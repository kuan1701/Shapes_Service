package com.intexsoft.test_task.shapes_calculator.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestDto {

  @NotBlank(message = "Type is mandatory")
  private String type;
  @Valid
  private List<Double> parameters;
}
