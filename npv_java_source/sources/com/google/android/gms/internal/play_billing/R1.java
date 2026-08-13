package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class R1 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.R1 zzb;
    private com.google.android.gms.internal.play_billing.P2 zzd = com.google.android.gms.internal.play_billing.L2.s();

    static {
        com.google.android.gms.internal.play_billing.R1 r6 = new com.google.android.gms.internal.play_billing.R1();
        zzb = r6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.R1.class, r6);
    }

    private R1() {
    }

    public static com.google.android.gms.internal.play_billing.Q1 A() {
        return (com.google.android.gms.internal.play_billing.Q1) zzb.m();
    }

    static /* synthetic */ void C(com.google.android.gms.internal.play_billing.R1 r6, java.lang.Iterable iterable) {
        com.google.android.gms.internal.play_billing.P2 p6 = r6.zzd;
        if (!p6.c()) {
            int size = p6.size();
            r6.zzd = p6.m(size + size);
        }
        com.google.android.gms.internal.play_billing.Z1.c(iterable, r6.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.play_billing.P1.class});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.R1();
        }
        com.google.android.gms.internal.play_billing.S1 s6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.Q1(s6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
