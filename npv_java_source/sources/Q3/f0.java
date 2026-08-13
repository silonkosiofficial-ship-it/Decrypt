package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Q3.Q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.os.IBinder f8960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1464c f8961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Q3.AbstractC1464c abstractC1464c, int i6, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(abstractC1464c, i6, bundle);
        this.f8961h = abstractC1464c;
        this.f8960g = iBinder;
    }

    @Override // Q3.Q
    protected final void f(N3.C1389b c1389b) {
        if (this.f8961h.f8910v != null) {
            this.f8961h.f8910v.q0(c1389b);
        }
        this.f8961h.L(c1389b);
    }

    @Override // Q3.Q
    protected final boolean g() {
        try {
            android.os.IBinder iBinder = this.f8960g;
            Q3.AbstractC1477p.l(iBinder);
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f8961h.E().equals(interfaceDescriptor)) {
                java.lang.String str = "service descriptor mismatch: " + this.f8961h.E() + " vs. " + interfaceDescriptor;
                return false;
            }
            android.os.IInterface iInterfaceS = this.f8961h.s(this.f8960g);
            if (iInterfaceS == null || !(Q3.AbstractC1464c.g0(this.f8961h, 2, 4, iInterfaceS) || Q3.AbstractC1464c.g0(this.f8961h, 3, 4, iInterfaceS))) {
                return false;
            }
            this.f8961h.f8914z = null;
            Q3.AbstractC1464c abstractC1464c = this.f8961h;
            android.os.Bundle bundleX = abstractC1464c.x();
            if (abstractC1464c.f8909u == null) {
                return true;
            }
            this.f8961h.f8909u.L0(bundleX);
            return true;
        } catch (android.os.RemoteException unused) {
        }
    }
}
