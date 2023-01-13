package com.devfun.dao;

import com.devfun.vo.MovieVO;

import java.util.List;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
