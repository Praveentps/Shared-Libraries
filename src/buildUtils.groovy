
class buildUtils implements Serializable {
    def steps
    buildUtils(steps) { this.steps = steps}
       def timedGradleBuild(tasks) {
         
       def gradleHome = steps.tool 'gradle3.2'
       steps.timestamps {
            steps.sh "mvn ${tasks}"
       }
    }
        def helloFunc(){
           print 'Hello'
           steps.sh "echo hello from buildUtils"
           anotherFunc()
        }
        def anotherFunc(){
            steps.sh "Hello from another func"
        }
}
