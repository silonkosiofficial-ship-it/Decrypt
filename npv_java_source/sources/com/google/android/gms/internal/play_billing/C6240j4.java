package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6240j4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.C6240j4 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private int zzg;
    private long zzh;

    static {
        com.google.android.gms.internal.play_billing.C6240j4 c6240j4 = new com.google.android.gms.internal.play_billing.C6240j4();
        zzb = c6240j4;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.C6240j4.class, c6240j4);
    }

    private C6240j4() {
    }

    static /* synthetic */ void B(com.google.android.gms.internal.play_billing.C6240j4 c6240j4, int i6) {
        c6240j4.zzd |= 4;
        c6240j4.zzg = i6;
    }

    static /* synthetic */ void C(com.google.android.gms.internal.play_billing.C6240j4 c6240j4, long j6) {
        c6240j4.zzd |= 8;
        c6240j4.zzh = j6;
    }

    static /* synthetic */ void D(com.google.android.gms.internal.play_billing.C6240j4 c6240j4, java.lang.String str) {
        str.getClass();
        c6240j4.zzd |= 2;
        c6240j4.zzf = str;
    }

    static /* synthetic */ void E(com.google.android.gms.internal.play_billing.C6240j4 c6240j4, java.lang.String str) {
        str.getClass();
        c6240j4.zzd |= 1;
        c6240j4.zze = str;
    }

    public static com.google.android.gms.internal.play_billing.C6228h4 F() {
        return (com.google.android.gms.internal.play_billing.C6228h4) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.C6240j4();
        }
        com.google.android.gms.internal.play_billing.AbstractC6234i4 abstractC6234i4 = null;
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.C6228h4(abstractC6234i4);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
