package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f42464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C6120s2 f42466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.BitSet f42467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.BitSet f42468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.Map f42469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.util.Map f42470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.h6 f42471h;

    private j6(com.google.android.gms.measurement.internal.h6 h6Var, java.lang.String str) {
        this.f42471h = h6Var;
        this.f42464a = str;
        this.f42465b = true;
        this.f42467d = new java.util.BitSet();
        this.f42468e = new java.util.BitSet();
        this.f42469f = new p170r.C7026a();
        this.f42470g = new p170r.C7026a();
    }

    private j6(com.google.android.gms.measurement.internal.h6 h6Var, java.lang.String str, com.google.android.gms.internal.measurement.C6120s2 c6120s2, java.util.BitSet bitSet, java.util.BitSet bitSet2, java.util.Map map, java.util.Map map2) {
        this.f42471h = h6Var;
        this.f42464a = str;
        this.f42467d = bitSet;
        this.f42468e = bitSet2;
        this.f42469f = map;
        this.f42470g = new p170r.C7026a();
        if (map2 != null) {
            for (java.lang.Integer num : map2.keySet()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add((java.lang.Long) map2.get(num));
                this.f42470g.put(num, arrayList);
            }
        }
        this.f42465b = false;
        this.f42466c = c6120s2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.j2$a, com.google.android.gms.internal.measurement.t4$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.s2$a] */
    final com.google.android.gms.internal.measurement.C6043j2 a(int i6) {
        java.util.ArrayList arrayList;
        ?? arrayList2;
        ?? I10 = com.google.android.gms.internal.measurement.C6043j2.I();
        I10.v(i6);
        I10.y(this.f42465b);
        com.google.android.gms.internal.measurement.C6120s2 c6120s2 = this.f42466c;
        if (c6120s2 != null) {
            I10.x(c6120s2);
        }
        ?? C10 = com.google.android.gms.internal.measurement.C6120s2.Q().y(com.google.android.gms.measurement.internal.Z5.O(this.f42467d)).C(com.google.android.gms.measurement.internal.Z5.O(this.f42468e));
        if (this.f42469f == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(this.f42469f.size());
            for (java.lang.Integer num : this.f42469f.keySet()) {
                int iIntValue = num.intValue();
                java.lang.Long l6 = (java.lang.Long) this.f42469f.get(num);
                if (l6 != null) {
                    arrayList.add((com.google.android.gms.internal.measurement.C6052k2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) com.google.android.gms.internal.measurement.C6052k2.I().v(iIntValue).w(l6.longValue()).q()));
                }
            }
        }
        if (arrayList != null) {
            C10.w(arrayList);
        }
        if (this.f42470g == null) {
            arrayList2 = java.util.Collections.emptyList();
        } else {
            arrayList2 = new java.util.ArrayList(this.f42470g.size());
            for (java.lang.Integer num2 : this.f42470g.keySet()) {
                com.google.android.gms.internal.measurement.C6128t2.a aVarV = com.google.android.gms.internal.measurement.C6128t2.J().v(num2.intValue());
                java.util.List list = (java.util.List) this.f42470g.get(num2);
                if (list != null) {
                    java.util.Collections.sort(list);
                    aVarV.w(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.C6128t2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarV.q()));
            }
        }
        C10.A(arrayList2);
        I10.w(C10);
        return (com.google.android.gms.internal.measurement.C6043j2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) I10.q());
    }

    final void c(com.google.android.gms.measurement.internal.AbstractC6341b abstractC6341b) {
        int iA = abstractC6341b.a();
        java.lang.Boolean bool = abstractC6341b.f42267c;
        if (bool != null) {
            this.f42468e.set(iA, bool.booleanValue());
        }
        java.lang.Boolean bool2 = abstractC6341b.f42268d;
        if (bool2 != null) {
            this.f42467d.set(iA, bool2.booleanValue());
        }
        if (abstractC6341b.f42269e != null) {
            java.lang.Long l6 = (java.lang.Long) this.f42469f.get(java.lang.Integer.valueOf(iA));
            long jLongValue = abstractC6341b.f42269e.longValue() / 1000;
            if (l6 == null || jLongValue > l6.longValue()) {
                this.f42469f.put(java.lang.Integer.valueOf(iA), java.lang.Long.valueOf(jLongValue));
            }
        }
        if (abstractC6341b.f42270f != null) {
            java.util.List arrayList = (java.util.List) this.f42470g.get(java.lang.Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                this.f42470g.put(java.lang.Integer.valueOf(iA), arrayList);
            }
            if (abstractC6341b.j()) {
                arrayList.clear();
            }
            if (com.google.android.gms.internal.measurement.B6.a() && this.f42471h.d().H(this.f42464a, com.google.android.gms.measurement.internal.G.f41908q0) && abstractC6341b.i()) {
                arrayList.clear();
            }
            if (!com.google.android.gms.internal.measurement.B6.a() || !this.f42471h.d().H(this.f42464a, com.google.android.gms.measurement.internal.G.f41908q0)) {
                arrayList.add(java.lang.Long.valueOf(abstractC6341b.f42270f.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC6341b.f42270f.longValue() / 1000;
            if (arrayList.contains(java.lang.Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(java.lang.Long.valueOf(jLongValue2));
        }
    }
}
