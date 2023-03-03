multibranchPipelineJob('jenya-application') {
    branchSources {
        github {
            id('multibranch-github-alexengrig-jenya-application')
            repoOwner('alexengrig')
            repository('jenya-application')
        }
    }
}
