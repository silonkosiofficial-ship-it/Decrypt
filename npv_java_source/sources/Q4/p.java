package Q4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static Q4.p a(long j6, long j10, long j11) {
        return new Q4.a(j6, j10, j11);
    }

    public static Q4.p e() {
        return a(java.lang.System.currentTimeMillis(), android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
