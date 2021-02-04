pipeline{
    agent any
    stages{
        stage("Compile Stage"){
            steps{
                   withMaven(maven : ''){
                        sh 'mvn clean compile'
                   }
            }

        }
    }
}