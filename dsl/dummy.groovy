pipelineJob('dummy-folder/Testing Jest 2.0') {
    displayName('Testing Jest Pipeline 2.0')
    description('Pipeline for running Jest test 2.0')

    definition {
        cps {
            script('''
                pipeline {
                    agent any
                    tools {
                        nodejs '22.1.0'
                    }
                    stages {
                        stage('Checkout') {
                            steps {
                                git branch: 'main', url: 'https://github.com/pramoso51/jestFramework.git'
                            }
                        }
                        stage('Revisa Version Node') {
                            steps {
                                sh 'npm --version'
                            }
                        }
                        stage('Instalar dependencias') {
                            steps {
                                sh 'npm install'
                            }
                        }
                        stage('Pruebas') {
                            steps {
                                sh 'npm run test'
                            }
                        }
                    }
                }
            ''')
        }
    }
    triggers {
        cron('* * * * *') // Ejecutar cada 5 minutos, por ejemplo
    }
}
