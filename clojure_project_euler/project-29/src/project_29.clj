(ns project-29
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn -main
  [& _args]
  (println
   (count
    (distinct
     (for [a (range 2 101)
           b (range 2 101)]
       (expt a b))))))
