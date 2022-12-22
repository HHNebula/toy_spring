package com.toy.spring.toy_spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PollWithDB {

    /**
     * Question ID 를 받아 Question Return
     * 
     * @param qId
     * @return question
     * @throws SQLException
     */
    public HashMap getQuestion(String qId) throws SQLException {

        // 쿼리 전달을 위한 statement 가져오기
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        // 쿼리 실행 후 결과 받아오기
        String queryString = "SELECT * FROM QUESTIONS_LIST WHERE QUESTIONS_UID = '" + qId + "'";
        ResultSet resultSet = statement.executeQuery(queryString);

        HashMap<String, Object> result = null;
        while (resultSet.next()) {
            result = new HashMap<>();
            result.put("questionId", resultSet.getString("QUESTIONS_UID"));
            result.put("question", resultSet.getString("QUESTIONS"));
            result.put("order", resultSet.getInt("ORDERS"));
        }

        return result;

    }

}
