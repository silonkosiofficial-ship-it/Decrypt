package p143o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    protected abstract void a(p243y2.e eVar, java.lang.Object obj);

    protected abstract java.lang.String b();

    public final void c(p243y2.b bVar, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        if (iterable == null) {
            return;
        }
        p243y2.e eVarE = bVar.e(b());
        try {
            for (java.lang.Object obj : iterable) {
                if (obj != null) {
                    a(eVarE, obj);
                    eVarE.p();
                    eVarE.a();
                }
            }
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            eVarE.close();
        }
    }

    public final void d(p243y2.b bVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        if (obj == null) {
            return;
        }
        p243y2.e eVarE = bVar.e(b());
        try {
            a(eVarE, obj);
            eVarE.p();
        } finally {
            eVarE.close();
        }
    }

    public final long e(p243y2.b bVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        if (obj == null) {
            return -1L;
        }
        p243y2.e eVarE = bVar.e(b());
        try {
            a(eVarE, obj);
            eVarE.p();
            return p223w2.i.a(bVar);
        } finally {
            eVarE.close();
        }
    }
}
