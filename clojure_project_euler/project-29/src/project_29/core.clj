(ns project-29.core
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn -main [& args]
  (println
   (count
    (distinct
     (for [a (range 2 101)
           b (range 2 101)]
       (expt a b))))))
