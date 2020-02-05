package vn.duclm.microservice.user.service;

import org.springframework.stereotype.Service;
import vn.duclm.microservice.user.dto.UserDTO;
import vn.duclm.microservice.user.exception.UserNotFoundException;

@Service
public class UserService {
    public UserDTO getUserById(long id) {
        if (id < 0) {
            throw new UserNotFoundException(String.format("User with id=%d is not found", id));
        }
        return new UserDTO(id, "Villa", "David");
    }
}
