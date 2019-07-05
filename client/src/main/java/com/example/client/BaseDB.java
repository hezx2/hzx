package com.example.client;

public class BaseDB {
    private String url;
    private String username;
    private String password;
    private String driverClass;
    private String dialectType = "mysql";
    private String dbType = "mysql";

    /**
     * AUTO->`0`("数据库ID自增")
     * INPUT->`1`(用户输入ID")
     * ID_WORKER->`2`("全局唯一ID")
     * UUID->`3`("全局唯一ID")
     */
    private Integer idType = 3;


    public String getDialectType() {
        return dialectType;
    }

    public void setDialectType(String dialectType) {
        this.dialectType = dialectType;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
