pipeline{
    agent any
    stages{
        stage ('Compile Stage') {
            steps{
                   maven{
                        sh 'mvn clean compile'
                   }
            }

        }
    }
}