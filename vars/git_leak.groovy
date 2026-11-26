def call() {
    sh '''
        docker run --rm \
        -v "$(pwd):/repo" \
        zricethezav/gitleaks:latest \
        detect --source=/repo --exit-code 1 -v
    '''
}
