/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package org.teiid.odbc;

import java.sql.Types;

public class PGUtil {

	public static final int PG_TYPE_UNSPECIFIED = 0;
	
	public static final int PG_TYPE_VARCHAR = 1043;
	
	public static final int PG_TYPE_BOOL = 16;
	public static final int PG_TYPE_BYTEA = 17;
	public static final int PG_TYPE_BPCHAR = 1042;
	public static final int PG_TYPE_INT8 = 20;
	public static final int PG_TYPE_INT2 = 21;
	public static final int PG_TYPE_INT4 = 23;
	public static final int PG_TYPE_TEXT = 25;
	public static final int PG_TYPE_XML = 142;
    //private static final int PG_TYPE_OID = 26;
	public static final int PG_TYPE_FLOAT4 = 700;
	public static final int PG_TYPE_FLOAT8 = 701;
	public static final int PG_TYPE_UNKNOWN = 705;
	
	public static final int PG_TYPE_GEOMETRY = 32816;
	public static final int PG_TYPE_GEOMETRYARRAY = 32824;
    
	public static final int PG_TYPE_OIDVECTOR = 30;
	public static final int PG_TYPE_INT2VECTOR = 22;
    public static final int PG_TYPE_OIDARRAY = 1028;
    public static final int PG_TYPE_CHARARRAY = 1002;
    public static final int PG_TYPE_TEXTARRAY = 1009;
    
	public static final int PG_TYPE_DATE = 1082;
	public static final int PG_TYPE_TIME = 1083;
	public static final int PG_TYPE_TIMESTAMP_NO_TMZONE = 1114;
	public static final int PG_TYPE_NUMERIC = 1700;
	
	public static final int PG_TYPE_BOOLARRAY = 1000;
    public static final int PG_TYPE_BYTEAARRAY = 1001;
    public static final int PG_TYPE_INT8ARRAY = 1026;
    public static final int PG_TYPE_INT2ARRAY = 1005;
    public static final int PG_TYPE_INT4ARRAY = 1007;
    public static final int PG_TYPE_FLOAT4ARRAY = 1021;
    public static final int PG_TYPE_FLOAT8ARRAY = 1022;
    public static final int PG_TYPE_DATEARRAY = 1182;
    public static final int PG_TYPE_TIMEARRAY = 1183;
    public static final int PG_TYPE_TIMESTAMP_NO_TMZONEARRAY = 1115;
    public static final int PG_TYPE_NUMERICARRAY = 1031;
    public static final int PG_TYPE_XMLARRAY = 143;
    //private static final int PG_TYPE_LO = 14939;
    
	public static class PgColInfo {
		public String name;
		public int reloid;
		public short attnum;
		public int type;
		public int precision;
		public int mod = -1;
	}
	
	/**
	 * Types.ARRAY is not supported
	 */
	public static int convertType(final int type, final String typeName) {
        switch (type) {
        case Types.BIT:
        case Types.BOOLEAN:
            return PG_TYPE_BOOL;
        case Types.VARCHAR:
            return PG_TYPE_VARCHAR;        
        case Types.CHAR:
            return PG_TYPE_BPCHAR;
        case Types.TINYINT:
        case Types.SMALLINT:
        	return PG_TYPE_INT2;
        case Types.INTEGER:
            return PG_TYPE_INT4;
        case Types.BIGINT:
            return PG_TYPE_INT8;
        case Types.NUMERIC:
        case Types.DECIMAL:
            return PG_TYPE_NUMERIC;
        case Types.FLOAT:
        case Types.REAL:
            return PG_TYPE_FLOAT4;
        case Types.DOUBLE:
            return PG_TYPE_FLOAT8;
        case Types.TIME:
            return PG_TYPE_TIME;
        case Types.DATE:
            return PG_TYPE_DATE;
        case Types.TIMESTAMP:
            return PG_TYPE_TIMESTAMP_NO_TMZONE;
            
        case Types.BLOB:            
        case Types.BINARY:
        case Types.VARBINARY:
        case Types.LONGVARBINARY:
            if (typeName.equals("geometry")) { //$NON-NLS-1$
                return PG_TYPE_GEOMETRY;
            }
        	return PG_TYPE_BYTEA;

        case Types.SQLXML:
            return PG_TYPE_XML;
        	
        case Types.LONGVARCHAR:
        case Types.CLOB:            
            return PG_TYPE_TEXT;
            
        case Types.ARRAY:
            switch (typeName) {
            case "boolean[]": //$NON-NLS-1$
                return PG_TYPE_BOOLARRAY;
            case "byte[]": //$NON-NLS-1$
            case "short[]": //$NON-NLS-1$
                return PG_TYPE_INT2ARRAY;
            case "integer[]": //$NON-NLS-1$
                return PG_TYPE_INT4ARRAY;
            case "long[]": //$NON-NLS-1$
                return PG_TYPE_INT8ARRAY;
            case "float[]": //$NON-NLS-1$
                return PG_TYPE_FLOAT4ARRAY;
            case "double[]": //$NON-NLS-1$
                return PG_TYPE_FLOAT8ARRAY;
            case "biginiteger[]": //$NON-NLS-1$
            case "bigdecimal[]": //$NON-NLS-1$
                return PG_TYPE_NUMERICARRAY;
            case "date[]": //$NON-NLS-1$
                return PG_TYPE_DATEARRAY;
            case "time[]": //$NON-NLS-1$
                return PG_TYPE_TIMEARRAY;
            case "timestamp[]": //$NON-NLS-1$
                return PG_TYPE_TIMESTAMP_NO_TMZONEARRAY;
            case "geometry[]": //$NON-NLS-1$
                return PG_TYPE_GEOMETRYARRAY;
            case "xml[]": //$NON-NLS-1$
                return PG_TYPE_XMLARRAY;
            default:
                return PG_TYPE_TEXTARRAY;
            }
        	
        default:
            return PG_TYPE_UNKNOWN;
        }
	}	
}
