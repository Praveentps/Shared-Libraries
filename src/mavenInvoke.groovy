package praveen.com

def timedGradleBuild(tasks) {
   timestamps {
      sh "mvn ${tasks}"
   }
}
