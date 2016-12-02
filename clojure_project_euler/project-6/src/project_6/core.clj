(ns project-6.core
  (:require
   [clojure.math.numeric-tower :refer [abs expt]]))

(defn- square [x] (expt x 2))

(defn -main [& args]
  (let [nums (range 1 101)
        sum-of-squares (->> nums
                            (map square)
                            (reduce +))
        square-of-sums (->> nums
                            (reduce +)
                            square)]
    (->> (- sum-of-squares square-of-sums)
         abs
         println)))
