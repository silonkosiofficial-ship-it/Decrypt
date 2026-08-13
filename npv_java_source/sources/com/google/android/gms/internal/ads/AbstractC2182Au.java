package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2182Au extends com.google.android.gms.internal.ads.AbstractC3097Zt {
    public AbstractC2182Au(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4704od c4704od, boolean z6, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT) {
        super(interfaceC2698Ot, c4704od, z6, new com.google.android.gms.internal.ads.C5493vn(interfaceC2698Ot, interfaceC2698Ot.r0(), new com.google.android.gms.internal.ads.C3940hf(interfaceC2698Ot.getContext())), null, binderC5240tT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final android.webkit.WebResourceResponse E0(android.webkit.WebView webView, java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf;
        if (!(webView instanceof com.google.android.gms.internal.ads.InterfaceC2698Ot)) {
            p224w3.p.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) webView;
        com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f33702a0;
        if (interfaceC3194aq != null) {
            interfaceC3194aq.b(str, map, 1);
        }
        com.google.android.gms.internal.ads.AbstractC4157je0.a();
        com.google.android.gms.internal.ads.AbstractC4927qe0 abstractC4927qe0 = com.google.android.gms.internal.ads.AbstractC4927qe0.f38294a;
        if (!"mraid.js".equalsIgnoreCase(new java.io.File(str).getName())) {
            if (map == null) {
                map = java.util.Collections.emptyMap();
            }
            return super.G(str, map);
        }
        if (interfaceC2698Ot.M() != null) {
            interfaceC2698Ot.M().T();
        }
        if (interfaceC2698Ot.I().i()) {
            abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25492a0;
        } else {
            abstractC5037rf = interfaceC2698Ot.R0() ? com.google.android.gms.internal.ads.AbstractC2161Af.f25481Z : com.google.android.gms.internal.ads.AbstractC2161Af.f25470Y;
        }
        java.lang.String str2 = (java.lang.String) p184s3.A.c().a(abstractC5037rf);
        p174r3.v.t();
        return p214v3.E0.d0(interfaceC2698Ot.getContext(), interfaceC2698Ot.n().f56217C, str2);
    }
}
