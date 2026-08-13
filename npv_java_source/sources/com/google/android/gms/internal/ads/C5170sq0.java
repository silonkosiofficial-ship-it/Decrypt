package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5170sq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f38801a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5280tq0 f38804d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Map f38802b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f38803c = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Cp0 f38805e = com.google.android.gms.internal.ads.Cp0.f26289b;

    /* synthetic */ C5170sq0(java.lang.Class cls, com.google.android.gms.internal.ads.AbstractC5390uq0 abstractC5390uq0) {
        this.f38801a = cls;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    private final com.google.android.gms.internal.ads.C5170sq0 e(java.lang.Object obj, com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.C4847pt0 c4847pt0, boolean z6) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.C5280tq0 c5280tq0;
        com.google.android.gms.internal.ads.Lu0 lu0B;
        byte[] bArrC;
        java.util.Map map;
        java.util.List list;
        if (this.f38802b == null) {
            throw new java.lang.IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("`fullPrimitive` must not be null");
        }
        if (c4847pt0.k0() != 3) {
            throw new java.security.GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = c4847pt0.f0().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    bArrC = com.google.android.gms.internal.ads.AbstractC5930zl0.f40372a;
                } else if (iOrdinal != 4) {
                    throw new java.security.GeneralSecurityException("unknown output prefix type");
                }
                c5280tq0 = new com.google.android.gms.internal.ads.C5280tq0(obj, com.google.android.gms.internal.ads.Lu0.b(bArrC), c4847pt0.k0(), c4847pt0.f0(), c4847pt0.b0(), c4847pt0.c0().g0(), el0, null);
                map = this.f38802b;
                java.util.List list2 = this.f38803c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(c5280tq0);
                list = (java.util.List) map.put(c5280tq0.f39035b, j$.util.DesugarCollections.unmodifiableList(arrayList));
                if (list != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(c5280tq0);
                    map.put(c5280tq0.f39035b, j$.util.DesugarCollections.unmodifiableList(arrayList2));
                }
                list2.add(c5280tq0);
                if (z6) {
                    if (this.f38804d == null) {
                        throw new java.lang.IllegalStateException("you cannot set two primary primitives");
                    }
                    this.f38804d = c5280tq0;
                }
                return this;
            }
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.a(c4847pt0.b0());
        } else {
            lu0B = com.google.android.gms.internal.ads.AbstractC3195aq0.b(c4847pt0.b0());
        }
        bArrC = lu0B.c();
        c5280tq0 = new com.google.android.gms.internal.ads.C5280tq0(obj, com.google.android.gms.internal.ads.Lu0.b(bArrC), c4847pt0.k0(), c4847pt0.f0(), c4847pt0.b0(), c4847pt0.c0().g0(), el0, null);
        map = this.f38802b;
        java.util.List list3 = this.f38803c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(c5280tq0);
        list = (java.util.List) map.put(c5280tq0.f39035b, j$.util.DesugarCollections.unmodifiableList(arrayList3));
        if (list != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.addAll(list);
            arrayList4.add(c5280tq0);
            map.put(c5280tq0.f39035b, j$.util.DesugarCollections.unmodifiableList(arrayList4));
        }
        list3.add(c5280tq0);
        if (z6) {
            if (this.f38804d == null) {
                throw new java.lang.IllegalStateException("you cannot set two primary primitives");
            }
            this.f38804d = c5280tq0;
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C5170sq0 a(java.lang.Object obj, com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.C4847pt0 c4847pt0) {
        e(obj, el0, c4847pt0, false);
        return this;
    }

    public final com.google.android.gms.internal.ads.C5170sq0 b(java.lang.Object obj, com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.C4847pt0 c4847pt0) {
        e(obj, el0, c4847pt0, true);
        return this;
    }

    public final com.google.android.gms.internal.ads.C5170sq0 c(com.google.android.gms.internal.ads.Cp0 cp0) {
        if (this.f38802b == null) {
            throw new java.lang.IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f38805e = cp0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5500vq0 d() {
        java.util.Map map = this.f38802b;
        if (map == null) {
            throw new java.lang.IllegalStateException("build cannot be called twice");
        }
        com.google.android.gms.internal.ads.C5500vq0 c5500vq0 = new com.google.android.gms.internal.ads.C5500vq0(map, this.f38803c, this.f38804d, this.f38805e, this.f38801a, null);
        this.f38802b = null;
        return c5500vq0;
    }
}
