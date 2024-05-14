folder('dummy-folder') {
    displayName('Nombre del Folder Dummy')
    description('Descripción emocionante del Folder Dummy')

    pipelineJob('Testing Jest') {
        displayName('¡Testing Jest Pipeline!')
        description('Pipeline emocionante para ejecutar pruebas de Jest')

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

        // Programa la ejecución emocionante del trabajo de pipeline usando el trigger currentBuild
        currentBuild.trigger()
    }
}
