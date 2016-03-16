/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.enumeration;

/**
 *
 * @author ErikLin
 */
public enum SqlOrder {
    ASC("ASC", "升冪"),
    DESC("DESC", "降冪");

    private String code;
    private String name;

    private SqlOrder(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
