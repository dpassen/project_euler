(ns project-8
  (:refer-clojure :exclude [partition])
  (:require
   [clojure.java.io :as io]
   [net.cgrand.xforms :refer [partition]]))

(defn -main
  [& _args]
  (println
   (transduce
    (comp
     (map ^[char] Character/getNumericValue)
     (partition 13 1)
     (map (partial reduce *)))
    max
    0
    (with-open [rdr (io/reader "../../data_files/8.txt")]
      (slurp rdr)))))
