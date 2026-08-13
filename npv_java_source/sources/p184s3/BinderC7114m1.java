package p184s3;

/* JADX INFO: renamed from: s3.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class BinderC7114m1 extends com.google.android.gms.internal.ads.AbstractBinderC3840gk {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p184s3.C7120o1 f54296C;

    /* synthetic */ BinderC7114m1(p184s3.C7120o1 c7120o1, p184s3.AbstractC7117n1 abstractC7117n1) {
        this.f54296C = c7120o1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950hk
    public final void L4(java.util.List list) {
        int i6;
        java.util.ArrayList arrayList;
        synchronized (this.f54296C.f54308a) {
            this.f54296C.f54311d = false;
            this.f54296C.f54312e = true;
            arrayList = new java.util.ArrayList(this.f54296C.f54310c);
            this.f54296C.f54310c.clear();
        }
        p164q3.b bVarA = p184s3.C7120o1.a(list);
        int size = arrayList.size();
        for (i6 = 0; i6 < size; i6++) {
            ((p164q3.c) arrayList.get(i6)).a(bVarA);
        }
    }
}
