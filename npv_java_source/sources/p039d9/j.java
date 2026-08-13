package p039d9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f44340a = p019b9.E.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f44341b = p019b9.G.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44342c = p019b9.G.e("kotlinx.coroutines.scheduler.core.pool.size", E7.j.d(p019b9.E.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44343d = p019b9.G.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f44344e = java.util.concurrent.TimeUnit.SECONDS.toNanos(p019b9.G.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p039d9.g f44345f = p039d9.e.f44331a;

    public static final p039d9.h b(java.lang.Runnable runnable, long j6, boolean z6) {
        return new p039d9.i(runnable, j6, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String c(boolean z6) {
        return z6 ? "Blocking" : "Non-blocking";
    }
}
