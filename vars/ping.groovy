import sun.awt.X11.XAnyEvent
import sun.util.resources.cldr.nyn.CalendarData_nyn_UG

def call() {
    pipeline {
        agent any
        stages {
            stage('ping') {
                step {
                    echo 'ping'
                }
                step {
                    echo 'ping'
                }
            }
            stage('joy') {
                step {
                    echo 'jeremiah'
                }
                step {
                    echo 'was a bullfrog'
                }
            }
        }
    }
}