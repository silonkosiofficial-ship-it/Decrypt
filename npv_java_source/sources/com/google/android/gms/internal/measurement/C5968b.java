package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5968b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.TreeMap f40798a = new java.util.TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.TreeMap f40799b = new java.util.TreeMap();

    private static int a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.C6125t c6125t, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = c6125t.a(c5963a3, java.util.Collections.singletonList(interfaceC6117s));
        if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6049k) {
            return com.google.android.gms.internal.measurement.AbstractC6152w2.i(interfaceC6117sA.d().doubleValue());
        }
        return -1;
    }

    public final void b(com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.C5986d c5986d) {
        com.google.android.gms.internal.measurement.V5 v6 = new com.google.android.gms.internal.measurement.V5(c5986d);
        for (java.lang.Integer num : this.f40798a.keySet()) {
            com.google.android.gms.internal.measurement.C5995e c5995e = (com.google.android.gms.internal.measurement.C5995e) c5986d.d().clone();
            int iA = a(c5963a3, (com.google.android.gms.internal.measurement.C6125t) this.f40798a.get(num), v6);
            if (iA == 2 || iA == -1) {
                c5986d.e(c5995e);
            }
        }
        java.util.Iterator it = this.f40799b.keySet().iterator();
        while (it.hasNext()) {
            a(c5963a3, (com.google.android.gms.internal.measurement.C6125t) this.f40799b.get((java.lang.Integer) it.next()), v6);
        }
    }

    public final void c(java.lang.String str, int i6, com.google.android.gms.internal.measurement.C6125t c6125t, java.lang.String str2) {
        java.util.TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f40799b;
        } else {
            if (!"edit".equals(str2)) {
                throw new java.lang.IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f40798a;
        }
        if (treeMap.containsKey(java.lang.Integer.valueOf(i6))) {
            i6 = ((java.lang.Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(java.lang.Integer.valueOf(i6), c6125t);
    }
}
