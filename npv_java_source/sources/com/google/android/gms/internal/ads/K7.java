package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class K7 extends java.lang.ThreadLocal {
    K7(com.google.android.gms.internal.ads.L7 l10) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        return java.nio.ByteBuffer.allocate(32);
    }
}
