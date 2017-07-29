(ns project-16.core
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn -main [& args]
  (println
   (str
    (transduce (map (comp bigint str)) + (str (expt 2 1000))))))
