(ns project-3
  (:require
   [clojure.math :as math]))

(defn factors
  [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num))))
   (range 1 (inc (math/floor (math/sqrt num))))))

(defn prime?
  [num]
  (when (< 1 num)
    (empty? (for [x     (range 2 (inc (math/floor (math/sqrt num))))
                  :when (zero? (mod num x))]
              x))))

(defn -main
  [& _args]
  (println (transduce (filter prime?) max 0 (factors 600851475143))))
