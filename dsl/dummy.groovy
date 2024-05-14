folder('dummy-folder') {
    displayName('Nombre del Folder Dummy')
    description('Descripcion del Folder Dummy')

    pipelineJob('Testing Jest') {
        displayName('Testing Jest Pipeline')
        description('Pipeline for running Jest tests')

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

        // Programa la ejecución del trabajo de pipeline después de definirlo
        triggers {
            cron('0 0 * * *') // Ejecutar a la medianoche todos los días, puedes ajustar según tus necesidades
        }
    }
}
