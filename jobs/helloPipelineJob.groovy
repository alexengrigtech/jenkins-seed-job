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
        activeChoiceParam('GREETING') {
            description('Select a greeting:')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Hello", "Good morning", "Good afternoon", "Good evening"]')
                fallbackScript('["Oops"]')
            }
        }

        stringParam {
            name('NAME')
            defaultValue('World')
            description("What's your name?")
            trim(true)
        }
    }
}