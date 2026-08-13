package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.animation.h f54500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.animation.j f54501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1742q0 f54502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p190t.x f54503d;

    public k(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f6, p190t.x xVar) {
        this.f54500a = hVar;
        this.f54501b = jVar;
        this.f54502c = V.J0.a(f6);
        this.f54503d = xVar;
    }

    public /* synthetic */ k(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f6, p190t.x xVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(hVar, jVar, (i6 & 4) != 0 ? 0.0f : f6, (i6 & 8) != 0 ? androidx.compose.animation.a.d(false, null, 3, null) : xVar);
    }

    public final androidx.compose.animation.j a() {
        return this.f54501b;
    }

    public final p190t.x b() {
        return this.f54503d;
    }

    public final androidx.compose.animation.h c() {
        return this.f54500a;
    }

    public final float d() {
        return this.f54502c.b();
    }

    public final void e(p190t.x xVar) {
        this.f54503d = xVar;
    }
}
