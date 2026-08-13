package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6449q2 extends com.google.android.gms.measurement.internal.E5 {
    public C6449q2(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] B(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
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

    public final boolean C() {
        u();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
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

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.Z5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.h6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6404k q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.I2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6403j5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.G5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    public final void y(java.lang.String str, com.google.android.gms.measurement.internal.I5 i6, com.google.android.gms.internal.measurement.C6097p2 c6097p2, com.google.android.gms.measurement.internal.InterfaceC6469t2 interfaceC6469t2) {
        n();
        u();
        try {
            java.net.URL url = new java.net.URI(i6.b()).toURL();
            o();
            l().z(new com.google.android.gms.measurement.internal.RunnableC6476u2(this, str, url, c6097p2.j(), i6.c(), interfaceC6469t2));
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.net.URISyntaxException unused) {
            j().G().c("Failed to parse URL. Not uploading MeasurementBatch. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), i6.b());
        }
    }

    public final void z(java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.InterfaceC6469t2 interfaceC6469t2) {
        n();
        u();
        Q3.AbstractC1477p.l(url);
        Q3.AbstractC1477p.l(bArr);
        Q3.AbstractC1477p.l(interfaceC6469t2);
        l().z(new com.google.android.gms.measurement.internal.RunnableC6476u2(this, str, url, bArr, map, interfaceC6469t2));
    }
}
