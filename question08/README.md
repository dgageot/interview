# Transform Word

Given a source word, target word and an English dictionary, transform the source word to target by
changing/adding/removing 1 character at a time, while all intermediate words being valid English words.
Return the transformation chain which has the smallest number of intermediate words.

Source: http://www.ardendertat.com/2011/10/17/programming-interview-questions-8-transform-word/

## Solution

Brute force: 
Optimal: 


pre scan the english dictionary

For each word:
 - Put each work into a Map

For each word:
 - Compute all the changing/adding/removing 1 character
        - Word of size s
        - removing: s
        - changing: 25 * s
        - adding: 25 * s
        Total: O(1) per word so O(n)
 - For each of those words, lookup into the dictionary it it exists O(1)
 - If is does, add a possible child to the Map O(1)
 
--> O(n)
 
When given a work, perform a search for the target word
 - Depth first wouldn't give the smallest number of intermediate words
 - Need a breadth first

