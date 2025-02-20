package com.rs.newsappwithauth.utils;

import com.rs.newsappwithauth.dto.response.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    public <T>ResponseEntity<ResponseDTO<T>> successResponse(T responseData){
        return new ResponseEntity<>(new ResponseDTO<>(0, 200, "success", responseData), HttpStatus.OK);

    }

    public <T> ResponseEntity<ResponseDTO<T>> successResponse(T responseData, String message) {
        return new ResponseEntity<>(new ResponseDTO<>(0, 200, message, responseData), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO<?>> errorResponse() {
        return new ResponseEntity<>(new ResponseDTO<>(-1, 404, "Fail", null), HttpStatus.NOT_FOUND);
    }

    public <T> ResponseEntity<ResponseDTO<T>> errorResponse(String message) {
        return new ResponseEntity<>(new ResponseDTO<>(-1, 404, message, null), HttpStatus.NOT_FOUND);
    }

    public <T> ResponseEntity<ResponseDTO<T>> errorResponse(String message, int statusCode) {
        return new ResponseEntity<>(new ResponseDTO<>(-1, statusCode, message, null), HttpStatusCode.valueOf(statusCode));
    }
}

