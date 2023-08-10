# DemolishingRoads
Hello!
This code will help you find the minimum number of roads to be demolished to satisfy the below condition,
Condition to demolish : If a subset of these houses [n] is picked having size m, then in this subset there should exist at least one pair of houses that does not have a direct road between them.
For Example: There are 4 houses in the town. So, the total number of roads in the town will be 6. Suppose, if m value is 3, then 2 roads have to be demolished to satisfy the condition. If only 1 road is demolished, then there will be at least one subset of size 3 which will have a road between all pairs of houses. More than 2 roads can also be demolished, but the minimum number of roads to be demolished is 2.
Constraints:
3<=n<=100000
3<=m<=n

Example 1:                                                                                     
Sample input: n=4, m=3                                                            
Output: 2 

Example 2:
Sample input: n=5, m=3
Output: 4
