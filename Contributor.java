/*
 * Deborah Lewis
 * CS230: Unit 1 IP
 */
package lewisdeborahunit1v2;

public class Contributor {

    //declare variables
    private final String name;
    private final String city;
    private final String country;
    private final String phoneNumber;
    private final double amount;
    private final int accountID;

    //create constructor to hold infomration from contributor file
    public Contributor(String name, String city, String country, String phone, double amount, int id) { //Custom constructor

        this.name = name;
        this.city = city;
        this.country = country;
        this.phoneNumber = phone;
        this.amount = amount;
        this.accountID = id;
    }

    //format using toString method
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s", name, city, country, phoneNumber, amount, accountID);
    }
}
