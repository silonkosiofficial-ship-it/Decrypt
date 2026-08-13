package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class V4 implements com.google.android.gms.internal.measurement.S4 {
    V4() {
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final boolean a(java.lang.Object obj) {
        return !((com.google.android.gms.internal.measurement.T4) obj).h();
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final com.google.android.gms.internal.measurement.Q4 b(java.lang.Object obj) {
        androidx.appcompat.app.D.a(obj);
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final java.lang.Object c(java.lang.Object obj) {
        return com.google.android.gms.internal.measurement.T4.b().d();
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final java.util.Map d(java.lang.Object obj) {
        return (com.google.android.gms.internal.measurement.T4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final java.util.Map e(java.lang.Object obj) {
        return (com.google.android.gms.internal.measurement.T4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.T4 t4D = (com.google.android.gms.internal.measurement.T4) obj;
        com.google.android.gms.internal.measurement.T4 t6 = (com.google.android.gms.internal.measurement.T4) obj2;
        if (!t6.isEmpty()) {
            if (!t4D.h()) {
                t4D = t4D.d();
            }
            t4D.c(t6);
        }
        return t4D;
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final java.lang.Object g(java.lang.Object obj) {
        ((com.google.android.gms.internal.measurement.T4) obj).e();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final int h(int i6, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.T4 t6 = (com.google.android.gms.internal.measurement.T4) obj;
        androidx.appcompat.app.D.a(obj2);
        if (t6.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = t6.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }
}
