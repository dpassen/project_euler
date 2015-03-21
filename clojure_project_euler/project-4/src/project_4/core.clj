(ns project-4.core
  (:require [clojure.string :as str]))

(defn -main [& args]
  (->> (for [x (range 100 1000)
             y (range 100 1000)]
         (* x y))
       (filter (comp (fn [product] (= product (str/reverse product))) str))
       (reduce max)
       println))
