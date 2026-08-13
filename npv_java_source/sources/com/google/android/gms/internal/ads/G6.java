package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class G6 extends com.google.android.gms.internal.ads.H6 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final byte[] f27677D;

    public G6(java.security.cert.X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f27677D = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f27677D;
    }
}
