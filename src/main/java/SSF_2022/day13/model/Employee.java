package SSF_2022.day13.model;

import java.util.*;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



//@Data
public class Employee {
    
    @NotEmpty(message = "First Name is a mandatory field")
    @Size(min =30, max = 150, message = "First Name must be between 30 to 100 characters")
    private String firsName;

    @NotEmpty(message = "Last Name is a mandatory field")
    @Size(min =30, max = 150, message = "Last Name must be between 30 to 100 characters") 
    private String lastNanme;

    @Email(message = "Email should be a valid format")
    @Size(max = 120)
    @Pattern(regexp = ".+@,*\\",message = "Wrong email format")
    @NotBlank
    private String email;

    @Pattern(regexp = "(\\8|9)[0-9]{7})", message = "Invalid phone format")
    private String phoneNumber;

    @Min(value = 1500, message = "Min salary starts from 1500")
    @Max(value = 400000,message = "Max salary 400000")
    private Integer salary;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @PastOrPresent(message = "Birthday cannot be greater than today")
    private Date birthDate;
    private String address;

    @Digits(fraction=0, integer=6,message="Postal code format i.e. 123456")
    private Integer postalCode;

    
    public Employee() {
    }
    
    public Employee(String firsName, String lastNanme, String email, String phoneNumber, Integer salary, Date birthDate,
            String address, Integer postalCode) {
        this.firsName = firsName;
        this.lastNanme = lastNanme;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthDate = birthDate;
        this.address = address;
        this.postalCode = postalCode;
    }
    public String getFirsName() {
        return firsName;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public String getLastNanme() {
        return lastNanme;
    }
    public void setLastNanme(String lastNanme) {
        this.lastNanme = lastNanme;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firsName == null) ? 0 : firsName.hashCode());
        result = prime * result + ((lastNanme == null) ? 0 : lastNanme.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (firsName == null) {
            if (other.firsName != null)
                return false;
        } else if (!firsName.equals(other.firsName))
            return false;
        if (lastNanme == null) {
            if (other.lastNanme != null)
                return false;
        } else if (!lastNanme.equals(other.lastNanme))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (postalCode == null) {
            if (other.postalCode != null)
                return false;
        } else if (!postalCode.equals(other.postalCode))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [firsName=" + firsName + ", lastNanme=" + lastNanme + ", email=" + email + ", phoneNumber="
                + phoneNumber + ", salary=" + salary + ", birthDate=" + birthDate + ", address=" + address
                + ", postalCode=" + postalCode + "]";
    }

    

}
