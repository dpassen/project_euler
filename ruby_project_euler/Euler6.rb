#!/usr/bin/env ruby

sum_of_squares = (1..100).map{ |n| n ** 2}.reduce(:+)
square_of_sums = (1..100).reduce(:+) ** 2

puts (sum_of_squares - square_of_sums).abs

