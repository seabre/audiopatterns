(ns audiopatterns.bubble-sort
  (:use [audiopatterns.sort-helpers]))

"Bubblesort functions"

(defn- bubble-sort-next-pass [v]
  (loop [v v
         acc 1]
    (if (= (count v) acc)
      v
      (if (> (nth v (- acc 1)) (nth v acc))
        (recur (swap v (- acc 1) acc) (+ acc 1))
        (recur v (+ acc 1))))))

(defn bubble-sort [v]
  (loop [v v
         pass (bubble-sort-next-pass v)
         acc [v]]
    (if (= pass v)
      (conj acc pass)
      (recur pass (bubble-sort-next-pass pass) (conj acc pass)))))
