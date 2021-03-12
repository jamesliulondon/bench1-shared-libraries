
import com.cloudbees.groovy.cps.NonCPS
import com.accordops.bench1.global.YamlReaderExample


def call() {

    echo "test"
    node('default') {
        YamlReaderExample yre = new YamlReaderExample();
//        String ee = yre.embedded();
        echo "this is supposed to run"
        return "test";
    }
}