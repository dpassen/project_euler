#!/usr/bin/env python -tt

from itertools import count

for num in count(1):
    if (set(str(num)) == set(str(num * 2)) == set(str(num * 3)) == set(str(num * 4)) == set(str(num * 5)) == set(str(num * 6))):
        break
print(num)

