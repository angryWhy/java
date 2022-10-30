package house;

public class service {
    private domain[] houses;
    private int nums = 1;
    public service(int size){
        houses = new domain[size];
        houses[0] = new domain(1,"jack","112","海淀区",2000,"未出租");
    }
    public domain[] list(){
        return houses;
    }
    public boolean addHouse(domain newHouse){
        if(nums == houses.length){
            return false;
        }
        houses[nums++] = newHouse;
        newHouse.setId(nums);
        return true;
    }
    public boolean delHouse(int id){
       int index = -1;
       System.out.println(id==houses[0].getId());
       for(int j = 0;j< houses.length;j++){
           if(id == houses[j].getId()){
               index = j;
               break;
           }
       }
       if(index==-1){
           return false;
       }
        for(int i = index;i< houses.length-1;i++){
            houses[i] = houses[i+1];
        }
        houses[--nums] = null;
        return true;
    }
}
