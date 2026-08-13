package K0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements K0.w, java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f5999C = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f6000D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f6001E;

    public final java.lang.Object C(K0.v vVar, p237x7.a aVar) {
        java.lang.Object obj = this.f5999C.get(vVar);
        return obj == null ? aVar.b() : obj;
    }

    public final java.lang.Object D(K0.v vVar, p237x7.a aVar) {
        java.lang.Object obj = this.f5999C.get(vVar);
        return obj == null ? aVar.b() : obj;
    }

    public final boolean E() {
        return this.f6001E;
    }

    public final boolean M() {
        return this.f6000D;
    }

    public final void N(K0.k kVar) {
        for (java.util.Map.Entry entry : kVar.f5999C.entrySet()) {
            K0.v vVar = (K0.v) entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.Object obj = this.f5999C.get(vVar);
            p247y7.AbstractC7350t.d(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            java.lang.Object objC = vVar.c(obj, value);
            if (objC != null) {
                this.f5999C.put(vVar, objC);
            }
        }
    }

    public final void O(boolean z6) {
        this.f6001E = z6;
    }

    public final void P(boolean z6) {
        this.f6000D = z6;
    }

    @Override // K0.w
    public void d(K0.v vVar, java.lang.Object obj) {
        if (!(obj instanceof K0.a) || !f(vVar)) {
            this.f5999C.put(vVar, obj);
            return;
        }
        java.lang.Object obj2 = this.f5999C.get(vVar);
        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        K0.a aVar = (K0.a) obj2;
        java.util.Map map = this.f5999C;
        K0.a aVar2 = (K0.a) obj;
        java.lang.String strB = aVar2.b();
        if (strB == null) {
            strB = aVar.b();
        }
        p087i7.InterfaceC6663i interfaceC6663iA = aVar2.a();
        if (interfaceC6663iA == null) {
            interfaceC6663iA = aVar.a();
        }
        map.put(vVar, new K0.a(strB, interfaceC6663iA));
    }

    public final void e(K0.k kVar) {
        if (kVar.f6000D) {
            this.f6000D = true;
        }
        if (kVar.f6001E) {
            this.f6001E = true;
        }
        for (java.util.Map.Entry entry : kVar.f5999C.entrySet()) {
            K0.v vVar = (K0.v) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!this.f5999C.containsKey(vVar)) {
                this.f5999C.put(vVar, value);
            } else if (value instanceof K0.a) {
                java.lang.Object obj = this.f5999C.get(vVar);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                K0.a aVar = (K0.a) obj;
                java.util.Map map = this.f5999C;
                java.lang.String strB = aVar.b();
                if (strB == null) {
                    strB = ((K0.a) value).b();
                }
                p087i7.InterfaceC6663i interfaceC6663iA = aVar.a();
                if (interfaceC6663iA == null) {
                    interfaceC6663iA = ((K0.a) value).a();
                }
                map.put(vVar, new K0.a(strB, interfaceC6663iA));
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.k)) {
            return false;
        }
        K0.k kVar = (K0.k) obj;
        return p247y7.AbstractC7350t.b(this.f5999C, kVar.f5999C) && this.f6000D == kVar.f6000D && this.f6001E == kVar.f6001E;
    }

    public final boolean f(K0.v vVar) {
        return this.f5999C.containsKey(vVar);
    }

    public final boolean g() {
        java.util.Set setKeySet = this.f5999C.keySet();
        if ((setKeySet instanceof java.util.Collection) && setKeySet.isEmpty()) {
            return false;
        }
        java.util.Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((K0.v) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5999C.hashCode() * 31) + p190t.h.a(this.f6000D)) * 31) + p190t.h.a(this.f6001E);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f5999C.entrySet().iterator();
    }

    public final K0.k o() {
        K0.k kVar = new K0.k();
        kVar.f6000D = this.f6000D;
        kVar.f6001E = this.f6001E;
        kVar.f5999C.putAll(this.f5999C);
        return kVar;
    }

    public final java.lang.Object s(K0.v vVar) {
        java.lang.Object obj = this.f5999C.get(vVar);
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = "";
        if (this.f6000D) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f6001E) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (java.util.Map.Entry entry : this.f5999C.entrySet()) {
            K0.v vVar = (K0.v) entry.getKey();
            java.lang.Object value = entry.getValue();
            sb.append(str);
            sb.append(vVar.a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return androidx.compose.ui.platform.J0.a(this, null) + "{ " + ((java.lang.Object) sb) + " }";
    }
}
