#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Register jobs') {
            jobDsl {
                targets('jobs/**/*.groovy')
                removedJobAction('DELETE')
            }
        }

        stage('Register views') {
            jobDsl {
                targets('views/**/*.groovy')
                removedViewAction('DELETE')
            }
        }
    }
}
