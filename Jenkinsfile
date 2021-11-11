pipeline{
 agent { node { label 'winslave' } }
  
  stages{
    stage('code checkout'){
      steps{
        git 'https://github.com/praveensomayaji/SeleniumCucumberMaven.git'
      }
    }
    stage('Compile'){
      steps(){
        bat 'mvn compile'
      }
    }
   stage('Execute'){
    steps{
     bat 'mvn clean install -Dcucumber.options="--tags @first"'
    }
   }
   post{
    success{
     // publish html
          publishHTML target: [
              allowMissing: false,
              alwaysLinkToLastBuild: false,
              keepAll: true,
              reportDir: 'coverage',
              reportFiles: 'report.html',
              reportName: 'HTML Report'
            ]
    }
   }
  }
}

