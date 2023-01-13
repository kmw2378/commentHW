package com.devfun.service;

import com.devfun.dao.MovieDAO;
import com.devfun.vo.MovieVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDAO movieDAO;

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return movieDAO.selectMovie();
    }
}
