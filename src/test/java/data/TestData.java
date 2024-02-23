package data;

import config.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;
import utils.GenUserData;

public class TestData {

    public String firstName,
            lastName,
            emailAddress,
            genderValue,
            phoneNumber,
            dayOfBirthDay,
            monthOfBirthDay,
            yearOfBirthDay,
            subjectChar,
            hobbieValue,
            namePicture,
            fullAddress,
            nameState,
            nameCity;

    public TestData() {

        System.setProperty("env", System.getProperty("env", "konturPreProd"));

        ProjectConfig projectConfig = ConfigFactory.create(ProjectConfig.class);

        try {
            firstName = projectConfig.firstName();
            lastName = projectConfig.lastName();
            emailAddress = projectConfig.emailAddress();
            genderValue = GenUserData.getRandomGenderValue();
            phoneNumber = projectConfig.phoneNumber();
            dayOfBirthDay = String.valueOf(GenUserData.getRandomDayOfBirthDay());
            monthOfBirthDay = GenUserData.getRandomMonthOfBirthDay(dayOfBirthDay);
            yearOfBirthDay = String.valueOf(GenUserData.getRandomYearOfBirthDay());
            subjectChar = GenUserData.getRandomGetRandomSubject();
            hobbieValue = GenUserData.getRandomHobbies();
            namePicture = "01.jpg";
            fullAddress = GenUserData.getRandomFullAddress();
            nameState = GenUserData.getRandomNameState();
            nameCity = GenUserData.getRandomNameCity(nameState);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}