package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.I f21940D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f21941C;

    static {
        androidx.datastore.preferences.protobuf.I i6 = new androidx.datastore.preferences.protobuf.I();
        f21940D = i6;
        i6.l();
    }

    private I() {
        this.f21941C = true;
    }

    private I(java.util.Map map) {
        super(map);
        this.f21941C = true;
    }

    static int a(java.util.Map map) {
        int iB = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static int b(java.lang.Object obj) {
        return obj instanceof byte[] ? androidx.datastore.preferences.protobuf.AbstractC2064y.d((byte[]) obj) : obj.hashCode();
    }

    private static void c(java.util.Map map) {
        for (java.lang.Object obj : map.keySet()) {
            androidx.datastore.preferences.protobuf.AbstractC2064y.a(obj);
            androidx.datastore.preferences.protobuf.AbstractC2064y.a(map.get(obj));
        }
    }

    public static androidx.datastore.preferences.protobuf.I d() {
        return f21940D;
    }

    private void e() {
        if (!k()) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static boolean h(java.lang.Object obj, java.lang.Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean j(java.util.Map map, java.util.Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && j(this, (java.util.Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean k() {
        return this.f21941C;
    }

    public void l() {
        this.f21941C = false;
    }

    public void m(androidx.datastore.preferences.protobuf.I i6) {
        e();
        if (i6.isEmpty()) {
            return;
        }
        putAll(i6);
    }

    public androidx.datastore.preferences.protobuf.I p() {
        return isEmpty() ? new androidx.datastore.preferences.protobuf.I() : new androidx.datastore.preferences.protobuf.I(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        e();
        androidx.datastore.preferences.protobuf.AbstractC2064y.a(obj);
        androidx.datastore.preferences.protobuf.AbstractC2064y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        e();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        e();
        return super.remove(obj);
    }
}
