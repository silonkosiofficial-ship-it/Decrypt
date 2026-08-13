package p243y2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(p243y2.b bVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(bVar, "<this>");
        p247y7.AbstractC7350t.f(str, "sql");
        p243y2.e eVarE = bVar.e(str);
        try {
            eVarE.p();
        } finally {
            eVarE.close();
        }
    }

    public static final java.lang.Void b(int i6, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Error code: " + i6);
        if (str != null) {
            sb.append(", message: " + str);
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        throw new android.database.SQLException(string);
    }
}
