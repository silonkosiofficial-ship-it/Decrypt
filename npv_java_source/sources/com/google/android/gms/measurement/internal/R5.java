package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class R5 implements com.google.android.gms.measurement.internal.InterfaceC6469t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.V5 f42113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42114c;

    R5(com.google.android.gms.measurement.internal.H5 h6, java.lang.String str, com.google.android.gms.measurement.internal.V5 v6) {
        this.f42112a = str;
        this.f42113b = v6;
        this.f42114c = h6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6469t2
    public final void a(java.lang.String str, int i6, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        this.f42114c.B(this.f42112a, i6, th, bArr, this.f42113b);
    }
}
