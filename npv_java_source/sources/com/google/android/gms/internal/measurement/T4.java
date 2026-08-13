package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class T4 extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.T4 f40665D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f40666C;

    static {
        com.google.android.gms.internal.measurement.T4 t6 = new com.google.android.gms.internal.measurement.T4();
        f40665D = t6;
        t6.f40666C = false;
    }

    private T4() {
        this.f40666C = true;
    }

    private T4(java.util.Map map) {
        super(map);
        this.f40666C = true;
    }

    private static int a(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.measurement.AbstractC6146v4.d((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.measurement.InterfaceC6170y4) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static com.google.android.gms.internal.measurement.T4 b() {
        return f40665D;
    }

    private final void j() {
        if (!this.f40666C) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void c(com.google.android.gms.internal.measurement.T4 t6) {
        j();
        if (t6.isEmpty()) {
            return;
        }
        putAll(t6);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final com.google.android.gms.internal.measurement.T4 d() {
        return isEmpty() ? new com.google.android.gms.internal.measurement.T4() : new com.google.android.gms.internal.measurement.T4(this);
    }

    public final void e() {
        this.f40666C = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean z6;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this == map) {
                z6 = true;
            } else {
                if (size() == map.size()) {
                    java.util.Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                java.lang.Object value = entry.getValue();
                                java.lang.Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z6 = true;
                        }
                    }
                }
                z6 = false;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f40666C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        java.util.Iterator it = entrySet().iterator();
        int iA = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        j();
        com.google.android.gms.internal.measurement.AbstractC6146v4.e(obj);
        com.google.android.gms.internal.measurement.AbstractC6146v4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        j();
        for (java.lang.Object obj : map.keySet()) {
            com.google.android.gms.internal.measurement.AbstractC6146v4.e(obj);
            com.google.android.gms.internal.measurement.AbstractC6146v4.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        j();
        return super.remove(obj);
    }
}
