package p059f9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f45419a = p019b9.G.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p019b9.D f45420b = new p019b9.D("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p019b9.D f45421c = new p019b9.D("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p019b9.D f45422d = new p019b9.D("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p019b9.D f45423e = new p019b9.D("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f45424f = p019b9.G.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final p059f9.k h(long j6, p059f9.k kVar) {
        return new p059f9.k(j6, kVar, 0);
    }
}
