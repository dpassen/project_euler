(ns project-26)

(defn cycle-length
  [num]
  (loop [rem 1
         acc #{}]
    (if (or (zero? rem) (acc rem))
      (dec (count acc))
      (recur (long (* 10 (mod rem num))) (conj acc rem)))))

(defn -main
  [& _args]
  (->> (range 1 1000)
       (apply max-key cycle-length)
       (println)))
