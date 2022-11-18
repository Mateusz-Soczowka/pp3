public class DrivingLicense
{
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private String teaofOfIssue;
    private String licenseCategory;
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;  
    }
    
    public String toString()
    {
        return name+" "+surname;
    }
    
}
