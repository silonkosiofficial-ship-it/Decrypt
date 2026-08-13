package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3224b40 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {
    public static com.google.android.gms.internal.ads.O20 a(android.content.Context context, com.google.android.gms.internal.ads.C2474Iq c2474Iq, com.google.android.gms.internal.ads.C2511Jq c2511Jq, java.lang.Object obj, com.google.android.gms.internal.ads.C5087s30 c5087s30, com.google.android.gms.internal.ads.N30 n30, com.google.android.gms.internal.ads.Uy0 uy0, com.google.android.gms.internal.ads.Uy0 uy1, com.google.android.gms.internal.ads.Uy0 uy2, com.google.android.gms.internal.ads.Uy0 uy3, com.google.android.gms.internal.ads.Uy0 uy4, com.google.android.gms.internal.ads.Uy0 uy5, com.google.android.gms.internal.ads.Uy0 uy6, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add((com.google.android.gms.internal.ads.G30) obj);
        hashSet.add(c5087s30);
        hashSet.add(n30);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25289H5)).booleanValue()) {
            hashSet.add((com.google.android.gms.internal.ads.L20) uy0.b());
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25300I5)).booleanValue()) {
            hashSet.add((com.google.android.gms.internal.ads.L20) uy1.b());
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25322K5)).booleanValue()) {
            hashSet.add((com.google.android.gms.internal.ads.L20) uy3.b());
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25333L5)).booleanValue()) {
            hashSet.add((com.google.android.gms.internal.ads.L20) uy4.b());
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25528d3)).booleanValue()) {
            hashSet.add((com.google.android.gms.internal.ads.L20) uy6.b());
        }
        return new com.google.android.gms.internal.ads.O20(context, executor, hashSet, q90, c3588eO);
    }
}
