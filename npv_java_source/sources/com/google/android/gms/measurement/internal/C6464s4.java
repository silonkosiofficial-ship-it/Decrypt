package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6464s4 extends com.google.android.gms.measurement.internal.AbstractC6512z3 {
    C6464s4(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] v(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.InputStream inputStream = null;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i6 = inputStream.read(bArr);
                if (i6 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final boolean t() {
        return false;
    }

    public final boolean w() {
        android.net.NetworkInfo activeNetworkInfo;
        p();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a().getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
