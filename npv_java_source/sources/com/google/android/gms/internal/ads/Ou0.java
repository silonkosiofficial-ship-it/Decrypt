package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ou0 implements com.google.android.gms.internal.ads.InterfaceC4523mw0 {
    protected int zzq = 0;

    protected static void i(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.gms.internal.ads.Nu0.l(iterable, list);
    }

    private java.lang.String m(java.lang.String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    abstract int e();

    abstract int f(com.google.android.gms.internal.ads.Ew0 ew0);

    public com.google.android.gms.internal.ads.AbstractC3753fv0 g() {
        try {
            int iC = c();
            com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
            byte[] bArr = new byte[iC];
            com.google.android.gms.internal.ads.C4631nv0 c4631nv0 = new com.google.android.gms.internal.ads.C4631nv0(bArr, 0, iC);
            d(c4631nv0);
            c4631nv0.g();
            return new com.google.android.gms.internal.ads.C3424cv0(bArr);
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(m("ByteString"), e6);
        }
    }

    com.google.android.gms.internal.ads.Kw0 h() {
        return new com.google.android.gms.internal.ads.Kw0(this);
    }

    abstract void j(int i6);

    public void k(java.io.OutputStream outputStream) {
        com.google.android.gms.internal.ads.C4851pv0 c4851pv0 = new com.google.android.gms.internal.ads.C4851pv0(outputStream, com.google.android.gms.internal.ads.AbstractC5070rv0.c(c()));
        d(c4851pv0);
        c4851pv0.j();
    }

    public byte[] l() {
        try {
            int iC = c();
            byte[] bArr = new byte[iC];
            com.google.android.gms.internal.ads.C4631nv0 c4631nv0 = new com.google.android.gms.internal.ads.C4631nv0(bArr, 0, iC);
            d(c4631nv0);
            c4631nv0.g();
            return bArr;
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(m("byte array"), e6);
        }
    }
}
