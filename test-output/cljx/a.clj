      (ns cljx.a
        (:use [clojure.pprint :only [pp]]))

                 
                                                   

      
           
                      

     
(defn p [x]
  (println x))

(defn both [x]
  (+ x x))

(reify
    clojure.lang.IFn (invoke [_ x] (inc x)))

(defmacro increment [x] `(inc ~x))

(comment foo)


;;;;;;;;;;;; This file autogenerated from test/cljx/a.cljx
