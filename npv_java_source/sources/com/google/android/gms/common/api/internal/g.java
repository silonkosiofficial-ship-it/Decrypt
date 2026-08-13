package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f24916a = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f24917b = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());

    private final void h(boolean z6, com.google.android.gms.common.api.Status status) {
        java.util.HashMap map;
        java.util.HashMap map2;
        synchronized (this.f24916a) {
            map = new java.util.HashMap(this.f24916a);
        }
        synchronized (this.f24917b) {
            map2 = new java.util.HashMap(this.f24917b);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z6 || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            if (z6 || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((p115l4.C6932m) entry2.getKey()).d(new O3.b(status));
            }
        }
    }

    final void c(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, boolean z6) {
        this.f24916a.put(basePendingResult, java.lang.Boolean.valueOf(z6));
        basePendingResult.a(new com.google.android.gms.common.api.internal.C2150e(this, basePendingResult));
    }

    final void d(p115l4.C6932m c6932m, boolean z6) {
        this.f24917b.put(c6932m, java.lang.Boolean.valueOf(z6));
        c6932m.a().c(new com.google.android.gms.common.api.internal.f(this, c6932m));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    final void e(int i6, java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i6 != 1) {
            str2 = i6 == 3 ? " due to dead object exception." : " due to service disconnection.";
            if (str != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str);
            }
            h(true, new com.google.android.gms.common.api.Status(20, sb.toString()));
        }
        sb.append(str2);
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new com.google.android.gms.common.api.Status(20, sb.toString()));
    }

    public final void f() {
        h(false, com.google.android.gms.common.api.internal.C2148c.f24886R);
    }

    final boolean g() {
        return (this.f24916a.isEmpty() && this.f24917b.isEmpty()) ? false : true;
    }
}
