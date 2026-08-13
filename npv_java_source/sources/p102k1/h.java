package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p102k1.e, p092j1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p092j1.g f49415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p122m1.h f49417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Object f49421g;

    public h(p092j1.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "state");
        this.f49415a = gVar;
        this.f49418d = -1;
        this.f49419e = -1;
    }

    @Override // p102k1.e, p092j1.f
    public p122m1.e a() {
        if (this.f49417c == null) {
            this.f49417c = new p122m1.h();
        }
        p122m1.h hVar = this.f49417c;
        p247y7.AbstractC7350t.c(hVar);
        return hVar;
    }

    @Override // p102k1.e, p092j1.f
    public void apply() {
        p122m1.h hVar = this.f49417c;
        p247y7.AbstractC7350t.c(hVar);
        hVar.j2(this.f49416b);
        if (this.f49418d != -1) {
            p122m1.h hVar2 = this.f49417c;
            p247y7.AbstractC7350t.c(hVar2);
            hVar2.g2(this.f49418d);
        } else if (this.f49419e != -1) {
            p122m1.h hVar3 = this.f49417c;
            p247y7.AbstractC7350t.c(hVar3);
            hVar3.h2(this.f49419e);
        } else {
            p122m1.h hVar4 = this.f49417c;
            p247y7.AbstractC7350t.c(hVar4);
            hVar4.i2(this.f49420f);
        }
    }

    @Override // p092j1.f
    public void b(p122m1.e eVar) {
        this.f49417c = eVar instanceof p122m1.h ? (p122m1.h) eVar : null;
    }

    @Override // p092j1.f
    public p102k1.e c() {
        return null;
    }

    public final p102k1.h d(java.lang.Object obj) {
        this.f49418d = -1;
        p092j1.g gVar = this.f49415a;
        p247y7.AbstractC7350t.c(obj);
        this.f49419e = gVar.e(obj);
        this.f49420f = 0.0f;
        return this;
    }

    public final p102k1.h e(float f6) {
        this.f49418d = -1;
        this.f49419e = -1;
        this.f49420f = f6;
        return this;
    }

    public void f(java.lang.Object obj) {
        this.f49421g = obj;
    }

    public final void g(int i6) {
        this.f49416b = i6;
    }

    @Override // p092j1.f
    public java.lang.Object getKey() {
        return this.f49421g;
    }

    public final p102k1.h h(java.lang.Object obj) {
        p092j1.g gVar = this.f49415a;
        p247y7.AbstractC7350t.c(obj);
        this.f49418d = gVar.e(obj);
        this.f49419e = -1;
        this.f49420f = 0.0f;
        return this;
    }
}
