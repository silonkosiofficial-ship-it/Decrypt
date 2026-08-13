package A9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    private b() {
    }

    public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public static /* synthetic */ p199t9.b c(A9.b bVar, F7.c cVar, java.util.List list, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i6 & 2) != 0) {
            list = p097j7.AbstractC6879v.m();
        }
        return bVar.b(cVar, list);
    }

    public abstract void a(A9.d dVar);

    public abstract p199t9.b b(F7.c cVar, java.util.List list);
}
