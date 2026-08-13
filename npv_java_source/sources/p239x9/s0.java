package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends p239x9.AbstractC7318o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F7.c f57037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v9.f f57038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(F7.c cVar, p199t9.b bVar) {
        super(bVar, null);
        p247y7.AbstractC7350t.f(cVar, "kClass");
        p247y7.AbstractC7350t.f(bVar, "eSerializer");
        this.f57037b = cVar;
        this.f57038c = new p239x9.C7292b(bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public java.lang.Object[] q(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        return p239x9.AbstractC7297d0.b(arrayList, this.f57037b);
    }

    @Override // p239x9.AbstractC7318o, p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return this.f57038c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList f() {
        return new java.util.ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int g(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(java.util.ArrayList arrayList, int i6) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        arrayList.ensureCapacity(i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator i(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return p247y7.AbstractC7334c.a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int j(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return objArr.length;
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
    public java.util.ArrayList p(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return new java.util.ArrayList(p097j7.AbstractC6872n.d(objArr));
    }
}
