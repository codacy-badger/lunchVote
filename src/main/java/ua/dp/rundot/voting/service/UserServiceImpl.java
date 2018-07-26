package ua.dp.rundot.voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.rundot.voting.model.User;
import ua.dp.rundot.voting.repository.UserRepository;

/**
 * service layer for {@link ua.dp.rundot.voting.repository.UserRepository}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User create(User user) { return userRepository.save(user); }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User find(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

}
