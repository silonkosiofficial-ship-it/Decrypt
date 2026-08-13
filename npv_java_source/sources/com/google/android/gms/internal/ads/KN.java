package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KN implements com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.ZG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f28902C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f28903D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f28904E;

    KN(com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C4246kO c4246kO, int i6) {
        this.f28902C = yn;
        this.f28903D = c4246kO;
        this.f28904E = i6;
    }

    private final void b(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (java.lang.String str : bundle.keySet()) {
            long j6 = bundle.getLong(str);
            if (j6 >= 0) {
                this.f28902C.c(str, java.lang.String.valueOf(j6));
            }
        }
    }

    private final void c(android.os.Bundle bundle, com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(com.google.android.gms.internal.ads.MN.PUBLIC_API_CALLBACK.e(), p174r3.v.c().a());
        if (bundle.containsKey("ls")) {
            this.f28902C.c("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = abstractC3398ci0.size();
        for (int i6 = 0; i6 < size; i6++) {
            com.google.android.gms.internal.ads.NN nn = (com.google.android.gms.internal.ads.NN) abstractC3398ci0.get(i6);
            long j6 = bundle.getLong(nn.a().e(), -1L);
            long j10 = bundle.getLong(nn.b().e(), -1L);
            if (j6 > 0 && j10 > 0) {
                this.f28902C.c(nn.c(), java.lang.String.valueOf(j10 - j6));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25668q7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.f28902C.c("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                this.f28902C.c("cmr", java.lang.String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        this.f28902C.e(c2730Po.f30793C);
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void G(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25345M6)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25668q7)).booleanValue()) {
                this.f28902C.b().put("sgw", java.lang.String.valueOf(this.f28904E));
            }
            this.f28902C.b().put("action", "sgf");
            this.f28902C.c("sgf_reason", str);
            this.f28903D.g(this.f28902C.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void a(B3.N n6) {
        java.util.Map mapB;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25345M6)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25668q7)).booleanValue()) {
                this.f28902C.b().put("sgw", java.lang.String.valueOf(this.f28904E));
            }
            if (n6 != null) {
                com.google.android.gms.internal.ads.C2730Po c2730Po = n6.f555d;
                android.os.Bundle bundle = n6.f556e;
                if (c2730Po != null) {
                    c(c2730Po.f30805O, com.google.android.gms.internal.ads.NN.f30280d);
                } else if (bundle != null && !bundle.isEmpty()) {
                    c(bundle, com.google.android.gms.internal.ads.NN.f30280d);
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(android.text.TextUtils.isEmpty(n6.f554c) ? n6.f553b : n6.f554c);
                    this.f28902C.b().put("action", "sgs");
                    java.util.Map mapB2 = this.f28902C.b();
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25217A9)).booleanValue()) {
                        try {
                            str3 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                        } catch (org.json.JSONException e6) {
                            p224w3.p.e("Error retrieving JSONObject from the requestJson, ", e6);
                            str3 = "na";
                        }
                    } else {
                        str3 = "na";
                    }
                    mapB2.put("tpc", str3);
                    com.google.android.gms.internal.ads.C2730Po c2730Po2 = n6.f555d;
                    if (c2730Po2 != null) {
                        this.f28902C.e(c2730Po2.f30793C);
                    }
                } catch (org.json.JSONException unused) {
                    this.f28902C.b().put("action", "sgf");
                    mapB = this.f28902C.b();
                    str = "sgf_reason";
                    str2 = "request_invalid";
                    mapB.put(str, str2);
                }
                this.f28903D.g(this.f28902C.b());
            }
            this.f28902C.b().put("action", "sgs");
            mapB = this.f28902C.b();
            str = "request_id";
            str2 = "-1";
            mapB.put(str, str2);
            this.f28903D.g(this.f28902C.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        this.f28902C.b().put("action", "loaded");
        c(this.f28902C.a(), com.google.android.gms.internal.ads.NN.f30281e);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.xc)).booleanValue()) {
            this.f28902C.b().put("mafe", true != G2.f.a("MUTE_AUDIO") ? "0" : "1");
        }
        this.f28903D.g(this.f28902C.b());
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(p184s3.W0 w6) {
        this.f28902C.b().put("action", "ftl");
        this.f28902C.c("ftl", java.lang.String.valueOf(w6.f54145C));
        this.f28902C.c("ed", w6.f54147E);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25477Y6)).booleanValue()) {
            this.f28902C.c("emsg", w6.f54146D);
        }
        this.f28903D.g(this.f28902C.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f28902C.d(c3558e70);
    }
}
