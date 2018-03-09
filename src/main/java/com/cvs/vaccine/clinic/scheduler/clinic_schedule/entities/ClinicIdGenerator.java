package com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ClinicIdGenerator implements IdentifierGenerator {

   

    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {

        String prefix = "CI";
        Connection connection = session.connection();
        try {

            PreparedStatement ps = connection
                    .prepareStatement("select count(*) as nextval from note01.harish_temp2"); // could be different, depending on database vendor

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("nextval") +1;
                String pattern="000";
                DecimalFormat myFormatter = new DecimalFormat(pattern);
                String output = myFormatter.format(id);
                String code = prefix + output ;
                return code;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (Throwable e) {
                    // log error, or rethrow exception
                }
            }
        } catch (Exception e) {
        	
                e.printStackTrace();
        } finally {
           
        }
        return null;
    }
}