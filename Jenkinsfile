pipeline {
    agent any
    tools {
            gradle 'myGradle'
            dockerTool 'myDocker'
    }
    environment {
    		dockerHome = tool name: 'myDocker', type: 'dockerTool'
    		gradleHome = tool name: 'myGradle', type: 'gradle'
    		PATH = "$dockerHome/bin:$gradleHome/bin:$PATH"
    }

    triggers {
        pollSCM('H * * * *')
    }

    stages {
        stage('build pin-validation-service') {
            steps {
                dir('pin-validation-service'){
                    sh 'docker version'
                    echo "Build"
                    echo "PATH - $PATH"
                    sh "gradle clean build bootBuildImage "
                }
            }
            post {
                always {
                    dir('pin-validation-service'){
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