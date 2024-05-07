package com.example.GetClientIp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IPController {
    private HttpServletRequest request;

    @GetMapping
    public String doGet(HttpServletRequest request) {
        String result = "";
        this.request = request;
        String ipAddress = request.getHeader("X-Forwarded-For"); // Returns the IP address of the client
        if(ipAddress != null && !ipAddress.isEmpty()){
            result = "Client IP: " + ipAddress.split(",")[0].trim();
        }else{
            result = "Client IP: " + request.getRemoteAddr();
        }
//    protected String doGet(HttpServletRequest request) {
//        String ipAddress = request.getRemoteAddr(); // Returns the IP address of the client
//        return "Client IP: " + ipAddress;

        return result;
    }
}
