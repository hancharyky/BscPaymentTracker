1) The input should be checked
2) We're working with resources so, should remove throw on main method and add meaningful error descriptions in log
3) Printing the list of net values should be implemented asynchronously.
4) Introduce logger to make debugging more easy
5) Change logic to be more suitable for unit testing
6) Introduce Spring to make injection easier and remove tight coupling
7) Bonus question is possible to implement but i need more time.  Me dessision is not suitable for this extension. I'd suggest to rewrite some parts
of it to delete the Map and to introduce class Currency to maintain all operation with object but not text. I did poor analysis, and payed for it.
