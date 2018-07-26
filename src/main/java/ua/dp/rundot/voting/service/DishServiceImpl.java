package ua.dp.rundot.voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.rundot.voting.model.Dish;
import ua.dp.rundot.voting.repository.DishRepository;

/**
 * {@link DishService} implementation
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Service
public class DishServiceImpl implements DishService {

    private DishRepository dishRepository;

    @Autowired
    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public Dish create(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public void update(Dish dish) {
        dishRepository.save(dish);
    }

    @Override
    public void delete(int id) {
        dishRepository.deleteById(id);
    }

    @Override
    public Dish find(int id) {
        return dishRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Dish> findAll() {
        return dishRepository.findAll();
    }
}
