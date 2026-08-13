package p173r2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p243y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p253z2.e f53813a;

    public c(p253z2.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "openHelper");
        this.f53813a = eVar;
    }

    public final p253z2.e b() {
        return this.f53813a;
    }

    @Override // p243y2.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p173r2.a a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "fileName");
        return new p173r2.a(this.f53813a.v0());
    }
}
