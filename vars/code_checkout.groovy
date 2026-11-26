def call(String GitUrl, String GitBranch){
 git credentialsId: 'git', git url: "${GitUrl}", branch: "${GitBranch}"
}
