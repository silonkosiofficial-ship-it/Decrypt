package p221w0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p221w0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f56165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f56166b;

    private c(int i6, p237x7.l lVar) {
        this.f56165a = lVar;
        this.f56166b = V.A1.d(p221w0.a.c(i6), null, 2, null);
    }

    public /* synthetic */ c(int i6, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, lVar);
    }

    @Override // p221w0.b
    public int a() {
        return ((p221w0.a) this.f56166b.getValue()).i();
    }

    public void b(int i6) {
        this.f56166b.setValue(p221w0.a.c(i6));
    }
}
