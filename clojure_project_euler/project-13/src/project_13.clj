(ns project-13
  (:require
   [clojure.java.io :as io]))

(defn -main
  [& _args]
  (with-open [rdr (io/reader "../../data_files/13.txt")]
    (println
     (subs (str (transduce (map bigint) + (line-seq rdr))) 0 10))))
