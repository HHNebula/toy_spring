package com.toy.spring.toy_spring.beans.poll;

import java.util.ArrayList;
import java.util.HashMap;

public class PollData {

    // 질문 아이디 생성
    public String[] getQuestionIds() {
        String[] questionIds = { "Q1", "Q2", "Q3", "Q4", "Q5" };
        return questionIds;
    }

    // 질문 목록 생성
    public HashMap getQuestion() {
        HashMap<String, String> questions = new HashMap<>();
        questions.put("Q1", "해당 매장 방문 시 매장은 청결 하였습니까?");
        questions.put("Q2", "주문 시 직원은 고객님께 친절 하였습니까?");
        questions.put("Q3", "주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        questions.put("Q4", "해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        questions.put("Q5", "직원이 제조한 음료에 대해 맛은 좋았습니까?");
        return questions;
    }

    // 답변 목록 생성
    public HashMap getAnswer() {
        HashMap<String, String> answers = new HashMap<>();
        answers.put("E1", "전혀 아니다.");
        answers.put("E2", "아니다.");
        answers.put("E3", "보통이다.");
        answers.put("E4", "그렇다.");
        answers.put("E5", "매우 그렇다.");
        return answers;
    }

    // 질문별 답변 목록 생성
    public ArrayList getPossibleAnswer(String questionId) {
        ArrayList<String> possibleAnswer = new ArrayList<>();

        switch (questionId) {
            case "Q1":
                possibleAnswer.add("E1");
                possibleAnswer.add("E2");
                possibleAnswer.add("E3");
                break;
            case "Q2":
                possibleAnswer.add("E1");
                possibleAnswer.add("E2");
                possibleAnswer.add("E3");
                possibleAnswer.add("E4");
                break;
            case "Q3":
                possibleAnswer.add("E1");
                possibleAnswer.add("E2");
                break;
            case "Q4":
                possibleAnswer.add("E1");
                possibleAnswer.add("E2");
                possibleAnswer.add("E3");
                possibleAnswer.add("E4");
                possibleAnswer.add("E5");
                break;
            case "Q5":
                possibleAnswer.add("E1");
                possibleAnswer.add("E2");
                possibleAnswer.add("E3");
                break;
        }
        return possibleAnswer;
    }

}
