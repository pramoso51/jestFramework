// Define la estructura de carpetas y el trabajo de Pipeline
folder('mi-carpeta') {
    displayName('Mi Carpeta')
    description('Descripción de Mi Carpeta')
    
    folder('mi-sub-carpeta') {
        displayName('Mi Sub Carpeta')
        description('Descripción de Mi Sub Carpeta')

        pipelineJob('mi-script') {
            displayName('Mi Script')
            description('Script dentro de la carpeta')

            definition {
                cps {
                    // Define el script dentro de la definición del trabajo
                    script('''
                        echo "Hola Mundo"
                        // Agrega aquí tus comandos o script
                    ''')
                }
            }
        }
    }
}

// Ejecutar el trabajo de Pipeline
build job: 'mi-carpeta/mi-sub-carpeta/mi-script', wait: true
