package com.saramrobot.jjamgong.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.saramrobot.jjamgong.model.AnswerVO;
import com.saramrobot.jjamgong.model.QuestionVO;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public QuestionVO getQuestionByBundle(int bundlenum) throws Exception {
		return sqlSession.selectOne( "com.saramrobot.jjamgong.questionMapper.getQuestionByBundle", bundlenum);
	}

	@Override
	public QuestionVO getQuestionBySubBundle(int subbundlenum) throws Exception {
		return sqlSession.selectOne( "com.saramrobot.jjamgong.questionMapper.getQuestionBySubBundle", subbundlenum);
	}

	@Override
	public List<AnswerVO> getAnswerList(int questionnum) throws Exception {
		return sqlSession.selectList( "com.saramrobot.jjamgong.questionMapper.getAnswerList", questionnum);
	}

}
