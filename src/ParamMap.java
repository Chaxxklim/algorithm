import java.util.HashMap;

public class ParamMap extends HashMap<String, Object> {

    public static ParamMap init(){
        return new ParamMap();
    }

    public String getString(String key){
        Object object = this.get(key);
        if(object == null){
            return null;
        } else {
            return String.valueOf(object);
        }
    }

    public <T> T get(String key, Class<T> clazz){

        Object object = this.get(key);
        if(object == null){
            return null;
        }else {
            return (T) object;
        }
    }

    public static void main(String[] args) {

        ParamMap param = ParamMap.init();
        param.put("key1", "value1");

        String value = param.getString("key1");

        StringBuffer sb = new StringBuffer();
        sb.append("test");
        param.put("key2",sb);
        StringBuffer sbReturn = param.get("key2", StringBuffer.class);


    }
}
