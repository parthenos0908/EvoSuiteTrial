#!/bin/sh

# evosuiteを実行するスクリプト
# 作成途中

dir_path="../java-design-patterns/*/target/classes/"
dirs=`find $dir_path -maxdepth 0 -type d`

for dir in $dirs;
do
    echo $dir
    java -jar evosuite.jar -target $dir
done
