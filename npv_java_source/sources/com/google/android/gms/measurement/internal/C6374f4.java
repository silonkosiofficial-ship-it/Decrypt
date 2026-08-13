package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6374f4 implements com.google.android.gms.measurement.internal.c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42386a;

    C6374f4(com.google.android.gms.measurement.internal.F3 f6) {
        this.f42386a = f6;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f42386a.U0("auto", str2, bundle);
        } else {
            this.f42386a.i0("auto", str2, bundle, str);
        }
    }
}
