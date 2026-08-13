package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final android.database.Cursor a(android.database.Cursor cursor) throws java.io.IOException {
        p247y7.AbstractC7350t.f(cursor, "c");
        try {
            android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                java.lang.Object[] objArr = new java.lang.Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i6 = 0; i6 < columnCount; i6++) {
                    int type = cursor.getType(i6);
                    if (type == 0) {
                        objArr[i6] = null;
                    } else if (type == 1) {
                        objArr[i6] = java.lang.Long.valueOf(cursor.getLong(i6));
                    } else if (type == 2) {
                        objArr[i6] = java.lang.Double.valueOf(cursor.getDouble(i6));
                    } else if (type == 3) {
                        objArr[i6] = cursor.getString(i6);
                    } else {
                        if (type != 4) {
                            throw new java.lang.IllegalStateException();
                        }
                        objArr[i6] = cursor.getBlob(i6);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            p197t7.b.a(cursor, null);
            return matrixCursor;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                p197t7.b.a(cursor, th);
                throw th2;
            }
        }
    }

    private static final int b(android.database.Cursor cursor, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        java.lang.String[] columnNames = cursor.getColumnNames();
        p247y7.AbstractC7350t.e(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(java.lang.String[] strArr, java.lang.String str) {
        p247y7.AbstractC7350t.f(strArr, "columnNames");
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.String str2 = '.' + str;
        java.lang.String str3 = '.' + str + '`';
        int length = strArr.length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            java.lang.String str4 = strArr[i6];
            int i11 = i10 + 1;
            if (str4.length() >= str.length() + 2) {
                if (S8.r.J(str4, str2, false, 2, null)) {
                    return i10;
                }
                if (str4.charAt(0) == '`' && S8.r.J(str4, str3, false, 2, null)) {
                    return i10;
                }
            }
            i6++;
            i10 = i11;
        }
        return -1;
    }

    public static final int d(android.database.Cursor cursor, java.lang.String str) {
        p247y7.AbstractC7350t.f(cursor, "c");
        p247y7.AbstractC7350t.f(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int e(android.database.Cursor cursor, java.lang.String str) {
        java.lang.String strW0;
        p247y7.AbstractC7350t.f(cursor, "c");
        p247y7.AbstractC7350t.f(str, "name");
        int iD = d(cursor, str);
        if (iD >= 0) {
            return iD;
        }
        try {
            java.lang.String[] columnNames = cursor.getColumnNames();
            p247y7.AbstractC7350t.e(columnNames, "c.columnNames");
            strW0 = p097j7.AbstractC6872n.w0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (java.lang.Exception e6) {
            strW0 = "unknown";
        }
        throw new java.lang.IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strW0);
    }
}
