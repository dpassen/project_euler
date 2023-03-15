(ns project-7
  (:require
   [clojure.math :as math]))

(defn prime?
  [num]
  (when (< 1 num)
    (empty? (for [x     (range 2 (inc (math/floor (math/sqrt num))))
                  :when (zero? (mod num x))]
              x))))

(def primes (filter prime? (range)))

(defn -main
  [& _args]
  (println (nth primes 10000)))
