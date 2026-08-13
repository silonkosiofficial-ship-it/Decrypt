package p029c9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(p237x7.p pVar, java.lang.Object obj, p127m7.e eVar) {
        p127m7.e eVarA = p147o7.h.a(eVar);
        try {
            p127m7.i context = eVarA.getContext();
            java.lang.Object objI = p019b9.K.i(context, null);
            try {
                p147o7.h.b(eVarA);
                java.lang.Object objE = !(pVar instanceof p147o7.a) ? p137n7.b.e(pVar, obj, eVarA) : ((p237x7.p) p247y7.W.f(pVar, 2)).u(obj, eVarA);
                p019b9.K.f(context, objI);
                if (objE != p137n7.b.g()) {
                    eVarA.t(p087i7.w.b(objE));
                }
            } catch (java.lang.Throwable th) {
                p019b9.K.f(context, objI);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            i7.w.a aVar = p087i7.w.f46751D;
            eVarA.t(p087i7.w.b(p087i7.x.a(th2)));
        }
    }

    public static final java.lang.Object b(p019b9.z zVar, java.lang.Object obj, p237x7.p pVar) {
        java.lang.Object a6;
        java.lang.Object objV0;
        try {
            a6 = !(pVar instanceof p147o7.a) ? p137n7.b.e(pVar, obj, zVar) : ((p237x7.p) p247y7.W.f(pVar, 2)).u(obj, zVar);
        } catch (java.lang.Throwable th) {
            a6 = new W8.A(th, false, 2, null);
        }
        if (a6 == p137n7.b.g() || (objV0 = zVar.v0(a6)) == W8.G0.f15446b) {
            return p137n7.b.g();
        }
        if (objV0 instanceof W8.A) {
            throw ((W8.A) objV0).f15423a;
        }
        return W8.G0.h(objV0);
    }

    public static final java.lang.Object c(p019b9.z zVar, java.lang.Object obj, p237x7.p pVar) throws java.lang.Throwable {
        java.lang.Object a6;
        java.lang.Object objV0;
        try {
            a6 = !(pVar instanceof p147o7.a) ? p137n7.b.e(pVar, obj, zVar) : ((p237x7.p) p247y7.W.f(pVar, 2)).u(obj, zVar);
        } catch (java.lang.Throwable th) {
            a6 = new W8.A(th, false, 2, null);
        }
        if (a6 == p137n7.b.g() || (objV0 = zVar.v0(a6)) == W8.G0.f15446b) {
            return p137n7.b.g();
        }
        if (objV0 instanceof W8.A) {
            java.lang.Throwable th2 = ((W8.A) objV0).f15423a;
            if (!(th2 instanceof W8.Y0) || ((W8.Y0) th2).f15478C != zVar) {
                throw th2;
            }
            if (a6 instanceof W8.A) {
                throw ((W8.A) a6).f15423a;
            }
        } else {
            a6 = W8.G0.h(objV0);
        }
        return a6;
    }
}
