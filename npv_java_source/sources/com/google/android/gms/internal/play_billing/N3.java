package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class N3 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.N3 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;
    private com.google.android.gms.internal.play_billing.X3 zzh;

    static {
        com.google.android.gms.internal.play_billing.N3 n6 = new com.google.android.gms.internal.play_billing.N3();
        zzb = n6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.N3.class, n6);
    }

    private N3() {
    }

    public static com.google.android.gms.internal.play_billing.N3 B(byte[] bArr, com.google.android.gms.internal.play_billing.A2 a6) {
        return (com.google.android.gms.internal.play_billing.N3) com.google.android.gms.internal.play_billing.L2.q(zzb, bArr, a6);
    }

    static /* synthetic */ void C(com.google.android.gms.internal.play_billing.N3 n6, com.google.android.gms.internal.play_billing.X3 x6) {
        x6.getClass();
        n6.zzh = x6;
        n6.zzd |= 2;
    }

    static /* synthetic */ void D(com.google.android.gms.internal.play_billing.N3 n6, int i6) {
        n6.zzg = i6 - 1;
        n6.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.L3 E() {
        return (com.google.android.gms.internal.play_billing.L3) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.P3.f41437a, "zzh", com.google.android.gms.internal.play_billing.C6287r4.class});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.N3();
        }
        com.google.android.gms.internal.play_billing.M3 m6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.L3(m6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
