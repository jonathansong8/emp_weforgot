# Team weforgot: Kevin Li, Justin Mohabir, Jonathan Song
## Tests performed
Part 1:
1. We created an array of size 100000, containing integers 0 to 99999.
2. We ran a binary search on every element in that array, and recorded the time elapsed by subtracting currentTimeMillis before the search, from currentTimeMillis after the search
3. We took the time elapsed and divided it by the array size to get the average time needed to search for 1 element
4. We repeated steps 1-3 100 times, and placed those average times into a second array 
5. We calculated an average using all those times in the second array
6. We repeated the above steps for arrays of sizes 75000, 50000, 25000, 20000, 15000, 10000, 5000, and 1000
7. The above steps were repeated for linear search, then we graphed the results

Part 2:
1. We ran a binary search for the last number in an array of size 80000000, 100 times
2. We recorded the time elapsed by subtracting currentTimeMillis before the search, from currentTimeMillis after the search
3. We divided the time elapsed by the number of repetitions, which is 100, in order to get an average time for the worst case scenario
4. We repeated steps 1-3 for arrays of sizes 70000000, 60000000, 50000000, 40000000, 30000000, 20000000, 10000000, 1000000
5. We graphed the results
6. The above steps were repeated for linear search

## Results
### Part 1
| Array Size | Binary Average Time (milliseconds) | Linear Average Time (milliseconds) | Difference in Time |
|------------|------------------------------------|------------------------------------|--------------------|
|100000      |               .0000612             |              .0278356              |       .0277744     |                           
|75000       |               .00006173            |              .02034986             |       .02028813    |                           
|50000       |               .0000574             |              .01354339             |       .01348599    | 
|25000       |               .0000572             |              .0068148              |       .0067576     | 
|20000       |               .0000565             |              .0053185              |       .0052618     | 
|15000       |               .0000493             |              .004123               |       .0040737     | 
|10000       |               .000056              |              .0028123              |       .0027563     | 
|5000        |               .000046              |              .001278               |       .001232      |
|1000        |               .00007               |              .00031                |       .00024       | 

![Binary vs Linear Search (1)](https://user-images.githubusercontent.com/58864927/146849780-5bf48388-dce5-4d52-a322-bb60ada89f9b.png)

The time for a binary search is so small in comparison to the time for a linear search, that the graphs of linear search time and difference in time overlap

### Part 2
| Array Size |  Binary Worst Case (milliseconds) | Linear Worst Case (milliseconds) | Difference in Time |
|------------|-----------------------------------|----------------------------------|--------------------|
|80000000    |             0.01                  |             93.63                |       93.62        |                           
|70000000    |             0.02                  |             83.3                 |       83.28        |                           
|60000000    |             0.01                  |             71.97                |       71.96        | 
|50000000    |             0.01                  |             62.35                |       62.34        | 
|40000000    |             0.02                  |             50.14                |       50.12        | 
|30000000    |             0.01                  |             33.63                |       33.62        | 
|20000000    |             0.0                   |             23.65                |       23.65        | 
|10000000    |             0.01                  |             11.62                |       11.61        |
|1000000     |             0.01                  |             1.11                 |       1.1          | 

![Binary vs Linear worst case (1)](https://user-images.githubusercontent.com/58864927/146864761-e2edbe3a-5df6-4f1c-a6a6-3feb221a4c83.png)

Once again, the graph of Linear overlaps with that of the difference in time.

## Conclusions
From Part 1:
* As the size of the array increases, the difference in time between Binary and Linear increases.
* The time elapsed for both the Binary and Linear search scale linearly with the size of the array
* The difference in speed between Binary and Linear increases significantly as the array size increases. The speed of binary hardly changes at all, while linear becomes very slow

From Part 2:
* Even in the worst case scenario, Binary outperforms Linear significantly. Even with 100 repetitions, binary search had a time of 0 for all array sizes
* The time elapsed for both the Binary and Linear search again scale linearly
