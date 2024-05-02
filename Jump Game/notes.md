We call a position in the array a "good index" if starting at that position, we can reach the last index.
Otherwise, that index is called a "bad index".
The problem then reduces to whether or not index 0 is a "good index".
## APPROACH:

Start from the end
good[n-1]=1
Now, go from n-1 to zero
At index i, (finding good[i]):
-   Find the nearest good index to its right (let this be g_i)
-   if, g_i can be reached from i, then i is good, and g_i = i
-   otherwise, g_i = 0
If, good[0] is one, then, return true
