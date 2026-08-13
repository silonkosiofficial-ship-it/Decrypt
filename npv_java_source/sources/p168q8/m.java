package p168q8;

/* JADX INFO: loaded from: classes2.dex */
public enum m {
    PLAIN { // from class: q8.m.b
        @Override // p168q8.m
        public java.lang.String g(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "string");
            return str;
        }
    },
    HTML { // from class: q8.m.a
        @Override // p168q8.m
        public java.lang.String g(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "string");
            return S8.r.R(S8.r.R(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };


    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f53283F = p157p7.b.a(e());

    /* synthetic */ m(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract java.lang.String g(java.lang.String str);
}
