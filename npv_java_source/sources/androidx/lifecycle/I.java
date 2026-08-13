package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.lifecycle.I.a f22755f = new androidx.lifecycle.I.a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.Class[] f22756g = {java.lang.Boolean.TYPE, boolean[].class, java.lang.Double.TYPE, double[].class, java.lang.Integer.TYPE, int[].class, java.lang.Long.TYPE, long[].class, java.lang.String.class, java.lang.String[].class, android.os.Binder.class, android.os.Bundle.class, java.lang.Byte.TYPE, byte[].class, java.lang.Character.TYPE, char[].class, java.lang.CharSequence.class, java.lang.CharSequence[].class, java.util.ArrayList.class, java.lang.Float.TYPE, float[].class, android.os.Parcelable.class, android.os.Parcelable[].class, java.io.Serializable.class, java.lang.Short.TYPE, short[].class, android.util.SparseArray.class, android.util.Size.class, android.util.SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f22757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f22758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f22759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f22760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x2.d.c f22761e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.lifecycle.I a(android.os.Bundle bundle, android.os.Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new androidx.lifecycle.I();
                }
                java.util.HashMap map = new java.util.HashMap();
                for (java.lang.String str : bundle2.keySet()) {
                    p247y7.AbstractC7350t.e(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new androidx.lifecycle.I(map);
            }
            java.lang.ClassLoader classLoader = androidx.lifecycle.I.class.getClassLoader();
            p247y7.AbstractC7350t.c(classLoader);
            bundle.setClassLoader(classLoader);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new java.lang.IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.Object obj = parcelableArrayList.get(i6);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((java.lang.String) obj, parcelableArrayList2.get(i6));
            }
            return new androidx.lifecycle.I(linkedHashMap);
        }

        public final boolean b(java.lang.Object obj) {
            if (obj == null) {
                return true;
            }
            for (java.lang.Class cls : androidx.lifecycle.I.f22756g) {
                p247y7.AbstractC7350t.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public I() {
        this.f22757a = new java.util.LinkedHashMap();
        this.f22758b = new java.util.LinkedHashMap();
        this.f22759c = new java.util.LinkedHashMap();
        this.f22760d = new java.util.LinkedHashMap();
        this.f22761e = new x2.d.c() { // from class: androidx.lifecycle.H
            @Override // x2.d.c
            public final android.os.Bundle a() {
                return androidx.lifecycle.I.d(this.f22754a);
            }
        };
    }

    public I(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "initialState");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f22757a = linkedHashMap;
        this.f22758b = new java.util.LinkedHashMap();
        this.f22759c = new java.util.LinkedHashMap();
        this.f22760d = new java.util.LinkedHashMap();
        this.f22761e = new x2.d.c() { // from class: androidx.lifecycle.H
            @Override // x2.d.c
            public final android.os.Bundle a() {
                return androidx.lifecycle.I.d(this.f22754a);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Bundle d(androidx.lifecycle.I i6) {
        p247y7.AbstractC7350t.f(i6, "this$0");
        for (java.util.Map.Entry entry : p097j7.S.s(i6.f22758b).entrySet()) {
            i6.e((java.lang.String) entry.getKey(), ((x2.d.c) entry.getValue()).a());
        }
        java.util.Set<java.lang.String> setKeySet = i6.f22757a.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(setKeySet.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        for (java.lang.String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(i6.f22757a.get(str));
        }
        return androidx.core.os.d.a(p087i7.B.a("keys", arrayList), p087i7.B.a("values", arrayList2));
    }

    public final x2.d.c c() {
        return this.f22761e;
    }

    public final void e(java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "key");
        if (!f22755f.b(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Can't put value with type ");
            p247y7.AbstractC7350t.c(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.Object obj2 = this.f22759c.get(str);
        androidx.lifecycle.C2093z c2093z = obj2 instanceof androidx.lifecycle.C2093z ? (androidx.lifecycle.C2093z) obj2 : null;
        if (c2093z != null) {
            c2093z.n(obj);
        } else {
            this.f22757a.put(str, obj);
        }
        Z8.y yVar = (Z8.y) this.f22760d.get(str);
        if (yVar == null) {
            return;
        }
        yVar.setValue(obj);
    }
}
