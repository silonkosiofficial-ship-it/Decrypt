package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5102sB implements com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.ZG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC2509Jo f38671C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.content.Context f38673E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f38674F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p224w3.a f38675G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.concurrent.Executor f38676H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f38677I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f38678J = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f38672D = new java.util.concurrent.atomic.AtomicBoolean();

    C5102sB(android.content.Context context, com.google.android.gms.internal.ads.T90 t90, p224w3.a aVar, java.util.concurrent.Executor executor) {
        this.f38673E = context;
        this.f38674F = t90;
        this.f38675G = aVar;
        this.f38676H = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void G(java.lang.String str) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void a(B3.N n6) {
        c();
    }

    final /* synthetic */ void b() {
        com.google.android.gms.internal.ads.AbstractC4158jf.e(this.f38673E);
        this.f38678J = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void c() {
        com.google.android.gms.internal.ads.AbstractC2509Jo abstractC2509Jo;
        int i6;
        com.google.android.gms.internal.ads.C5599wl c5599wlA;
        if (!this.f38672D.getAndSet(true)) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26281j.e()).booleanValue()) {
                i6 = 2;
            } else {
                i6 = 3;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26282k.e()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2237Cg.f26280i.e()).booleanValue()) {
                        try {
                            java.lang.String strOptString = new org.json.JSONObject(p174r3.v.s().j().i().c()).optString("local_flag_write");
                            if (android.text.TextUtils.equals(strOptString, "client")) {
                                i6 = 2;
                            } else if (!android.text.TextUtils.equals(strOptString, "service")) {
                                i6 = 1;
                            }
                        } catch (org.json.JSONException unused) {
                        }
                    } else {
                        i6 = 1;
                    }
                }
            }
            int i10 = i6 - 1;
            if (i10 == 1) {
                c5599wlA = p174r3.v.j().a(this.f38673E, p224w3.a.e(), this.f38674F);
            } else if (i10 == 2) {
                c5599wlA = p174r3.v.j().b(this.f38673E, p224w3.a.e(), this.f38674F);
            }
            com.google.android.gms.internal.ads.InterfaceC4940ql interfaceC4940ql = com.google.android.gms.internal.ads.AbstractC5269tl.f39020b;
            this.f38671C = new com.google.android.gms.internal.ads.C2583Lo(this.f38673E, c5599wlA.a("google.afma.sdkConstants.getSdkConstants", interfaceC4940ql, interfaceC4940ql), this.f38675G);
            this.f38677I = true;
        }
        if (this.f38677I && (abstractC2509Jo = this.f38671C) != null) {
            P4.d dVarA = abstractC2509Jo.a();
            if (!this.f38678J && ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39202i.e()).booleanValue()) {
                dVarA.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.rB
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38445C.b();
                    }
                }, this.f38676H);
            }
            com.google.android.gms.internal.ads.AbstractC3854gr.a(dVarA, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
    }
}
