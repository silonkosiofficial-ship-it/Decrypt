package androidx.compose.foundation.text.modifiers;

/* JADX INFO: loaded from: classes.dex */
public final class a extends F0.AbstractC0927m implements F0.E, F0.InterfaceC0932s, F0.InterfaceC0934u {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private M.g f19546R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p237x7.l f19547S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final androidx.compose.foundation.text.modifiers.b f19548T;

    private a(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6, p237x7.l lVar3) {
        this.f19547S = lVar3;
        this.f19548T = (androidx.compose.foundation.text.modifiers.b) T1(new androidx.compose.foundation.text.modifiers.b(c1332d, p6, bVar, lVar, i6, z6, i10, i11, list, lVar2, this.f19546R, b6, this.f19547S, null));
        throw new java.lang.IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
    }

    public /* synthetic */ a(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6, p237x7.l lVar3, int i12, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, bVar, (i12 & 8) != 0 ? null : lVar, (i12 & 16) != 0 ? X0.u.f15666a.a() : i6, (i12 & 32) != 0 ? true : z6, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? 1 : i11, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : lVar2, (i12 & 1024) != 0 ? null : gVar, (i12 & 2048) != 0 ? null : b6, (i12 & 4096) != 0 ? null : lVar3, null);
    }

    public /* synthetic */ a(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, p237x7.l lVar, int i6, boolean z6, int i10, int i11, java.util.List list, p237x7.l lVar2, M.g gVar, p141o0.B0 b6, p237x7.l lVar3, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, bVar, lVar, i6, z6, i10, i11, list, lVar2, gVar, b6, lVar3);
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f19548T.k2(interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f19548T.h2(interfaceC0896o, interfaceC0895n, i6);
    }

    public final void Z1(M0.C1332d c1332d, M0.P p6, java.util.List list, int i6, int i10, boolean z6, R0.AbstractC1494h.b bVar, int i11, p237x7.l lVar, p237x7.l lVar2, M.g gVar, p141o0.B0 b6) {
        androidx.compose.foundation.text.modifiers.b bVar2 = this.f19548T;
        bVar2.a2(bVar2.n2(b6, p6), this.f19548T.p2(c1332d), this.f19548T.o2(p6, list, i6, i10, z6, bVar, i11), this.f19548T.m2(lVar, lVar2, gVar, this.f19547S));
        F0.H.b(this);
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        return this.f19548T.i2(m6, g6, j6);
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f19548T.g2(interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.InterfaceC0932s
    public /* synthetic */ void m0() {
        F0.r.a(this);
    }

    @Override // F0.InterfaceC0934u
    public void s(D0.InterfaceC0900t interfaceC0900t) {
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return this.f19548T.j2(interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        this.f19548T.b2(cVar);
    }
}
