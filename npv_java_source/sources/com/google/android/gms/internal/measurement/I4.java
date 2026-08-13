package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class I4 implements com.google.android.gms.internal.measurement.J4 {
    I4() {
    }

    private static com.google.android.gms.internal.measurement.D4 c(java.lang.Object obj, long j6) {
        return (com.google.android.gms.internal.measurement.D4) com.google.android.gms.internal.measurement.G5.B(obj, j6);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void a(java.lang.Object obj, long j6) {
        c(obj, j6).b();
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void b(java.lang.Object obj, java.lang.Object obj2, long j6) {
        com.google.android.gms.internal.measurement.D4 d4C = c(obj, j6);
        com.google.android.gms.internal.measurement.D4 d4C2 = c(obj2, j6);
        int size = d4C.size();
        int size2 = d4C2.size();
        if (size > 0 && size2 > 0) {
            if (!d4C.c()) {
                d4C = d4C.r(size2 + size);
            }
            d4C.addAll(d4C2);
        }
        if (size > 0) {
            d4C2 = d4C;
        }
        com.google.android.gms.internal.measurement.G5.j(obj, j6, d4C2);
    }
}
