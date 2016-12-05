(ns project-25.core)

(def fibs (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(defn -main [& args]
  (->> fibs
       (take-while (comp (partial > 1000) count str))
       count
       println))
