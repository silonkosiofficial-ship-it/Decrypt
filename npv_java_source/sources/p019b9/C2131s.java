package p019b9;

/* JADX INFO: renamed from: b9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2131s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p019b9.C2131s f24385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W8.J0 f24386b;

    static {
        p019b9.C2131s c2131s = new p019b9.C2131s();
        f24385a = c2131s;
        p019b9.E.f("kotlinx.coroutines.fast.service.loader", true);
        f24386b = c2131s.a();
    }

    private C2131s() {
    }

    private final W8.J0 a() {
        java.lang.Object next;
        W8.J0 j0E;
        try {
            java.util.List listM = R8.k.M(R8.k.g(java.util.ServiceLoader.load(p019b9.r.class, p019b9.r.class.getClassLoader()).iterator()));
            java.util.Iterator it = listM.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((p019b9.r) next).c();
                    do {
                        java.lang.Object next2 = it.next();
                        int iC2 = ((p019b9.r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            p019b9.r rVar = (p019b9.r) next;
            if (rVar != null && (j0E = p019b9.t.e(rVar, listM)) != null) {
                return j0E;
            }
            p019b9.t.b(null, null, 3, null);
            return null;
        } catch (java.lang.Throwable th) {
            p019b9.t.b(th, null, 2, null);
            return null;
        }
    }
}
