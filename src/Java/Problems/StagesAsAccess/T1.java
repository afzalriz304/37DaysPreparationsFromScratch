package Java.Problems.StagesAsAccess;

public class T1 implements CreateTemplate {

    @Override
    public Response createTemplate(Response response) {
        Response res = new Response();
        res.setPincode(response.getId());
        return res;
    }
}
