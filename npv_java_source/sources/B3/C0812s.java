package B3;

/* JADX INFO: renamed from: B3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0812s implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ P4.d f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2363Fq f681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5829yq f682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ B3.BinderC0816w f684e;

    C0812s(B3.BinderC0816w binderC0816w, P4.d dVar, com.google.android.gms.internal.ads.C2363Fq c2363Fq, com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq, com.google.android.gms.internal.ads.E90 e90) {
        this.f680a = dVar;
        this.f681b = c2363Fq;
        this.f682c = interfaceC5829yq;
        this.f683d = e90;
        this.f684e = binderC0816w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25236C7)).booleanValue()) {
            p174r3.v.s().w(th, "SignalGeneratorImpl.generateSignals");
        } else {
            p174r3.v.s().x(th, "SignalGeneratorImpl.generateSignals");
        }
        com.google.android.gms.internal.ads.Q90 q90V6 = B3.BinderC0816w.V6(this.f680a, this.f681b);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() && q90V6 != null) {
            com.google.android.gms.internal.ads.E90 e90 = this.f683d;
            e90.c(th);
            e90.K0(false);
            q90V6.a(e90);
            q90V6.h();
        }
        if (this.f682c == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f682c.y(message);
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.E90 e90;
        com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq;
        java.lang.String str;
        java.lang.String str2;
        B3.N n6 = (B3.N) obj;
        com.google.android.gms.internal.ads.Q90 q90V6 = B3.BinderC0816w.V6(this.f680a, this.f681b);
        this.f684e.f741d0.set(true);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25738x7)).booleanValue()) {
            try {
                if (n6 == null) {
                    com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq2 = this.f682c;
                    if (interfaceC5829yq2 != null) {
                        interfaceC5829yq2.M1(null, null, null);
                    }
                    this.f683d.K0(true);
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() || q90V6 == null) {
                        return;
                    }
                } else {
                    try {
                        if (android.text.TextUtils.isEmpty((!android.text.TextUtils.isEmpty(n6.f554c) ? new org.json.JSONObject(n6.f554c) : new org.json.JSONObject(n6.f553b)).optString("request_id", ""))) {
                            p224w3.p.g("The request ID is empty in request JSON.");
                            com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq3 = this.f682c;
                            if (interfaceC5829yq3 != null) {
                                interfaceC5829yq3.y("Internal error: request ID is empty in request JSON.");
                            }
                            com.google.android.gms.internal.ads.E90 e91 = this.f683d;
                            e91.E("Request ID empty");
                            e91.K0(false);
                            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() || q90V6 == null) {
                                return;
                            }
                        } else {
                            android.os.Bundle bundle = n6.f557f;
                            B3.BinderC0816w binderC0816w = this.f684e;
                            if (binderC0816w.f729R && bundle != null && bundle.getInt(binderC0816w.f731T, -1) == -1) {
                                B3.BinderC0816w binderC0816w2 = this.f684e;
                                bundle.putInt(binderC0816w2.f731T, binderC0816w2.f732U.get());
                            }
                            B3.BinderC0816w binderC0816w3 = this.f684e;
                            if (binderC0816w3.f728Q && bundle != null && android.text.TextUtils.isEmpty(bundle.getString(binderC0816w3.f730S))) {
                                if (android.text.TextUtils.isEmpty(this.f684e.f734W)) {
                                    B3.BinderC0816w binderC0816w4 = this.f684e;
                                    p214v3.E0 e0T = p174r3.v.t();
                                    B3.BinderC0816w binderC0816w5 = this.f684e;
                                    binderC0816w4.f734W = e0T.H(binderC0816w5.f715D, binderC0816w5.f733V.f56217C);
                                }
                                B3.BinderC0816w binderC0816w6 = this.f684e;
                                bundle.putString(binderC0816w6.f730S, binderC0816w6.f734W);
                            }
                            if (this.f682c != null) {
                                if (android.text.TextUtils.isEmpty(n6.f554c)) {
                                    interfaceC5829yq = this.f682c;
                                    str = n6.f552a;
                                    str2 = n6.f553b;
                                } else {
                                    interfaceC5829yq = this.f682c;
                                    str = n6.f552a;
                                    str2 = n6.f554c;
                                }
                                interfaceC5829yq.M1(str, str2, bundle);
                            }
                            this.f683d.K0(true);
                            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() || q90V6 == null) {
                                return;
                            }
                        }
                    } catch (org.json.JSONException e6) {
                        p224w3.p.g("Failed to create JSON object from the request string.");
                        com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq4 = this.f682c;
                        if (interfaceC5829yq4 != null) {
                            interfaceC5829yq4.y("Internal error for request JSON: " + e6.toString());
                        }
                        com.google.android.gms.internal.ads.E90 e92 = this.f683d;
                        e92.c(e6);
                        e92.K0(false);
                        p174r3.v.s().x(e6, "SignalGeneratorImpl.generateSignals.onSuccess");
                        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() || q90V6 == null) {
                            return;
                        }
                    }
                }
            } catch (android.os.RemoteException e10) {
                com.google.android.gms.internal.ads.E90 e93 = this.f683d;
                e93.c(e10);
                e93.K0(false);
                p224w3.p.e("", e10);
                p174r3.v.s().x(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() || q90V6 == null) {
                    return;
                }
            } finally {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() && q90V6 != null) {
                    q90V6.a(this.f683d);
                    q90V6.h();
                }
            }
            e90 = this.f683d;
        } else {
            try {
                com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq5 = this.f682c;
                if (interfaceC5829yq5 != null) {
                    interfaceC5829yq5.y("QueryInfo generation has been disabled.");
                }
            } catch (android.os.RemoteException e11) {
                p224w3.p.d("QueryInfo generation has been disabled.".concat(e11.toString()));
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39434e.e()).booleanValue() || q90V6 == null) {
                return;
            }
            e90 = this.f683d;
            e90.E("QueryInfo generation has been disabled.");
            e90.K0(false);
        }
        q90V6.a(e90);
    }
}
