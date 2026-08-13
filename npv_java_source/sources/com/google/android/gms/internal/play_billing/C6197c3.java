package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6197c3 extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6197c3 f41530D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f41531C;

    static {
        com.google.android.gms.internal.play_billing.C6197c3 c6197c3 = new com.google.android.gms.internal.play_billing.C6197c3();
        f41530D = c6197c3;
        c6197c3.f41531C = false;
    }

    private C6197c3() {
        this.f41531C = true;
    }

    private C6197c3(java.util.Map map) {
        super(map);
        this.f41531C = true;
    }

    public static com.google.android.gms.internal.play_billing.C6197c3 a() {
        return f41530D;
    }

    private static int h(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof com.google.android.gms.internal.play_billing.EnumC6198c4) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = com.google.android.gms.internal.play_billing.Q2.f41449b;
        int length = bArr.length;
        int iB = com.google.android.gms.internal.play_billing.Q2.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void j() {
        if (!this.f41531C) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.google.android.gms.internal.play_billing.C6197c3 b() {
        return isEmpty() ? new com.google.android.gms.internal.play_billing.C6197c3() : new com.google.android.gms.internal.play_billing.C6197c3(this);
    }

    public final void c() {
        this.f41531C = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final void d(com.google.android.gms.internal.play_billing.C6197c3 c6197c3) {
        j();
        if (c6197c3.isEmpty()) {
            return;
        }
        putAll(c6197c3);
    }

    public final boolean e() {
        return this.f41531C;
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
        byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        j();
        for (java.lang.Object obj : map.keySet()) {
            byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
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
