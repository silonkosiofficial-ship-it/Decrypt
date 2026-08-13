package com.google.android.gms.internal.measurement;

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
/* JADX INFO: loaded from: classes3.dex */
public class N5 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40596E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40597F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40598G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40599H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40600I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40601J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40602K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40603L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40604M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40605N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40606O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40607P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40608Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40609R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40610S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40611T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40612U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final com.google.android.gms.internal.measurement.N5 f40613V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final /* synthetic */ com.google.android.gms.internal.measurement.N5[] f40614W;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.U5 f40615C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f40616D;

    static {
        com.google.android.gms.internal.measurement.N5 n6 = new com.google.android.gms.internal.measurement.N5("DOUBLE", 0, com.google.android.gms.internal.measurement.U5.DOUBLE, 1);
        f40596E = n6;
        com.google.android.gms.internal.measurement.N5 n10 = new com.google.android.gms.internal.measurement.N5("FLOAT", 1, com.google.android.gms.internal.measurement.U5.FLOAT, 5);
        f40597F = n10;
        com.google.android.gms.internal.measurement.U5 u6 = com.google.android.gms.internal.measurement.U5.LONG;
        com.google.android.gms.internal.measurement.N5 n11 = new com.google.android.gms.internal.measurement.N5("INT64", 2, u6, 0);
        f40598G = n11;
        com.google.android.gms.internal.measurement.N5 n12 = new com.google.android.gms.internal.measurement.N5("UINT64", 3, u6, 0);
        f40599H = n12;
        com.google.android.gms.internal.measurement.U5 u10 = com.google.android.gms.internal.measurement.U5.INT;
        com.google.android.gms.internal.measurement.N5 n13 = new com.google.android.gms.internal.measurement.N5("INT32", 4, u10, 0);
        f40600I = n13;
        com.google.android.gms.internal.measurement.N5 n14 = new com.google.android.gms.internal.measurement.N5("FIXED64", 5, u6, 1);
        f40601J = n14;
        com.google.android.gms.internal.measurement.N5 n15 = new com.google.android.gms.internal.measurement.N5("FIXED32", 6, u10, 5);
        f40602K = n15;
        com.google.android.gms.internal.measurement.N5 n16 = new com.google.android.gms.internal.measurement.N5("BOOL", 7, com.google.android.gms.internal.measurement.U5.BOOLEAN, 0);
        f40603L = n16;
        int i6 = 2;
        com.google.android.gms.internal.measurement.T5 t6 = null;
        com.google.android.gms.internal.measurement.Q5 q6 = new com.google.android.gms.internal.measurement.Q5("STRING", com.google.android.gms.internal.measurement.U5.STRING);
        f40604M = q6;
        com.google.android.gms.internal.measurement.U5 u11 = com.google.android.gms.internal.measurement.U5.MESSAGE;
        com.google.android.gms.internal.measurement.P5 p6 = new com.google.android.gms.internal.measurement.P5("GROUP", u11);
        f40605N = p6;
        com.google.android.gms.internal.measurement.S5 s6 = new com.google.android.gms.internal.measurement.S5("MESSAGE", u11);
        f40606O = s6;
        com.google.android.gms.internal.measurement.R5 r6 = new com.google.android.gms.internal.measurement.R5("BYTES", com.google.android.gms.internal.measurement.U5.BYTE_STRING);
        f40607P = r6;
        com.google.android.gms.internal.measurement.N5 n17 = new com.google.android.gms.internal.measurement.N5("UINT32", 12, u10, 0);
        f40608Q = n17;
        com.google.android.gms.internal.measurement.N5 n18 = new com.google.android.gms.internal.measurement.N5("ENUM", 13, com.google.android.gms.internal.measurement.U5.ENUM, 0);
        f40609R = n18;
        com.google.android.gms.internal.measurement.N5 n19 = new com.google.android.gms.internal.measurement.N5("SFIXED32", 14, u10, 5);
        f40610S = n19;
        com.google.android.gms.internal.measurement.N5 n20 = new com.google.android.gms.internal.measurement.N5("SFIXED64", 15, u6, 1);
        f40611T = n20;
        com.google.android.gms.internal.measurement.N5 n21 = new com.google.android.gms.internal.measurement.N5("SINT32", 16, u10, 0);
        f40612U = n21;
        com.google.android.gms.internal.measurement.N5 n22 = new com.google.android.gms.internal.measurement.N5("SINT64", 17, u6, 0);
        f40613V = n22;
        f40614W = new com.google.android.gms.internal.measurement.N5[]{n6, n10, n11, n12, n13, n14, n15, n16, q6, p6, s6, r6, n17, n18, n19, n20, n21, n22};
    }

    private N5(java.lang.String str, int i6, com.google.android.gms.internal.measurement.U5 u6, int i10) {
        super(str, i6);
        this.f40615C = u6;
        this.f40616D = i10;
    }

    public static com.google.android.gms.internal.measurement.N5[] values() {
        return (com.google.android.gms.internal.measurement.N5[]) f40614W.clone();
    }

    public final com.google.android.gms.internal.measurement.U5 e() {
        return this.f40615C;
    }
}
