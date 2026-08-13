package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Iu0 implements com.google.android.gms.internal.ads.Rl0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f28521e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Qr0 f28522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f28524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f28525d;

    private Iu0(com.google.android.gms.internal.ads.Nq0 nq0) {
        this.f28522a = new com.google.android.gms.internal.ads.Fu0(nq0.d().d(com.google.android.gms.internal.ads.Dl0.a()));
        this.f28523b = nq0.b().b();
        this.f28524c = nq0.c().c();
        if (nq0.b().f().equals(com.google.android.gms.internal.ads.Uq0.f32290d)) {
            this.f28525d = java.util.Arrays.copyOf(f28521e, 1);
        } else {
            this.f28525d = new byte[0];
        }
    }

    public Iu0(com.google.android.gms.internal.ads.Qr0 qr0, int i6) {
        this.f28522a = qr0;
        this.f28523b = i6;
        this.f28524c = new byte[0];
        this.f28525d = new byte[0];
        qr0.a(new byte[0], i6);
    }

    private Iu0(com.google.android.gms.internal.ads.C3525dr0 c3525dr0) {
        java.lang.String strValueOf = java.lang.String.valueOf(c3525dr0.b().f());
        this.f28522a = new com.google.android.gms.internal.ads.Hu0("HMAC".concat(strValueOf), new javax.crypto.spec.SecretKeySpec(c3525dr0.d().d(com.google.android.gms.internal.ads.Dl0.a()), "HMAC"));
        this.f28523b = c3525dr0.b().b();
        this.f28524c = c3525dr0.c().c();
        if (c3525dr0.b().g().equals(com.google.android.gms.internal.ads.C4403lr0.f37243d)) {
            this.f28525d = java.util.Arrays.copyOf(f28521e, 1);
        } else {
            this.f28525d = new byte[0];
        }
    }

    public static com.google.android.gms.internal.ads.Rl0 a(com.google.android.gms.internal.ads.Nq0 nq0) {
        return new com.google.android.gms.internal.ads.Iu0(nq0);
    }

    public static com.google.android.gms.internal.ads.Rl0 b(com.google.android.gms.internal.ads.C3525dr0 c3525dr0) {
        return new com.google.android.gms.internal.ads.Iu0(c3525dr0);
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = this.f28525d;
        return bArr2.length > 0 ? com.google.android.gms.internal.ads.AbstractC4299ku0.b(this.f28524c, this.f28522a.a(com.google.android.gms.internal.ads.AbstractC4299ku0.b(bArr, bArr2), this.f28523b)) : com.google.android.gms.internal.ads.AbstractC4299ku0.b(this.f28524c, this.f28522a.a(bArr, this.f28523b));
    }
}
