(ns project-16
  (:require
   [clojure.math.numeric-tower :refer [expt]]))

(defn -main
  [& _args]
  (println
   (str
    (transduce (map (comp bigint str)) + (str (expt 2 1000))))))
