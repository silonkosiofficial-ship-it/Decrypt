package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class K4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.K4 zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.K4 k6 = new com.google.android.gms.internal.play_billing.K4();
        zzb = k6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.K4.class, k6);
    }

    private K4() {
    }

    public static com.google.android.gms.internal.play_billing.K4 A() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.I4.f41420a});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.K4();
        }
        com.google.android.gms.internal.play_billing.J4 j6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.H4(j6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
