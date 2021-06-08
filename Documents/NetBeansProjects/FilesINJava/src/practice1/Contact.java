
package practice1;


public class Contact implements Comparable<Contact>{
    private String firstName,lastName,address,phone;
    private int age;
    

    public Contact(String line) throws InvalidInputException{
    
        setFirstName(line.substring(
        line.indexOf("firstName=")+"firstName=".length(),
        line.indexOf(",",line.indexOf("firstName="))));
        
        setLastName(line.substring(
        line.indexOf("lastName=")+"lastName=".length(),
        line.indexOf(",",line.indexOf("lastName="))));
        
        setAddress(line.substring(
        line.indexOf("address=")+"address=".length(),
        line.indexOf(",",line.indexOf("address="))));
        
        setPhone(line.substring(
        line.indexOf("phone=")+"phone=".length(),
        line.indexOf(",",line.indexOf("phone="))));
    
        setAge(Integer.parseInt(line.substring(
        line.indexOf("age=")+"age=".length(),
        line.indexOf("}",line.indexOf("age="))))); 
        
        
    }
    

    public Contact(String firstName, String lastName, String address,
            String phone, int age) throws InvalidInputException {
        this.setAge(age);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhone(phone);
        this.setAddress(address);
        
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)
    throws InvalidInputException{
        if(!firstName.isEmpty()&&firstName.length()<=8){
        this.firstName = firstName;}
        else{
        throw new InvalidInputException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws InvalidInputException {
        if(!lastName.isEmpty()&&lastName.length()<=8){
        this.lastName = lastName;}
        else{
        throw new InvalidInputException();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws InvalidInputException {
        if(!(address.trim().isEmpty())){
                this.address = address;
        }
        else{
        throw new InvalidInputException();
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws InvalidInputException {
        if(phone.length()==13){
        this.phone = phone;
        }
        else{
        throw new InvalidInputException();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidInputException {
        if(age>0&&age<120){
        this.age = age;}
        else{
        throw new InvalidInputException();
        }
    }

 

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ",lastName=" + lastName + ",address=" + address + ",phone=" + phone + ",age=" + age +  '}';
    }


    
    
    
    @Override
    public int compareTo(Contact o) {
        int diff=this.firstName.compareTo(o.firstName);
        if(diff!=0){
        return diff;
        }
        return this.lastName.compareTo(o.lastName);
    }
    
}
