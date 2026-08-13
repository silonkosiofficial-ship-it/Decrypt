package androidx.compose.foundation.selection;

/* JADX INFO: loaded from: classes.dex */
final class d extends androidx.compose.foundation.e {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private L0.a f19506l0;

    private d(L0.a aVar, p250z.l lVar, p210v.I i6, boolean z6, K0.h hVar, p237x7.a aVar2) {
        super(lVar, i6, z6, null, hVar, aVar2, null);
        this.f19506l0 = aVar;
    }

    public /* synthetic */ d(L0.a aVar, p250z.l lVar, p210v.I i6, boolean z6, K0.h hVar, p237x7.a aVar2, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, lVar, i6, z6, hVar, aVar2);
    }

    @Override // androidx.compose.foundation.a
    public void f2(K0.w wVar) {
        K0.u.j0(wVar, this.f19506l0);
    }

    public final void u2(L0.a aVar, p250z.l lVar, p210v.I i6, boolean z6, K0.h hVar, p237x7.a aVar2) {
        if (this.f19506l0 != aVar) {
            this.f19506l0 = aVar;
            F0.A0.b(this);
        }
        super.t2(lVar, i6, z6, null, hVar, aVar2);
    }
}
