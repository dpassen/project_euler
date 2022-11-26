#!/usr/bin/env python -tt

with open("../data_files/13.txt") as f:
    print(str(sum(int(num) for num in f.read().strip().split("\n")))[:10])
