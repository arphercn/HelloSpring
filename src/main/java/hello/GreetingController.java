package hello;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";

    @RequestMapping("/greeting")
    public HttpEntity<Greeting> greeting(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name
    ) {
        Greeting greeting = new Greeting(String.format(TEMPLATE, name));
        //  Both linkTo(…) and methodOn(…) are static methods on ControllerLinkBuilder that allow
        // you to fake a method invocation on the controller.
        // The LinkBuilder returned will have inspected the controller method’s mapping annotation to
        // build up exactly the URI the method is mapped to
        greeting.add(linkTo(methodOn(GreetingController.class).greeting(name)).withSelfRel());

        return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
    }
}