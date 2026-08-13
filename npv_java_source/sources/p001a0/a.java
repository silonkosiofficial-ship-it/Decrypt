package p001a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p097j7.AbstractC6868j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return e((java.util.Map.Entry) obj);
        }
        return false;
    }

    public final boolean e(java.util.Map.Entry entry) {
        if ((entry instanceof java.lang.Object ? entry : null) instanceof java.util.Map.Entry) {
            return f(entry);
        }
        return false;
    }

    public abstract boolean f(java.util.Map.Entry entry);

    public final boolean g(java.util.Map.Entry entry) {
        if ((entry instanceof java.lang.Object ? entry : null) instanceof java.util.Map.Entry) {
            return o(entry);
        }
        return false;
    }

    public abstract boolean o(java.util.Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return g((java.util.Map.Entry) obj);
        }
        return false;
    }
}
