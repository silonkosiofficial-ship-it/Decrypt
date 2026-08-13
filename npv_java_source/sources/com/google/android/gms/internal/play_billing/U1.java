package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class U1 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.U1 zzb;
    private int zzd;
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.play_billing.U1 u6 = new com.google.android.gms.internal.play_billing.U1();
        zzb = u6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.U1.class, u6);
    }

    private U1() {
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.U1();
        }
        com.google.android.gms.internal.play_billing.V1 v6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.T1(v6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
