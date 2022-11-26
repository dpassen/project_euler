#!/usr/bin/env python -tt

import calendar
from datetime import date, timedelta

date = date(1901, 1, 1)
count = 0

while date.year < 2001:
    if date.isoweekday() == 7:
        count += 1
    days = calendar.monthrange(date.year, date.month)[1]
    date += timedelta(days=days)

print(count)
