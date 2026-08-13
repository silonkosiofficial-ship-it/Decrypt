package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6125t extends com.google.android.gms.internal.measurement.AbstractC6076n implements com.google.android.gms.internal.measurement.InterfaceC6067m {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.List f41202E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.List f41203F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C5963a3 f41204G;

    private C6125t(com.google.android.gms.internal.measurement.C6125t c6125t) {
        super(c6125t.f41044C);
        java.util.ArrayList arrayList = new java.util.ArrayList(c6125t.f41202E.size());
        this.f41202E = arrayList;
        arrayList.addAll(c6125t.f41202E);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(c6125t.f41203F.size());
        this.f41203F = arrayList2;
        arrayList2.addAll(c6125t.f41203F);
        this.f41204G = c6125t.f41204G;
    }

    public C6125t(java.lang.String str, java.util.List list, java.util.List list2, com.google.android.gms.internal.measurement.C5963a3 c5963a3) {
        super(str);
        this.f41202E = new java.util.ArrayList();
        this.f41204G = c5963a3;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f41202E.add(((com.google.android.gms.internal.measurement.InterfaceC6117s) it.next()).e());
            }
        }
        this.f41203F = new java.util.ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        java.lang.String str;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB;
        com.google.android.gms.internal.measurement.C5963a3 c5963a3D = this.f41204G.d();
        for (int i6 = 0; i6 < this.f41202E.size(); i6++) {
            if (i6 < list.size()) {
                str = (java.lang.String) this.f41202E.get(i6);
                interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i6));
            } else {
                str = (java.lang.String) this.f41202E.get(i6);
                interfaceC6117sB = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
            }
            c5963a3D.e(str, interfaceC6117sB);
        }
        for (com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s : this.f41203F) {
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3D.b(interfaceC6117s);
            if (interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.C6141v) {
                interfaceC6117sB2 = c5963a3D.b(interfaceC6117s);
            }
            if (interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.C6058l) {
                return ((com.google.android.gms.internal.measurement.C6058l) interfaceC6117sB2).a();
            }
        }
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n, com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return new com.google.android.gms.internal.measurement.C6125t(this);
    }
}
