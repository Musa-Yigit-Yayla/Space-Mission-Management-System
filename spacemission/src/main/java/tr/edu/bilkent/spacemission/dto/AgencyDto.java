package tr.edu.bilkent.spacemission.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgencyDto {
    private long id;
    private String mail;
    private String password;
    private String name;
    private byte[] logo;
    private String status;
}
