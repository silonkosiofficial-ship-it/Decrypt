package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2831Sh0 extends com.google.android.gms.internal.ads.AbstractC2867Th0 implements java.util.Map {
    protected AbstractC2831Sh0() {
    }

    @Override // java.util.Map
    public final void clear() {
        o().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return o().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract java.util.Set entrySet();

    protected abstract java.util.Map o();

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return o().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        o().putAll(map);
    }

    protected final int q() {
        return com.google.android.gms.internal.ads.AbstractC3729fj0.a(entrySet());
    }

    protected final boolean r(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C5374ui0 c5374ui0 = new com.google.android.gms.internal.ads.C5374ui0(entrySet().iterator());
        if (obj == null) {
            while (c5374ui0.hasNext()) {
                if (c5374ui0.next() == null) {
                }
            }
            return false;
        }
        while (c5374ui0.hasNext()) {
            if (obj.equals(c5374ui0.next())) {
            }
        }
        return false;
        return true;
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        return o().remove(obj);
    }

    protected final boolean s(java.lang.Object obj) {
        return com.google.android.gms.internal.ads.AbstractC5924zi0.b(this, obj);
    }

    @Override // java.util.Map
    public int size() {
        return o().size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return o().values();
    }
}
