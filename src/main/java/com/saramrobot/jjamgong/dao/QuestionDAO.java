package com.saramrobot.jjamgong.dao;

import java.util.List;

import com.saramrobot.jjamgong.model.AnswerVO;
import com.saramrobot.jjamgong.model.QuestionVO;

public interface QuestionDAO {
	public QuestionVO getQuestionByBundle( int bundlenum ) throws Exception;
	public QuestionVO getQuestionBySubBundle( int subbundlenum ) throws Exception;
	
	public List<AnswerVO> getAnswerList( int questionnum ) throws Exception;
}
