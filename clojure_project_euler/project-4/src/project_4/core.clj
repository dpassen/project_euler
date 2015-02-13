(ns project-4.core
  (:require [clojure.string :as str]))

(defn -main [& args]
  (->> (for [x (range 100 1000)
             y (range 100 1000)]
         (* x y))
       (filter (fn [product] (= (str product) (str/reverse (str product)))))
       (reduce max)
       println))
