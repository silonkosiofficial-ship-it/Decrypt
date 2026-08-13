package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1961n1 implements F0.p0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f20153C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f20154D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Float f20155E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Float f20156F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private K0.i f20157G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private K0.i f20158H;

    public C1961n1(int i6, java.util.List list, java.lang.Float f6, java.lang.Float f10, K0.i iVar, K0.i iVar2) {
        this.f20153C = i6;
        this.f20154D = list;
        this.f20155E = f6;
        this.f20156F = f10;
        this.f20157G = iVar;
        this.f20158H = iVar2;
    }

    @Override // F0.p0
    public boolean R() {
        return this.f20154D.contains(this);
    }

    public final K0.i a() {
        return this.f20157G;
    }

    public final java.lang.Float b() {
        return this.f20155E;
    }

    public final java.lang.Float c() {
        return this.f20156F;
    }

    public final int d() {
        return this.f20153C;
    }

    public final K0.i e() {
        return this.f20158H;
    }

    public final void f(K0.i iVar) {
        this.f20157G = iVar;
    }

    public final void g(java.lang.Float f6) {
        this.f20155E = f6;
    }

    public final void h(java.lang.Float f6) {
        this.f20156F = f6;
    }

    public final void i(K0.i iVar) {
        this.f20158H = iVar;
    }
}
