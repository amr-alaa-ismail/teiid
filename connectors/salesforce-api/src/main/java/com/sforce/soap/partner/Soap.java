package com.sforce.soap.partner;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Thu Feb 11 15:37:56 EST 2010
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:partner.soap.sforce.com", name = "Soap")
@XmlSeeAlso({com.sforce.soap.partner.fault.ObjectFactory.class,ObjectFactory.class,com.sforce.soap.partner.sobject.ObjectFactory.class})
public interface Soap {

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "merge", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Merge")
    @ResponseWrapper(localName = "mergeResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.MergeResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.MergeResult> merge(
        @WebParam(name = "request", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.MergeRequest> request,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AssignmentRuleHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AssignmentRuleHeader assignmentRuleHeader,
        @WebParam(name = "MruHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        MruHeader mruHeader,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "EmailHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        EmailHeader emailHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws InvalidFieldFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetUserInfoResponse")
    @WebMethod
    public com.sforce.soap.partner.GetUserInfoResult getUserInfo(
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSoftphoneLayout", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeSoftphoneLayout")
    @ResponseWrapper(localName = "describeSoftphoneLayoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeSoftphoneLayoutResponse")
    @WebMethod
    public com.sforce.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout(
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "update", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.UpdateResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.SaveResult> update(
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.sobject.SObject> sObjects,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AssignmentRuleHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AssignmentRuleHeader assignmentRuleHeader,
        @WebParam(name = "MruHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        MruHeader mruHeader,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "EmailHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        EmailHeader emailHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws InvalidFieldFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "setPassword", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.SetPassword")
    @ResponseWrapper(localName = "setPasswordResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.SetPasswordResponse")
    @WebMethod
    public com.sforce.soap.partner.SetPasswordResult setPassword(
        @WebParam(name = "userId", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String userId,
        @WebParam(name = "password", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String password,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws InvalidNewPasswordFault, InvalidIdFault, UnexpectedErrorFault;

    @RequestWrapper(localName = "logout", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.LogoutResponse")
    @WebMethod
    public void logout(
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "retrieve", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Retrieve")
    @ResponseWrapper(localName = "retrieveResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.RetrieveResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.sobject.SObject> retrieve(
        @WebParam(name = "fieldList", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String fieldList,
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "QueryOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        QueryOptions queryOptions,
        @WebParam(name = "MruHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        MruHeader mruHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws InvalidFieldFault, MalformedQueryFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "queryAll", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.QueryAll")
    @ResponseWrapper(localName = "queryAllResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.QueryAllResponse")
    @WebMethod
    public com.sforce.soap.partner.QueryResult queryAll(
        @WebParam(name = "queryString", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String queryString,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "QueryOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        QueryOptions queryOptions
    ) throws InvalidFieldFault, MalformedQueryFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault, InvalidQueryLocatorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getUpdated", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetUpdated")
    @ResponseWrapper(localName = "getUpdatedResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetUpdatedResponse")
    @WebMethod
    public com.sforce.soap.partner.GetUpdatedResult getUpdated(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "startDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar endDate,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws InvalidSObjectFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "undelete", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Undelete")
    @ResponseWrapper(localName = "undeleteResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.UndeleteResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.UndeleteResult> undelete(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "create", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.CreateResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.SaveResult> create(
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.sobject.SObject> sObjects,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AssignmentRuleHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AssignmentRuleHeader assignmentRuleHeader,
        @WebParam(name = "MruHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        MruHeader mruHeader,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "EmailHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        EmailHeader emailHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws InvalidFieldFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "sendEmail", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.SendEmail")
    @ResponseWrapper(localName = "sendEmailResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.SendEmailResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.SendEmailResult> sendEmail(
        @WebParam(name = "messages", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.Email> messages,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "search", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.SearchResponse")
    @WebMethod
    public com.sforce.soap.partner.SearchResult search(
        @WebParam(name = "searchString", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String searchString,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws InvalidFieldFault, InvalidSObjectFault, UnexpectedErrorFault, MalformedSearchFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "query", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.QueryResponse")
    @WebMethod
    public com.sforce.soap.partner.QueryResult query(
        @WebParam(name = "queryString", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String queryString,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "QueryOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        QueryOptions queryOptions,
        @WebParam(name = "MruHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        MruHeader mruHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws InvalidFieldFault, MalformedQueryFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault, InvalidQueryLocatorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getDeleted", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetDeleted")
    @ResponseWrapper(localName = "getDeletedResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetDeletedResponse")
    @WebMethod
    public com.sforce.soap.partner.GetDeletedResult getDeleted(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "startDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar endDate,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws InvalidSObjectFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "process", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.ProcessResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.ProcessResult> process(
        @WebParam(name = "actions", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.ProcessRequest> actions,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "resetPassword", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.ResetPassword")
    @ResponseWrapper(localName = "resetPasswordResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.ResetPasswordResponse")
    @WebMethod
    public com.sforce.soap.partner.ResetPasswordResult resetPassword(
        @WebParam(name = "userId", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String userId,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "EmailHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        EmailHeader emailHeader
    ) throws InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeGlobal", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeGlobal")
    @ResponseWrapper(localName = "describeGlobalResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeGlobalResponse")
    @WebMethod
    public com.sforce.soap.partner.DescribeGlobalResult describeGlobal(
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeLayout", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeLayout")
    @ResponseWrapper(localName = "describeLayoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeLayoutResponse")
    @WebMethod
    public com.sforce.soap.partner.DescribeLayoutResult describeLayout(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "recordTypeIds", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> recordTypeIds,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeTabs", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeTabs")
    @ResponseWrapper(localName = "describeTabsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeTabsResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.DescribeTabSetResult> describeTabs(
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getServerTimestamp", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetServerTimestamp")
    @ResponseWrapper(localName = "getServerTimestampResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.GetServerTimestampResponse")
    @WebMethod
    public com.sforce.soap.partner.GetServerTimestampResult getServerTimestamp(
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "invalidateSessions", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.InvalidateSessions")
    @ResponseWrapper(localName = "invalidateSessionsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.InvalidateSessionsResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.InvalidateSessionsResult> invalidateSessions(
        @WebParam(name = "sessionIds", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> sessionIds,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSObject", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeSObject")
    @ResponseWrapper(localName = "describeSObjectResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeSObjectResponse")
    @WebMethod
    public com.sforce.soap.partner.DescribeSObjectResult describeSObject(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "LocaleOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        LocaleOptions localeOptions
    ) throws InvalidSObjectFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "login", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.LoginResponse")
    @WebMethod
    public com.sforce.soap.partner.LoginResult login(
        @WebParam(name = "username", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String password,
        @WebParam(name = "LoginScopeHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        LoginScopeHeader loginScopeHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws LoginFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "queryMore", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.QueryMore")
    @ResponseWrapper(localName = "queryMoreResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.QueryMoreResponse")
    @WebMethod
    public com.sforce.soap.partner.QueryResult queryMore(
        @WebParam(name = "queryLocator", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String queryLocator,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "QueryOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        QueryOptions queryOptions
    ) throws InvalidFieldFault, UnexpectedErrorFault, InvalidQueryLocatorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSObjects", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeSObjects")
    @ResponseWrapper(localName = "describeSObjectsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DescribeSObjectsResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.DescribeSObjectResult> describeSObjects(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> sObjectType,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "LocaleOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        LocaleOptions localeOptions
    ) throws InvalidSObjectFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "emptyRecycleBin", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.EmptyRecycleBin")
    @ResponseWrapper(localName = "emptyRecycleBinResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.EmptyRecycleBinResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.EmptyRecycleBinResult> emptyRecycleBin(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "upsert", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Upsert")
    @ResponseWrapper(localName = "upsertResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.UpsertResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.UpsertResult> upsert(
        @WebParam(name = "externalIDFieldName", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String externalIDFieldName,
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.sobject.SObject> sObjects,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AssignmentRuleHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AssignmentRuleHeader assignmentRuleHeader,
        @WebParam(name = "MruHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        MruHeader mruHeader,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "EmailHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        EmailHeader emailHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws InvalidFieldFault, InvalidSObjectFault, InvalidIdFault, UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "convertLead", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.ConvertLead")
    @ResponseWrapper(localName = "convertLeadResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.ConvertLeadResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.LeadConvertResult> convertLead(
        @WebParam(name = "leadConverts", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.sforce.soap.partner.LeadConvert> leadConverts,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws UnexpectedErrorFault;

    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "delete", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.sforce.soap.partner.DeleteResponse")
    @WebMethod
    public java.util.List<com.sforce.soap.partner.DeleteResult> delete(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids,
        @WebParam(name = "SessionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        SessionHeader sessionHeader,
        @WebParam(name = "CallOptions", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        CallOptions callOptions,
        @WebParam(name = "PackageVersionHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        PackageVersionHeader packageVersionHeader,
        @WebParam(name = "UserTerritoryDeleteHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        UserTerritoryDeleteHeader userTerritoryDeleteHeader,
        @WebParam(name = "EmailHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        EmailHeader emailHeader,
        @WebParam(name = "AllowFieldTruncationHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        AllowFieldTruncationHeader allowFieldTruncationHeader,
        @WebParam(name = "DebuggingHeader", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        DebuggingHeader debuggingHeader,
        @WebParam(mode = WebParam.Mode.OUT, name = "DebuggingInfo", targetNamespace = "urn:partner.soap.sforce.com", header = true)
        javax.xml.ws.Holder<DebuggingInfo> debuggingInfo
    ) throws UnexpectedErrorFault;
}
