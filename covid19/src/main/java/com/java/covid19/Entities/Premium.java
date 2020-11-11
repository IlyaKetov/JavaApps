package com.java.covid19.Entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

//----------Lombok Annotation----------//
@Data               //Set,Get,Equals,... methods
@NoArgsConstructor  //Consturctor without args
@JsonAutoDetect
public class Premium {
    @JsonProperty("Message")
    private String message;
}
