#!/usr/bin/env python -tt

from datetime import date
from dateutil.relativedelta import relativedelta

date = date(1901, 01, 01)
count = 0

while date.year < 2001:
    if date.isoweekday() == 7:
        count += 1
    date += relativedelta(months=1)

print(count)
