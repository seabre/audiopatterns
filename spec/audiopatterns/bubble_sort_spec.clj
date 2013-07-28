(ns audiopatterns.bubble-sort-spec
  (:require [speclj.core :refer :all]
            [audiopatterns.bubble-sort :refer :all]))

(describe "Bubblesort"

(describe "#bubble-sort-next-pass"
  (it "should return the next step in the bubblesort"
    (should= [1 4 2 5 8] (#'audiopatterns.bubble-sort/bubble-sort-next-pass [5 1 4 2 8])))

  (it "should return the vector as-is if the list is already sorted"
    (should= [1 2 3 4 5] (#'audiopatterns.bubble-sort/bubble-sort-next-pass [1 2 3 4 5]))))

(describe "#bubble-sort"
  (it "should return a vector of each bubble sort pass, including the initial vector"
    (should= [[5 1 4 2 8] [1 4 2 5 8] [1 2 4 5 8] [1 2 4 5 8]] (bubble-sort [5 1 4 2 8])))

  (it "should return a vector of the pass and the given vector if the vector is already sorted"
    (should= [[1 2 3 4 5] [1 2 3 4 5]] (bubble-sort [1 2 3 4 5])
          ))))

(run-specs)
