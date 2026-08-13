package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class S5 implements com.google.android.gms.measurement.internal.c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42154a;

    S5(com.google.android.gms.measurement.internal.H5 h6) {
        this.f42154a = h6;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f42154a.l().D(new com.google.android.gms.measurement.internal.U5(this, str, str2, bundle));
        } else if (this.f42154a.f41954l != null) {
            this.f42154a.f41954l.j().G().b("AppId not known when logging event", str2);
        }
    }
}
