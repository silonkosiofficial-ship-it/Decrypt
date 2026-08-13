package T6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {
    private static final void a(W6.z zVar, W6.z zVar2) {
        for (java.lang.String str : zVar2.names()) {
            java.util.List listC = zVar2.c(str);
            if (listC == null) {
                listC = p097j7.AbstractC6879v.m();
            }
            java.lang.String strK = T6.AbstractC1658f.k(str, 0, 0, false, null, 15, null);
            java.util.List list = listC;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(T6.AbstractC1658f.k((java.lang.String) it.next(), 0, 0, true, null, 11, null));
            }
            zVar.d(strK, arrayList);
        }
    }

    private static final void b(W6.z zVar, W6.y yVar) {
        for (java.lang.String str : yVar.names()) {
            java.util.List listC = yVar.c(str);
            if (listC == null) {
                listC = p097j7.AbstractC6879v.m();
            }
            java.lang.String strM = T6.AbstractC1658f.m(str, false, 1, null);
            java.util.List list = listC;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(T6.AbstractC1658f.o((java.lang.String) it.next()));
            }
            zVar.d(strM, arrayList);
        }
    }

    public static final T6.G c(W6.z zVar) {
        p247y7.AbstractC7350t.f(zVar, "parameters");
        T6.H hB = T6.K.b(0, 1, null);
        a(hB, zVar);
        return hB.i();
    }

    public static final T6.H d(W6.y yVar) {
        p247y7.AbstractC7350t.f(yVar, "parameters");
        T6.H hB = T6.K.b(0, 1, null);
        b(hB, yVar);
        return hB;
    }
}
