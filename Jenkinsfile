pipeline {
    agent any

    tools {
      maven "3.8.1"
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