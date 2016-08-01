package redis;

import redis.clients.jedis.Jedis;

/**
 * Created by jeremy on 2016/8/1.
 */
public class Redis
{
    private static final String auth = "e3,t6,p-,!@#$%^&*?78";
    private static final String ip = "118.192.141.225";
    private static final int port = 6379;

    private Jedis connect()
    {
        Jedis jedis = new Jedis(ip, port);
        jedis.auth(auth);
        return jedis;
    }

    public Boolean setValue(String keys, String value){
        Jedis jedis = connect();
        if (null != jedis)
        {
            jedis.set(keys, value);
            return true;
        }
        return false;
    }

    public String getValue(String key){
        Jedis jedis = connect();
        if (null != jedis)
        {
            String value = jedis.get(key);
            return value;
        }
        return null;
    }
}
