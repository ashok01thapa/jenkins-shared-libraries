def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(
    credentialsID: 'dockerHubCred',
    passwordVariable: 'dockerHubPass',
    usernameVariable: 'dockerHubUser')])
    sh "docker login -u ${dockerhubUser} -p ${dockerhubpass}"
}
sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
}
    
    
