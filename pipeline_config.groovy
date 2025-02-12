// pipeline_config/pipeline_config.groovy

// The shared pipeline configuration
@merge
pipeline {
    agent any

    environment {
        SHARED_ENV = 'sharedValue' // Shared environment variable for both pipelines
    }

    options {
        skipDefaultCheckout() // Option to skip default checkout
    }

    stages {
        stage('Initialize') {
            steps {
                echo 'Initializing shared pipeline configuration...'
            }
        }
    }
}
