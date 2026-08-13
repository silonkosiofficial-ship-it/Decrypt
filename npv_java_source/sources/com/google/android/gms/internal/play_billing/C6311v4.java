package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6311v4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.C6311v4 zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.play_billing.C6311v4 c6311v4 = new com.google.android.gms.internal.play_billing.C6311v4();
        zzb = c6311v4;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.C6311v4.class, c6311v4);
    }

    private C6311v4() {
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.C6305u4.f41657a, "zzf"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.C6311v4();
        }
        com.google.android.gms.internal.play_billing.AbstractC6317w4 abstractC6317w4 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.C6299t4(abstractC6317w4);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
