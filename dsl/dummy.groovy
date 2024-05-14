folder('mi-carpeta') {
    displayName('Mi Carpeta')
    description('Descripción de Mi Carpeta')
}

folder('mi-carpeta/mi-sub-carpeta') {
    displayName('Mi Sub Carpeta')
    description('Descripción de Mi Sub Carpeta')
}

pipelineJob('mi-carpeta/mi-sub-carpeta/mi-script') {
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

build job: 'mi-carpeta/mi-sub-carpeta/mi-script', wait: true