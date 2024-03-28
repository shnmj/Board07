package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardVo;
import com.board.menus.domain.MenuVo2;

@Mapper
public interface BoardMapper {

	List<BoardVo> getBoardList(MenuVo2 menuVo);

	void insertBoard(BoardVo boardVo);

	BoardVo getBoard(BoardVo boardVo);

	void incHit(BoardVo boardVo);

}
