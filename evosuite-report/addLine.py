import csv
import re
import os
import glob

f_read = open("./statistics.csv", "r")
f_write = open("./design-pattern.csv", "w", newline="")
reader = csv.reader(f_read)
writer = csv.writer(f_write)
file_list = os.listdir("../jacoco_result/java-design-patterns")
tmp = "none"
for row in reader:
    m = re.search(r'com\.iluwatar\.\w+', row[0])
    Blank = ["", "", "", "", "", "", "", ""]
    if m != None:
        if m.group() != tmp:
            jacoco_list = glob.glob(
                "C:\\Users\\disto\\gitrepos\\EvoSuiteTrial\\jacoco_result\\java-design-patterns\\*\\" + m.group())
            if jacoco_list:
                Blank.append(
                    "file:///" + jacoco_list[0].replace(m.group(), "index.html"))
            writer.writerow(Blank)
        tmp = m.group()
    else:
        if tmp != "none":
            Blank.append("命名規則外")
            writer.writerow(Blank)
        tmp = "none"
    evotest_path = "file:///C:\\Users\\disto\\gitrepos\\EvoSuiteTrial\\evosuite-tests\\"
    evotest = evotest_path + row[0].replace(".", "\\") + "_ESTest.java"
    row.append(evotest)
    src_list = glob.glob(
        "C:\\Users\\disto\\gitrepos\\java-design-patterns\\*\\src\\main\\java\\" + row[0].replace(".", "\\") + ".java")
    sampletest_list = glob.glob(
        "C:\\Users\\disto\\gitrepos\\java-design-patterns\\*\\src\\test\\java\\" + row[0].replace(".", "\\") + "Test.java")
    if src_list:
        row.append("file:///" + src_list[0])
    if sampletest_list:
        row.append("file:///" + sampletest_list[0])
    else:
        row.append(" ")
    row.append(" ")
    writer.writerow(row)
