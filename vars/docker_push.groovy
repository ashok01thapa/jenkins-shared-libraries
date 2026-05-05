def call(String Project, Stirng ImageTag, String dockerhubuser){
  withCredentia([usernamePassword(
    credentialsID: 'dockerHubCred',
    passwordVariable: 'dockerHubPass',
    usernameVariable: 'dockerHubUser')])
    sh "docker login -u ${dockerhubUser} -p ${dockerhubpass}"
}
sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
}
    
    
