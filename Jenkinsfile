pipeline {
    agent {
        docker {
            image "maven:3.8.1-jdk-11"
            label "docker"
        }
    }

//     tools {
//         maven "3.8.1" // You need to add a maven with name "3.8.1" in the Global Tools Configuration page
//     }

    stages {
        stage("build") {
            steps {
                bat "mvn -version"
                bat "mvn clean"
                bat "mvn install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}