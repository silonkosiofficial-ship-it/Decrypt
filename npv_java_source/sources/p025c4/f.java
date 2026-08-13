package p025c4;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Q3.AbstractC1468g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final I3.g f24418I;

    public f(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, I3.g gVar, O3.f.a aVar, O3.f.b bVar) {
        super(context, looper, 68, c1465d, aVar, bVar);
        I3.f fVar = new I3.f(gVar == null ? I3.g.f5019F : gVar);
        fVar.a(p025c4.b.a());
        this.f24418I = new I3.g(fVar);
    }

    @Override // Q3.AbstractC1464c
    protected final android.os.Bundle A() {
        return this.f24418I.a();
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 12800000;
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof p025c4.g ? (p025c4.g) iInterfaceQueryLocalInterface : new p025c4.g(iBinder);
    }
}
