pipeline {
    agent any
    tools {
            gradle 'myGradle'
    }

    triggers {
        pollSCM('*/5 * * * *')
    }

    stages {
        stage('build pin-validation-service') {
            steps {
                sh "pwd"
                dir('pin-validation-service'){
                    sh "pwd"
                    sh "gradle clean build"
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
        stage('build error-logger') {
            steps {
                sh "pwd"
                dir('error-logger'){
                    sh "pwd"
                    sh "gradle clean build"
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
        stage('build par-generator') {
            steps {
                sh "pwd"
                dir('par-generator'){
                    sh "pwd"
                    sh "gradle clean build"
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }

    }
    post {
        failure {
            echo 'build failed'
        }
    }

}