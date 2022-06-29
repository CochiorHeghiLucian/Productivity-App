package com.hgi.javaapp.db.dbtype;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.EnumType;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.Types.OTHER;

public class PostgreSqlEnumType<T extends Enum<?>> extends EnumType<T> {
    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException,
            SQLException {
        if (value == null) {
            st.setNull(index, OTHER);
        } else {
            st.setObject(index, value.toString(), OTHER);
        }
    }
}
