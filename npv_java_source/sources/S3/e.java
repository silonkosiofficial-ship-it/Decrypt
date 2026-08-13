package S3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Q3.AbstractC1468g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Q3.C1483w f12432I;

    public e(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, Q3.C1483w c1483w, P3.InterfaceC1447c interfaceC1447c, P3.h hVar) {
        super(context, looper, 270, c1465d, interfaceC1447c, hVar);
        this.f12432I = c1483w;
    }

    @Override // Q3.AbstractC1464c
    protected final android.os.Bundle A() {
        return this.f12432I.b();
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // Q3.AbstractC1464c
    protected final boolean I() {
        return true;
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 203400000;
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof S3.a ? (S3.a) iInterfaceQueryLocalInterface : new S3.a(iBinder);
    }

    @Override // Q3.AbstractC1464c
    public final N3.C1391d[] v() {
        return p035d4.d.f44295b;
    }
}
