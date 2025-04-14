#lang racket

(define (adjust-salaries lst)
  (define (helper lst acc)
    (cond
      [(empty? lst) (reverse acc)]
      [else
       (define salary (first lst))
       (define new-salary (if (< salary 100)
                              (min 100 (+ salary (* salary 0.2)))
                              salary))
       (helper (rest lst) (cons new-salary acc))]))
  (helper lst '()))

(displayln (adjust-salaries '(80 90 100 110)))
