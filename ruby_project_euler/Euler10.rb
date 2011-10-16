#!/usr/bin/env ruby

require 'Prime'

puts Prime.take_while {|p| p < 2000000}.reduce(:+)

