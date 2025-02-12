// pipeline_config/pipeline_config_PipelineB.groovy

@override
pipeline {
    environment {
        PIPELINE_B_ENV = 'valueForPipelineB'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building Pipeline B'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying Pipeline B'
            }
        }
    }
}
