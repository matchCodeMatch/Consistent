package com.demo.employee.client;

import com.demo.employee.Advice.FeignBadRequestException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class DepartmentServiceErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        System.out.println("Error Response!!");

//        switch(response.status()){
//            case 400:
//            case 404:
//            case 405:
//            case 408:
//            case 413:
//            case 500:
//        }
        throw new FeignBadRequestException();
//        if(400 == response.status()){
//            System.out.println("Bad Request!");
//        }
//        if(503 == response.status()) {
//            System.out.println("Service Not Found");
//            throw new NullPointerException();
//        }
//        return defaultErrorDecoder.decode(methodKey,response);
    }
}
