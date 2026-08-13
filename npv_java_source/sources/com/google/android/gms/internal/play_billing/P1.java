package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.P1 zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.U1 zze;
    private com.google.android.gms.internal.play_billing.U1 zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.play_billing.P1 p6 = new com.google.android.gms.internal.play_billing.P1();
        zzb = p6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.P1.class, p6);
    }

    private P1() {
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.play_billing.X1.a()});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.P1();
        }
        com.google.android.gms.internal.play_billing.S1 s6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.O1(s6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
