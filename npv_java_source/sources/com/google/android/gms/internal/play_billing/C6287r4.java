package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6287r4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.C6287r4 zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.C6287r4 c6287r4 = new com.google.android.gms.internal.play_billing.C6287r4();
        zzb = c6287r4;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.C6287r4.class, c6287r4);
    }

    private C6287r4() {
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.C6270o4.f41605a});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.C6287r4();
        }
        com.google.android.gms.internal.play_billing.AbstractC6282q4 abstractC6282q4 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.C6264n4(abstractC6282q4);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
