package p015b4;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Q3.AbstractC1468g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.os.Bundle f24176I;

    public b(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, I3.c cVar, P3.InterfaceC1447c interfaceC1447c, P3.h hVar) {
        super(context, looper, 16, c1465d, interfaceC1447c, hVar);
        this.f24176I = new android.os.Bundle();
    }

    @Override // Q3.AbstractC1464c
    protected final android.os.Bundle A() {
        return this.f24176I;
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // Q3.AbstractC1464c
    public final boolean S() {
        return true;
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 12451000;
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final boolean o() {
        Q3.C1465d c1465dJ0 = j0();
        return (android.text.TextUtils.isEmpty(c1465dJ0.b()) || c1465dJ0.e(I3.b.f5013a).isEmpty()) ? false : true;
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof p015b4.c ? (p015b4.c) iInterfaceQueryLocalInterface : new p015b4.c(iBinder);
    }
}
