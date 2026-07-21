/********************************************
*	DEVELOPER:Rafael Castro
* COLLABORATORS: <names>
*	LAST MODIFIED:	7/20/26
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
//surname (Ex: Chapeton-Lamas)
//givenName (Ex: Nery)
//uscisNumber (Ex: 12-4-789)
//countryOfOrigin (Ex: Guatemala)
//this is int birthday, validFromDate, and expirationDate (Integers in the form of a Julian Day number. For example: Jan 1, 2000 = 2451564)
//This is a char--- sex (Ex: 'M' for Male)
class Main 
{
  public static void main(String[] args) 
	{
        DACArecipient test1 = new DACArecipient();
        DACArecipient test2 = new DACArecipient();

        test1.setSurname("Chapeton-Lamas");
        test1.setGivenName("Nery");
        test1.setUscisNumber("12-3-456");
        test1.setCountryOfOrgin("Guatemala");
        test1.setBirthday(123456);
        test1.setValidFromDate(234567);
        test1.setExpirationDate(2345789);
        test1.setSex('M');

        System.out.println("Person 1");
        System.out.println("-----------------------------");
        System.out.println("Surname: " + test1.getSurname());
        System.out.println("Given name: " + test1.getGivenName());
        System.out.println("USCIC number: " + test1.getUscisNumber());
        System.out.println("Birthday (JDN): " + test1.getBirthday());
        System.out.println("Valid From Date (JDN): " + test1.getValidFromDate());
        System.out.println("Expiration Date (JDN): " + test1.getExpirationDate());
        System.out.println("Sex: " + test1.getSex());
        System.out.println("\n");

        test2.setAll("Mendez", "Javier", "546-3-455", "Venezuela", 2451564, 3956753, 3956840, 'M');

        System.out.println("Person 2");
        System.out.println("-----------------------------");
        System.out.println("Surname: " + test2.getSurname());
        System.out.println("Given name: " + test2.getGivenName());
        System.out.println("USCIC number: " + test2.getUscisNumber());
        System.out.println("Birthday (JDN): " + test2.getBirthday());
        System.out.println("Valid From Date (JDN): " + test2.getValidFromDate());
        System.out.println("Expiration Date (JDN): " + test2.getExpirationDate());
        System.out.println("Sex: " + test2.getSex());
    //TODO PART 3: test your setter/getter here!
  }
}
