pipeline {
    agent any
    tools {
        nodejs '22.1.0'
    }
    stages {
        stage('Checkout') {
            steps {
                echo "Hola Mundo"
            }
        }
    }
}