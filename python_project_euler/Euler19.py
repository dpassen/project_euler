#!/usr/bin/env python

import calendar
from datetime import date, timedelta


def sundays(date):
    while date.year < 2001:
        if date.isoweekday() == 7:
            yield date
        days = calendar.monthrange(date.year, date.month)[1]
        date += timedelta(days=days)


start_date = date(1901, 1, 1)
print(len(list(sundays(start_date))))
