package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Q1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f8755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q1.b f8756b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final Q1.c.a f8757D = new Q1.c.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(java.util.Map.Entry entry) {
            p247y7.AbstractC7350t.f(entry, "entry");
            java.lang.Object value = entry.getValue();
            return "  " + ((Q1.f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? p097j7.AbstractC6872n.u0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : java.lang.String.valueOf(entry.getValue()));
        }
    }

    public c(java.util.Map map, boolean z6) {
        p247y7.AbstractC7350t.f(map, "preferencesMap");
        this.f8755a = map;
        this.f8756b = new Q1.b(z6);
    }

    public /* synthetic */ c(java.util.Map map, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new java.util.LinkedHashMap() : map, (i6 & 2) != 0 ? true : z6);
    }

    @Override // Q1.f
    public java.util.Map a() {
        p087i7.u uVar;
        java.util.Set<java.util.Map.Entry> setEntrySet = this.f8755a.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(setEntrySet, 10)), 16));
        for (java.util.Map.Entry entry : setEntrySet) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                java.lang.Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(this, size)");
                uVar = new p087i7.u(key, bArrCopyOf);
            } else {
                uVar = new p087i7.u(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(uVar.c(), uVar.d());
        }
        return Q1.a.b(linkedHashMap);
    }

    @Override // Q1.f
    public java.lang.Object b(Q1.f.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "key");
        java.lang.Object obj = this.f8755a.get(aVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (!(!this.f8756b.a())) {
            throw new java.lang.IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    public boolean equals(java.lang.Object obj) {
        boolean zB;
        if (!(obj instanceof Q1.c)) {
            return false;
        }
        Q1.c cVar = (Q1.c) obj;
        java.util.Map map = cVar.f8755a;
        if (map == this.f8755a) {
            return true;
        }
        if (map.size() != this.f8755a.size()) {
            return false;
        }
        java.util.Map map2 = cVar.f8755a;
        if (!map2.isEmpty()) {
            for (java.util.Map.Entry entry : map2.entrySet()) {
                java.lang.Object obj2 = this.f8755a.get(entry.getKey());
                if (obj2 != null) {
                    java.lang.Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        zB = p247y7.AbstractC7350t.b(value, obj2);
                    } else if ((obj2 instanceof byte[]) && java.util.Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        zB = true;
                    } else {
                        zB = false;
                    }
                } else {
                    zB = false;
                }
                if (!zB) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f() {
        this.f8756b.b(true);
    }

    public final void g(Q1.f.b... bVarArr) {
        p247y7.AbstractC7350t.f(bVarArr, "pairs");
        e();
        if (bVarArr.length <= 0) {
            return;
        }
        Q1.f.b bVar = bVarArr[0];
        throw null;
    }

    public final java.lang.Object h(Q1.f.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "key");
        e();
        return this.f8755a.remove(aVar);
    }

    public int hashCode() {
        java.util.Iterator it = this.f8755a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(Q1.f.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "key");
        j(aVar, obj);
    }

    public final void j(Q1.f.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "key");
        e();
        if (obj == null) {
            h(aVar);
            return;
        }
        if (obj instanceof java.util.Set) {
            this.f8755a.put(aVar, Q1.a.a((java.util.Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f8755a.put(aVar, obj);
            return;
        }
        java.util.Map map = this.f8755a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(this, size)");
        map.put(aVar, bArrCopyOf);
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this.f8755a.entrySet(), ",\n", "{\n", "\n}", 0, null, Q1.c.a.f8757D, 24, null);
    }
}
