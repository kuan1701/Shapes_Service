package com.intexsoft.test_task.shapes_calculator.controller;

import com.intexsoft.test_task.shapes_calculator.dto.RequestDto;
import com.intexsoft.test_task.shapes_calculator.dto.ResponseDto;
import com.intexsoft.test_task.shapes_calculator.service.ShapeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/shape")
public class ShapeController {

  private final ShapeService shapeService;

  //TODO: Валидация в DTO
  @PostMapping("/perimeter")
  public ResponseEntity<ResponseDto> getPerimeterOfShape(@RequestBody RequestDto requestDto) {
    Double perimeterOfShape = shapeService.getPerimeterOfShape(requestDto);
    return ResponseEntity.ok().body(new ResponseDto().setResult(perimeterOfShape));
  }

  @PostMapping("/square")
  public ResponseEntity<ResponseDto> getSquareOfShape(@RequestBody RequestDto requestDto) {
    Double squareOfShape = shapeService.getSquareOfShape(requestDto);
    return ResponseEntity.ok().body(new ResponseDto().setResult(squareOfShape));
  }
}
