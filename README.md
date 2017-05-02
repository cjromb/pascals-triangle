# pascals-triangle
Pascal's Triangle

Created for Louis Salin at SC on 2017.05.02

Hi Louis,

I just got home, had to take care of a few things, and then finished this up.

I'm including the pseudocode.txt file, which has a little of the content that I'd written while I was there.

I'm also including the Java file, which I'd created while I was there.

The main difference between what I had there and now, is that I changed the data structure from ArrayList to LinkedList.  Seeing there's not much array activity other than adding rows at the end and accessing each previous row, it was a tossup between ArrayList and LinkedList.  I chose LinkedList, because it's prettier getting the last row with .getLast() instead of a size calculation. :)

I think the base logic is the same other than that.

I'm interested in knowing if this is what you were looking for.  If not, I'm always open to hearing what you were interested in seeing instead.

PS.  I did NOT look up Pascal's Triangle on the internet.  I DID look up getLast for ArrayList, because it wasn't working.  That's how I found out it belonged to LinkedList, not ArrayList.

I did consider using a primitive integer array.  It could have worked, even though each row was going to be a different size, but this looked a bit cleaner to me, and also gave me more options for using functions.  For example, instead of a for each loop, if the object were more complicated, I might want to use an Iterator.

It was truly wonderful meeting all of you today. 

