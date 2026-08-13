package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ar0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3197ar0 implements com.google.android.gms.internal.ads.InterfaceC5610wq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3197ar0 f34154a = new com.google.android.gms.internal.ads.C3197ar0();

    private C3197ar0() {
    }

    static void d() {
        com.google.android.gms.internal.ads.Wp0.a().f(f34154a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5610wq0
    public final java.lang.Class a() {
        return com.google.android.gms.internal.ads.Xq0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5610wq0
    public final java.lang.Class b() {
        return com.google.android.gms.internal.ads.Xq0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5610wq0
    public final /* bridge */ /* synthetic */ java.lang.Object c(com.google.android.gms.internal.ads.C5500vq0 c5500vq0) throws java.security.GeneralSecurityException {
        if (c5500vq0.c() == null) {
            throw new java.security.GeneralSecurityException("no primary in primitive set");
        }
        java.util.Iterator it = c5500vq0.e().iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = ((java.util.List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new com.google.android.gms.internal.ads.Yq0(c5500vq0, null);
    }
}
