pipelineJob('hello-pipeline-job') {
    description('Pipeline-job to print "Hello, World!".')

    definition {
        cpsScm {
            scm {
                github('alexengrig/jenya-seed-job')
                scriptPath('pipelines/helloPipelineJob.jenkinsfile')
            }
        }
    }
}