package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Q3.AbstractC1468g implements p095j4.e {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f49523M = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f49524I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Q3.C1465d f49525J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final android.os.Bundle f49526K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.lang.Integer f49527L;

    public a(android.content.Context context, android.os.Looper looper, boolean z6, Q3.C1465d c1465d, android.os.Bundle bundle, O3.f.a aVar, O3.f.b bVar) {
        super(context, looper, 44, c1465d, aVar, bVar);
        this.f49524I = true;
        this.f49525J = c1465d;
        this.f49526K = bundle;
        this.f49527L = c1465d.i();
    }

    public static android.os.Bundle m0(Q3.C1465d c1465d) {
        c1465d.h();
        java.lang.Integer numI = c1465d.i();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1465d.a());
        if (numI != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numI.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // Q3.AbstractC1464c
    protected final android.os.Bundle A() {
        if (!y().getPackageName().equals(this.f49525J.f())) {
            this.f49526K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f49525J.f());
        }
        return this.f49526K;
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p095j4.e
    public final void b(p105k4.f fVar) {
        Q3.AbstractC1477p.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            android.accounts.Account accountC = this.f49525J.c();
            ((p105k4.g) D()).c2(new p105k4.j(1, new Q3.M(accountC, ((java.lang.Integer) Q3.AbstractC1477p.l(this.f49527L)).intValue(), "<<default account>>".equals(accountC.name) ? L3.c.b(y()).c() : null)), fVar);
        } catch (android.os.RemoteException e6) {
            try {
                fVar.V3(new p105k4.l(1, new N3.C1389b(8, null), null));
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 12451000;
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final boolean o() {
        return this.f49524I;
    }

    @Override // p095j4.e
    public final void p() {
        c(new Q3.AbstractC1464c.d());
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof p105k4.g ? (p105k4.g) iInterfaceQueryLocalInterface : new p105k4.g(iBinder);
    }
}
