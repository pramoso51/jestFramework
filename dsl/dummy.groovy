folder('mi-carpeta') {
    displayName('Mi Carpeta')
    description('Descripción de Mi Carpeta')

    // pipelineJob('mi-script') {
    //     displayName('Mi Script')
    //     description('Script dentro de la carpeta')

        definition {
            cps {
                // Define el script dentro de la definición del trabajo
                script('''
                    echo "Hola Mundo"
                    // Agrega aquí tus comandos o script
                ''')
            }
        }
    // }
}
