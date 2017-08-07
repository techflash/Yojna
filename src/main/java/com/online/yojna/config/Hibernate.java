package com.online.yojna.config;

public class Hibernate {
    private String showSql;
    private String dialect;
    private String hbm2dll;

    public String getShowSql() {
        return showSql;
    }

    public void setShowSql(String showSql) {
        this.showSql = showSql;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getHbm2dll() {
        return hbm2dll;
    }

    public void setHbm2dll(String hbm2dll) {
        this.hbm2dll = hbm2dll;
    }
}
