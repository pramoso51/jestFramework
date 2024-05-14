import jenkins.model.Jenkins

def jenkins = Jenkins.getInstance()

def script = '''
folder('mi-folder') {
    displayName('Mi Folder')
    description('Folder para organizar jobs')

    pipelineJob('hola-mundo') {
        displayName('Hola Mundo')
        description('Pipeline que imprime Hola Mundo')

        definition {
            cps {
                script('''
                    // Aquí va el script del pipeline
                    println "Hola Mundo"
                ''')
            }
        }
    }
}
'''

def jobXml = new XmlParser().parseText(script)
jenkins.createProjectFromXML("mi-folder", new JsonBuilder(jobXml).toString())
