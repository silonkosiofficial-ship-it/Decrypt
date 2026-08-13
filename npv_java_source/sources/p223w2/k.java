package p223w2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class k {
    public static final int a(p243y2.e eVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(eVar, "<this>");
        p247y7.AbstractC7350t.f(str, "name");
        int columnCount = eVar.getColumnCount();
        for (int i6 = 0; i6 < columnCount; i6++) {
            if (p247y7.AbstractC7350t.b(str, eVar.getColumnName(i6))) {
                return i6;
            }
        }
        return -1;
    }

    public static final int b(p243y2.e eVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(eVar, "stmt");
        p247y7.AbstractC7350t.f(str, "name");
        int iA = p223w2.j.a(eVar, str);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = eVar.getColumnCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(columnCount);
        for (int i6 = 0; i6 < columnCount; i6++) {
            arrayList.add(eVar.getColumnName(i6));
        }
        throw new java.lang.IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + p097j7.AbstractC6879v.r0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }
}
