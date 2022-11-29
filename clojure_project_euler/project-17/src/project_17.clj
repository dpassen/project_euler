(ns project-17
  (:require
   [clojure.pprint :as pprint]
   [clojure.string :as string]))

(defn -main
  [& _args]
  (println
   (transduce
    (comp
     (map (partial pprint/cl-format nil "~R"))
     (map (fn [num] (string/replace num " hundred " " hundred and ")))
     (map (fn [num] (string/replace num #"[- ]" "")))
     (map count)) + (range 1 1001))))
