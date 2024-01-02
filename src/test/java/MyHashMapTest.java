import org.example.MyHashMap;
import org.example.MyLinkedHashMap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void givenaSentance_WhenWordsareAddedToList_ShouldReturnWordFrequencyUC1(){
        String sentence="To be or not to be";
        MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word:words){
            Integer value= myHashMap.get(word);
            if(value==null) value=1;

            else value+=1;
            myHashMap.add(word,value);
        }
        int frequency= myHashMap.get("to");
        System.out.println(myHashMap);

        System.out.println(myHashMap.size());
        Assert.assertEquals(2,frequency);

    }
    @Test
    public void givenaSentance_WhenWordsareAddedToList_ShouldReturnParanoidFrequencyUC2(){

        String sentence="Paranoids are not paranoid because they are paranoid but"+
                "because they keep putting themselves deliberately into"+
                "paranoid avoidable situations";
        MyLinkedHashMap<String,Integer> myHashMap=new MyLinkedHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word:words){
            Integer value= myHashMap.get(word);
            if(value==null) value=1;

            else value+=1;
            myHashMap.add(word,value);
        }
        System.out.println(myHashMap);
        int frequency= myHashMap.get("paranoids");
        Assert.assertEquals(1,frequency);
    }
    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequencyAndRemoveAvoidable() {
        String sentence = "Paranoids are not paranoid because they are paranoid but" +
                " because they keep putting themselves deliberately into" +
                " paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null) value = 1;
            else value += 1;

            myHashMap.add(word, value);
        }
        System.out.println(myHashMap);

        int frequencyBeforeRemoval = myHashMap.get("paranoid");
        Assert.assertEquals(3, frequencyBeforeRemoval);
        myHashMap.remove("avoidable");
        int frequencyAfterRemoval = myHashMap.get("paranoid");
        Assert.assertEquals(3, frequencyAfterRemoval);
        Assert.assertNull(myHashMap.get("avoidable"));
        System.out.println(myHashMap);
    }
}
