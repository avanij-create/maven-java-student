pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build JAR') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run Application') {
            steps {
                sh 'java -jar target/student-app-1.0.0.jar'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t student-app:1.0 .'
            }
        }
    }

    post {
        success {
            echo 'Maven Java project built successfully.'
        }
        failure {
            echo 'Build failed. Check the console output.'
        }
    }
}
