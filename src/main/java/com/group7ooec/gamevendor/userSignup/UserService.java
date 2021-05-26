// package com.group7ooec.gamevendor.userSignup;
//
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;
//
// @Service
// @Transactional
// public class UserService implements IUserService {
//     @Autowired
//     private UserRepository repository;
//
//     @Override
//     public User registerNewUserAccount(UserDto userDto) throws UserAlreadyExistException {
//         if (emailExist(userDto.getEmail())) {
//             throw new UserAlreadyExistException("There is an account with that email address: "
//               + userDto.getEmail());
//         }
//
//         // the rest of the registration operation
//     }
//     private boolean emailExist(String email) {
//         return userRepository.findByEmail(email) != null;
//     }
// }