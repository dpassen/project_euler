#!/usr/bin/env io

Range 1 to(999) asList select(i, i % 3 == 0 or(i % 5 == 0)) sum println

