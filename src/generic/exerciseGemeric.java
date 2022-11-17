package generic;

import java.util.*;

public class exerciseGemeric {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<>();

    }
}
class User{
    private String id;
    private int age;
    private String name;
    public User(String id,int age,String name){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dao<T>{
    private Map<String,T> map = new HashMap<>();
    public T getT(String id){
        return map.get(id);
    }
    public void updateT(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        ArrayList<T> arr = new ArrayList<>();
        Set<String> keys = map.keySet();
        for(String k :keys){
            arr.add(getT(k));
        }
        return arr;
    }
}
