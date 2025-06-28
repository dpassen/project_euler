(ns project-25)

(def fibs (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(defn -main
  [& _args]
  (->> fibs
       (take-while (comp (partial > 1000) count str))
       (count)
       (println)))
