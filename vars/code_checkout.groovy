def call(String GitUrl, String GitBranch){
 git credentialsId: 'git', url: "${GitUrl}", branch: "${GitBranch}"
}
