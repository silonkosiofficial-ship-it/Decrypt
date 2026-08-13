package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends p097j7.AbstractC6868j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return e((java.util.Map.Entry) obj);
        }
        return false;
    }

    public final boolean e(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "element");
        return f(entry);
    }

    public abstract boolean f(java.util.Map.Entry entry);

    public abstract /* bridge */ boolean g(java.util.Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return g((java.util.Map.Entry) obj);
        }
        return false;
    }
}
