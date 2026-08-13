package O7;

/* JADX INFO: renamed from: O7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1425f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f8161K = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f8162C;

    EnumC1425f(java.lang.String str) {
        this.f8162C = str;
    }

    public final boolean g() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
