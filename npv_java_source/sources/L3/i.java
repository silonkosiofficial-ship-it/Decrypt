package L3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Q3.AbstractC1468g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions f6204I;

    public i(android.content.Context context, android.os.Looper looper, Q3.C1465d c1465d, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, O3.f.a aVar, O3.f.b bVar) {
        super(context, looper, 91, c1465d, aVar, bVar);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new com.google.android.gms.auth.api.signin.GoogleSignInOptions.a(googleSignInOptions) : new com.google.android.gms.auth.api.signin.GoogleSignInOptions.a();
        aVar2.e(p025c4.b.a());
        if (!c1465d.d().isEmpty()) {
            java.util.Iterator it = c1465d.d().iterator();
            while (it.hasNext()) {
                aVar2.d((com.google.android.gms.common.api.Scope) it.next(), new com.google.android.gms.common.api.Scope[0]);
            }
        }
        this.f6204I = aVar2.a();
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 12451000;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions m0() {
        return this.f6204I;
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof L3.u ? (L3.u) iInterfaceQueryLocalInterface : new L3.u(iBinder);
    }
}
