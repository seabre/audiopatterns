(ns audiopatterns.sort-helpers)

(defn swap [v x y]
   (assoc v y (v x) x (v y)))
