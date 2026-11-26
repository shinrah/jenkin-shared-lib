def call(String sourceImage, String sourceTag, String targetImage, String targetTag) {
    sh """
        docker tag ${sourceImage}:${sourceTag} ${targetImage}:${targetTag}
    """
}
