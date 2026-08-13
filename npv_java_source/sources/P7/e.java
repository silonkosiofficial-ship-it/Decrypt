package P7;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f8377N = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f8378C;

    e(java.lang.String str) {
        this.f8378C = str == null ? N8.a.f(name()) : str;
    }

    /* synthetic */ e(java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : str);
    }

    public final java.lang.String g() {
        return this.f8378C;
    }
}
