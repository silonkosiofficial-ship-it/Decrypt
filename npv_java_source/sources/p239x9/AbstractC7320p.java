package p239x9;

/* JADX INFO: renamed from: x9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7320p extends p239x9.AbstractC7318o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7320p(p199t9.b bVar) {
        super(bVar, null);
        p247y7.AbstractC7350t.f(bVar, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator i(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int j(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        return collection.size();
    }
}
