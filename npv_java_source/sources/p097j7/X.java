package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X extends p097j7.W {
    public static java.util.List v(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        if (map.size() == 0) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (!it.hasNext()) {
            return p097j7.AbstractC6879v.e(new p087i7.u(entry.getKey(), entry.getValue()));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        arrayList.add(new p087i7.u(entry.getKey(), entry.getValue()));
        do {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            arrayList.add(new p087i7.u(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
