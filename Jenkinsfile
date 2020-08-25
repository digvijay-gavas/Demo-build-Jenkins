pipeline {
    agent any
    tools {
        // versions of jdk and maven were installed in local instance of Jenkins
        jdk "JDK8"
        maven "MVN3.6.3"
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
                docker.build("digvijay0gavas/hello-world-demo")
            }
        }
        stage('Test') {
            steps {
                echo 'test stage'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploy stage'
            }
        }
    }
}