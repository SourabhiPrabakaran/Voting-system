pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/SourabhiPrabakaran/Voting-system.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t voting-system .'
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker tag voting-system sourabhip/voting-system'
                bat 'docker push sourabhip/voting-system'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                bat 'kubectl apply -f k8s/deployment.yaml'
            }
        }
    }
}