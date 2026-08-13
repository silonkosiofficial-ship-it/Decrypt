package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5685xY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f39877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f39878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.view.View f39879d;

    public C5685xY(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context, com.google.android.gms.internal.ads.C4546n70 c4546n70, android.view.ViewGroup viewGroup) {
        this.f39876a = yk0;
        this.f39877b = context;
        this.f39878c = c4546n70;
        this.f39879d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f39877b);
        return this.f39876a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.wY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f39629a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C5905zY c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.View view = this.f39879d;
        while (view != null) {
            java.lang.Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof android.view.ViewGroup ? ((android.view.ViewGroup) parent).indexOfChild(view) : -1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof android.view.View)) {
                break;
            }
            view = (android.view.View) parent;
        }
        return new com.google.android.gms.internal.ads.C5905zY(this.f39877b, this.f39878c.f37512e, arrayList);
    }
}
