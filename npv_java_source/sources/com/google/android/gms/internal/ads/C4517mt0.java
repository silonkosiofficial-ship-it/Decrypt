package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4517mt0 extends com.google.android.gms.internal.ads.Jv0 implements com.google.android.gms.internal.ads.InterfaceC4633nw0 {
    private static final com.google.android.gms.internal.ads.C4517mt0 zza;
    private static volatile com.google.android.gms.internal.ads.InterfaceC5292tw0 zzb;
    private int zze;
    private boolean zzf;
    private java.lang.String zzc = "";
    private java.lang.String zzd = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.ads.C4517mt0 c4517mt0 = new com.google.android.gms.internal.ads.C4517mt0();
        zza = c4517mt0;
        com.google.android.gms.internal.ads.Jv0.F(com.google.android.gms.internal.ads.C4517mt0.class, c4517mt0);
    }

    private C4517mt0() {
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    protected final java.lang.Object W(com.google.android.gms.internal.ads.Iv0 iv0, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = iv0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.Jv0.A(zza, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.C4517mt0();
        }
        com.google.android.gms.internal.ads.AbstractC4407lt0 abstractC4407lt0 = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.C4297kt0(abstractC4407lt0);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.InterfaceC5292tw0 gv0 = zzb;
        if (gv0 == null) {
            synchronized (com.google.android.gms.internal.ads.C4517mt0.class) {
                try {
                    gv0 = zzb;
                    if (gv0 == null) {
                        gv0 = new com.google.android.gms.internal.ads.Gv0(zza);
                        zzb = gv0;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return gv0;
    }
}
