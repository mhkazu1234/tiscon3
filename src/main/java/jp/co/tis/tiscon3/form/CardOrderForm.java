package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Size(max = 60)
    private String kanjiNamesei;

    @NotBlank
    @Size(max = 60)
    private String kanjiNamemei;

    @NotBlank
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaNamesei;

    @NotBlank
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaNamemei;

    @NotBlank
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetNamesei;

    @NotBlank
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetNamemei;

    @NotBlank
    @Size(max = 10)
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$")
    private String dateOfBirth;

    @NotBlank
    @Size(max = 6)
    private String gender;

    @NotBlank
    @Size(max = 8)
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$")
    private String zipCode;

    @NotBlank
    @Size(max = 255)
    private String address;

    @NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$")
    private String homePhoneNumber;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$")
    private String mobilePhoneNumber;

    @NotBlank
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank
    @Size(max = 20)
    private String spouse;

    @NotBlank
    @Size(max = 20)
    private String houseClassification;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank
    @Size(max = 120)
    private String job;

    //@NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

 /*   @AssertTrue(message = "なんかおかしいです")
    public boolean isEmployeeNameInput() {
        if (screenName.equals("user") && employerName.isEmpty()) {
            return true;
        }
        return false;
    }*/
    //@NotBlank
    @Size(max = 255)
    private String employerName;

    /*@NotBlank
    @Size(max = 255)
    public String getEmployeeName() {
        return employerName;
    }*/

    //@NotBlank
    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    //@NotBlank
    @Size(max = 255)
    private String employerAddress;

    //@NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    //@NotBlank
    @Size(max = 255)
    private String industryType;

    //@NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    //@NotBlank
    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    //@NotBlank
    @Size(max = 255)
    private String department;

    //@NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

    private String screenName;

}
