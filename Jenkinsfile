pipeline {
    agent any
    tools {
        // versions of jdk and maven were installed in local instance of Jenkins
        jdk "JDK8"
        maven "3.6.3"
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
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