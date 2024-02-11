package ClubMember;

public class ClubMember {
    String firstName;
    String surname;
    int yearOfJoining;
    
    ClubMember(String f, String s, int j){
        this.firstName = f;
        this.surname = s;
        this.yearOfJoining = j;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getSurName(){
        return surname;
    }
    public int getYearOfJoining(){
        return yearOfJoining;
    }
    
    public void setSurName(String newSurName){
        this.surname = newSurName;
    }
    
     public String toString(){
                return "FirstName: "+firstName+ "\nSurName: "+surname+"\nYear Of Joining: "+yearOfJoining;
          }
    }