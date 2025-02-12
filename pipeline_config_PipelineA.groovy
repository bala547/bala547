// pipeline_config/pipeline_config_PipelineA.groovy

@override
pipeline {
    environment {
        PIPELINE_A_ENV = 'valueForPipelineA'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building Pipeline A'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing Pipeline A'
            }
        }
    }
}
