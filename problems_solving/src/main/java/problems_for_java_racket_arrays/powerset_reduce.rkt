#lang racket
(define (powerset lst)
  (foldr
   (lambda (elem acc)
     (append acc (map (lambda (subset) (cons elem subset)) acc)))
   '(())
   lst))
(displayln "Hatványhalmaz (1 2):")
(displayln (powerset '(1 2)))

(displayln "Hatványhalmaz (1 2 3):")
(displayln (powerset '(1 2 3)))
