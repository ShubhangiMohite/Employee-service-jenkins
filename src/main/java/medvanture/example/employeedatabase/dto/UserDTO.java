package medvanture.example.employeedatabase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

@Data
@AllArgsConstructor
public class UserDTO
{
    private Integer userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
    private String panId;

    private String userName;
    private String passWord;

}
