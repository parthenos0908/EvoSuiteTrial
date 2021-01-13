#!/bin/bash

dir_path="../java-design-patterns/*/target/classes/"
dirs=`find $dir_path -maxdepth 0 -type d`

for dir in $dirs;
do
    echo $dir
    java -jar jacoco/lib/jacococli.jar report $dir/../jacoco.exec --sourcefiles $dir/../../src/main/java --classfiles $dir --html jacoco_result/a/$dir/../.. --csv jacoco_result/a/$dir/../../coverage.csv
done