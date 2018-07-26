package ua.dp.rundot.voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.rundot.voting.model.Restaurant;
import ua.dp.rundot.voting.repository.RestaurantRepository;

/**
 * {@link RestaurantService} implementation
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void update(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public void delete(int id) {
        restaurantRepository.deleteById(id);
    }

    @Override
    public Restaurant find(int id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

}
