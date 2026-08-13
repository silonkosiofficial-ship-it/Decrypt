package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends I2.h {
    @Override // I2.h
    public androidx.work.b b(java.util.List list) {
        androidx.work.b.a aVar = new androidx.work.b.a();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((androidx.work.b) it.next()).h());
        }
        aVar.d(map);
        return aVar.a();
    }
}
