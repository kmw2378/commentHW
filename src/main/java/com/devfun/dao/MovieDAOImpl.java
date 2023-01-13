package com.devfun.dao;

import com.devfun.vo.MovieVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Inject
    private SqlSession sqlSession;
    private static final String namespace= "com.devfun.mybatis.query.test";


    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return sqlSession.selectList(namespace + ".selectMovie");
    }
}
