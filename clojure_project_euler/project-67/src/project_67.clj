(ns project-67
  (:require
   [clojure.java.io :as io]
   [clojure.string  :as str]))

(defn -main
  [& _args]
  (letfn [(parse-nums [line] (map parse-long (str/split line #"\s+")))]
    (with-open [rdr (io/reader "../../data_files/67.txt")]
      (println
       (first
        (reduce
         (fn [[_ & offset-sums :as sums] line]
           (map max (map + line sums) (map + line offset-sums)))
         (map parse-nums (reverse (line-seq rdr)))))))))
