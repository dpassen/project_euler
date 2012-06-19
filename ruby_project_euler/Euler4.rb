#!/usr/bin/env ruby -rubygems

require 'Cartesian'

puts (100...1000).cartesian(100...1000).collect{|i,j| i * j}.select{|p| p.to_s == p.to_s.reverse}.max

