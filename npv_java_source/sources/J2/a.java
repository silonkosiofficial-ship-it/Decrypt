package J2;

/* JADX INFO: loaded from: classes.dex */
public class a implements I2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f5646a = androidx.core.os.h.a(android.os.Looper.getMainLooper());

    @Override // I2.q
    public void a(long j6, java.lang.Runnable runnable) {
        this.f5646a.postDelayed(runnable, j6);
    }

    @Override // I2.q
    public void b(java.lang.Runnable runnable) {
        this.f5646a.removeCallbacks(runnable);
    }
}
