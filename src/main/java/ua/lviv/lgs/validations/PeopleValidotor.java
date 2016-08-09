package ua.lviv.lgs.validations;

import org.dom4j.rule.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.lviv.lgs.entity.People;

import java.util.regex.Matcher;

@Component
public class PeopleValidotor implements Validator{

  Pattern pattern = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

      public boolean supports(Class<?> aClass) {
        return People.class.equals(aClass);
         }

    public void validate(Object olololo, Errors errors) {
               People people = (People) olololo;

          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "namePeople", "name.empty");
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "surname.empty");
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.empty");
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "phone.empty");
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.empty");


     boolean passwordSwitcher = true;

         if (people.getPassword().length() < 3) {
                 errors.rejectValue("password", "password.too.short");
                   passwordSwitcher = false;
                   }
          if (passwordSwitcher) {
             if (!people.getPassword().equals(people.getPasswordConfirm())) {
                 errors.rejectValue("password", "bad.password");
                  }
          }

    Matcher matcher;

        if(!(matcher=pattern.matches(people.getEmail())).matches()){
          errors.rejectValue("email", "bad.email");
           }
     }
  }




