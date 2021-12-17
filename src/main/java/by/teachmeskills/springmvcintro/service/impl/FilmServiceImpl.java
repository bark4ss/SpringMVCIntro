package by.teachmeskills.springmvcintro.service.impl;

import by.teachmeskills.springmvcintro.dao.FilmDAO;
import by.teachmeskills.springmvcintro.entity.Film;
import by.teachmeskills.springmvcintro.service.FilmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private FilmDAO filmDAO;

    public FilmServiceImpl(FilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Override
    @Transactional
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Override
    @Transactional
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Override
    @Transactional(readOnly = true)
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}
