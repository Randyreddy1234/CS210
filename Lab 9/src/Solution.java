class Solution{

    public int find(int size, HashTable mytable, String word){
        //fill this in so as to minimize collisions
        //takes in the HashTable object and the word to be found
        //the only thing you can do with the HashTable object is call "check"
        //this method should return the slot in the hashtable where the word is
        int HashIndex = primaryHash(word,size);
        int jump = secondaryHash(word,HashIndex,size);

        while(!mytable.check(HashIndex,word)){
            HashIndex = (HashIndex + jump) % size;
        }

        return HashIndex;
    }

    public String[] fill(int size, String[] array){
        int HashIndex,jump;
        //takes in the size of the hashtable, and the array ofStrings to be placed in the hashtable
        //this should add all the words into the hashtable using some system
        //then it should return the hashtable array
        String[] hashtable = new String[size];
        for(int i=0;i<size;i++){
            hashtable[i]="";
        }

        for(int i = 0; i < array.length; i++){
            HashIndex = primaryHash(array[i],size);
            //checking if space is not occupied, double hashes if not empty
            if(hashtable[HashIndex] != ""){
                jump = secondaryHash(array[i],HashIndex,size);
                while(hashtable[HashIndex] != ""){
                    HashIndex = (HashIndex + jump)%size;
                }
            }
            hashtable[HashIndex] = array[i];
        }
        return hashtable;
    }

    public int primaryHash(String word,int size){
        int unique=0;
        int hashIndex=0;
        char temp;
        //Step 1 - generating unique numbers for words (pos. if letter in alphabet * 128^(index of letter in word)
        for(int j = 0; j < word.length(); j++){
            temp = word.charAt(j);
            //unique += (long) Math.sqrt(val * Math.pow(val,j));
            unique = (17 * unique + (int)temp) % size;
        }
        //unique = (long)Math.sqrt(unique);
        //Step 2 - generating hash index
        hashIndex = (int)unique%size;
        return hashIndex;
    }

    public int secondaryHash(String word,int primaryHash,int size){
        int jump = 0;
        char temp;
        for(int j = 0; j < word.length(); j++){
            temp = word.charAt(j);
            //unique += (long) Math.sqrt(val * Math.pow(val,j));
            jump = (17 * jump + (int)temp) % size;
        }
        return jump;
    }
}