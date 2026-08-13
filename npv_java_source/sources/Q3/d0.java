package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Q3.T {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Q3.AbstractC1464c f8934C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f8935D;

    public d0(Q3.AbstractC1464c abstractC1464c, int i6) {
        this.f8934C = abstractC1464c;
        this.f8935D = i6;
    }

    @Override // Q3.InterfaceC1472k
    public final void D3(int i6, android.os.IBinder iBinder, android.os.Bundle bundle) {
        Q3.AbstractC1477p.m(this.f8934C, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f8934C.N(i6, iBinder, bundle, this.f8935D);
        this.f8934C = null;
    }

    @Override // Q3.InterfaceC1472k
    public final void l2(int i6, android.os.Bundle bundle) {
        new java.lang.Exception();
    }

    @Override // Q3.InterfaceC1472k
    public final void n1(int i6, android.os.IBinder iBinder, Q3.h0 h0Var) {
        Q3.AbstractC1464c abstractC1464c = this.f8934C;
        Q3.AbstractC1477p.m(abstractC1464c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Q3.AbstractC1477p.l(h0Var);
        Q3.AbstractC1464c.c0(abstractC1464c, h0Var);
        D3(i6, iBinder, h0Var.f8971C);
    }
}
