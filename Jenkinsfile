pipeline {
    agent any

    tools {
        maven "3.8.1" // You need to add a maven with name "3.8.1" in the Global Tools Configuration page
    }

    stages {
        stage("build") {
            steps {
                bat "mvn -version"
                bat "mvn clean"
                bat "mvn compile"
                bat "mvn test"
                bat "mvn package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

        stage ("docker build") {
            agent {
                dockerfile "true"
            }

            steps {
                bat "docker images"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}