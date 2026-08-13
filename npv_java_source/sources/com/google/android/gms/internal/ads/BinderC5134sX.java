package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5134sX extends com.google.android.gms.internal.ads.AbstractBinderC2946Vm {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f38758C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2874Tm f38759D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f38760E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final org.json.JSONObject f38761F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final long f38762G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f38763H;

    public BinderC5134sX(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874Tm, com.google.android.gms.internal.ads.C4512mr c4512mr, long j6) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f38761F = jSONObject;
        this.f38763H = false;
        this.f38760E = c4512mr;
        this.f38758C = str;
        this.f38759D = interfaceC2874Tm;
        this.f38762G = j6;
        try {
            jSONObject.put("adapter_version", interfaceC2874Tm.e().toString());
            jSONObject.put("sdk_version", interfaceC2874Tm.i().toString());
            jSONObject.put("name", str);
        } catch (android.os.RemoteException | java.lang.NullPointerException | org.json.JSONException unused) {
        }
    }

    public static synchronized void o6(java.lang.String str, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25296I1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                c4512mr.c(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void p6(java.lang.String str, int i6) {
        try {
            if (this.f38763H) {
                return;
            }
            try {
                this.f38761F.put("signal_error", str);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25307J1)).booleanValue()) {
                    this.f38761F.put("latency", p174r3.v.c().c() - this.f38762G);
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25296I1)).booleanValue()) {
                    this.f38761F.put("signal_error_code", i6);
                }
            } catch (org.json.JSONException unused) {
            }
            this.f38760E.c(this.f38761F);
            this.f38763H = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982Wm
    public final synchronized void G(java.lang.String str) {
        p6(str, 2);
    }

    public final synchronized void c() {
        p6("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982Wm
    public final synchronized void c6(p184s3.W0 w6) {
        p6(w6.f54146D, 2);
    }

    public final synchronized void f() {
        if (this.f38763H) {
            return;
        }
        try {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25296I1)).booleanValue()) {
                this.f38761F.put("signal_error_code", 0);
            }
        } catch (org.json.JSONException unused) {
        }
        this.f38760E.c(this.f38761F);
        this.f38763H = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982Wm
    public final synchronized void o(java.lang.String str) {
        if (this.f38763H) {
            return;
        }
        if (str == null) {
            G("Adapter returned null signals");
            return;
        }
        try {
            this.f38761F.put("signals", str);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25307J1)).booleanValue()) {
                this.f38761F.put("latency", p174r3.v.c().c() - this.f38762G);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25296I1)).booleanValue()) {
                this.f38761F.put("signal_error_code", 0);
            }
        } catch (org.json.JSONException unused) {
        }
        this.f38760E.c(this.f38761F);
        this.f38763H = true;
    }
}
