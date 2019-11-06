package com.bw.movie.dao;

import java.util.List;

import com.bw.movie.domain.Movie;
import com.bw.movie.vo.MovieVo;

public interface MovieMapper {
	
	List<Movie> list(MovieVo MovieVo);
}
