package ua.dp.rundot.voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.rundot.voting.model.Menu;
import ua.dp.rundot.voting.repository.MenuRepository;

/**
 * {@link MenuService} implementation
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Service
public class MenuServiceImpl implements MenuService {

    private MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void update(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public void delete(int id) {
        menuRepository.deleteById(id);
    }

    @Override
    public Menu find(int id) {
        return menuRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Menu> findAll() {
        return menuRepository.findAll();
    }
}
