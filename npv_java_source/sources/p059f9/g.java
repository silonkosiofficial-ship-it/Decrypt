package p059f9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p019b9.D f45407a = new p019b9.D("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p019b9.D f45408b = new p019b9.D("ALREADY_LOCKED_BY_OWNER");

    public static final p059f9.a a(boolean z6) {
        return new p059f9.f(z6);
    }

    public static /* synthetic */ p059f9.a b(boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return a(z6);
    }
}
