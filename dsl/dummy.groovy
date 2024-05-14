import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import groovy.util.XmlParser
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
                    echo "Hola Mundo"
                ''')
            }
        }
    }
}
'''

def jobXml = new XmlParser().parseText(script)
jenkins.createProjectFromXML("mi-folder", new JsonBuilder(jobXml).toString())
