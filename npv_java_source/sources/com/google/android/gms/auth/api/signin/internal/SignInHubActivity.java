package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepName
public class SignInHubActivity extends androidx.fragment.app.g {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static boolean f24833i0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f24834d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration f24835e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f24836f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f24837g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private android.content.Intent f24838h0;

    private final void r0() {
        f0().c(0, null, new com.google.android.gms.auth.api.signin.internal.a(this, null));
        f24833i0 = false;
    }

    private final void s0(int i6) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i6);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f24833i0 = false;
    }

    private final void t0(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f24835e0);
        try {
            startActivityForResult(intent, 40962);
        } catch (android.content.ActivityNotFoundException unused) {
            this.f24834d0 = true;
            s0(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // p040e.j, android.app.Activity
    protected final void onActivityResult(int i6, int i10, android.content.Intent intent) {
        if (this.f24834d0) {
            return;
        }
        setResult(0);
        if (i6 != 40962) {
            return;
        }
        if (intent != null) {
            com.google.android.gms.auth.api.signin.SignInAccount signInAccount = (com.google.android.gms.auth.api.signin.SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.e() != null) {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountE = signInAccount.e();
                L3.p pVarA = L3.p.a(this);
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptionsE = this.f24835e0.e();
                googleSignInAccountE.getClass();
                pVarA.c(googleSignInOptionsE, googleSignInAccountE);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountE);
                this.f24836f0 = true;
                this.f24837g0 = i10;
                this.f24838h0 = intent;
                r0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                s0(intExtra);
                return;
            }
        }
        s0(8);
    }

    @Override // androidx.fragment.app.g, p040e.j, androidx.core.app.f, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            s0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(java.lang.String.valueOf(intent.getAction()));
            finish();
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f24835e0 = signInConfiguration;
        if (bundle == null) {
            if (f24833i0) {
                setResult(0);
                s0(12502);
                return;
            } else {
                f24833i0 = true;
                t0(action);
                return;
            }
        }
        boolean z6 = bundle.getBoolean("signingInGoogleApiClients");
        this.f24836f0 = z6;
        if (z6) {
            this.f24837g0 = bundle.getInt("signInResultCode");
            android.content.Intent intent2 = (android.content.Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f24838h0 = intent2;
            r0();
        }
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f24833i0 = false;
    }

    @Override // p040e.j, androidx.core.app.f, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f24836f0);
        if (this.f24836f0) {
            bundle.putInt("signInResultCode", this.f24837g0);
            bundle.putParcelable("signInResultData", this.f24838h0);
        }
    }
}
