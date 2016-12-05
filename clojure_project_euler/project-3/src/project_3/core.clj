(ns project-3.core
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn factors [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num))))
   (range 1 (inc (floor (sqrt num))))))

(defn prime? [num]
  (when (< 1 num)
    (empty? (for [x (range 2 (inc (floor (sqrt num))))
                  :when (zero? (mod num x))]
              x))))

(defn -main [& args]
  (println (transduce (filter prime?) max 0 (factors 600851475143))))
