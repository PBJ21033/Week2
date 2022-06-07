;; This function is to practice using the different math operators found in clojure. 
(defn exercise-math[]
    (def x 4)
    (def y 10)
    (def z 11)
    ;; x + y + z
    (println(+ x y z))
    ;; x * y * z
    (println(* x y z))
    ;; x / y / z
    (println(/ x y z))
    ;;x ^ 2 + 3y + z
    (println(+ (Math/pow x 2) (* y 3) z))
    ;; z^x + x^z
    (println(+ (Math/pow z x)(Math/pow x z)))
    ;; z/y + x
    (println(+ (/ z y) x))
    ;; xyz + 1
    (println(+ (* x y z) 1))
    ;; xyz - 1
    (println(-(* x y z) 1))
)

;; This function is to practice the different logical operators found in cloure. 
(defn exercise-logic []
    (def a 4)
    (def b 8)
    (def c 3)

    ;; a> b
    (println(> a b))
    ;; b > a
    (println(> b a))
    ;; a < b
    (println(< a b))
    ;; b < c
    (println(< b c))
    ;; c >= c
    (println(>= c c))
    ;; a = c
    (println(= a c))
    ;; a <= b
    (println(<= a b))
    ;; a < b and b > c
    (println(and (< a b) (> b c)))
    ;; a < b or b > c
    (println(or (< a b) (> b c)))

)