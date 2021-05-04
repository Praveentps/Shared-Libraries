
class buildUtils implements Serializable {
    def steps
    buildUtils(steps) { this.steps = steps}
       def timedGradleBuild(tasks) {
           print 'Hello world'
           steps.sh "echo hello from buildUtils"
       def gradleHome = steps.tool 'gradle3.2'
       steps.timestamps {
            steps.sh "mvn ${tasks}"
       }
    }

  
}
