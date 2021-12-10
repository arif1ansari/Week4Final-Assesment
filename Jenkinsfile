pipeline {
    agent any 
    stages {
        stage('Compile and Clean') { 
            steps {

                sh "mvn clean compile"
            }
        }
       

        stage('deploy') { 
            steps {
                sh "mvn package"
            }
        }


        stage('Build Docker image'){
            steps {
              
                sh 'docker build -t  aarif7836/springboot-docker-hello2:latest  .'
            }
        }

        stage('Docker Login'){
            
            steps {
                 withCredentials([string(credentialsId: 'DockerId', variable: 'Dockerpwd')]) {
                    sh "docker login -u aarif7836 -p ${Flipkart7836}"
                }
            }                
        }

        stage('Docker Push'){
            steps {
                sh 'docker push aarif7836/springboot-docker-hello2:latest'
            }
        }
        
        stage('Docker deploy'){
            steps {
               
                sh 'docker run -itd -p  8092:8092 aarif7836/springboot-docker-hello2:latest'
            }
        }

        
        stage('Archving') { 
            steps {
                 archiveArtifacts './target/Producer-0.0.1-SNAPSHOT.jar Producer-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
