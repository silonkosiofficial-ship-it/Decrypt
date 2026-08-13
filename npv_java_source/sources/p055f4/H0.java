package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class H0 extends p055f4.I0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final transient int f45042F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient int f45043G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ p055f4.I0 f45044H;

    H0(p055f4.I0 i6, int i10, int i11) {
        this.f45044H = i6;
        this.f45042F = i10;
        this.f45043G = i11;
    }

    @Override // p055f4.F0
    final int e() {
        return this.f45044H.f() + this.f45042F + this.f45043G;
    }

    @Override // p055f4.F0
    final int f() {
        return this.f45044H.f() + this.f45042F;
    }

    @Override // p055f4.F0
    final java.lang.Object[] g() {
        return this.f45044H.g();
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        p055f4.A0.a(i6, this.f45043G, "index");
        return this.f45044H.get(i6 + this.f45042F);
    }

    @Override // p055f4.I0
    /* JADX INFO: renamed from: n */
    public final p055f4.I0 subList(int i6, int i10) {
        p055f4.A0.c(i6, i10, this.f45043G);
        int i11 = this.f45042F;
        return this.f45044H.subList(i6 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45043G;
    }

    @Override // p055f4.I0, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i6, int i10) {
        return subList(i6, i10);
    }
}
