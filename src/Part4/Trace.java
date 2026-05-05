/*

{ 5, 4, 2, 9, 1, 7, 3, 8, 6 }

Quicksort:
[ 5, 4, 2, 9, 1, 7, 3, 8, 6 ]

1: Pivot = 5
1: swap 1 and 9
1: swap 3 and 9
1: swap 5 and 3
1: Partition: 7
1: [3, 4, 2, 1, 5, 7, 9, 8, 6 ] - Array after partitioning
1: [3, 4, 2, 1] - sort left part
2:      Pivot = 3
2:      swap 1 and 4
2:      swap 2 and 3
2:      Partition: 3
2:      [2, 1, 3, 4] - Array after partitioning
2:      [2, 1] - sort left part
3:          Pivot = 2
3:          swap 2 and 1
3:          Partition: 2
3:          [1, 2] - Array after partitioning
3:          [1] - sort left part
3:          [] - sort right part
3:          [1, 2] - sort result
2:      [4] - sort right part
2:      [1, 2, 3, 4] - sort result
1: [ 7, 9, 8, 6 ] - sort right part
2:      Pivot = 7
2:      swap 6 and 9
2:      swap 7 and 6
2:      Partition: 2
2:      [6, 7, 8, 9] - Array after partitioning
2:      [6] - sort left part
2:      [8, 9] - sort right part
3:          Pivot = 8
3:          Partition: 1
3:          [8, 9] - Array after partitioning
3:          [] - sort left part
3:          [9] - sort right part
3:          [8, 9] - sort result
2:      [6, 7, 8, 9] - sort result
1: [1, 2, 3, 4, 5, 6, 7, 8, 9] - sort result


 */