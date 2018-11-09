ckage org.demo

def timedGradleBuild(tasks) {
   timestamps {
      sh "${tool 'gradle3.2'}/bin/gradle ${tasks}"
   }
}
