(ns myapp.core
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn fibonacci [x] ;;Funcion recursiva para serie de Fibonacci
(if (<= x 2) 1 ;;los dos primeros elementos dela serie siempre son "1"
    (+ (fibonacci (- x 2)) (fibonacci (- x 1))))) ;; Se suma el num de la serie en dos lugares menos con el numero con un lugar menos



(defn factorial [x]


(if (<= x 1) 1
    (* (factorial (- x 1)) x)))







(defn -main [& args]

  (let [arg-1 (or (first args) "0")
n (Integer/parseInt arg-1)]

(println "fib(" n ") = " (fibonacci n))
(println "!(" n ") = " (factorial n))))
	;; (foo "main!!"))
