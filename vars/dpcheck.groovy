def call() {
    dependencyCheck(
        odcInstallation: 'dpcheck',
        additionalArguments: '--scan . --format XML --format HTML'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
