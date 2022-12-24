job('hello-job') {
    description('Job to print "Hello, World!".')

    steps {
        shell('echo Hello, World!')
    }
}
