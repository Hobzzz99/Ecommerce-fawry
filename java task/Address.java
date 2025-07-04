public class Address 
{
    private String city;
    private String street;
    private String building;
    private String phoneNumber;

    public Address(String city, String street, String building, String phoneNumber) 
    {
        this.city = city;
        this.street = street;
        this.building = building;
        this.phoneNumber = phoneNumber;
    }

    public String getCity() 
    {
        return city;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }
    public String getStreet() 
    {
        return street;
    }
    public void setStreet(String street) 
    {
        this.street = street;
    }
    public String getBuilding() 
    {
        return building;
    }
    public void setBuilding(String building) 
    {
        this.building = building;
    }
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() 
    {
        return "Address [City =" + city + ", Street =" + street + ", Building =" + building + ", Phone Number ="
                + phoneNumber + "]";
    }

}