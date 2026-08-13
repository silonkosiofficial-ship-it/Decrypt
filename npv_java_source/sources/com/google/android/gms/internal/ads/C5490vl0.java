package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5490vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.InputStream f39437a;

    private C5490vl0(java.io.InputStream inputStream) {
        this.f39437a = inputStream;
    }

    public static com.google.android.gms.internal.ads.C5490vl0 b(byte[] bArr) {
        return new com.google.android.gms.internal.ads.C5490vl0(new java.io.ByteArrayInputStream(bArr));
    }

    public final com.google.android.gms.internal.ads.C5066rt0 a() throws java.io.IOException {
        try {
            return com.google.android.gms.internal.ads.C5066rt0.g0(this.f39437a, com.google.android.gms.internal.ads.C5730xv0.a());
        } finally {
            this.f39437a.close();
        }
    }
}
