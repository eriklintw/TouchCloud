/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.vo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ErikLin
 */
public class DateUtility {

    private static final SimpleDateFormat sdtf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String formatDateTime(Date theDate) {
        if (theDate != null) {
            return DateUtility.sdtf.format(theDate);
        }
        return "";
    }
}
