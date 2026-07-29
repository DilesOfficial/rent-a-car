package com.skillmentor.rentacar.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerRequestDTO {
    // You *must* find out all the regex patterns....
    @NotBlank(message = "Name is Required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contains letters and spaces only.")
    private String name;

    @NotBlank(message = "Address Required")
    @Size(min = 3, max = 255, message = "Address must be between 3 and 255 characters")
    private String address;

    @Positive(message = "Salary must be a positive value")
    @DecimalMin(value = "0.01", message = "Salary must be at least 0.01")
    @DecimalMax(value = "9999999.99", message = "Salary must be at least 9,999,999.99")
    private double salary;
}
