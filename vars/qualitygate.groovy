def call() {
    timeout(time: 10, unit: 'MINUTES') {
        def qg = waitForQualityGate()

        if (qg.status != 'OK') {
            error "Pipeline failed because Quality Gate status is: ${qg.status}"
        }

        echo "Quality Gate Passed!"
    }
}
