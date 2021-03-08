#!/bin/bash
/usr/bin/git remote remove gitlab || echo "no previous github exists"
/usr/bin/git remote add gitlab http://office-localdomain:18080/jamesliulondon/bench1-shared-libraries.git || echo "failed to add github"