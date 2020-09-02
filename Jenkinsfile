pipeline {
    agent any
    tools {
        gradle 'myGradle'
    }
    
    triggers {
        pollSCM('H * * * *')
    }

    stages {
        stage('build pin-validation-service') {
            steps {
                dir('pin-validation-service'){
                    sh "gradle clean build"
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
        stage('build error-logger') {
            steps {
                dir('error-logger'){
                    sh "gradle clean build"
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
        stage('build par-generator') {
            steps {
                dir('par-generator'){
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