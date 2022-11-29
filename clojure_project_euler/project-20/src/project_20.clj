(ns project-20)

(defn -main
  [& _args]
  (letfn [(factorial [n] (reduce *' (range 1 n)))]
    (println
     (str
      (transduce (map (comp bigint str)) + (str (factorial 100)))))))
