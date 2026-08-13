package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class b extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private D0.AbstractC0882a f19232P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f19233Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f19234R;

    private b(D0.AbstractC0882a abstractC0882a, float f6, float f10) {
        this.f19232P = abstractC0882a;
        this.f19233Q = f6;
        this.f19234R = f10;
    }

    public /* synthetic */ b(D0.AbstractC0882a abstractC0882a, float f6, float f10, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC0882a, f6, f10);
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final void T1(float f6) {
        this.f19234R = f6;
    }

    public final void U1(D0.AbstractC0882a abstractC0882a) {
        this.f19232P = abstractC0882a;
    }

    public final void V1(float f6) {
        this.f19233Q = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        return androidx.compose.foundation.layout.a.c(m6, this.f19232P, this.f19233Q, this.f19234R, g6, j6);
    }

    @Override // F0.E
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.c(this, interfaceC0896o, interfaceC0895n, i6);
    }
}
