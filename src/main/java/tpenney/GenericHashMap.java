package tpenney;

public class GenericHashMap<K,V>{
    final K key;
    V value;

    public GenericHashMap(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return  key;
    }

    public V getValue(){
        return  value;
    }

}