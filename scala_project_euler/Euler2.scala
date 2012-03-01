#!/usr/bin/env sh
exec scala "$0" "$@"
!#

def fib(a:Int = 0, b:Int = 1):Stream[Int] = {
  a #:: fib(b, a + b)
}

println(fib().filter(n => n % 2 != 0).takeWhile(n => n < 4000000).sum)

