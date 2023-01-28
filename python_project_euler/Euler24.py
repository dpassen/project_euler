#!/usr/bin/env python

from itertools import islice, permutations

print("".join(next(islice(permutations("0123456789"), 999999, 1000000))))
