package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Hq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f28109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f28110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f28111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f28112d;

    /* synthetic */ Hq0(com.google.android.gms.internal.ads.Dq0 dq0, com.google.android.gms.internal.ads.Gq0 gq0) {
        this.f28109a = new java.util.HashMap(dq0.f26772a);
        this.f28110b = new java.util.HashMap(dq0.f26773b);
        this.f28111c = new java.util.HashMap(dq0.f26774c);
        this.f28112d = new java.util.HashMap(dq0.f26775d);
    }

    public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Eq0 eq0 = new com.google.android.gms.internal.ads.Eq0(cq0.getClass(), cq0.f(), null);
        if (this.f28110b.containsKey(eq0)) {
            return ((com.google.android.gms.internal.ads.AbstractC5058rp0) this.f28110b.get(eq0)).a(cq0, wl0);
        }
        throw new java.security.GeneralSecurityException("No Key Parser for requested key type " + eq0.toString() + " available");
    }

    public final com.google.android.gms.internal.ads.Sl0 b(com.google.android.gms.internal.ads.Cq0 cq0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Eq0 eq0 = new com.google.android.gms.internal.ads.Eq0(cq0.getClass(), cq0.f(), null);
        if (this.f28112d.containsKey(eq0)) {
            return ((com.google.android.gms.internal.ads.AbstractC3633eq0) this.f28112d.get(eq0)).a(cq0);
        }
        throw new java.security.GeneralSecurityException("No Parameters Parser for requested key type " + eq0.toString() + " available");
    }

    public final com.google.android.gms.internal.ads.Cq0 c(com.google.android.gms.internal.ads.El0 el0, java.lang.Class cls, com.google.android.gms.internal.ads.Wl0 wl0) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Fq0 fq0 = new com.google.android.gms.internal.ads.Fq0(el0.getClass(), cls, null);
        if (this.f28109a.containsKey(fq0)) {
            return ((com.google.android.gms.internal.ads.AbstractC5498vp0) this.f28109a.get(fq0)).a(el0, wl0);
        }
        throw new java.security.GeneralSecurityException("No Key serializer for " + fq0.toString() + " available");
    }

    public final com.google.android.gms.internal.ads.Cq0 d(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Fq0 fq0 = new com.google.android.gms.internal.ads.Fq0(sl0.getClass(), cls, null);
        if (this.f28111c.containsKey(fq0)) {
            return ((com.google.android.gms.internal.ads.AbstractC4072iq0) this.f28111c.get(fq0)).a(sl0);
        }
        throw new java.security.GeneralSecurityException("No Key Format serializer for " + fq0.toString() + " available");
    }

    public final boolean i(com.google.android.gms.internal.ads.Cq0 cq0) {
        return this.f28110b.containsKey(new com.google.android.gms.internal.ads.Eq0(cq0.getClass(), cq0.f(), null));
    }

    public final boolean j(com.google.android.gms.internal.ads.Cq0 cq0) {
        return this.f28112d.containsKey(new com.google.android.gms.internal.ads.Eq0(cq0.getClass(), cq0.f(), null));
    }
}
