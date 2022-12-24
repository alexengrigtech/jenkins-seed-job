#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Register jobs') {
            steps {
                jobDsl {
                    targets('jobs/**/*.groovy')
                    removedJobAction('DELETE')
                }
            }
        }

        stage('Register views') {
            steps {
                jobDsl {
                    targets('views/**/*.groovy')
                    removedViewAction('DELETE')
                }
            }
        }
    }
}
