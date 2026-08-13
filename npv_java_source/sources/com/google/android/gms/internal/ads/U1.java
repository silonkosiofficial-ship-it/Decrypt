package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.ByteArrayOutputStream f32082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.io.DataOutputStream f32083b;

    public U1() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        this.f32082a = byteArrayOutputStream;
        this.f32083b = new java.io.DataOutputStream(byteArrayOutputStream);
    }

    private static void b(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(com.google.android.gms.internal.ads.T1 t6) {
        this.f32082a.reset();
        try {
            b(this.f32083b, t6.f31832C);
            java.lang.String str = t6.f31833D;
            if (str == null) {
                str = "";
            }
            b(this.f32083b, str);
            this.f32083b.writeLong(t6.f31834E);
            this.f32083b.writeLong(t6.f31835F);
            this.f32083b.write(t6.f31836G);
            this.f32083b.flush();
            return this.f32082a.toByteArray();
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }
}
