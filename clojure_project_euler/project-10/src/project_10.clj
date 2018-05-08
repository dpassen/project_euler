(ns project-10)

(defn primes-up-to [upper]
  (letfn [(sieve [potentials primes]
            (if-let [p (first potentials)]
              (if (> (* p p) (last potentials))
                (concat primes potentials)
                (recur (filter (fn [n] (not= (mod n p) 0)) potentials)
                       (conj primes p)))
              primes))]
    (sieve (range 2 (inc upper)) [])))

(defn -main [& args]
  (println
   (reduce + (primes-up-to 2000000))))
