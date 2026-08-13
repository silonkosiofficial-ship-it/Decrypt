package Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p097j7.AbstractC6862d implements Y.f {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.Collection f16630D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.Collection collection) {
            super(1);
            this.f16630D = collection;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(this.f16630D.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, Y.f
    public Y.f addAll(java.util.Collection collection) {
        Y.f.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.i();
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Y.d subList(int i6, int i10) {
        return Y.c.a(this, i6, i10);
    }

    @Override // p097j7.AbstractC6862d, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, Y.f
    public Y.f remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? y(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, Y.f
    public Y.f removeAll(java.util.Collection collection) {
        return v(new Z.b.a(collection));
    }
}
