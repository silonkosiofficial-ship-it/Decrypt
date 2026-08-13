package D;

/* JADX INFO: renamed from: D.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0877n {
    public static final java.util.List a(D.InterfaceC0881s interfaceC0881s, D.D d6, D.C0873j c0873j) {
        if (!c0873j.d() && d6.isEmpty()) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        E7.i iVar = c0873j.d() ? new E7.i(c0873j.c(), java.lang.Math.min(c0873j.b(), interfaceC0881s.a() - 1)) : E7.i.f2266G.a();
        int size = d6.size();
        for (int i6 = 0; i6 < size; i6++) {
            D.D.a aVar = (D.D.a) d6.get(i6);
            int iA = D.t.a(interfaceC0881s, aVar.getKey(), aVar.getIndex());
            int iF = iVar.f();
            if ((iA > iVar.g() || iF > iA) && iA >= 0 && iA < interfaceC0881s.a()) {
                arrayList.add(java.lang.Integer.valueOf(iA));
            }
        }
        int iF2 = iVar.f();
        int iG = iVar.g();
        if (iF2 <= iG) {
            while (true) {
                arrayList.add(java.lang.Integer.valueOf(iF2));
                if (iF2 == iG) {
                    break;
                }
                iF2++;
            }
        }
        return arrayList;
    }
}
