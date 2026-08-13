package p239x9;

/* JADX INFO: renamed from: x9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7296d extends p239x9.AbstractC7320p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v9.f f56992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7296d(p199t9.b bVar) {
        super(bVar);
        p247y7.AbstractC7350t.f(bVar, "element");
        this.f56992b = new p239x9.C7294c(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public java.util.List q(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // p239x9.AbstractC7318o, p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return this.f56992b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList f() {
        return new java.util.ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(java.util.ArrayList arrayList, int i6) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        arrayList.ensureCapacity(i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(java.util.ArrayList arrayList, int i6, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        arrayList.add(i6, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList p(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        java.util.ArrayList arrayList = list instanceof java.util.ArrayList ? (java.util.ArrayList) list : null;
        return arrayList == null ? new java.util.ArrayList(list) : arrayList;
    }
}
