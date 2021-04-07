package Java.Problems.StagesAsAccess;

public class ResponseBuilder {

    private Response createResponse(String template) {
        Response response = new Response();

        response.setId(2);

        if (template.equals("T1")) {
            return response;
        } else if (template.equals("T2")) {
            response.setName("afzal");
            response.setNumber("7983037749");
            return response;
        } else if (template.equals("T3")) {
            response.setCity("Bareilly");
            response.setState("UP");
            response.setLocality("Anand Vihar");
            return response;
        } else if (template.equals("T4")) {
            response.setName("afzal");
            response.setNumber("7983037749");
            response.setPincode(243502);
            return response;
        }

        return response;
    }

    public static void main(String[] args) {
        ResponseBuilder responseBuilder = new ResponseBuilder();
        String template="T2";
        //System.out.println(responseBuilder.createResponse("T4"));
        Response response = new Response();
        response.setId(2);
        response.setName("afzal");
        response.setNumber("7983037749");
        response.setCity("Bareilly");
        response.setState("UP");
        response.setLocality("Anand Vihar");
        response.setName("afzal");
        response.setNumber("7983037749");
        response.setPincode(243502);


        if(template.equals("T1"))
            System.out.println(new T1().createTemplate(response));
        else if(template.equals("T2"))
            System.out.println(new T2().createTemplate(response));
    }


}

