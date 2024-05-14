folder('mi-carpeta') {
    displayName('Mi Carpeta')
    description('Descripción de Mi Carpeta')

    // Define un nuevo job dentro de la carpeta
    pipelineJob('mi-script') {
        displayName('Mi Script')
        description('Script dentro de la carpeta')

        definition {
            cps {
                // Especifica la ruta del script dentro de la carpeta
                scriptPath('mi-script.groovy')
            }
        }
    }
}
