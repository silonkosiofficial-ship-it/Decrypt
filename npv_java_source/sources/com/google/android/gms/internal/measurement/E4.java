package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'E' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class E4 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40482D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40483E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40484F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40485G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40486H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40487I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40488J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40489K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40490L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.E4 f40491M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ com.google.android.gms.internal.measurement.E4[] f40492N;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Class f40493C;

    static {
        com.google.android.gms.internal.measurement.E4 e6 = new com.google.android.gms.internal.measurement.E4("VOID", 0, java.lang.Void.class, java.lang.Void.class, null);
        f40482D = e6;
        java.lang.Class cls = java.lang.Integer.TYPE;
        com.google.android.gms.internal.measurement.E4 e10 = new com.google.android.gms.internal.measurement.E4("INT", 1, cls, java.lang.Integer.class, 0);
        f40483E = e10;
        com.google.android.gms.internal.measurement.E4 e11 = new com.google.android.gms.internal.measurement.E4("LONG", 2, java.lang.Long.TYPE, java.lang.Long.class, 0L);
        f40484F = e11;
        com.google.android.gms.internal.measurement.E4 e12 = new com.google.android.gms.internal.measurement.E4("FLOAT", 3, java.lang.Float.TYPE, java.lang.Float.class, java.lang.Float.valueOf(0.0f));
        f40485G = e12;
        com.google.android.gms.internal.measurement.E4 e13 = new com.google.android.gms.internal.measurement.E4("DOUBLE", 4, java.lang.Double.TYPE, java.lang.Double.class, java.lang.Double.valueOf(0.0d));
        f40486H = e13;
        com.google.android.gms.internal.measurement.E4 e14 = new com.google.android.gms.internal.measurement.E4("BOOLEAN", 5, java.lang.Boolean.TYPE, java.lang.Boolean.class, java.lang.Boolean.FALSE);
        f40487I = e14;
        com.google.android.gms.internal.measurement.E4 e15 = new com.google.android.gms.internal.measurement.E4("STRING", 6, java.lang.String.class, java.lang.String.class, "");
        f40488J = e15;
        com.google.android.gms.internal.measurement.E4 e16 = new com.google.android.gms.internal.measurement.E4("BYTE_STRING", 7, com.google.android.gms.internal.measurement.L3.class, com.google.android.gms.internal.measurement.L3.class, com.google.android.gms.internal.measurement.L3.f40566D);
        f40489K = e16;
        com.google.android.gms.internal.measurement.E4 e17 = new com.google.android.gms.internal.measurement.E4("ENUM", 8, cls, java.lang.Integer.class, null);
        f40490L = e17;
        com.google.android.gms.internal.measurement.E4 e18 = new com.google.android.gms.internal.measurement.E4("MESSAGE", 9, java.lang.Object.class, java.lang.Object.class, null);
        f40491M = e18;
        f40492N = new com.google.android.gms.internal.measurement.E4[]{e6, e10, e11, e12, e13, e14, e15, e16, e17, e18};
    }

    private E4(java.lang.String str, int i6, java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        super(str, i6);
        this.f40493C = cls2;
    }

    public static com.google.android.gms.internal.measurement.E4[] values() {
        return (com.google.android.gms.internal.measurement.E4[]) f40492N.clone();
    }

    public final java.lang.Class e() {
        return this.f40493C;
    }
}
