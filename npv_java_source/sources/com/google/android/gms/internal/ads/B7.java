package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class B7 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.net.HttpURLConnection f25904C;

    /* JADX WARN: Illegal instructions before constructor call */
    B7(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (java.io.IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.f25904C = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        this.f25904C.disconnect();
    }
}
