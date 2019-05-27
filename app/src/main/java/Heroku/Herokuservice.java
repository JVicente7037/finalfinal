package Heroku;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface Herokuservice {
    @GET("hello")
    Call<ResponseBody> hello();
}

