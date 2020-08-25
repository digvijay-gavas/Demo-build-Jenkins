pipeline {
    agent any
    tools {
        // versions of JDK8 and MVN3.6.3 should be configured in the Jenkins Global Setting 
        jdk "JDK8"
        maven "MVN3.6.3"
    }
    stages {
        stages {
            stage('parameters') {
                steps {
                    script { 
                        properties([
                            parameters([
                                booleanParam(
                                    defaultValue: false, 
                                    description: '', 
                                    name: 'deploy'
                                )
                            ])
                        ])
                    }
                }
            }
        }  
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
                script {
                    def deployableDockerImage = docker.build("hello-world-digvijay:${BUILD_ID}")
                    // pushing docker to public repo hub.docker.io. 
                    // In reality it will be deployed to some private repository 
                    deployableDockerImage.push() 
                }   
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
            
        }
        stage('Deploy') {
            when {
                expression { 
                   return deploy == true
                }
            }
            steps {
                echo 'deploy stage'
            }
        }
    }
}