package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class U7 extends com.google.android.gms.internal.ads.Gy0 {
    public U7(java.lang.String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.Gy0
    public final void c(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
