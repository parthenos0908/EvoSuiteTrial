import csv
import re

f_read = open("./statistics.csv", "r")
f_write = open("./design-pattern.csv", "w", newline="")
reader = csv.reader(f_read)
writer = csv.writer(f_write)
tmp = "none"
for row in reader:
    m = re.search(r'com\.iluwatar\.\w+', row[0])
    if m != None:
        if m.group() != tmp:
            writer.writerow([])
        tmp = m.group()
    else:
        if tmp != "none":
            writer.writerow([])
        tmp = "none"
    writer.writerow(row)
