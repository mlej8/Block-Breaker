/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/



<<<<<<< HEAD
// line 7 "Block223StateMachine.ump"
=======
// line 7 "Block223 v3.ump"
>>>>>>> master
public class UserRole
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UserRole Attributes
  private String password;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UserRole(String aPassword)
  {
    password = aPassword;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public String getPassword()
  {
    return password;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "password" + ":" + getPassword()+ "]";
  }
}