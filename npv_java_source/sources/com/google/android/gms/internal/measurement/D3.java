package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D3 implements com.google.android.gms.internal.measurement.InterfaceC5965a5 {
    protected int zza = 0;

    protected static void g(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.gms.internal.measurement.E3.j(iterable, list);
    }

    abstract int e(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5);

    abstract int h();

    abstract void i(int i6);

    public final byte[] j() {
        try {
            byte[] bArr = new byte[d()];
            com.google.android.gms.internal.measurement.AbstractC5982c4 abstractC5982c4D = com.google.android.gms.internal.measurement.AbstractC5982c4.D(bArr);
            a(abstractC5982c4D);
            abstractC5982c4D.E();
            return bArr;
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e6);
        }
    }
}
