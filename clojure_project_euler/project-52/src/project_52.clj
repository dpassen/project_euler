(ns project-52)

(defn -main
  [& _args]
  (println
   (ffirst
    (filter
     (fn [nums] (apply = (map (comp set str) nums)))
     (eduction
      (map inc)
      (map (fn [n] (map (partial * n) (range 1 7))))
      (range))))))
