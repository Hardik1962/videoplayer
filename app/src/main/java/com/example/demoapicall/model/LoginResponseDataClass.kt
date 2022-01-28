package com.example.demoapicall.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class LoginResponseDataClass {

    @SerializedName("status")
    var status: Int? = null

    @SerializedName("message")
    var message: String? = ""

    @SerializedName("data")
    var data: Data? = null

}

class Data {
    @SerializedName("userID")
    var userID: String? = ""

    @SerializedName("fullName")
    @Expose
    var fullName: String? = ""

    @SerializedName("email")
    @Expose
    var email: String? = ""

    @SerializedName("phoneNumber")
    @Expose
    var phoneNumber: String? = ""

    @SerializedName("birthDay")
    @Expose
    var birthDay: String? = ""

    @SerializedName("gender")
    @Expose
    var gender: String? = ""

    @SerializedName("showGenderIdentity")
    @Expose
    var showGenderIdentity: String? = ""

    @SerializedName("datesFor")
    @Expose
    var datesFor: Any? = null

    @SerializedName("identifyAs")
    @Expose
    var identifyAs: String? = ""

    @SerializedName("lookingFor")
    @Expose
    var lookingFor: Any? = null

    @SerializedName("visibleTo")
    @Expose
    var visibleTo: Any? = null

    @SerializedName("iamInto")
    @Expose
    var iamInto: Any? = null

    @SerializedName("relationship")
    @Expose
    var relationship: String? = ""

    @SerializedName("location")
    @Expose
    var location: String? = ""

    @SerializedName("latitude")
    @Expose
    var latitude: String? = ""

    @SerializedName("longitude")
    @Expose
    var longitude: String? = ""

    @SerializedName("aboutUser")
    @Expose
    var aboutUser: String? = ""

    @SerializedName("socialID")
    @Expose
    var socialID: String? = ""

    @SerializedName("loginType")
    @Expose
    var loginType: String? = ""

    @SerializedName("stateID")
    @Expose
    var stateID: String? = ""

    @SerializedName("countryID")
    @Expose
    var countryID: String? = ""

    @SerializedName("dogPlayStyle")
    @Expose
    var dogPlayStyle: Any? = null

    @SerializedName("dogTemperament")
    @Expose
    var dogTemperament: Any? = null

    @SerializedName("introduction")
    @Expose
    var introduction: Any? = null

    @SerializedName("status")
    @Expose
    var status: String? = ""

    @SerializedName("onlineStatus")
    @Expose
    var onlineStatus: String? = ""

    @SerializedName("isDeleted")
    @Expose
    var isDeleted: String? = ""

    @SerializedName("createdAt")
    @Expose
    var createdAt: String? = ""

    @SerializedName("updatedAt")
    @Expose
    var updatedAt: Any? = null

    @SerializedName("ipAddress")
    @Expose
    var ipAddress: String? = ""

    @SerializedName("age")
    @Expose
    var age: String? = ""

    @SerializedName("userAvatar")
    @Expose
    var userAvatar: List<UserAvatar?>? = null

    @SerializedName("accessToken")
    @Expose
    var accessToken: String? = ""

}

class UserAvatar {
    @SerializedName("userAvatar")
    @Expose
    var userAvatar: String? = ""

    @SerializedName("userAvatarID")
    @Expose
    var userAvatarID: String? = ""

}
