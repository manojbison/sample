pipeline {
  agent any
  stages {
    stage('test') {
      parallel {
        stage('test') {
          steps {
            bat 'mvn test'
          }
        }
        stage('sleep') {
          steps {
            sleep 10
          }
        }
      }
    }
    stage('package') {
      steps {
        bat 'mvn package'
      }
    }
    stage('pmd') {
      steps {
        pmd(canComputeNew: true, canResolveRelativePaths: true, canRunOnFailed: true, useDeltaValues: true, usePreviousBuildAsReference: true, useStableBuildAsReference: true)
      }
    }
  }
}