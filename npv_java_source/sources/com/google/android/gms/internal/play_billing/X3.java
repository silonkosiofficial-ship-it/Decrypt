package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class X3 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.X3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.play_billing.X3 x6 = new com.google.android.gms.internal.play_billing.X3();
        zzb = x6;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.X3.class, x6);
    }

    private X3() {
    }

    static /* synthetic */ void B(com.google.android.gms.internal.play_billing.X3 x6, java.lang.String str) {
        x6.zzd |= 8;
        x6.zzh = str;
    }

    static /* synthetic */ void C(com.google.android.gms.internal.play_billing.X3 x6, java.lang.String str) {
        str.getClass();
        x6.zzd |= 2;
        x6.zzf = str;
    }

    static /* synthetic */ void D(com.google.android.gms.internal.play_billing.X3 x6, int i6) {
        x6.zzd |= 1;
        x6.zze = i6;
    }

    static /* synthetic */ void E(com.google.android.gms.internal.play_billing.X3 x6, int i6) {
        x6.zzg = i6 - 1;
        x6.zzd |= 4;
    }

    public static com.google.android.gms.internal.play_billing.T3 F() {
        return (com.google.android.gms.internal.play_billing.T3) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.play_billing.U3.f41489a, "zzh"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.X3();
        }
        com.google.android.gms.internal.play_billing.W3 w6 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.T3(w6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
