package com.example.smartbarmobile;

/*
 * Modified from com.ecs.android.sample.oauth2
 * 
 * @author davydewaele
 */

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential.AccessMethod;
import com.google.api.services.plus.PlusScopes;

/**
 * 
 * Enum that encapsulates the various OAuth2 connection parameters for the different providers
 * 
 * We capture the following properties for the demo application
 * 
 * clientId
 * clientSecret
 * scope
 * rederictUri
 * apiUrl
 * tokenServerUrl
 * authorizationServerEncodedUrl
 * accessMethod
 * 
 * @author davydewaele
 *
 */
public enum Oauth2Params {

	GOOGLE_PLUS("797689970540-nmc1blntnurpeeh6gd4qrhfd1qapk124.apps.googleusercontent.com",
				"JkBtWy7S-4hM6JKMWlP0lEu5",
				"https://accounts.google.com/o/oauth2/token",
				"https://accounts.google.com/o/oauth2/auth",
				BearerToken.authorizationHeaderAccessMethod(),
				PlusScopes.PLUS_LOGIN,
				"http://ucscsmartbar.com",
				"plus",
				"https://www.googleapis.com/auth/plus.login");

    private String clientId;
	private String clientSecret;
	private String scope;
	private String rederictUri;
	private String userId;
	private String apiUrl;

	private String tokenServerUrl;
	private String authorizationServerEncodedUrl;
	
	private AccessMethod accessMethod;
	
	Oauth2Params(String clientId,String clientSecret,String tokenServerUrl,String authorizationServerEncodedUrl,AccessMethod accessMethod,String scope,String rederictUri,String userId,String apiUrl) {
		this.clientId=clientId;
		this.clientSecret=clientSecret;
		this.tokenServerUrl=tokenServerUrl;
		this.authorizationServerEncodedUrl=authorizationServerEncodedUrl;
		this.accessMethod=accessMethod;
		this.scope=scope;
		this.rederictUri=rederictUri;
		this.userId=userId;
		this.apiUrl=apiUrl;
	}
	
	public String getClientId() {
		if (this.clientId==null || this.clientId.length()==0) {
			throw new IllegalArgumentException("Please provide a valid clientId in the Oauth2Params class");
		}
		return clientId;
	}
	public String getClientSecret() {
		if (this.clientSecret==null || this.clientSecret.length()==0) {
			throw new IllegalArgumentException("Please provide a valid clientSecret in the Oauth2Params class");
		}
		return clientSecret;
	}
	
	public String getScope() {
		return scope;
	}
	public String getRederictUri() {
		return rederictUri;
	}
	public String getApiUrl() {
		return apiUrl;
	}
	public String getTokenServerUrl() {
		return tokenServerUrl;
	}

	public String getAuthorizationServerEncodedUrl() {
		return authorizationServerEncodedUrl;
	}
	
	public AccessMethod getAccessMethod() {
		return accessMethod;
	}
	
	public String getUserId() {
		return userId;
	}
}
