package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f1391b;

    public G(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "rawInput");
        this.f1390a = str;
        this.f1391b = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: C9.D
            @Override // p237x7.a
            public final java.lang.Object b() {
                return C9.G.d(this.f1389C);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map d(C9.G g6) {
        R8.h<java.util.List> hVarW = R8.k.w(R8.k.G(S8.r.V0(S8.r.i1(g6.f1390a, "?", null, 2, null), new java.lang.String[]{"&"}, false, 0, 6, null), new p237x7.l() { // from class: C9.E
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return C9.G.e((java.lang.String) obj);
            }
        }), new p237x7.l() { // from class: C9.F
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C9.G.f((java.util.List) obj));
            }
        });
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.List list : hVarW) {
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((java.util.List) arrayList).add((java.lang.String) p097j7.AbstractC6879v.l0(list, 1));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable<java.lang.String> iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.String str2 : iterable) {
                if (str2 == null || str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            arrayList2.add(p087i7.B.a(key, arrayList3));
        }
        return p097j7.S.q(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "it");
        return S8.r.T0(str, new java.lang.String[]{"="}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "it");
        int size = list.size();
        return 1 <= size && size < 3 && ((java.lang.CharSequence) list.get(0)).length() > 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9.G) && p247y7.AbstractC7350t.b(this.f1390a, ((C9.G) obj).f1390a);
    }

    public int hashCode() {
        return this.f1390a.hashCode();
    }

    public java.lang.String toString() {
        return "QueryString(rawInput=" + this.f1390a + ")";
    }
}
