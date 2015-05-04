package de.chkal.mvc.ctrl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Named
@RequestScoped
public class Messages {

  private final List<String> infos = new ArrayList<>();
  private final List<String> errors = new ArrayList<>();

  public Messages addInfo(String info) {
    infos.add(info);
    return this;
  }

  public List<String> getInfos() {
    return Collections.unmodifiableList(infos);
  }

  public Messages addError(String error) {
    errors.add(error);
    return this;
  }

  public List<String> getErrors() {
    return Collections.unmodifiableList(errors);
  }

}
