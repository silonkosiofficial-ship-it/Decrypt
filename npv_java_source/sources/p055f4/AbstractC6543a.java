package p055f4;

/* JADX INFO: renamed from: f4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6543a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p055f4.AbstractC6543a f45093a;

    public static p055f4.AbstractC6543a a(android.content.Context context) {
        p055f4.AbstractC6543a abstractC6543a;
        synchronized (p055f4.AbstractC6543a.class) {
            try {
                if (f45093a == null) {
                    p055f4.C6561j c6561j = new p055f4.C6561j(null);
                    c6561j.b((android.app.Application) context.getApplicationContext());
                    f45093a = c6561j.a();
                }
                abstractC6543a = f45093a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return abstractC6543a;
    }

    public abstract p055f4.c1 b();

    public abstract p055f4.P c();
}
