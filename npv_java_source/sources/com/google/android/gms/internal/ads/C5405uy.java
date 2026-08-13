package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5405uy implements com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2698Ot f39296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.Executor f39297D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3868gy f39298E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final V3.f f39299F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f39300G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f39301H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4196jy f39302I = new com.google.android.gms.internal.ads.C4196jy();

    public C5405uy(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C3868gy c3868gy, V3.f fVar) {
        this.f39297D = executor;
        this.f39298E = c3868gy;
        this.f39299F = fVar;
    }

    private final void f() {
        try {
            final org.json.JSONObject jSONObjectC = this.f39298E.c(this.f39302I);
            if (this.f39296C != null) {
                this.f39297D.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ty
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39060C.c(jSONObjectC);
                    }
                });
            }
        } catch (org.json.JSONException e6) {
            p214v3.AbstractC7265q0.l("Failed to call video active view js", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        boolean z6 = this.f39301H ? false : c2596Mb.f29800j;
        com.google.android.gms.internal.ads.C4196jy c4196jy = this.f39302I;
        c4196jy.f36872a = z6;
        c4196jy.f36875d = this.f39299F.c();
        this.f39302I.f36877f = c2596Mb;
        if (this.f39300G) {
            f();
        }
    }

    public final void a() {
        this.f39300G = false;
    }

    public final void b() {
        this.f39300G = true;
        f();
    }

    final /* synthetic */ void c(org.json.JSONObject jSONObject) {
        this.f39296C.G0("AFMA_updateActiveView", jSONObject);
    }

    public final void d(boolean z6) {
        this.f39301H = z6;
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f39296C = interfaceC2698Ot;
    }
}
