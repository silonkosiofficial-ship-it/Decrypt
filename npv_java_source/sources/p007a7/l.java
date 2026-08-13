package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final java.lang.Throwable a(java.lang.Throwable th, p127m7.e eVar) {
        p247y7.AbstractC7350t.f(th, "exception");
        p247y7.AbstractC7350t.f(eVar, "continuation");
        try {
            return p007a7.k.a(th, th.getCause());
        } catch (java.lang.Throwable unused) {
            return th;
        }
    }
}
