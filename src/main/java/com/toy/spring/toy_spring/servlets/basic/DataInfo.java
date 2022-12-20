package com.toy.spring.toy_spring.servlets.basic;

import java.util.ArrayList;
import java.util.HashMap;

import com.toy.spring.toy_spring.beans.MemberBeans;

public class DataInfo {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "하성수");
        searchForm.put("id", "SOO");
        return searchForm;
    }

    public ArrayList<String> getTableListWithString() {
        ArrayList<String> tableListWithString = new ArrayList<String>();
        tableListWithString.add("@mdo");
        tableListWithString.add("@fat");
        tableListWithString.add("@twitter");

        return tableListWithString;
    }

    public HashMap<String, Object> getBundleData() {
        DataInfo datasInfor = new DataInfo();
        HashMap<String, String> searchForm = new DataInfo().getSearchFormData();
        ArrayList<String> tableListWithString = new DataInfo().getTableListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tableListWithString", tableListWithString);

        bundlesData.put("dataWithMemberBean", datasInfor.getDataListWithMemberBean());
        bundlesData.put("dataListWithMemberBean", datasInfor.getDataListWithMemberBean());

        return bundlesData;
    }

    public MemberBeans getDataToMemberBean() {
        MemberBeans memberBean = new MemberBeans();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }

    public ArrayList<MemberBeans> getDataListWithMemberBean() {
        ArrayList<MemberBeans> membersList = new ArrayList<>();
        MemberBeans memberBean = new MemberBeans();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        membersList.add(memberBean);

        MemberBeans memberBean02 = new MemberBeans();
        memberBean02.setFirstName("Jacob");
        memberBean02.setSecondName("Thornton");
        memberBean02.setHandleName("@fat");
        membersList.add(memberBean02);
        return membersList;
    }
}