package ua.dp.rundot.voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.rundot.voting.model.Vote;
import ua.dp.rundot.voting.repository.VoteRepository;

/**
 * {@link VoteService} implementation
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Service
public class VoteServiceImpl implements VoteService {

    private VoteRepository voteRepository;

    @Autowired
    public VoteServiceImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public Vote create(Vote vote) {
        return voteRepository.save(vote);
    }

    @Override
    public void update(Vote vote) {
        voteRepository.save(vote);
    }

    @Override
    public void delete(int id) {
        voteRepository.deleteById(id);
    }

    @Override
    public Vote find(int id) {
        return voteRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Vote> findAll() {
        return voteRepository.findAll();
    }
}
