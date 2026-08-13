package p213v2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements z2.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z2.e.c f55802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p213v2.b f55803b;

    public d(z2.e.c cVar, p213v2.b bVar) {
        p247y7.AbstractC7350t.f(cVar, "delegate");
        p247y7.AbstractC7350t.f(bVar, "autoCloser");
        this.f55802a = cVar;
        this.f55803b = bVar;
    }

    @Override // z2.e.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p213v2.c a(z2.e.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "configuration");
        return new p213v2.c(this.f55802a.a(bVar), this.f55803b);
    }
}
