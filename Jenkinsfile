pipeline {
    agent any
    environment {
        SONARQUBE = 'Sonarqube' // Update with your SonarQube server name if necessary
    }
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from the Git repository
                git branch: 'main', url: 'https://github.com/kavyaramesh18/Maven_task1.git' // Your repo
            }
        }
        stage('Build') {
            steps {
                // Run Maven clean install to build the project
                bat 'mvn -X clean install'
            }
        }
        stage('Static Code Analysis') {
            steps {
                // Run PMD for static code analysis
                bat 'mvn pmd:pmd'
            }
        }
        stage('Run Tests') {
            steps {
                // Run Maven tests
                bat 'mvn test'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Run SonarQube analysis
                bat ''' 
                    mvn sonar:sonar ^
                        -Dsonar.projectKey=Maven_task1 ^
                        -Dsonar.projectName='Maven_task1' ^
                        -Dsonar.host.url=http://localhost:9000 ^
                        -Dsonar.token=sqp_91bdefc6d07a195dbf11007299e6a7191b60afe5 ^
                        -Dsonar.inclusions="src/main/java/**/*" ^
                        -Dsonar.exclusions="src/test/java/**/*"
                '''
            }
        }
        stage('Success') {
            steps {
                echo 'Build, Test, and SonarQube Analysis completed successfully!'
            }
        }
    }
}
