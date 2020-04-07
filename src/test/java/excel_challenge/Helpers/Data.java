package excel_challenge.Helpers;

public class Data
{
    private String firstName, lastName, companyName, roleInCompany, address, eMail, phoneNumber;

    public Data(String firstName, String lastName, String companyName, String roleInCompany, String address, String eMail,
                String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.roleInCompany = roleInCompany;
        this.address = address;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public String getRoleInCompany()
    {
        return roleInCompany;
    }
    public String getAddress()
    {
        return address;
    }
    public String geteMail()
    {
        return eMail;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
