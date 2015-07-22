# team8_odometer
The odometer essentially generates the legitimate odometeric values* and stores it in an array list with the index representing it's value in decimal format.
Method for geneartion of such values: Recurively generate digits

Features:
 - nextValue : given a value we find it's proceeding value by returning the value stored in the next array cell circularly
 - prevValue : given a value we find it's preceeding value by returning the value stored in the previous array cell circularly
 - difference : given 2 odometric values we find the index of the two numbers and subtract the two values. 
                This difference is in decimal format. Hence we return the value in the array whose index is equal to the difference obtained.
                
              
              
              
*legitimate odometric values:
it is an integer whose digits range from 1-6 and the digits should increment strictly
