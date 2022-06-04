package br.com.springkafka.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter@Setter
public class CarDTO {

    private String id;
    private String name;
    private String brand;

}
