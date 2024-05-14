folder('dummy-folder') {
    displayName('Nombre del Folder Dummy')
    description('Descripcion del Folder Dummy')
}

folder('dummy-folder/testing-folder') {
    description('Folder containing all QA jobs for project A')

    pipelineJob('Testing Jest') {
        displayName('Testing Jest Pipeline')
        description('Pipeline for running Jest tests')

        definition {
            cps {
                script {
                    // Define la versión de Node.js para este pipeline
                    tools {
                        nodejs '22.1.0'
                    }

                    // Define los pasos del pipeline dentro de node
                    node {
                        // Definición de tu pipeline aquí
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
            }
        }
    }
}
