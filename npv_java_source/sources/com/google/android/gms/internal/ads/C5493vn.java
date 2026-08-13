package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5493vn extends com.google.android.gms.internal.ads.C5603wn implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f39440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.Context f39441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.view.WindowManager f39442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3940hf f39443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    android.util.DisplayMetrics f39444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f39445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f39446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f39447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f39449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f39450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f39451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f39452o;

    public C5493vn(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, android.content.Context context, com.google.android.gms.internal.ads.C3940hf c3940hf) {
        super(interfaceC2698Ot, "");
        this.f39446i = -1;
        this.f39447j = -1;
        this.f39449l = -1;
        this.f39450m = -1;
        this.f39451n = -1;
        this.f39452o = -1;
        this.f39440c = interfaceC2698Ot;
        this.f39441d = context;
        this.f39443f = c3940hf;
        this.f39442e = (android.view.WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        int iX;
        org.json.JSONObject jSONObjectPut;
        this.f39444g = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = this.f39442e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f39444g);
        this.f39445h = this.f39444g.density;
        this.f39448k = defaultDisplay.getRotation();
        p184s3.C7147y.b();
        android.util.DisplayMetrics displayMetrics = this.f39444g;
        this.f39446i = p224w3.g.x(displayMetrics, displayMetrics.widthPixels);
        p184s3.C7147y.b();
        android.util.DisplayMetrics displayMetrics2 = this.f39444g;
        this.f39447j = p224w3.g.x(displayMetrics2, displayMetrics2.heightPixels);
        android.app.Activity activityH = this.f39440c.h();
        if (activityH == null || activityH.getWindow() == null) {
            this.f39449l = this.f39446i;
            iX = this.f39447j;
        } else {
            p174r3.v.t();
            int[] iArrQ = p214v3.E0.q(activityH);
            p184s3.C7147y.b();
            this.f39449l = p224w3.g.x(this.f39444g, iArrQ[0]);
            p184s3.C7147y.b();
            iX = p224w3.g.x(this.f39444g, iArrQ[1]);
        }
        this.f39450m = iX;
        if (this.f39440c.I().i()) {
            this.f39451n = this.f39446i;
            this.f39452o = this.f39447j;
        } else {
            this.f39440c.measure(0, 0);
        }
        e(this.f39446i, this.f39447j, this.f39449l, this.f39450m, this.f39445h, this.f39448k);
        com.google.android.gms.internal.ads.C5383un c5383un = new com.google.android.gms.internal.ads.C5383un();
        com.google.android.gms.internal.ads.C3940hf c3940hf = this.f39443f;
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setData(android.net.Uri.parse("tel:"));
        c5383un.e(c3940hf.a(intent));
        com.google.android.gms.internal.ads.C3940hf c3940hf2 = this.f39443f;
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse("sms:"));
        c5383un.c(c3940hf2.a(intent2));
        c5383un.a(this.f39443f.b());
        c5383un.d(this.f39443f.c());
        c5383un.b(true);
        boolean z6 = c5383un.f39218a;
        boolean z10 = c5383un.f39219b;
        boolean z11 = c5383un.f39220c;
        boolean z12 = c5383un.f39221d;
        boolean z13 = c5383un.f39222e;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f39440c;
        try {
            jSONObjectPut = new org.json.JSONObject().put("sms", z6).put("tel", z10).put("calendar", z11).put("storePicture", z12).put("inlineVideo", z13);
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while obtaining the MRAID capabilities.", e6);
            jSONObjectPut = null;
        }
        interfaceC2698Ot.a("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f39440c.getLocationOnScreen(iArr);
        h(p184s3.C7147y.b().e(this.f39441d, iArr[0]), p184s3.C7147y.b().e(this.f39441d, iArr[1]));
        if (p224w3.p.j(2)) {
            p224w3.p.f("Dispatching Ready Event.");
        }
        d(this.f39440c.n().f56217C);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r3
  0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public final void h(int i6, int i10) {
        int i11;
        android.content.Context context = this.f39441d;
        int i12 = 0;
        if (context instanceof android.app.Activity) {
            p174r3.v.t();
            i11 = p214v3.E0.r((android.app.Activity) context)[0];
        } else {
            i11 = 0;
        }
        if (this.f39440c.I() == null || !this.f39440c.I().i()) {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f39440c;
            int width = interfaceC2698Ot.getWidth();
            int height = interfaceC2698Ot.getHeight();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25525d0)).booleanValue()) {
                if (width == 0) {
                    width = this.f39440c.I() != null ? this.f39440c.I().f29846c : 0;
                }
                if (height != 0) {
                    i12 = height;
                } else if (this.f39440c.I() != null) {
                    i12 = this.f39440c.I().f29845b;
                }
            } else {
                i12 = height;
            }
            this.f39451n = p184s3.C7147y.b().e(this.f39441d, width);
            this.f39452o = p184s3.C7147y.b().e(this.f39441d, i12);
        }
        b(i6, i10 - i11, this.f39451n, this.f39452o);
        this.f39440c.M().x(i6, i10);
    }
}
