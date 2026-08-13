package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class D4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.D4 zzb;
    private int zzd;
    private int zzf;
    private com.google.android.gms.internal.play_billing.P2 zze = com.google.android.gms.internal.play_billing.L2.s();
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.play_billing.D4 d6 = new com.google.android.gms.internal.play_billing.D4();
        zzb = d6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.D4.class, d6);
    }

    private D4() {
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.D4();
        }
        com.google.android.gms.internal.play_billing.C4 c6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.B4(c6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
