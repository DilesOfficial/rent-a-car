package com.skillmentor.rentacar.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerOrderRequestDTO {
    @NotNull(message = "Order date is required")
    @PastOrPresent(message = "Order date cannot be future date")
    private LocalDate date;

    @NotNull(message = "Customer ID is Required")
    private UUID customerId;

    @NotNull(message = "Order details cannot be null")
    @NotEmpty(message = "Order must contain at least one product")
    @Size(max = 100, message = "order cannot contain more than 100 products")
    @Valid
    private List<OrderDetailsRequestDTO> details;
}
