(ns project-6
  (:require
   [clojure.math.numeric-tower :refer [abs expt]]))

(defn -main
  [& _args]
  (let [nums           (range 1 101)
        square         (fn [x] (expt x 2))
        sum-of-squares (transduce (map square) + nums)
        square-of-sums (square (reduce + nums))]
    (println (abs (- sum-of-squares square-of-sums)))))
