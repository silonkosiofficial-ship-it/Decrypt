package Q3;

/* JADX INFO: renamed from: Q3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1478q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Q3.C1478q f9003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Q3.r f9004c = new Q3.r(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Q3.r f9005a;

    private C1478q() {
    }

    public static synchronized Q3.C1478q b() {
        try {
            if (f9003b == null) {
                f9003b = new Q3.C1478q();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f9003b;
    }

    public Q3.r a() {
        return this.f9005a;
    }

    public final synchronized void c(Q3.r rVar) {
        try {
            if (rVar == null) {
                this.f9005a = f9004c;
                return;
            }
            Q3.r rVar2 = this.f9005a;
            if (rVar2 == null || rVar2.C() < rVar.C()) {
                this.f9005a = rVar;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
