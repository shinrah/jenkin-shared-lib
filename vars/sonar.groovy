def call(String projectKey) {
  withSonarQubeEnv('sonar') {
    sh """
            mvn clean verify \
            org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
            -Dsonar.projectKey=${projectKey} \
            -Dsonar.projectName=${projectKey} \
            -Dsonar.junit.reportPaths=target/surefire-reports
        """
  }
}
