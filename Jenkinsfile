#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Register jobs') {
            steps {
                jobDsl targets: 'jobs/**/*.groovy'
            }
        }
    }
}
