package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3936hd extends java.io.PushbackInputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4046id f36098C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3936hd(com.google.android.gms.internal.ads.C4046id c4046id, java.io.InputStream inputStream, int i6) {
        super(inputStream, 1);
        this.f36098C = c4046id;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        com.google.android.gms.internal.ads.C4264kd.e(this.f36098C.f36322c);
        super.close();
    }
}
