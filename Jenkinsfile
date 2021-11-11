pipeline{
  agent {"Winslave"}
  
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
  }
}

