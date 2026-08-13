package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6013g implements com.google.android.gms.internal.measurement.InterfaceC6067m, com.google.android.gms.internal.measurement.InterfaceC6117s, java.lang.Iterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.SortedMap f40943C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f40944D;

    public C6013g() {
        this.f40943C = new java.util.TreeMap();
        this.f40944D = new java.util.TreeMap();
    }

    public C6013g(java.util.List list) {
        this();
        if (list != null) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                Q(i6, (com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i6));
            }
        }
    }

    public C6013g(com.google.android.gms.internal.measurement.InterfaceC6117s... interfaceC6117sArr) {
        this(java.util.Arrays.asList(interfaceC6117sArr));
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s C(int i6) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s;
        if (i6 < N()) {
            return (!R(i6) || (interfaceC6117s = (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f40943C.get(java.lang.Integer.valueOf(i6))) == null) ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o : interfaceC6117s;
        }
        throw new java.lang.IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void D(int i6, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("Invalid value index: " + i6);
        }
        if (i6 >= N()) {
            Q(i6, interfaceC6117s);
            return;
        }
        for (int iIntValue = ((java.lang.Integer) this.f40943C.lastKey()).intValue(); iIntValue >= i6; iIntValue--) {
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2 = (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f40943C.get(java.lang.Integer.valueOf(iIntValue));
            if (interfaceC6117s2 != null) {
                Q(iIntValue + 1, interfaceC6117s2);
                this.f40943C.remove(java.lang.Integer.valueOf(iIntValue));
            }
        }
        Q(i6, interfaceC6117s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final boolean E(java.lang.String str) {
        return "length".equals(str) || this.f40944D.containsKey(str);
    }

    public final void M(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        Q(N(), interfaceC6117s);
    }

    public final int N() {
        if (this.f40943C.isEmpty()) {
            return 0;
        }
        return ((java.lang.Integer) this.f40943C.lastKey()).intValue() + 1;
    }

    public final java.lang.String O(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.f40943C.isEmpty()) {
            for (int i6 = 0; i6 < N(); i6++) {
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC = C(i6);
                sb.append(str);
                if (!(interfaceC6117sC instanceof com.google.android.gms.internal.measurement.C6173z) && !(interfaceC6117sC instanceof com.google.android.gms.internal.measurement.C6102q)) {
                    sb.append(interfaceC6117sC.e());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void P(int i6) {
        int iIntValue = ((java.lang.Integer) this.f40943C.lastKey()).intValue();
        if (i6 > iIntValue || i6 < 0) {
            return;
        }
        this.f40943C.remove(java.lang.Integer.valueOf(i6));
        if (i6 == iIntValue) {
            int i10 = i6 - 1;
            if (this.f40943C.containsKey(java.lang.Integer.valueOf(i10)) || i10 < 0) {
                return;
            }
            this.f40943C.put(java.lang.Integer.valueOf(i10), com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o);
            return;
        }
        while (true) {
            i6++;
            if (i6 > ((java.lang.Integer) this.f40943C.lastKey()).intValue()) {
                return;
            }
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s = (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f40943C.get(java.lang.Integer.valueOf(i6));
            if (interfaceC6117s != null) {
                this.f40943C.put(java.lang.Integer.valueOf(i6 - 1), interfaceC6117s);
                this.f40943C.remove(java.lang.Integer.valueOf(i6));
            }
        }
    }

    public final void Q(int i6, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (i6 > 32468) {
            throw new java.lang.IllegalStateException("Array too large");
        }
        if (i6 < 0) {
            throw new java.lang.IndexOutOfBoundsException("Out of bounds index: " + i6);
        }
        if (interfaceC6117s == null) {
            this.f40943C.remove(java.lang.Integer.valueOf(i6));
        } else {
            this.f40943C.put(java.lang.Integer.valueOf(i6), interfaceC6117s);
        }
    }

    public final boolean R(int i6) {
        if (i6 >= 0 && i6 <= ((java.lang.Integer) this.f40943C.lastKey()).intValue()) {
            return this.f40943C.containsKey(java.lang.Integer.valueOf(i6));
        }
        throw new java.lang.IndexOutOfBoundsException("Out of bounds index: " + i6);
    }

    public final java.util.Iterator S() {
        return this.f40943C.keySet().iterator();
    }

    public final java.util.List T() {
        java.util.ArrayList arrayList = new java.util.ArrayList(N());
        for (int i6 = 0; i6 < N(); i6++) {
            arrayList.add(C(i6));
        }
        return arrayList;
    }

    public final void U() {
        this.f40943C.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        java.util.SortedMap sortedMap;
        java.lang.Integer num;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC;
        com.google.android.gms.internal.measurement.C6013g c6013g = new com.google.android.gms.internal.measurement.C6013g();
        for (java.util.Map.Entry entry : this.f40943C.entrySet()) {
            if (entry.getValue() instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
                sortedMap = c6013g.f40943C;
                num = (java.lang.Integer) entry.getKey();
                interfaceC6117sC = (com.google.android.gms.internal.measurement.InterfaceC6117s) entry.getValue();
            } else {
                sortedMap = c6013g.f40943C;
                num = (java.lang.Integer) entry.getKey();
                interfaceC6117sC = ((com.google.android.gms.internal.measurement.InterfaceC6117s) entry.getValue()).c();
            }
            sortedMap.put(num, interfaceC6117sC);
        }
        return c6013g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        if (this.f40943C.size() == 1) {
            return C(0).d();
        }
        return this.f40943C.size() <= 0 ? java.lang.Double.valueOf(0.0d) : java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        return toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.C6013g)) {
            return false;
        }
        com.google.android.gms.internal.measurement.C6013g c6013g = (com.google.android.gms.internal.measurement.C6013g) obj;
        if (N() != c6013g.N()) {
            return false;
        }
        if (this.f40943C.isEmpty()) {
            return c6013g.f40943C.isEmpty();
        }
        for (int iIntValue = ((java.lang.Integer) this.f40943C.firstKey()).intValue(); iIntValue <= ((java.lang.Integer) this.f40943C.lastKey()).intValue(); iIntValue++) {
            if (!C(iIntValue).equals(c6013g.C(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return new com.google.android.gms.internal.measurement.C6004f(this, this.f40943C.keySet().iterator(), this.f40944D.keySet().iterator());
    }

    public final int hashCode() {
        return this.f40943C.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.C6031i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? com.google.android.gms.internal.measurement.H.d(str, this, c5963a3, list) : com.google.android.gms.internal.measurement.AbstractC6094p.a(this, new com.google.android.gms.internal.measurement.C6133u(str), c5963a3, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final com.google.android.gms.internal.measurement.InterfaceC6117s o(java.lang.String str) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s;
        if ("length".equals(str)) {
            return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(N()));
        }
        return (!E(str) || (interfaceC6117s = (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f40944D.get(str)) == null) ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o : interfaceC6117s;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final void s(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (interfaceC6117s == null) {
            this.f40944D.remove(str);
        } else {
            this.f40944D.put(str, interfaceC6117s);
        }
    }

    public final java.lang.String toString() {
        return O(",");
    }

    public final int w() {
        return this.f40943C.size();
    }
}
