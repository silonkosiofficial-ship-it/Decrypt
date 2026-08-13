package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final F8.t0 a(java.util.List list) {
        F8.M mE1;
        p247y7.AbstractC7350t.f(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (F8.t0) p097j7.AbstractC6879v.G0(list);
        }
        java.util.List<F8.t0> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        boolean z6 = false;
        boolean z10 = false;
        for (F8.t0 t0Var : list2) {
            z6 = z6 || F8.G.a(t0Var);
            if (t0Var instanceof F8.M) {
                mE1 = (F8.M) t0Var;
            } else {
                if (!(t0Var instanceof F8.AbstractC0963y)) {
                    throw new p087i7.s();
                }
                if (F8.AbstractC0959u.a(t0Var)) {
                    return t0Var;
                }
                mE1 = ((F8.AbstractC0963y) t0Var).e1();
                z10 = true;
            }
            arrayList.add(mE1);
        }
        if (z6) {
            return H8.k.d(H8.j.f4483X0, list.toString());
        }
        if (!z10) {
            return G8.u.f3165a.c(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(F8.B.d((F8.t0) it.next()));
        }
        G8.u uVar = G8.u.f3165a;
        return F8.F.d(uVar.c(arrayList), uVar.c(arrayList2));
    }
}
