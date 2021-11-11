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
   stage('Publish'){
    steps{
    post {
     success {
      echo 'One way or another, I have finished'
     }
    }
    }
   }
  }
}


