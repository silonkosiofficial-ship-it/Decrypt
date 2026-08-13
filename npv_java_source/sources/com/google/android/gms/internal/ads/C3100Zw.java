package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3100Zw extends com.google.android.gms.internal.ads.AbstractC5619wv {
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i6 = iLimit - iPosition;
        int i10 = this.f39715b.f31386c;
        if (i10 == 3) {
            i6 += i6;
        } else if (i10 == 4) {
            i6 /= 2;
        } else {
            if (i10 != 21) {
                if (i10 == 22) {
                    i6 /= 2;
                } else if (i10 != 268435456) {
                    if (i10 != 1342177280) {
                        if (i10 != 1610612736) {
                            throw new java.lang.IllegalStateException();
                        }
                        i6 /= 2;
                    }
                }
            }
            i6 /= 3;
            i6 += i6;
        }
        java.nio.ByteBuffer byteBufferJ = j(i6);
        int i11 = this.f39715b.f31386c;
        if (i11 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i11 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (java.lang.Math.max(-1.0f, java.lang.Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferJ.put((byte) (sMax & 255));
                byteBufferJ.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i11 == 21) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i11 == 22) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i11 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new java.lang.IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final com.google.android.gms.internal.ads.C2809Rt h(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        int i6 = c2809Rt.f31386c;
        if (i6 != 3) {
            if (i6 == 2) {
                return com.google.android.gms.internal.ads.C2809Rt.f31383e;
            }
            if (i6 != 268435456 && i6 != 21 && i6 != 1342177280 && i6 != 22 && i6 != 1610612736 && i6 != 4) {
                throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
            }
        }
        return new com.google.android.gms.internal.ads.C2809Rt(c2809Rt.f31384a, c2809Rt.f31385b, 2);
    }
}
