#lang racket

(define (even-elements-filter lst)
  (filter even? lst))

(displayln (even-elements-filter '(1 2 3 4 5 6 7 8)))
