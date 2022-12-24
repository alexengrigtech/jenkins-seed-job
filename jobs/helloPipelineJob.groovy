pipelineJob('hello-pipeline-job') {
    description('Pipeline-job to print "Hello, $NAME!".')

    definition {
        cpsScm {
            scm {
                github('alexengrig/jenya-seed-job')
                scriptPath('pipelines/helloPipelineJob.jenkinsfile')
            }
        }
    }

    parameters {
        choiceParam {
            name('LANGUAGE')
            description('Select a language:')
            choices("""
            English
            Russian
            """.trim())
        }

        activeChoiceReactiveParam('GREETING') {
            description('Select a greeting:')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('''
                switch(LANGUAGE) {
                    case 'English':
                        return ["Hi","Hello","Good morning","Good afternoon","Good evening"]
                    case 'Russian':
                        return ["Здравствуйте","Привет","Доброе утро","Добрый день","Добрый вечер"]
                    default:
                        return ["Oops, no for " + LANGUAGE]
                }
                '''.trim())
                fallbackScript('["Oops"]')
            }
            referencedParameter('LANGUAGE')
        }

        stringParam {
            name('NAME')
            defaultValue('World')
            description("What's your name?")
            trim(true)
        }
    }
}