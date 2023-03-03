//package com.demo.employee.client;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@FeignClient(value = "Feign2", url = "http://localhost:8082/task")
//public interface FeignInterfaceTask {
//    @GetMapping("/name/{id}")
//    public List<String> getNameById(@PathVariable String id);
//}
