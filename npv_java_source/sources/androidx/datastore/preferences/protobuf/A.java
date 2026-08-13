package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'G' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21909F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21910G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21911H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21912I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21913J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21914K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21915L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21916M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21917N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.A f21918O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final /* synthetic */ androidx.datastore.preferences.protobuf.A[] f21919P;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Class f21920C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Class f21921D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f21922E;

    static {
        androidx.datastore.preferences.protobuf.A a6 = new androidx.datastore.preferences.protobuf.A("VOID", 0, java.lang.Void.class, java.lang.Void.class, null);
        f21909F = a6;
        java.lang.Class cls = java.lang.Integer.TYPE;
        androidx.datastore.preferences.protobuf.A a10 = new androidx.datastore.preferences.protobuf.A("INT", 1, cls, java.lang.Integer.class, 0);
        f21910G = a10;
        androidx.datastore.preferences.protobuf.A a11 = new androidx.datastore.preferences.protobuf.A("LONG", 2, java.lang.Long.TYPE, java.lang.Long.class, 0L);
        f21911H = a11;
        androidx.datastore.preferences.protobuf.A a12 = new androidx.datastore.preferences.protobuf.A("FLOAT", 3, java.lang.Float.TYPE, java.lang.Float.class, java.lang.Float.valueOf(0.0f));
        f21912I = a12;
        androidx.datastore.preferences.protobuf.A a13 = new androidx.datastore.preferences.protobuf.A("DOUBLE", 4, java.lang.Double.TYPE, java.lang.Double.class, java.lang.Double.valueOf(0.0d));
        f21913J = a13;
        androidx.datastore.preferences.protobuf.A a14 = new androidx.datastore.preferences.protobuf.A("BOOLEAN", 5, java.lang.Boolean.TYPE, java.lang.Boolean.class, java.lang.Boolean.FALSE);
        f21914K = a14;
        androidx.datastore.preferences.protobuf.A a15 = new androidx.datastore.preferences.protobuf.A("STRING", 6, java.lang.String.class, java.lang.String.class, "");
        f21915L = a15;
        androidx.datastore.preferences.protobuf.A a16 = new androidx.datastore.preferences.protobuf.A("BYTE_STRING", 7, androidx.datastore.preferences.protobuf.AbstractC2047g.class, androidx.datastore.preferences.protobuf.AbstractC2047g.class, androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D);
        f21916M = a16;
        androidx.datastore.preferences.protobuf.A a17 = new androidx.datastore.preferences.protobuf.A("ENUM", 8, cls, java.lang.Integer.class, null);
        f21917N = a17;
        androidx.datastore.preferences.protobuf.A a18 = new androidx.datastore.preferences.protobuf.A("MESSAGE", 9, java.lang.Object.class, java.lang.Object.class, null);
        f21918O = a18;
        f21919P = new androidx.datastore.preferences.protobuf.A[]{a6, a10, a11, a12, a13, a14, a15, a16, a17, a18};
    }

    private A(java.lang.String str, int i6, java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        super(str, i6);
        this.f21920C = cls;
        this.f21921D = cls2;
        this.f21922E = obj;
    }

    public static androidx.datastore.preferences.protobuf.A valueOf(java.lang.String str) {
        return (androidx.datastore.preferences.protobuf.A) java.lang.Enum.valueOf(androidx.datastore.preferences.protobuf.A.class, str);
    }

    public static androidx.datastore.preferences.protobuf.A[] values() {
        return (androidx.datastore.preferences.protobuf.A[]) f21919P.clone();
    }

    public java.lang.Class e() {
        return this.f21921D;
    }
}
