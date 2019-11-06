package com.bw.movie.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.movie.dao.MovieMapper;
import com.bw.movie.domain.Movie;
import com.bw.movie.vo.MovieVo;

@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieMapper movieMapper;
	
	@Override
	public List<Movie> list(MovieVo movieVo) {
		// TODO Auto-generated method stub
		return movieMapper.list(movieVo);
	}

}
