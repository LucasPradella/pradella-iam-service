package pradella.iam.service.model;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MockerUser {

    public UserModel process(String email) {
            switch(email) {
                case "admin@email":{

                    List<String> profiles = Arrays.asList("ROLE_ADMIN", "ROLE_USER");
                    return user(email, profiles);
                }
                case "user@email":
                    return user(email, Arrays.asList("ROLE_USER"));
                case "app":
                    return user(email, Arrays.asList("ROLE_APPLICATION"));
                default:
                    throw new UsernameNotFoundException("User not found with user: " + email);
            }
        }

        private UserModel user(String email, List<String> profiles) {

            profiles.stream().forEach(p -> {

            });

            return  UserModel.builder()
                    .email(email)
                    .password("$2a$10$wP6Ax739xes3vNR5sAEVdewT.66xIZwF17qi8iuy5pAX2rO6q.DcS")
                    .profiles(profiles)
                    .build();
        }

}
