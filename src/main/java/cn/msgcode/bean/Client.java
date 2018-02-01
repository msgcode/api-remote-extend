package cn.msgcode.bean;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <b><code>Client</code></b>
 * <p>
 * Comment here.
 * </p>
 * <b>Creation Time:</b> 2016年10月10日 下午2:27:23
 * 
 * @author abin.yao
 * @since qlchat 1.0
 */
public class Client {

    private String caller = "";

    private String os = "";

    private String ver = "";

    private String platform = "";

    private Map<String, Object> ex;

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public Map<String, Object> getEx() {
        return ex;
    }

    public void setEx(Map<String, Object> ex) {
        this.ex = ex;
    }

    public String getPlatform() {
        return StringUtils.isEmpty(this.platform) ? "" : this.platform.toUpperCase();
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 取得 ex 属性值。
     *
     * @param key key
     * @return 如果 ex 为 null，或者属性不存在，那么返回 null
     */
    @SuppressWarnings("rawtypes")
    public String getExValue(String key) {
        if (ex != null && ex instanceof HashMap) {
            Map m = (Map) ex;
            return (String) m.get(key);
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    public Integer getExValueAsInt(String key) {
        try {
            if (ex != null && ex instanceof HashMap) {
                Map m = (Map) ex;
                return (Integer) m.get(key);
            }
        } catch (Exception e) {
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    public Double getExValueAsDouble(String key) {
        try {
            if (ex != null && ex instanceof HashMap) {
                Map m = (Map) ex;
                return (Double) m.get(key);
            }
        } catch (Exception e) {
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    public String getExValue(String key, String defaultValue) {
        String value = null;
        if (ex != null && ex instanceof HashMap) {
            Map m = (Map) ex;
            value = (String) m.get(key);
        }
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

}