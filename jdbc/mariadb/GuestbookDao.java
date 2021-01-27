package com.javaex.jdbc.mariadb;

import java.util.List;

public interface GuestbookDao {
	public List<GuestbookVo> selectAll();
	public int insert(GuestbookVo vo);
	public int delete(Long no, String password);
	public List<GuestbookVo> search(String keyword);
}
