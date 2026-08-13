package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
final class l implements p190t.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.p f18812b;

    public l(boolean z6, p237x7.p pVar) {
        this.f18811a = z6;
        this.f18812b = pVar;
    }

    @Override // p190t.x
    public boolean a() {
        return this.f18811a;
    }

    @Override // p190t.x
    public p200u.I b(long j6, long j10) {
        return (p200u.I) this.f18812b.u(Y0.t.b(j6), Y0.t.b(j10));
    }
}
