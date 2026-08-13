package p171r0;

/* JADX INFO: renamed from: r0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7056f {
    public static final void a(p161q0.g gVar, p171r0.C7053c c7053c) {
        c7053c.h(gVar.F0().h(), gVar.F0().f());
    }

    public static final void b(p171r0.C7053c c7053c, p141o0.L1 l6) {
        p141o0.Q1 q1C;
        if (l6 instanceof o0.L1.b) {
            o0.L1.b bVar = (o0.L1.b) l6;
            c7053c.R(p131n0.h.a(bVar.b().i(), bVar.b().l()), p131n0.n.a(bVar.b().n(), bVar.b().h()));
            return;
        }
        if (l6 instanceof o0.L1.a) {
            q1C = ((o0.L1.a) l6).b();
        } else {
            if (!(l6 instanceof o0.L1.c)) {
                return;
            }
            o0.L1.c cVar = (o0.L1.c) l6;
            if (cVar.c() == null) {
                p131n0.k kVarB = cVar.b();
                c7053c.W(p131n0.h.a(kVarB.e(), kVarB.g()), p131n0.n.a(kVarB.j(), kVarB.d()), p131n0.a.d(kVarB.b()));
                return;
            }
            q1C = cVar.c();
        }
        c7053c.O(q1C);
    }
}
