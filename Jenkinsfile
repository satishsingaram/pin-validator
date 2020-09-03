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
            dir('pin-validation-service'){
                steps {
                    sh "gradle clean build bootBuildImage "
                }
                post {
                    always {
                        junit '**/build/test-results/test/TEST-*.xml'
                    }
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
            mail to: 'satish.singaram@daimler.com', subject: 'Build failed', body: 'Please fix!'
        }
    }

}