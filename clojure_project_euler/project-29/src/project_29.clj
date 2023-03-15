(ns project-29
  (:require
   [clojure.math :as math]))

(defn -main
  [& _args]
  (println
   (count
    (distinct
     (for [a (range 2 101)
           b (range 2 101)]
       (math/pow a b))))))
