pipeline {
  agent any
  stages {
    stage('compile') {
      parallel {
        stage('compile') {
          steps {
            pmd()
          }
        }
        stage('') {
          steps {
            bat 'hostname'
          }
        }
      }
    }
    stage('test') {
      steps {
        bat 'mvn test'
      }
    }
    stage('package') {
      steps {
        bat 'mvn package'
      }
    }
  }
}