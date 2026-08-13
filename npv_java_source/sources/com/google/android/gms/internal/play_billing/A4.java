package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class A4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.A4 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private com.google.android.gms.internal.play_billing.C6240j4 zzg;
    private com.google.android.gms.internal.play_billing.C6258m4 zzh;

    static {
        com.google.android.gms.internal.play_billing.A4 a6 = new com.google.android.gms.internal.play_billing.A4();
        zzb = a6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.A4.class, a6);
    }

    private A4() {
    }

    static /* synthetic */ void B(com.google.android.gms.internal.play_billing.A4 a6, com.google.android.gms.internal.play_billing.N3 n6) {
        a6.zzf = n6;
        a6.zze = 2;
    }

    static /* synthetic */ void C(com.google.android.gms.internal.play_billing.A4 a6, com.google.android.gms.internal.play_billing.S3 s6) {
        a6.zzf = s6;
        a6.zze = 3;
    }

    static /* synthetic */ void D(com.google.android.gms.internal.play_billing.A4 a6, com.google.android.gms.internal.play_billing.C6186a4 c6186a4) {
        c6186a4.getClass();
        a6.zzf = c6186a4;
        a6.zze = 7;
    }

    static /* synthetic */ void E(com.google.android.gms.internal.play_billing.A4 a6, com.google.android.gms.internal.play_billing.C6240j4 c6240j4) {
        c6240j4.getClass();
        a6.zzg = c6240j4;
        a6.zzd |= 1;
    }

    static /* synthetic */ void F(com.google.android.gms.internal.play_billing.A4 a6, com.google.android.gms.internal.play_billing.G4 g6) {
        g6.getClass();
        a6.zzf = g6;
        a6.zze = 8;
    }

    static /* synthetic */ void G(com.google.android.gms.internal.play_billing.A4 a6, com.google.android.gms.internal.play_billing.K4 k6) {
        a6.zzf = k6;
        a6.zze = 4;
    }

    public static com.google.android.gms.internal.play_billing.y4 I() {
        return (com.google.android.gms.internal.play_billing.y4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.N3.class, com.google.android.gms.internal.play_billing.S3.class, com.google.android.gms.internal.play_billing.K4.class, com.google.android.gms.internal.play_billing.C6222g4.class, "zzh", com.google.android.gms.internal.play_billing.C6186a4.class, com.google.android.gms.internal.play_billing.G4.class});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.A4();
        }
        com.google.android.gms.internal.play_billing.z4 z4Var = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.y4(z4Var);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
