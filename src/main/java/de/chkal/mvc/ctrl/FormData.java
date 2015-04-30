package de.chkal.mvc.ctrl;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class FormData {

  @FormParam("text")
  @Size(min = 5)
  private String text;

  @FormParam("number")
  @Min(1)
  @Max(100)
  @NotNull
  private Integer number;

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
