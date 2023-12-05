multibranchPipelineJob('jenkins-application') {
    branchSources {
        github {
            id('multibranch-github-alexengrigtech-jenkins-application')
            repoOwner('alexengrigtech')
            repository('jenkins-application')
        }
    }
}
