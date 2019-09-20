package docker.demo.app


import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class MainController {

    private static List<Person> persons = new ArrayList<Person>()

    static {
        try {
            persons.add(new Person('Bill', 'Gates', '09756748'))
            persons.add(new Person('Steve', 'Jobs', '98485858'))
        }catch(Exception ex){
            ex.getMessage();
        }
    }

    // Inject via application.properties
    @Value('${welcome.message}')
    private String message

    @Value('${error.message}')
    private String errorMessage

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index(Model model) {

        model.addAttribute('message', message)

        return 'index'
    }

    @RequestMapping(value = '/personList', method = RequestMethod.GET)
    String personList(Model model) {

        model.addAttribute('persons', persons)

//        return 'personList'
        return 'garden'
    }

    @RequestMapping(value = '/addPerson', method = RequestMethod.GET)
    String showAddPersonPage(Model model) {

        PersonForm personForm = new PersonForm()
        model.addAttribute('personForm', personForm)

        return 'addPerson'
    }

    @RequestMapping(value = '/addPerson', method = RequestMethod.POST)
    String savePerson(Model model, //
                      @ModelAttribute('personForm') PersonForm personForm) {

        String firstName = personForm.getFirstName()
        String lastName = personForm.getLastName()
        Long phone = personForm.getPhone();

        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0 && phone != null) {
            Person newPerson = new Person(firstName, lastName, phone)
            persons.add(newPerson)

            return 'redirect:/personList'
        }

        model.addAttribute('errorMessage', errorMessage)
        return 'addPerson'
    }

}