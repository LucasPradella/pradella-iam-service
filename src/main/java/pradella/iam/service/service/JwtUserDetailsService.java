package pradella.iam.service.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pradella.iam.service.model.MockerUser;
import pradella.iam.service.model.UserModel;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private MockerUser mockerUser;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel user = mockerUser.process(email);
        return new User(email, user.getPassword(), new ArrayList<>());
    }

}