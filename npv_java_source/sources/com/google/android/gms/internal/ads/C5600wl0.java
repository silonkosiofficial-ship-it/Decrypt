package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5600wl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.OutputStream f39668a;

    private C5600wl0(java.io.OutputStream outputStream) {
        this.f39668a = outputStream;
    }

    public static com.google.android.gms.internal.ads.C5600wl0 b(java.io.OutputStream outputStream) {
        return new com.google.android.gms.internal.ads.C5600wl0(outputStream);
    }

    public final void a(com.google.android.gms.internal.ads.C5066rt0 c5066rt0) throws java.io.IOException {
        try {
            c5066rt0.k(this.f39668a);
        } finally {
            this.f39668a.close();
        }
    }
}
