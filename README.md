# Team weforgot: Kevin Li, Justin Mohabir, Jonathan Song
## Tests performed
1. We created an array of size 100000, containing integers 0 to 99999.
2. We ran a binary search on every element in that array, and recorded the time elapsed by subtracting currentTimeMillis before the search, from currentTimeMillis after the search
3. We took the time elapsed and divided it by the array size to get the average time needed to search for 1 element
4. We repeated steps 1-3 100 times, and placed those average times into a second array 
5. We calculated an average using all those times in the second array
6. We repeated the above steps for arrays of sizes 75000, 50000, 25000, 20000, 15000, 10000, 5000, and 1000
7. The above steps were repeated for linear search, then we graphed the results


## Results
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
|1000        |               .00007               |              .00031                |       .00303       | 
|  Averages  |                                    |                                    |                    | 

![Binary Average Time, Linear Average Time and Difference in Time](https://user-images.githubusercontent.com/58864927/146707414-42046b39-1690-4c21-b296-5774365d92a3.png)
The time for a binary search is so small in comparison to the time for a linear search, that the graphs linear search time, and difference in time, overlap

## Conclusions
