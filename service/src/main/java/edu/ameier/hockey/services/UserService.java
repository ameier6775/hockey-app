package edu.ameier.hockey.services;

import edu.ameier.hockey.models.AppUser;
import edu.ameier.hockey.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private RestTemplateService restTemplateService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, RestTemplateService restTemplateService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.restTemplateService = restTemplateService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public AppUser addUser(AppUser appUser) {
        appUser.setPassword(bCryptPasswordEncoder.encode(appUser.getPassword()));
        return userRepository.save(appUser);
    }

//    public Boolean checkUser(String username, String password) {
//        List<AppUser> appUsers = userRepository.findAll();
//        for (AppUser appUser :
//                appUsers) {
//            String name = appUser.getUserName();
//            String secret = appUser.getPassword();
//            if (name.equals(username) && secret.equals(password)) {
//                return true;
//            }
//        }
//        return false;
//    }
    }
