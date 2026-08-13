package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class S3 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.S3 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.play_billing.S3 s6 = new com.google.android.gms.internal.play_billing.S3();
        zzb = s6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.S3.class, s6);
    }

    private S3() {
    }

    static /* synthetic */ void B(com.google.android.gms.internal.play_billing.S3 s6, com.google.android.gms.internal.play_billing.N4 n6) {
        n6.getClass();
        s6.zzf = n6;
        s6.zze = 3;
    }

    static /* synthetic */ void C(com.google.android.gms.internal.play_billing.S3 s6, int i6) {
        s6.zzg = i6 - 1;
        s6.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.Q3 D() {
        return (com.google.android.gms.internal.play_billing.Q3) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.P3.f41437a, com.google.android.gms.internal.play_billing.C6287r4.class, com.google.android.gms.internal.play_billing.N4.class, com.google.android.gms.internal.play_billing.C6323x4.class});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.S3();
        }
        com.google.android.gms.internal.play_billing.R3 r6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.Q3(r6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
