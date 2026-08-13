package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6131t5 extends com.google.android.gms.internal.measurement.AbstractC6108q5 {
    C6131t5() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6108q5
    public final void m() {
        if (!p()) {
            if (a() > 0) {
                androidx.appcompat.app.D.a(f(0).getKey());
                throw null;
            }
            java.util.Iterator it = g().iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.D.a(((java.util.Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.m();
    }
}
