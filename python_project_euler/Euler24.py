#!/usr/bin/env python -tt

from itertools import islice, permutations

print(''.join(next(islice(permutations('0123456789'), 999999, 1000000))))
