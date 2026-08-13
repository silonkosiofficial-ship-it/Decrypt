package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List b(p109k9.o oVar) {
        java.util.List listC = p097j7.AbstractC6879v.c();
        c(listC, oVar);
        return p097j7.AbstractC6879v.a(listC);
    }

    private static final void c(java.util.List list, p109k9.o oVar) {
        if (oVar instanceof p109k9.C6919e) {
            list.add(((p109k9.C6919e) oVar).c());
            return;
        }
        if (oVar instanceof p109k9.h) {
            java.util.Iterator it = ((p109k9.h) oVar).c().iterator();
            while (it.hasNext()) {
                c(list, (p109k9.s) it.next());
            }
            return;
        }
        if (oVar instanceof p109k9.j) {
            return;
        }
        if (oVar instanceof p109k9.z) {
            c(list, ((p109k9.z) oVar).f());
            return;
        }
        if (!(oVar instanceof p109k9.C6917c)) {
            if (oVar instanceof p109k9.t) {
                c(list, ((p109k9.t) oVar).d());
            }
        } else {
            p109k9.C6917c c6917c = (p109k9.C6917c) oVar;
            c(list, c6917c.d());
            java.util.Iterator it2 = c6917c.c().iterator();
            while (it2.hasNext()) {
                c(list, (p109k9.o) it2.next());
            }
        }
    }
}
