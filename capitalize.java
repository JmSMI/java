/**
* capitalize the first letter of each word in a sentence
* no streams
* @author James
* @version 1
* @date September 28 2020, BCIT Comp1451 Harrison
*/

public String capitalize(String string)
    {
        if(string == null || string.isBlank())
        {
            return null;
        }
    
        // list of words like "this movie is good" is a list of size 4
        ArrayList<String> sentence; 
        sentence = new ArrayList<>();
        String[] words = null;
        String capitalSentence= null;
        
        words = string.split(" ");
        
        for(int i = 0; i < words.length; i ++)
        {
            sentence.add(words[i]);
        }
                
        //for each word
        for(int i = 0; i < sentence.size(); i ++)
        {
            String word          = null;
            String firstLetter   = null;
            String restOfLetters = null;
            String capitalWord   = null;
            
            word = sentence.get(i);  //  this
            
            //  get the first letter and capitalize it
            //  get the rest of the letters
            firstLetter   = word.substring(0,1).toUpperCase();
            restOfLetters = word.substring(1).toLowerCase();
            
            // put the substrings together again
            capitalWord   = firstLetter + restOfLetters;
            
            //  and then replace the word in the list
            sentence.set(i, capitalWord);
        }
        
        //  convert the list back to a string with spaces
        for(int i = 0; i < sentence.size(); i ++)
        {
            if(i == 0)
            {
                capitalSentence = sentence.get(i);
                capitalSentence += " ";
            }
            else
            {
                capitalSentence += sentence.get(i);
                capitalSentence += " ";
            }
        }
        capitalSentence.trim();
        
        return capitalSentence;
    }
