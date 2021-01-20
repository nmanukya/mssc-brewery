package guru.springframework.msscbrewery.web.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private Integer id;
    @NotBlank
    @Size(min=3, max=100)
    private String customerName;

}
