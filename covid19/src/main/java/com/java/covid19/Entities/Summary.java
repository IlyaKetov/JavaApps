package com.java.covid19.Entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//----------Lombok Annotation----------//
@Data               //Set,Get,Equals,... methods
@NoArgsConstructor  //Constructor without args
@JsonAutoDetect
public class Summary {
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Global")
    private Global global;
    @JsonProperty("Countries")
    private List<Country> countries;
    @JsonProperty("Date")
    private String date;
}
