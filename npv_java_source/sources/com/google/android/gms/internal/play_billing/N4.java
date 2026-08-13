package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class N4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.N4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        com.google.android.gms.internal.play_billing.N4 n6 = new com.google.android.gms.internal.play_billing.N4();
        zzb = n6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.N4.class, n6);
    }

    private N4() {
    }

    static /* synthetic */ void B(com.google.android.gms.internal.play_billing.N4 n6, boolean z6) {
        n6.zzd |= 2;
        n6.zzf = true;
    }

    public static com.google.android.gms.internal.play_billing.L4 C() {
        return (com.google.android.gms.internal.play_billing.L4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.N4();
        }
        com.google.android.gms.internal.play_billing.M4 m6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.L4(m6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
