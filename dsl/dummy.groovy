folder('mi-carpeta') {
    displayName('mi-carpeta')
    description('Descripción de Mi Carpeta')
}

folder('mi-carpeta/mi-sub-carpeta') {
    displayName('mi-sub-carpeta')
    description('Descripción de Mi Sub Carpeta')
}

pipelineJob('mi-carpeta/mi-sub-carpeta/mi-script') {
    displayName('mi-script')
    description('Script dentro de la carpeta')

    definition {
        cps {
            script('''
                pipeline {
                    agent any
                    tools {
                        nodejs '22.1.0'
                    }
                    stages {
                        stage('NODEJS') {
                            steps {
                                echo "NODEJS:22.1.0"
                            }
                        }
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

// job("mi-carpeta/mi-sub-carpeta/Seed 0") {
//     parameters {
//         stringParam("SERVER", "PRODUCTION", "Production Environment")
//     }
//     steps {
//         shell ('''
//             SERVER="$SERVER"
//             echo Server is $SERVER
//             echo LLEVA: mi-carpeta/mi-sub-carpeta/mi-script
//         ''')
//     }
//     publishers {
//         downstreamParameterized {
//             trigger("mi-carpeta/mi-sub-carpeta/mi-script") {
//                 condition('SUCCESS')
//                 parameters {
//                     currentBuild()
//                 }
//             }
//         }
//     }
// }

    