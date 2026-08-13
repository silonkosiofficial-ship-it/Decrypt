package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Il0 {
    public static final com.google.android.gms.internal.ads.Sl0 a(com.google.android.gms.internal.ads.Sl0 sl0) {
        return sl0 != null ? sl0 : com.google.android.gms.internal.ads.Yl0.a(b(null).l());
    }

    static final com.google.android.gms.internal.ads.C4187jt0 b(com.google.android.gms.internal.ads.Sl0 sl0) {
        try {
            return ((com.google.android.gms.internal.ads.C5830yq0) com.google.android.gms.internal.ads.Zp0.c().e(null, com.google.android.gms.internal.ads.C5830yq0.class)).c();
        } catch (java.security.GeneralSecurityException e6) {
            throw new com.google.android.gms.internal.ads.Jq0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e6);
        }
    }
}
