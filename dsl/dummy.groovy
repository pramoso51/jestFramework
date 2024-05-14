folder('mi-folder') {
    displayName('Mi Folder')
    description('Folder para organizar jobs')

    folder('mi-folder/mi-sub-folder') {
        displayName('Mi Sub Folder')
        description('Folder para organizar jobs')

        pipelineJob('mi-folder/mi-sub-folder/hola-mundo') {
            displayName('Hola Mundo')
            description('Pipeline que imprime Hola Mundo')

            definition {
                cps {
                    script('''
                        echo "Hola Mundo"
                    ''')
                }
            }
        }
    }
}