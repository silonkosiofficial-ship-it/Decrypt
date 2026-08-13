package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class P5 implements com.google.android.gms.measurement.internal.InterfaceC6469t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ java.util.List f42096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42097c;

    P5(com.google.android.gms.measurement.internal.H5 h6, java.lang.String str, java.util.List list) {
        this.f42095a = str;
        this.f42096b = list;
        this.f42097c = h6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6469t2
    public final void a(java.lang.String str, int i6, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        this.f42097c.L(true, i6, th, bArr, this.f42095a, this.f42096b);
    }
}
