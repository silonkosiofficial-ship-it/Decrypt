package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {
    private static final p019b9.u a(java.lang.Throwable th, java.lang.String str) throws java.lang.Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new p087i7.C6665k();
    }

    static /* synthetic */ p019b9.u b(java.lang.Throwable th, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            th = null;
        }
        if ((i6 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(W8.J0 j6) {
        return j6.z1() instanceof p019b9.u;
    }

    public static final java.lang.Void d() {
        throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final W8.J0 e(p019b9.r rVar, java.util.List list) {
        try {
            return rVar.b(list);
        } catch (java.lang.Throwable th) {
            return a(th, rVar.a());
        }
    }
}
