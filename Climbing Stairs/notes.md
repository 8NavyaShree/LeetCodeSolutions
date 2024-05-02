## APPROACH
-   Number of ways to reach nth stair is f(n)
-   A person can reach nth stair from either (n-1)th stair or from (n-2)th stair

### STATE TRANSITION FORMULATION
-   So, number of ways to reach nth stair is
        f(n) = f(n-1)+f(n-2)
        
        fibnoci series with f(1)=1 and f(2)=2
