package p108k8;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k8.h.a f49817b = new k8.h.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p108k8.h f49818c = new p108k8.h(p097j7.AbstractC6879v.m());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f49819a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p108k8.h a(p088i8.w wVar) {
            p247y7.AbstractC7350t.f(wVar, "table");
            if (wVar.v() == 0) {
                return b();
            }
            java.util.List listW = wVar.w();
            p247y7.AbstractC7350t.e(listW, "getRequirementList(...)");
            return new p108k8.h(listW, null);
        }

        public final p108k8.h b() {
            return p108k8.h.f49818c;
        }
    }

    private h(java.util.List list) {
        this.f49819a = list;
    }

    public /* synthetic */ h(java.util.List list, p247y7.AbstractC7342k abstractC7342k) {
        this(list);
    }
}
