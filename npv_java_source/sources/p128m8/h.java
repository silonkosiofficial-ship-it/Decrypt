package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final java.util.List a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.ensureCapacity(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            l8.a.e.c cVar = (l8.a.e.c) it.next();
            int iF = cVar.F();
            for (int i6 = 0; i6 < iF; i6++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
