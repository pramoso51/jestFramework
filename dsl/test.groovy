folder('dummy-folder-1.0') {
    displayName('Prueba 1.0')
    description('Descripcion Prueba 1.0')

    pipelineJob('pipelineJob 1.0') {
        displayName('Campo 1: 1.0')
        description('Campo 2: 1.0')

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
    }
}