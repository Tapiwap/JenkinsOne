pipeline {
    agent any

    tools {
        maven "3.6.0" // You need to add a maven with name "3.6.0" in the Global Tools Configuration page
    }

    stages {
        stage("build") {
            steps {
                sh "mvn -version"
                sh "clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}