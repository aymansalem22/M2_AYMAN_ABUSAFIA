package practice2;

public class Contact implements Comparable<Contact> {

    private String firstName, lastName, address, phone, email;
    private int age;
    private int id;
    static int addid = 1;
    Gender gender;

    public Contact(String line) throws InvalidInputException {
        System.out.println("okayy");
        setFirstName(line.substring(
                line.indexOf("firstName=") + "firstName=".length(),
                line.indexOf(",", line.indexOf("firstName="))));

        
        setLastName(line.substring(
                line.indexOf("lastName=")+ "lastName=".length(),
                        line.indexOf(",", line.indexOf("lastName="))));

        
        setAddress(line.substring(
                line.indexOf("address=") + "address=".length(),
                line.indexOf(",", line.indexOf("address="))));
        

        
        setPhone(line.substring(
                line.indexOf("phone=") + "phone=".length(),
                line.indexOf(",", line.indexOf("phone="))));

      
        
        setEmail(line.substring(
                line.indexOf("email=") + "email=".length(),
                line.indexOf(",", line.indexOf("email="))));
        
       
        
        setAge(Integer.parseInt(line.substring( 
        line.indexOf("age=")+"age=".length(),
        line.indexOf(",",line.indexOf("age=")))));
        
        
        
        setId(Integer.parseInt(line.substring( 
        line.indexOf("id=")+"id=".length(),
        line.indexOf(",",line.indexOf("id=")))));
        
        
        String g=line.substring(
                line.indexOf("gender=")+"gender=".length(),
                line.indexOf("}",line.indexOf("gender=")));
        
                 setGender(g);
    }

    public Contact(String firstName, String lastName, String address,
            String phone, String email, int age, String gender) throws InvalidInputException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setPhone(phone);
        this.setEmail(email);
        this.setAge(age);
        this.setGender(gender);
        this.id=addid++;
    }
    
    
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)
            throws InvalidInputException {
        if (!firstName.isEmpty() && firstName.length() <= 8) {
            this.firstName = firstName;
        } else {
            throw new InvalidInputException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName)
            throws InvalidInputException {

        if (!lastName.isEmpty() && lastName.length() <= 8) {
            this.lastName = lastName;

        } else {

            throw new InvalidInputException();

        }
    }

    public String getAddress() {
        return address;
    }

    public final void setAddress(String address)
            throws InvalidInputException {
        if (!(address.trim().isEmpty())) {
            this.address = address;
        } else {
            throw new InvalidInputException();
        }
    }

    public String getPhone() {
        return phone;
    }

    public final void setPhone(String phone)
            throws InvalidInputException {
        if (phone.length() == 13) {
            this.phone = phone;
        } else {
            throw new InvalidInputException();
        }
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email)
            throws InvalidInputException {
        String s = email;
        if (s.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
            this.email = email;
        } else {
            throw new InvalidInputException();
        }
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age)
            throws InvalidInputException {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            throw new InvalidInputException();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public final void setGender(String genderStr) {
        switch (genderStr) {
            case "m":
                gender = Gender.MALE;
                break;
            case "f":
                gender = Gender.FEMALE;
                break;
        }

    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastName=" + lastName
                + ", address=" + address + ", phone=" + phone + ", email="
                + email + ", age=" + age + ", id=" + id + ", gender=" + gender + '}';
    }

    @Override
    public int compareTo(Contact o) {
        int diff = this.gender.compareTo(o.gender);
        int diffG = this.firstName.compareTo(o.firstName);
        if (diff != 0) {
            return diff;
        } else if (diffG != 0) {
            return diffG;
        } else {
            return this.lastName.compareTo(o.lastName);
        }
    }

}
