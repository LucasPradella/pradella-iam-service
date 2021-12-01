package pradella.iam.service.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder
public class UserModel  {

    private String id;
    private String name;
    private String email;
    private String password;
    private String username;

    private List<String> profiles = new ArrayList<>();

}
