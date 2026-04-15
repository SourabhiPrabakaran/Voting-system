pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/SourabhiPrabakaran/Voting-system.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t voting-system .'
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker tag voting-system sourabhip/voting-system'
                sh 'docker push sourabhip/voting-system'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/deployment.yaml'
            }
        }
    }
}