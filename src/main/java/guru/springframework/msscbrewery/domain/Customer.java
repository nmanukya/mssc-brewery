package guru.springframework.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * mssc-brewery
 * Created by nmanu on 20/01/2021
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private Integer id;
    @NotBlank
    @Size(min=3, max=100)
    private String customerName;

}
