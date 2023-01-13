package com.devfun.service;

import com.devfun.vo.MovieVO;

import java.util.List;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}
