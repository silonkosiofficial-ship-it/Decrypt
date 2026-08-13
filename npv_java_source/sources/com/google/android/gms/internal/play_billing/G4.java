package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class G4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.G4 zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.X3 zze;

    static {
        com.google.android.gms.internal.play_billing.G4 g6 = new com.google.android.gms.internal.play_billing.G4();
        zzb = g6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.G4.class, g6);
    }

    private G4() {
    }

    static /* synthetic */ void B(com.google.android.gms.internal.play_billing.G4 g6, com.google.android.gms.internal.play_billing.X3 x6) {
        x6.getClass();
        g6.zze = x6;
        g6.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.E4 C() {
        return (com.google.android.gms.internal.play_billing.E4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.G4();
        }
        com.google.android.gms.internal.play_billing.F4 f6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.E4(f6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
