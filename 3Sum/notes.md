## TWO POINTERS APPROACH:

    -   Sort the array
    -   Loop over the array and fix the first element of the possible triplet, arr[i]
    -   Then use two pointers, l=i+1 and r=n-1 and look at the sum=arr[i]+arr[l]+arr[r],
        1. if sum == 0, add the triplet to the result
        2. if sum<0, increment the left pointer
        3. if sum>0, decrement the right pointer
