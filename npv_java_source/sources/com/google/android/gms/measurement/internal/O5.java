package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class O5 implements com.google.android.gms.measurement.internal.InterfaceC6469t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.V5 f42078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42079c;

    O5(com.google.android.gms.measurement.internal.H5 h6, java.lang.String str, com.google.android.gms.measurement.internal.V5 v6) {
        this.f42077a = str;
        this.f42078b = v6;
        this.f42079c = h6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6469t2
    public final void a(java.lang.String str, int i6, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        this.f42079c.B(this.f42077a, i6, th, bArr, this.f42078b);
    }
}
