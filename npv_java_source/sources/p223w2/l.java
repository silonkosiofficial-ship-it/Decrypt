package p223w2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class l {
    public static final int a(p243y2.e eVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(eVar, "<this>");
        p247y7.AbstractC7350t.f(str, "name");
        int iB = p223w2.j.b(eVar, str);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = p223w2.j.b(eVar, '`' + str + '`');
        return iB2 >= 0 ? iB2 : b(eVar, str);
    }

    private static final int b(p243y2.e eVar, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = eVar.getColumnCount();
            java.lang.String str2 = '.' + str;
            java.lang.String str3 = '.' + str + '`';
            for (int i6 = 0; i6 < columnCount; i6++) {
                java.lang.String columnName = eVar.getColumnName(i6);
                if (columnName.length() >= str.length() + 2) {
                    if (S8.r.J(columnName, str2, false, 2, null)) {
                        return i6;
                    }
                    if (columnName.charAt(0) == '`' && S8.r.J(columnName, str3, false, 2, null)) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }
}
