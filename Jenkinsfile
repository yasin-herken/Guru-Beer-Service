Jenkinsfile (Declarative Pipeline)
/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'jenkins/jenkins' } }
    stages {
        stage('build') {
            steps {
                sh './gradlew clean build'
                echo 'Build complete'
            }
        }
    }
}