package com.toy.spring.toy_spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    /**
     * Question ID 를 받아 응답 가능한 Answer ID 리턴
     * 
     * @param qId
     * @return Answer_IDs ArrayList
     * @throws SQLException
     */
    public ArrayList getPosiibleAnswer(String qId) throws SQLException {

        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        // 쿼리 실행 후 결과 받아오기
        String queryString = "SELECT EXAMPLE_UID FROM ANSWERS WHERE QUESTIONS_UID = '" + qId + "'";
        ResultSet resultSet = statement.executeQuery(queryString);

        ArrayList<String> result = new ArrayList<>();
        while (resultSet.next()) {
            result.add(resultSet.getString("EXAMPLE_UID"));
        }

        return result;

    }

    /**
     * Question ID 를 받아 Question Return
     * 
     * @param qId
     * @return question
     * @throws SQLException
     */
    public ArrayList getAnswer() throws SQLException {

        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        // 쿼리 실행 후 결과 받아오기
        String queryString = "SELECT * FROM EXAMPLE_LIST";
        ResultSet resultSet = statement.executeQuery(queryString);

        ArrayList<HashMap> result = new ArrayList<>();
        HashMap<String, Object> answer = null;
        while (resultSet.next()) {
            answer = new HashMap<>();
            answer.put("exampleUid", resultSet.getString("EXAMPLE_UID"));
            answer.put("example", resultSet.getString("EXAMPLE"));
            answer.put("order", resultSet.getInt("ORDERS"));
            result.add(answer);
        }

        return result;

    }

}
