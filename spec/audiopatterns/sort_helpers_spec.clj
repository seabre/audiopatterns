(ns audiopatterns.sort-helpers-spec
  (:require [speclj.core :refer :all]
            [audiopatterns.sort-helpers :refer :all]))

(describe "Swap"

  (it "should swap elements in a vector"
    (should= [2 4 10 8 6] (swap [2 4 6 8 10] 2 4))))

(run-specs)
