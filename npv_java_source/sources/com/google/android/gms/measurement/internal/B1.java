package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p085i4.p f41728a;

    B1(p085i4.p pVar) {
        this.f41728a = pVar;
    }

    static com.google.android.gms.measurement.internal.B1 a(java.lang.String str) {
        return new com.google.android.gms.measurement.internal.B1((android.text.TextUtils.isEmpty(str) || str.length() > 1) ? p085i4.p.UNINITIALIZED : com.google.android.gms.measurement.internal.A3.g(str.charAt(0)));
    }

    final p085i4.p b() {
        return this.f41728a;
    }

    final java.lang.String c() {
        return java.lang.String.valueOf(com.google.android.gms.measurement.internal.A3.a(this.f41728a));
    }
}
