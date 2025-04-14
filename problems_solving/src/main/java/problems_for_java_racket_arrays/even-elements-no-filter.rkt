#lang racket

(define (even-elements lst)
  (define (helper lst acc)
    (cond
      [(empty? lst) (reverse acc)]
      [(even? (first lst)) (helper (rest lst) (cons (first lst) acc))]
      [else (helper (rest lst) acc)]))
  (helper lst '()))

(displayln (even-elements '(1 2 3 4 5 6 7 8)))
