package I4;

/* JADX INFO: loaded from: classes3.dex */
abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static I4.v f5058a;

    static synchronized I4.v a(android.content.Context context) {
        try {
            if (f5058a == null) {
                I4.t tVar = new I4.t(null);
                tVar.b(K4.AbstractC1309f.a(context));
                f5058a = tVar.a();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f5058a;
    }
}
