package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z1 implements com.google.android.gms.internal.play_billing.InterfaceC6233i3 {
    protected int zza = 0;

    protected static void c(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.gms.internal.play_billing.Y1.c(iterable, list);
    }

    abstract int b(com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3);

    public final byte[] d() {
        try {
            int iK = k();
            byte[] bArr = new byte[iK];
            com.google.android.gms.internal.play_billing.C6291s2 c6291s2 = new com.google.android.gms.internal.play_billing.C6291s2(bArr, 0, iK);
            a(c6291s2);
            c6291s2.b();
            return bArr;
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e6);
        }
    }
}
