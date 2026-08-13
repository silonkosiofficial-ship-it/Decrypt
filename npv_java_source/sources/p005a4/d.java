package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Q3.AbstractC1468g {
    protected d(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, P3.InterfaceC1447c interfaceC1447c, P3.h hVar) {
        super(context, looper, 300, c1465d, interfaceC1447c, hVar);
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // Q3.AbstractC1464c
    protected final boolean I() {
        return true;
    }

    @Override // Q3.AbstractC1464c
    public final boolean S() {
        return true;
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 212800000;
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof p005a4.g ? (p005a4.g) iInterfaceQueryLocalInterface : new p005a4.g(iBinder);
    }

    @Override // Q3.AbstractC1464c
    public final N3.C1391d[] v() {
        return H3.h.f4365b;
    }
}
