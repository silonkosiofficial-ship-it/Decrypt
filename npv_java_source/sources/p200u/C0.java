package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {

    public static final class a implements p200u.InterfaceC7192t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f54668a;

        a(p200u.r rVar, float f6, float f10) {
            E7.i iVarQ = E7.j.q(0, rVar.b());
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iVarQ, 10));
            java.util.Iterator it = iVarQ.iterator();
            while (it.hasNext()) {
                arrayList.add(new p200u.N(f6, f10, rVar.a(((p097j7.O) it).b())));
            }
            this.f54668a = arrayList;
        }

        @Override // p200u.InterfaceC7192t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p200u.N get(int i6) {
            return (p200u.N) this.f54668a.get(i6);
        }
    }

    public static final class b implements p200u.InterfaceC7192t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p200u.N f54669a;

        b(float f6, float f10) {
            this.f54669a = new p200u.N(f6, f10, 0.0f, 4, null);
        }

        @Override // p200u.InterfaceC7192t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p200u.N get(int i6) {
            return this.f54669a;
        }
    }

    public static final long b(p200u.F0 f6, long j6) {
        return E7.j.l(j6 - ((long) f6.d()), 0L, f6.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p200u.InterfaceC7192t c(p200u.r rVar, float f6, float f10) {
        return rVar != null ? new u.C0.a(rVar, f6, f10) : new u.C0.b(f6, f10);
    }

    public static final p200u.r d(p200u.B0 b6, long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return b6.c(j6 * 1000000, rVar, rVar2, rVar3);
    }
}
