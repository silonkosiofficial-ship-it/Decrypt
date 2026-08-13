package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.th0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C5262th0 extends com.google.android.gms.internal.ads.AbstractC5042rh0 implements java.util.List {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f39009H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5262th0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.lang.Object obj, java.util.List list, com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0) {
        super(abstractC5372uh0, obj, list, abstractC5042rh0);
        this.f39009H = abstractC5372uh0;
    }

    @Override // java.util.List
    public final void add(int i6, java.lang.Object obj) {
        b();
        boolean zIsEmpty = this.f38533D.isEmpty();
        ((java.util.List) this.f38533D).add(i6, obj);
        this.f39009H.f39208G++;
        if (zIsEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i6, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((java.util.List) this.f38533D).addAll(i6, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f38533D.size();
        this.f39009H.f39208G += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        b();
        return ((java.util.List) this.f38533D).get(i6);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        b();
        return ((java.util.List) this.f38533D).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        b();
        return ((java.util.List) this.f38533D).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        b();
        return new com.google.android.gms.internal.ads.C5152sh0(this);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i6) {
        b();
        return new com.google.android.gms.internal.ads.C5152sh0(this, i6);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i6) {
        b();
        java.lang.Object objRemove = ((java.util.List) this.f38533D).remove(i6);
        this.f39009H.f39208G--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        b();
        return ((java.util.List) this.f38533D).set(i6, obj);
    }

    @Override // java.util.List
    public final java.util.List subList(int i6, int i10) {
        b();
        java.util.List listSubList = ((java.util.List) this.f38533D).subList(i6, i10);
        com.google.android.gms.internal.ads.AbstractC5042rh0 abstractC5042rh0 = this.f38534E;
        if (abstractC5042rh0 == null) {
            abstractC5042rh0 = this;
        }
        return this.f39009H.l(this.f38532C, listSubList, abstractC5042rh0);
    }
}
