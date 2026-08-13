package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class NF0 extends com.google.android.gms.internal.ads.AbstractC5619wv {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f30206i = java.lang.Float.floatToIntBits(Float.NaN);

    NF0() {
    }

    private static void o(int i6, java.nio.ByteBuffer byteBuffer) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits((float) (((double) i6) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f30206i) {
            iFloatToIntBits = java.lang.Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void a(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i6 = iLimit - iPosition;
        int i10 = this.f39715b.f31386c;
        if (i10 == 21) {
            byteBufferJ = j((i6 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else if (i10 == 22) {
            byteBufferJ = j(i6);
            while (iPosition < iLimit) {
                int i11 = byteBuffer.get(iPosition) & 255;
                int i12 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                o(i11 | i12 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        } else if (i10 == 1342177280) {
            byteBufferJ = j((i6 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i10 != 1610612736) {
                throw new java.lang.IllegalStateException();
            }
            byteBufferJ = j(i6);
            while (iPosition < iLimit) {
                int i13 = byteBuffer.get(iPosition + 3) & 255;
                int i14 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                o(i13 | i14 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final com.google.android.gms.internal.ads.C2809Rt h(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        int i6 = c2809Rt.f31386c;
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736) {
            return new com.google.android.gms.internal.ads.C2809Rt(c2809Rt.f31384a, c2809Rt.f31385b, 4);
        }
        if (i6 == 4) {
            return com.google.android.gms.internal.ads.C2809Rt.f31383e;
        }
        throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
    }
}
