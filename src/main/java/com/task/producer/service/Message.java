package com.task.producer.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.task.producer.model.Product;
import com.task.producer.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Message {

    public String sendMcg(Product product) {
        Logger log = LoggerFactory.getLogger(Message.class);

        try {
            System.out.println("service class line 28");



            HttpResponse<String> response1 = Unirest.post(Constants.MCGURL)
                    .header("Content-Type", "application/json")
                    .body(product.toString())
                            .asString();

            System.out.println(response1);
            System.out.println("service class line 36");
            log.info("Response From mcg for msisdn is   " +  product.getName());


        } catch (Exception e) {
            log.info("Exception Sending message: "+e.getMessage() +" for id "+product.getName());

            e.printStackTrace();
            return "error occured";
        }
        return "Success";
    }
}
