package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public class b extends p198t8.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f54629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.List list, p237x7.l lVar) {
        super(list);
        p247y7.AbstractC7350t.f(list, "value");
        p247y7.AbstractC7350t.f(lVar, "computeType");
        this.f54629b = lVar;
    }

    @Override // p198t8.g
    public F8.E a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.E e6 = (F8.E) this.f54629b.l(g6);
        if (!L7.g.c0(e6) && !L7.g.q0(e6)) {
            L7.g.D0(e6);
        }
        return e6;
    }
}
