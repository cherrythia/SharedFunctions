def call(Map config=[:]) {
    node {
    stage('SCM') {
	echo 'Gathering code from version control'
    }
    stage('Build') {
        echo 'Building....'
        releasenotes(changes:true) 
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}
}

