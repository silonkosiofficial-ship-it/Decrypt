package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5598wk0 extends com.google.android.gms.internal.ads.AbstractC4499mk0 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.util.List f39664R;

    AbstractC5598wk0(com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0, boolean z6) {
        super(abstractC3011Xh0, z6, true);
        java.util.List listEmptyList = abstractC3011Xh0.isEmpty() ? java.util.Collections.emptyList() : com.google.android.gms.internal.ads.AbstractC5264ti0.a(abstractC3011Xh0.size());
        for (int i6 = 0; i6 < abstractC3011Xh0.size(); i6++) {
            listEmptyList.add(null);
        }
        this.f39664R = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4499mk0
    final void R(int i6, java.lang.Object obj) {
        java.util.List list = this.f39664R;
        if (list != null) {
            list.set(i6, new com.google.android.gms.internal.ads.C5488vk0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4499mk0
    final void S() {
        java.util.List list = this.f39664R;
        if (list != null) {
            f(X(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4499mk0
    final void W(int i6) {
        super.W(i6);
        this.f39664R = null;
    }

    abstract java.lang.Object X(java.util.List list);
}
