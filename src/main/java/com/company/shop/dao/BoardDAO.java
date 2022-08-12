package com.company.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.shop.vo.BoardVO;
import com.company.shop.vo.MemberVO;

@Mapper
public interface BoardDAO {
	public List<BoardVO> selectListBoard() throws Exception;
	public BoardVO getBoard(int bno) throws Exception;
	public void addBoard(BoardVO boardVO) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	public void deleteBoard(BoardVO boardVO) throws Exception;
}