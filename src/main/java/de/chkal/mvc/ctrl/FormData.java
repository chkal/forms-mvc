package de.chkal.mvc.ctrl;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class FormData {

  public enum Choice {
    FOO,
    BAR
  }

  @FormParam("text")
  @Size(min = 5)
  private String text;

  @FormParam("number")
  @Min(1)
  @Max(100)
  @NotNull
  private Integer number;

  @FormParam("decimal")
  @Min(1)
  @Max(10)
  @NotNull
  private Double decimal;

  @FormParam("choice")
  @NotNull
  private Choice choice;

  @FormParam("boolean")
  private boolean bool;

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

  public boolean isBool() {
    return bool;
  }

  public void setBool(boolean bool) {
    this.bool = bool;
  }

  public Double getDecimal() {
    return decimal;
  }

  public void setDecimal(Double decimal) {
    this.decimal = decimal;
  }

  public Choice getChoice() {
    return choice;
  }

  public void setChoice(Choice choice) {
    this.choice = choice;
  }
}
