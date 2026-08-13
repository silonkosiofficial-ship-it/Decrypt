package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends U7.f implements p048e8.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f14589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p138n8.f fVar, java.lang.Object[] objArr) {
        super(fVar, null);
        p247y7.AbstractC7350t.f(objArr, "values");
        this.f14589c = objArr;
    }

    @Override // p048e8.e
    public java.util.List e() {
        java.lang.Object[] objArr = this.f14589c;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            U7.f.a aVar = U7.f.f14586b;
            p247y7.AbstractC7350t.c(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
