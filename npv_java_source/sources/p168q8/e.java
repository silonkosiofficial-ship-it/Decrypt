package p168q8;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final java.util.Set f53189E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final java.util.Set f53190F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f53207C;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f53206V = p157p7.b.a(e());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final q8.e.a f53188D = new q8.e.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        p168q8.e[] eVarArrValues = values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p168q8.e eVar : eVarArrValues) {
            if (eVar.f53207C) {
                arrayList.add(eVar);
            }
        }
        f53189E = p097j7.AbstractC6879v.Y0(arrayList);
        f53190F = p097j7.AbstractC6872n.d1(values());
    }

    e(boolean z6) {
        this.f53207C = z6;
    }
}
