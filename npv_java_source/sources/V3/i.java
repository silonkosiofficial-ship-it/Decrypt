package V3;

/* JADX INFO: loaded from: classes.dex */
public class i implements V3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V3.i f15116a = new V3.i();

    private i() {
    }

    public static V3.f d() {
        return f15116a;
    }

    @Override // V3.f
    public final long a() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // V3.f
    public final long b() {
        return java.lang.System.nanoTime();
    }

    @Override // V3.f
    public final long c() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
