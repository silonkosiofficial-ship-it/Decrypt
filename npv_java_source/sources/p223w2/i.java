package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final long a(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        if (b(bVar) == 0) {
            return -1L;
        }
        p243y2.e eVarE = bVar.e("SELECT last_insert_rowid()");
        try {
            eVarE.p();
            return eVarE.getLong(0);
        } finally {
            eVarE.close();
        }
    }

    public static final int b(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        p243y2.e eVarE = bVar.e("SELECT changes()");
        try {
            eVarE.p();
            return (int) eVarE.getLong(0);
        } finally {
            eVarE.close();
        }
    }
}
