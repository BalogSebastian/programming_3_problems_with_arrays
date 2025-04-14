#lang racket

(define (adjust-salaries-map lst)
  (map (lambda (salary)
         (if (< salary 100)
             (min 100 (+ salary (* salary 0.2)))
             salary))
       lst))

;; Teszt
(displayln (adjust-salaries-map '(80 90 100 110))) ; => '(96 100 100 110)
