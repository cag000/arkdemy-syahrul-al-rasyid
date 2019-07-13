import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

public class ResultJSON{
    public ResultJSON{String name, int age, String address, list<String> hobbies, boolean isMarried, boolean interestInCoding, HashMap<String, list<listSchoolInMajor>listSchool>, HashMap<String,String> skills
        //constructor
        this.name = name;
        this.age = age;
        this.address = address;
        this.hobbies = hobbies;
        this.isMarried = isMarried;
        this.interestInCoding = interestInCoding;
        this.listSchool = listSchool;
        this.skills = skills;
    }
    public ResultJSON(String name, int age,String address  ){
        this(name, age, address, null, false, false, null, null)
    }
   private String name;
   private int age;
   private String address;
   private list<String> hobbies;
   private boolean isMarried;
   private boolean interestInCoding;
   private HashMap <String, list<listSchoolInMajor>> listSchool;
   private HashMap <String,String> skills;
   
   public void setName (String name){
       this.name = name;
   }
   public String getName(){
       return this.name;                    //
   }
    public void setAge (String age){
       this.age = age;                      
   }
   public int getAge(){
       return this.age;                     // 
   }
    public void setAddress (String address){
       this.address = address;
   }
   public String getAddress(){
       return this.address;                 //
   }
    public void setHobbies (list<String> hobbies){
       this.hobbies = hobbies;              
   }
   public list<String> getHobbies(){
       return this.hobbies;                 //
   }
    public void setIsMarried (boolean isMarried){
       this.isMarried = isMarried;          
   }
   public boolean getIsMarried(){
       return this.isMarried;               //
   }
    public void setInterestInCoding (boolean interestInCoding){
       this.interestInCoding = interestInCoding;
   }
   public boolean getInterestInCoding(){
       return this.interestInCoding         //
   }
    public void setListSchool (HashMap <String, list<listSchoolInMajor>> listSchool){
       this.listSchool = listSchool;
   }
   public HashMap <String, list<listSchoolInMajor>> getListSchool(){
       return this.listSchool;              //  
   }
    public void setSkills (HashMap <String, String> skills){
       this.skills = skills;
   }
   public HashMap <String, String> getSkills(){
       return this.skills;                  //
   }
   
  @Override
  public String toString(){
      return "ResultJSON{" +
             "name='" + name + '\'' +
             ", age=" + age +
             ", address=" + address +
             ", hobbies=" + hobbies +
             ", isMarried=" + isMarried +
             ", interestInCoding=" + interestInCoding +
             ", listSchool=" + listSchool +
             ", skills=" + skills
             '}';
  }

}