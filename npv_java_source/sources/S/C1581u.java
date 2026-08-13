package S;

/* JADX INFO: renamed from: S.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1581u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p141o0.Q1 f11801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p141o0.T1 f11802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.Q1 f11803c;

    public C1581u(p141o0.Q1 q6, p141o0.T1 t6, p141o0.Q1 q10) {
        this.f11801a = q6;
        this.f11802b = t6;
        this.f11803c = q10;
    }

    public /* synthetic */ C1581u(p141o0.Q1 q6, p141o0.T1 t6, p141o0.Q1 q10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p141o0.Y.a() : q6, (i6 & 2) != 0 ? p141o0.X.a() : t6, (i6 & 4) != 0 ? p141o0.Y.a() : q10);
    }

    public final p141o0.Q1 a() {
        return this.f11801a;
    }

    public final p141o0.T1 b() {
        return this.f11802b;
    }

    public final p141o0.Q1 c() {
        return this.f11803c;
    }
}
