package com.bit.springbootdemo.dto;

/*
 *  form 태그안에 있는 name들의 값들만 set처리를 함
 *
 */
public class MemberDto {
    private long id;
    private int intId;
    private double doubleId;
    private float floatId;

    private byte byteId;
    private short shortId;

    private char chValue;

    private boolean boolValue;

    private String username;
    private String password;
//    private String textStr;


    public long getId() {
        return id;
    }

    public int getIntId(){
        return intId;
    }

    public double getDoubleId(){
        return doubleId;
    }

    public float getFloatId(){
        return floatId;
    }

    public byte getByteId(){
        return byteId;
    }

    public short getShortId(){
        return shortId;
    }

    public boolean getBoolValue() {
        return boolValue;
    }

    public void setId(long id) {
        System.out.println("form에 없는 id : " + id);
        this.id = id;
    }

    public void setIntId(int intId) {
        System.out.println("form에 없는 intId : " + intId);
        this.intId = intId;
    }

    public void setDoubleId(double doubleId) {
        System.out.println("form에 없는 doubleId : " + doubleId);
        this.doubleId = doubleId;
    }

    public void setFloatId(float floatId) {
        System.out.println("form에 없는 floatId : " + floatId);
        this.floatId = floatId;
    }

    public void setByteId(byte byteId) {
        System.out.println("form에 없는 byteId : " + byteId);
        this.byteId = byteId;
    }

    public void setShortId(short shortId) {
        System.out.println("form에 없는 shortId : " + shortId);
        this.shortId = shortId;
    }

    public void setBoolValue(boolean boolValue) {
        System.out.println("form에 없는 boolValue : " + boolValue);
        this.boolValue = boolValue;
    }

    public String getUsername() {
        return username;
    }

    public char getChValue() {
        return chValue;
    }

    public void setChValue(char chValue) {
        System.out.println("form에 없는 chValue : " + chValue);
        this.chValue = chValue;
    }

    public void setUsername(String username) {
        System.out.println("form에서 가져온 username 값 : " + username);
        this.username = username;
    }
}
