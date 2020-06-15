package services;

import api.model.World_Total;
import api.model.UserCreated;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class UserService extends MethodsService {

    public static Response get(String jsonName) {
       return get(jsonName, World_Total.class);
    }

    public static Response post(String jsonName) {
        return post(jsonName, UserCreated.class);
    }
}
