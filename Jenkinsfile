pipeline{
	agent any
	
	tools{
		maven 'Maven'
	}
	stages{
		stage('Checkout'){
			steps{
			git branch:'main' , url:'https://github.com/Darshan429/final3.git'
			}
		}
		stage('Build'){
			steps{
				sh 'mvn build'
			}
		}
		stage('Test'){
			steps{
				sh 'mvn test'
			}
		}
		stage('Run Application'){
			steps{
				sh 'mvn exec:java -dexec.mainClass="com.example.App"'
			}
		}
	}
	post{
		always{
			echo 'Pipeline execution completed'
		}
		success{
			echo 'Build success'
		}
		failure{
			echo 'Build failure'
		}
	}
}
