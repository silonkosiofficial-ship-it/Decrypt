package K4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static final java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            K4.r rVar = (K4.r) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("event_type", rVar.a());
            bundle.putLong("event_timestamp", rVar.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i6, java.util.List list) {
        list.add(K4.r.c(i6, java.lang.System.currentTimeMillis()));
    }
}
