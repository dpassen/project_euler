(ns project-2.core)

(def fibs (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn -main [& args]
  (->> fibs
       (take-while (partial > 4000000))
       (filter even?)
       (reduce +)
       println))
