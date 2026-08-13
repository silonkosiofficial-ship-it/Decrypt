package p214v3;

/* JADX INFO: renamed from: v3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7233a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f55871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f55872b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f55873c = new java.lang.Object();

    public C7233a0(long j6) {
        this.f55871a = j6;
    }

    public final void a(long j6) {
        synchronized (this.f55873c) {
            this.f55871a = j6;
        }
    }

    public final boolean b() {
        synchronized (this.f55873c) {
            try {
                long jC = p174r3.v.c().c();
                if (this.f55872b + this.f55871a > jC) {
                    return false;
                }
                this.f55872b = jC;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
