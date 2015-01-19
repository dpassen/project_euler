(ns project-3.core
  (:require [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn factors [num]
  (->> (for [x (range 1 (inc (floor (sqrt num))))
             :when (zero? (mod num x))]
         [x (/ num x)])
       flatten
       distinct))

(defn prime? [num]
  (cond
    (>= 1 num) false
    :else (empty? (for [x (range 2 (inc (floor (sqrt num))))
                        :when (zero? (mod num x))]
                    x))))

(defn -main [& args]
  (->> 600851475143
       factors
       (filter prime?)
       (apply max)
       println))
