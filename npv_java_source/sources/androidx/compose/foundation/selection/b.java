package androidx.compose.foundation.selection;

/* JADX INFO: loaded from: classes.dex */
final class b extends androidx.compose.foundation.e {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f19500l0;

    private b(boolean z6, p250z.l lVar, p210v.I i6, boolean z10, K0.h hVar, p237x7.a aVar) {
        super(lVar, i6, z10, null, hVar, aVar, null);
        this.f19500l0 = z6;
    }

    public /* synthetic */ b(boolean z6, p250z.l lVar, p210v.I i6, boolean z10, K0.h hVar, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, lVar, i6, z10, hVar, aVar);
    }

    @Override // androidx.compose.foundation.a
    public void f2(K0.w wVar) {
        K0.u.Y(wVar, this.f19500l0);
    }

    public final void u2(boolean z6, p250z.l lVar, p210v.I i6, boolean z10, K0.h hVar, p237x7.a aVar) {
        if (this.f19500l0 != z6) {
            this.f19500l0 = z6;
            F0.A0.b(this);
        }
        super.t2(lVar, i6, z10, null, hVar, aVar);
    }
}
