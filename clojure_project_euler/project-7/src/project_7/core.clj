(ns project-7.core
  (:require [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn prime? [num]
  (cond
    (>= 1 num) false
    :else (empty? (for [x (range 2 (inc (floor (sqrt num))))
                        :when (zero? (mod num x))]
                    x))))

(def primes (filter prime? (range)))

(defn -main [& args]
  (-> primes
      (nth 10000)
      println))
