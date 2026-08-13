package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6222g4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.C6222g4 zzb;
    private int zzd;
    private int zzf;
    private com.google.android.gms.internal.play_billing.X3 zzi;
    private boolean zzj;
    private boolean zzk;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.play_billing.O2 zzg = com.google.android.gms.internal.play_billing.L2.r();
    private com.google.android.gms.internal.play_billing.P2 zzh = com.google.android.gms.internal.play_billing.L2.s();

    static {
        com.google.android.gms.internal.play_billing.C6222g4 c6222g4 = new com.google.android.gms.internal.play_billing.C6222g4();
        zzb = c6222g4;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.C6222g4.class, c6222g4);
    }

    private C6222g4() {
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.play_billing.C6210e4.f41551a, "zzg", com.google.android.gms.internal.play_billing.C6192b4.f41522a, "zzh", com.google.android.gms.internal.play_billing.D4.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.C6222g4();
        }
        com.google.android.gms.internal.play_billing.AbstractC6216f4 abstractC6216f4 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.C6204d4(abstractC6216f4);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
