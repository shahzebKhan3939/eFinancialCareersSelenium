package eFinancialCareers.app.auth.login.models;

import com.google.gson.annotations.SerializedName;
import utils.indexed.pojo.model.IndexedPojo;

public class LoginParameters extends IndexedPojo {

    @SerializedName("Email")
    public String email = "";

    @SerializedName("Password")
    public String password = "";
}
