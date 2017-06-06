package com.example.samsung_pc.apptrial;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Samsung-PC on 6/5/2017.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "eatright.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password, int height, int weight, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", password);
        params.put("height", height + "");
        params.put("weight", weight + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
