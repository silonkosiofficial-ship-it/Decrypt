package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3755fw0 extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3755fw0 f35485D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f35486C;

    static {
        com.google.android.gms.internal.ads.C3755fw0 c3755fw0 = new com.google.android.gms.internal.ads.C3755fw0();
        f35485D = c3755fw0;
        c3755fw0.f35486C = false;
    }

    private C3755fw0() {
        this.f35486C = true;
    }

    private C3755fw0(java.util.Map map) {
        super(map);
        this.f35486C = true;
    }

    public static com.google.android.gms.internal.ads.C3755fw0 a() {
        return f35485D;
    }

    private static int h(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof com.google.android.gms.internal.ads.Lv0) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = com.google.android.gms.internal.ads.Tv0.f32042b;
        int length = bArr.length;
        int iB = com.google.android.gms.internal.ads.Tv0.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void j() {
        if (!this.f35486C) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.google.android.gms.internal.ads.C3755fw0 b() {
        return isEmpty() ? new com.google.android.gms.internal.ads.C3755fw0() : new com.google.android.gms.internal.ads.C3755fw0(this);
    }

    public final void c() {
        this.f35486C = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final void d(com.google.android.gms.internal.ads.C3755fw0 c3755fw0) {
        j();
        if (c3755fw0.isEmpty()) {
            return;
        }
        putAll(c3755fw0);
    }

    public final boolean e() {
        return this.f35486C;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        java.util.Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            java.lang.Object value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        java.util.Iterator it = entrySet().iterator();
        int iH = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        j();
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        j();
        for (java.lang.Object obj : map.keySet()) {
            byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        j();
        return super.remove(obj);
    }
}
