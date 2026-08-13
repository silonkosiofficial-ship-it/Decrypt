package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6224h0 implements java.util.Map, java.io.Serializable, j$.util.Map {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient com.google.android.gms.internal.play_billing.AbstractC6248l0 f41561C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient com.google.android.gms.internal.play_billing.AbstractC6248l0 f41562D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private transient com.google.android.gms.internal.play_billing.Z f41563E;

    AbstractC6224h0() {
    }

    public static com.google.android.gms.internal.play_billing.AbstractC6224h0 c(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        com.google.android.gms.internal.play_billing.L.b("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        com.google.android.gms.internal.play_billing.L.b("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        com.google.android.gms.internal.play_billing.L.b("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return com.google.android.gms.internal.play_billing.G0.g(3, new java.lang.Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract com.google.android.gms.internal.play_billing.Z a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.Z values() {
        com.google.android.gms.internal.play_billing.Z z6 = this.f41563E;
        if (z6 != null) {
            return z6;
        }
        com.google.android.gms.internal.play_billing.Z zA = a();
        this.f41563E = zA;
        return zA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    abstract com.google.android.gms.internal.play_billing.AbstractC6248l0 d();

    abstract com.google.android.gms.internal.play_billing.AbstractC6248l0 e();

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.AbstractC6248l0 entrySet() {
        com.google.android.gms.internal.play_billing.AbstractC6248l0 abstractC6248l0 = this.f41561C;
        if (abstractC6248l0 != null) {
            return abstractC6248l0;
        }
        com.google.android.gms.internal.play_billing.AbstractC6248l0 abstractC6248l0D = d();
        this.f41561C = abstractC6248l0D;
        return abstractC6248l0D;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return com.google.android.gms.internal.play_billing.J0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        com.google.android.gms.internal.play_billing.AbstractC6248l0 abstractC6248l0 = this.f41562D;
        if (abstractC6248l0 != null) {
            return abstractC6248l0;
        }
        com.google.android.gms.internal.play_billing.AbstractC6248l0 abstractC6248l0E = e();
        this.f41562D = abstractC6248l0E;
        return abstractC6248l0E;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public final java.lang.String toString() {
        int size = size();
        com.google.android.gms.internal.play_billing.L.a(size, "size");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (java.util.Map.Entry entry : entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
