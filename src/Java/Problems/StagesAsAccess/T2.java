package Java.Problems.StagesAsAccess;

public class T2 implements CreateTemplate {
    @Override
    public Response createTemplate(Response res) {
        Response response = new Response();
        response.setPincode(res.getPincode());
        response.setName(res.getName());
        response.setNumber(res.getNumber());
        return response;
    }
}
