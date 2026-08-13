package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6186a4 extends com.google.android.gms.internal.play_billing.L2 implements com.google.android.gms.internal.play_billing.InterfaceC6239j3 {
    private static final com.google.android.gms.internal.play_billing.C6186a4 zzb;

    static {
        com.google.android.gms.internal.play_billing.C6186a4 c6186a4 = new com.google.android.gms.internal.play_billing.C6186a4();
        zzb = c6186a4;
        com.google.android.gms.internal.play_billing.L2.x(com.google.android.gms.internal.play_billing.C6186a4.class, c6186a4);
    }

    private C6186a4() {
    }

    public static com.google.android.gms.internal.play_billing.C6186a4 A() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.L2
    protected final java.lang.Object j(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10 = i6 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        com.google.android.gms.internal.play_billing.Z3 z6 = null;
        if (i10 == 2) {
            return com.google.android.gms.internal.play_billing.L2.u(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new com.google.android.gms.internal.play_billing.C6186a4();
        }
        if (i10 == 4) {
            return new com.google.android.gms.internal.play_billing.Y3(z6);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
