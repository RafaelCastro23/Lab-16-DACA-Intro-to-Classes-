/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
        DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrgin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+getSurname() : String
+getGivenName() : String
+getUscisNumber() : String
+getCountryOfOrgin() : String
+getBirthday() : int
+getValidFromDate() : int
+getExpirationDate() : int
+getSex() : char

+setSurname(surname : String) : void
+setGivenName(givenName : String) : void
+setUscisNumber(uscisNumber : String) : void
+setCountryOfOrgin(countryOfOrgin : String) : void
+setBirthday(birthday : int) : void
+setValidFromDate(validFromDate : int) : void
+setExpirationDate(validFromDate : int) : void
+setSex(sex : char) : void

+setAll(surname : String, givenName : String, uscisNumber : String, countryOfOrgin : String, birthday : int, validFromDate : int, expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables.
   private String surname;
   private String givenName;
   private String uscisNumber;
   private String countryOfOrgin;
   private int birthday, validFromDate, expirationDate;
   private char sex;


	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	public String getSurname()
    {
        return this.surname;
    }
    public String getGivenName()
    {
        return this.givenName;
    }
    public String getUscisNumber()
    {
        return this.uscisNumber;
    }
    public String getCountryOfOrgin()
    {
        return this.countryOfOrgin;
    }
    public int getBirthday()
    {
        return this.birthday;
    }
    public int getValidFromDate()
    {
        return this.validFromDate;
    }
    public int getExpirationDate()
    {
        return this.expirationDate;
    }
    public char getSex()
    {
        return this.sex;
    }

	/***** MUTATORS *****/
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setGivenName(String givenName)
    {
        this.givenName = givenName;
    }
    public void setUscisNumber(String uscisNumber)
    {
        this.uscisNumber = uscisNumber;
    }
    public void setCountryOfOrgin(String countryOfOrgin)
    {
        this.countryOfOrgin = countryOfOrgin;
    }
    public void setBirthday(int birthday)
    {
        this.birthday = birthday;
    }
    public void setValidFromDate(int validFromDate)
    {
        this.validFromDate = validFromDate;
    }
    public void setExpirationDate(int expirationDate)
    {
        this.expirationDate = expirationDate;
    }
    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrgin, int birthday, int validFromDate, int expirationDate, char sex)
    {
     this.setSurname(surname);
     this.setGivenName(givenName);
     this.setUscisNumber(uscisNumber);
     this.setCountryOfOrgin(countryOfOrgin);
     this.setBirthday(birthday);
     this.setValidFromDate(validFromDate);
     this.setExpirationDate(expirationDate);
     this.setSex(sex);
    }
}

//TODO: Write the setter for each instance variable. Remember to include documentation for each method.

	//TODO: Write the setAll method. Remember to include documentation.
