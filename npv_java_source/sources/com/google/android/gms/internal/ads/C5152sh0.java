package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5152sh0 extends com.google.android.gms.internal.ads.C4933qh0 implements java.util.ListIterator {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5262th0 f38788F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5152sh0(com.google.android.gms.internal.ads.C5262th0 c5262th0) {
        super(c5262th0);
        this.f38788F = c5262th0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5152sh0(com.google.android.gms.internal.ads.C5262th0 c5262th0, int i6) {
        super(c5262th0, ((java.util.List) c5262th0.f38533D).listIterator(i6));
        this.f38788F = c5262th0;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        boolean zIsEmpty = this.f38788F.isEmpty();
        b();
        ((java.util.ListIterator) this.f38300C).add(obj);
        this.f38788F.f39009H.f39208G++;
        if (zIsEmpty) {
            this.f38788F.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((java.util.ListIterator) this.f38300C).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((java.util.ListIterator) this.f38300C).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        b();
        return ((java.util.ListIterator) this.f38300C).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((java.util.ListIterator) this.f38300C).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        b();
        ((java.util.ListIterator) this.f38300C).set(obj);
    }
}
