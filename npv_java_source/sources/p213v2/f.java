package p213v2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements z2.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f55812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.io.File f55813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Callable f55814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z2.e.c f55815d;

    public f(java.lang.String str, java.io.File file, java.util.concurrent.Callable callable, z2.e.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "delegate");
        this.f55812a = str;
        this.f55813b = file;
        this.f55814c = callable;
        this.f55815d = cVar;
    }

    @Override // z2.e.c
    public p253z2.e a(z2.e.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "configuration");
        return new p213v2.e(bVar.f57642a, this.f55812a, this.f55813b, this.f55814c, bVar.f57644c.f57640a, this.f55815d.a(bVar));
    }
}
