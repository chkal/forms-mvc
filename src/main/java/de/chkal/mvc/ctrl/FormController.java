package de.chkal.mvc.ctrl;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.mvc.validation.ValidationResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/forms")
@Controller
@View("forms.jsp")
public class FormController {

  @Inject
  private Models models;

  @Inject
  private ValidationResult validationResult;

  @Inject
  private Messages messages;

  @GET
  public void listItems() {
    // nothing to do here
  }

  @POST
  @ValidateOnExecution(type = ExecutableType.NONE)
  public void createItem(@BeanParam @Valid FormData form) {

    // we want to populate the form with initial value
    models.put("form", form);

    if (validationResult.isFailed()) {

      validationResult.getAllViolations().stream()
          .map(violation -> violation.getPropertyPath().toString() + " " + violation.getMessage())
          .forEach(messages::addError);
      return;

    }

    messages.addInfo("Got text: " + form.getText());
    messages.addInfo("Got number: " + form.getNumber());
    messages.addInfo("Got decimal: " + form.getDecimal());
    messages.addInfo("Got enum: " + form.getChoice());
    messages.addInfo("Got boolean: " + form.isBool());

  }

}
