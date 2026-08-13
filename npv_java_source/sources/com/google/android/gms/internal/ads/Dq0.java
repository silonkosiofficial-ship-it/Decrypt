package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Dq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f26772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f26773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f26774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f26775d;

    public Dq0() {
        this.f26772a = new java.util.HashMap();
        this.f26773b = new java.util.HashMap();
        this.f26774c = new java.util.HashMap();
        this.f26775d = new java.util.HashMap();
    }

    public Dq0(com.google.android.gms.internal.ads.Hq0 hq0) {
        this.f26772a = new java.util.HashMap(hq0.f28109a);
        this.f26773b = new java.util.HashMap(hq0.f28110b);
        this.f26774c = new java.util.HashMap(hq0.f28111c);
        this.f26775d = new java.util.HashMap(hq0.f28112d);
    }

    public final com.google.android.gms.internal.ads.Dq0 a(com.google.android.gms.internal.ads.AbstractC5058rp0 abstractC5058rp0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Eq0 eq0 = new com.google.android.gms.internal.ads.Eq0(abstractC5058rp0.d(), abstractC5058rp0.c(), null);
        if (this.f26773b.containsKey(eq0)) {
            com.google.android.gms.internal.ads.AbstractC5058rp0 abstractC5058rp1 = (com.google.android.gms.internal.ads.AbstractC5058rp0) this.f26773b.get(eq0);
            if (!abstractC5058rp1.equals(abstractC5058rp0) || !abstractC5058rp0.equals(abstractC5058rp1)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(eq0.toString()));
            }
        } else {
            this.f26773b.put(eq0, abstractC5058rp0);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.Dq0 b(com.google.android.gms.internal.ads.AbstractC5498vp0 abstractC5498vp0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Fq0 fq0 = new com.google.android.gms.internal.ads.Fq0(abstractC5498vp0.c(), abstractC5498vp0.d(), null);
        if (this.f26772a.containsKey(fq0)) {
            com.google.android.gms.internal.ads.AbstractC5498vp0 abstractC5498vp1 = (com.google.android.gms.internal.ads.AbstractC5498vp0) this.f26772a.get(fq0);
            if (!abstractC5498vp1.equals(abstractC5498vp0) || !abstractC5498vp0.equals(abstractC5498vp1)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(fq0.toString()));
            }
        } else {
            this.f26772a.put(fq0, abstractC5498vp0);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.Dq0 c(com.google.android.gms.internal.ads.AbstractC3633eq0 abstractC3633eq0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Eq0 eq0 = new com.google.android.gms.internal.ads.Eq0(abstractC3633eq0.d(), abstractC3633eq0.c(), null);
        if (this.f26775d.containsKey(eq0)) {
            com.google.android.gms.internal.ads.AbstractC3633eq0 abstractC3633eq1 = (com.google.android.gms.internal.ads.AbstractC3633eq0) this.f26775d.get(eq0);
            if (!abstractC3633eq1.equals(abstractC3633eq0) || !abstractC3633eq0.equals(abstractC3633eq1)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(eq0.toString()));
            }
        } else {
            this.f26775d.put(eq0, abstractC3633eq0);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.Dq0 d(com.google.android.gms.internal.ads.AbstractC4072iq0 abstractC4072iq0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Fq0 fq0 = new com.google.android.gms.internal.ads.Fq0(abstractC4072iq0.c(), abstractC4072iq0.d(), null);
        if (this.f26774c.containsKey(fq0)) {
            com.google.android.gms.internal.ads.AbstractC4072iq0 abstractC4072iq1 = (com.google.android.gms.internal.ads.AbstractC4072iq0) this.f26774c.get(fq0);
            if (!abstractC4072iq1.equals(abstractC4072iq0) || !abstractC4072iq0.equals(abstractC4072iq1)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(fq0.toString()));
            }
        } else {
            this.f26774c.put(fq0, abstractC4072iq0);
        }
        return this;
    }
}
