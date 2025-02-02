package com.example.auto.controller;


import com.example.auto.Interface.ClassificationInter;
import com.example.auto.entity.Classification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/classification")


public class ClassificationAPI {

private  final ClassificationInter classificationInter;

public ClassificationAPI(ClassificationInter classificationInter) {
this.classificationInter = classificationInter;
}


public List<Classification> findAll() {
return classificationInter.findAll();
}
@PostMapping("/classification")
public Classification save(Classification classification) {
return classificationInter.save(classification);
}

@PutMapping("/classification/{id}")
public Classification update(Long id, Classification classification) {
return classificationInter.update(id, classification);
}

@DeleteMapping("/classification/{id}")
public Boolean delete(Long id) {
return classificationInter.delete(id);

}
@GetMapping("/classification/{id}")
public Classification getByIdClass(Long id) {
return classificationInter.getByIdClass(id);
}

}
