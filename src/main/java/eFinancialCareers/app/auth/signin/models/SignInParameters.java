package eFinancialCareers.app.auth.signin.models;

import com.google.gson.annotations.SerializedName;
import utils.indexed.pojo.model.IndexedPojo;

public class SignInParameters extends IndexedPojo {

    @SerializedName("Email")
    public String email = "";

    @SerializedName("Password")
    public String password = "";
}
