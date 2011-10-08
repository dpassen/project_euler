#!/usr/bin/env clj

(ns euler-1)

(println
  (reduce +  
    (filter 
      #(or
        (zero?
          (mod % 3))
        (zero?
          (mod % 5)))
      (range 1 1000))))

