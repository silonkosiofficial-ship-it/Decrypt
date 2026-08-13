package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends p198t8.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F8.E f54655c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F8.E f54656D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F8.E e6) {
            super(1);
            this.f54656D = e6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "it");
            return this.f54656D;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.List list, F8.E e6) {
        super(list, new t8.v.a(e6));
        p247y7.AbstractC7350t.f(list, "value");
        p247y7.AbstractC7350t.f(e6, "type");
        this.f54655c = e6;
    }

    public final F8.E c() {
        return this.f54655c;
    }
}
