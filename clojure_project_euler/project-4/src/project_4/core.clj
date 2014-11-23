(ns project-4.core)

(defn -main [& args]
  (->> (for [x (range 100 1000)
             y (range 100 1000)]
         (* x y))
       (filter (fn [product] (= (str product) (apply str (reverse (str product))))))
       (reduce max)
       println))
