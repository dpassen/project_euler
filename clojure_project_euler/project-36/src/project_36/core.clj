(ns project-36.core)

(defn -main [& args]
  (letfn [(palindrome? [s] (= (seq s) (reverse s)))]
    (println
     (transduce
      (comp
       (filter (comp palindrome? str))
       (filter (comp palindrome? #(Integer/toBinaryString %))))
      + (range 1 1000000)))))
