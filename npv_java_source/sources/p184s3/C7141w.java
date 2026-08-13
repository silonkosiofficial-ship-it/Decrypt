package p184s3;

/* JADX INFO: renamed from: s3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7141w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.V1 f54335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p184s3.T1 f54336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p184s3.C7140v1 f54337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4494mi f54338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2508Jn f54339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4604ni f54340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4616no f54341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p184s3.W1 f54342h;

    public C7141w(p184s3.V1 v6, p184s3.T1 t6, p184s3.C7140v1 c7140v1, com.google.android.gms.internal.ads.C4494mi c4494mi, com.google.android.gms.internal.ads.C2473Ip c2473Ip, com.google.android.gms.internal.ads.C2508Jn c2508Jn, com.google.android.gms.internal.ads.C4604ni c4604ni, p184s3.W1 w6) {
        this.f54335a = v6;
        this.f54336b = t6;
        this.f54337c = c7140v1;
        this.f54338d = c4494mi;
        this.f54339e = c2508Jn;
        this.f54340f = c4604ni;
        this.f54342h = w6;
    }

    static /* bridge */ /* synthetic */ void q(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        p184s3.C7147y.b().p(context, p184s3.C7147y.c().f56217C, "gmob-apps", bundle, true);
    }

    public final p184s3.Q c(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (p184s3.Q) new p184s3.C7124q(this, context, str, interfaceC2945Vl).d(context, false);
    }

    public final p184s3.V d(android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (p184s3.V) new p184s3.C7112m(this, context, c2Var, str, interfaceC2945Vl).d(context, false);
    }

    public final p184s3.V e(android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (p184s3.V) new p184s3.C7118o(this, context, c2Var, str, interfaceC2945Vl).d(context, false);
    }

    public final p184s3.Q0 f(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (p184s3.Q0) new p184s3.C7094g(this, context, interfaceC2945Vl).d(context, false);
    }

    public final com.google.android.gms.internal.ads.InterfaceC5261th h(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        return (com.google.android.gms.internal.ads.InterfaceC5261th) new p184s3.C7135u(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final com.google.android.gms.internal.ads.InterfaceC2323En j(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (com.google.android.gms.internal.ads.InterfaceC2323En) new p184s3.C7106k(this, context, interfaceC2945Vl).d(context, false);
    }

    public final com.google.android.gms.internal.ads.InterfaceC2618Mn l(android.app.Activity activity) {
        p184s3.C7088e c7088e = new p184s3.C7088e(this, activity);
        android.content.Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            p224w3.p.d("useClientJar flag not found in activity intent extras.");
        }
        return (com.google.android.gms.internal.ads.InterfaceC2618Mn) c7088e.d(activity, booleanExtra);
    }

    public final com.google.android.gms.internal.ads.InterfaceC5497vp n(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (com.google.android.gms.internal.ads.InterfaceC5497vp) new p184s3.C7082c(this, context, str, interfaceC2945Vl).d(context, false);
    }

    public final com.google.android.gms.internal.ads.InterfaceC2215Bq o(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        return (com.google.android.gms.internal.ads.InterfaceC2215Bq) new p184s3.C7100i(this, context, interfaceC2945Vl).d(context, false);
    }
}
