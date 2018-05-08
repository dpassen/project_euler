(ns project-7
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn prime? [num]
  (when (< 1 num)
    (empty? (for [x (range 2 (inc (floor (sqrt num))))
                  :when (zero? (mod num x))]
              x))))

(def primes (filter prime? (range)))

(defn -main [& args]
  (println (nth primes 10000)))
