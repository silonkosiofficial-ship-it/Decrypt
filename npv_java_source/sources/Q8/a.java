package Q8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f9118a = new j$.util.concurrent.ConcurrentHashMap();

    public static final java.lang.Void a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "message");
        throw new java.lang.IllegalStateException(str.toString());
    }

    public static /* synthetic */ java.lang.Void b(java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
