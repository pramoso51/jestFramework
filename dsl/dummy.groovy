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
            // Define el script dentro de la definición del trabajo
            script('''
                echo "Hola Mundo"
            ''')
        }
    }
}

job('mi-carpeta/mi-sub-carpeta/mi-script') {
    publishers {
      downstreamParameterized {
        trigger("mi-Carpeta/mi-sub-carpeta/mi-script") {
          condition('SUCCESS')
          parameters {
            currentBuild()
          }
        }
      }
    }
}
    