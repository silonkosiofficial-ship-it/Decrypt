package Y6;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"ଟ"}, d2 = {"ଠ", "", "", "ଡ", "ଢ", "ଣ", "ତ", "ଥ", "ଦ", "ଧ", "ନ", "\u0b29", "ପ", "", "ଫ", "ବ", "ଭ", "ମ", "ଯ", "ର", "\u0b31", "ଲ", "ଳ", "\u0b34", "ଵ", "ଶ", "ଷ", "ସ", "ହ", "\u0b3a", "\u0b3b", "଼", "", "ଽ", "ା", "ି", "ୀ", "", "", "ୁ", "ୂ", "ୃ", "ୄ", "\u0b45", "\u0b46", "େ", "ୈ", "\u0b49", "\u0b4a", "ୋ", "ୌ", "୍", "\u0b4e", "\u0b4f", "\u0b50", "\u0b51", "\u0b52", "\u0b53", "\u0b54", "୕", "ୖ", "ୗ", "\u0b58", "\u0b59", "\u0b5a", "\u0b5b", "ଡ଼", "ଢ଼"}, k = 1, mv = {2, 0, 0})
public final class b implements java.lang.Comparable<Y6.b> {
    public static final Y6.b.C0308b Companion = new Y6.b.C0308b(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final p199t9.b[] f16417L = {null, null, null, p239x9.AbstractC7331z.a("io.ktor.util.date.WeekDay", Y6.d.values()), null, null, p239x9.AbstractC7331z.a("io.ktor.util.date.Month", Y6.c.values()), null, null};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Y6.b f16418M = Y6.a.a(0L);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f16419C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f16420D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f16421E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Y6.d f16422F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f16423G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f16424H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Y6.c f16425I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f16426J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final long f16427K;

    public /* synthetic */ class a implements p239x9.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Y6.b.a f16428a;
        private static final p219v9.f descriptor;

        static {
            Y6.b.a aVar = new Y6.b.a();
            f16428a = aVar;
            p239x9.C7311k0 c7311k0 = new p239x9.C7311k0("io.ktor.util.date.GMTDate", aVar, 9);
            c7311k0.r("seconds", false);
            c7311k0.r("minutes", false);
            c7311k0.r("hours", false);
            c7311k0.r("dayOfWeek", false);
            c7311k0.r("dayOfMonth", false);
            c7311k0.r("dayOfYear", false);
            c7311k0.r("month", false);
            c7311k0.r("year", false);
            c7311k0.r("timestamp", false);
            descriptor = c7311k0;
        }

        private a() {
        }

        @Override // p199t9.b, p199t9.e, p199t9.a
        public final p219v9.f a() {
            return descriptor;
        }

        @Override // p239x9.E
        public p199t9.b[] c() {
            return x9.E.a.a(this);
        }

        @Override // p239x9.E
        public final p199t9.b[] d() {
            p199t9.b[] bVarArr = Y6.b.f16417L;
            p199t9.b bVar = bVarArr[3];
            p199t9.b bVar2 = bVarArr[6];
            p239x9.J j6 = p239x9.J.f56947a;
            return new p199t9.b[]{j6, j6, j6, bVar, j6, j6, bVar2, j6, p239x9.Q.f56967a};
        }

        @Override // p199t9.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Y6.b b(p229w9.h hVar) {
            int i6;
            Y6.c cVar;
            Y6.d dVar;
            int iT;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            long jU;
            p247y7.AbstractC7350t.f(hVar, "decoder");
            p219v9.f fVar = descriptor;
            p229w9.d dVarA = hVar.a(fVar);
            p199t9.b[] bVarArr = Y6.b.f16417L;
            int i15 = 7;
            if (dVarA.v()) {
                int iT2 = dVarA.t(fVar, 0);
                int iT3 = dVarA.t(fVar, 1);
                int iT4 = dVarA.t(fVar, 2);
                Y6.d dVar2 = (Y6.d) dVarA.B(fVar, 3, bVarArr[3], null);
                int iT5 = dVarA.t(fVar, 4);
                int iT6 = dVarA.t(fVar, 5);
                cVar = (Y6.c) dVarA.B(fVar, 6, bVarArr[6], null);
                i6 = iT2;
                iT = dVarA.t(fVar, 7);
                i10 = iT6;
                i11 = 511;
                i12 = iT5;
                i13 = iT4;
                dVar = dVar2;
                i14 = iT3;
                jU = dVarA.u(fVar, 8);
            } else {
                boolean z6 = true;
                int iT7 = 0;
                int iT8 = 0;
                int iT9 = 0;
                int iT10 = 0;
                Y6.c cVar2 = null;
                long jU2 = 0;
                int iT11 = 0;
                int i16 = 0;
                Y6.d dVar3 = null;
                int iT12 = 0;
                while (z6) {
                    int iR = dVarA.r(fVar);
                    switch (iR) {
                        case -1:
                            z6 = false;
                            i15 = 7;
                            break;
                        case 0:
                            i16 |= 1;
                            iT7 = dVarA.t(fVar, 0);
                            i15 = 7;
                            break;
                        case 1:
                            iT10 = dVarA.t(fVar, 1);
                            i16 |= 2;
                            i15 = 7;
                            break;
                        case 2:
                            iT9 = dVarA.t(fVar, 2);
                            i16 |= 4;
                            break;
                        case 3:
                            dVar3 = (Y6.d) dVarA.B(fVar, 3, bVarArr[3], dVar3);
                            i16 |= 8;
                            break;
                        case 4:
                            iT8 = dVarA.t(fVar, 4);
                            i16 |= 16;
                            break;
                        case 5:
                            iT11 = dVarA.t(fVar, 5);
                            i16 |= 32;
                            break;
                        case 6:
                            cVar2 = (Y6.c) dVarA.B(fVar, 6, bVarArr[6], cVar2);
                            i16 |= 64;
                            break;
                        case 7:
                            iT12 = dVarA.t(fVar, i15);
                            i16 |= 128;
                            break;
                        case 8:
                            jU2 = dVarA.u(fVar, 8);
                            i16 |= 256;
                            break;
                        default:
                            throw new p199t9.f(iR);
                    }
                }
                i6 = iT7;
                cVar = cVar2;
                dVar = dVar3;
                iT = iT12;
                i10 = iT11;
                i11 = i16;
                i12 = iT8;
                i13 = iT9;
                i14 = iT10;
                jU = jU2;
            }
            dVarA.b(fVar);
            return new Y6.b(i11, i6, i14, i13, dVar, i12, i10, cVar, iT, jU, null);
        }

        @Override // p199t9.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void e(p229w9.j jVar, Y6.b bVar) {
            p247y7.AbstractC7350t.f(jVar, "encoder");
            p247y7.AbstractC7350t.f(bVar, "value");
            p219v9.f fVar = descriptor;
            p229w9.f fVarA = jVar.a(fVar);
            Y6.b.i(bVar, fVarA, fVar);
            fVarA.b(fVar);
        }
    }

    /* JADX INFO: renamed from: Y6.b$b, reason: collision with other inner class name */
    public static final class C0308b {
        private C0308b() {
        }

        public /* synthetic */ C0308b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p199t9.b serializer() {
            return Y6.b.a.f16428a;
        }
    }

    public /* synthetic */ b(int i6, int i10, int i11, int i12, Y6.d dVar, int i13, int i14, Y6.c cVar, int i15, long j6, p239x9.u0 u0Var) {
        if (511 != (i6 & 511)) {
            p239x9.AbstractC7301f0.a(i6, 511, Y6.b.a.f16428a.a());
        }
        this.f16419C = i10;
        this.f16420D = i11;
        this.f16421E = i12;
        this.f16422F = dVar;
        this.f16423G = i13;
        this.f16424H = i14;
        this.f16425I = cVar;
        this.f16426J = i15;
        this.f16427K = j6;
    }

    public b(int i6, int i10, int i11, Y6.d dVar, int i12, int i13, Y6.c cVar, int i14, long j6) {
        p247y7.AbstractC7350t.f(dVar, "dayOfWeek");
        p247y7.AbstractC7350t.f(cVar, "month");
        this.f16419C = i6;
        this.f16420D = i10;
        this.f16421E = i11;
        this.f16422F = dVar;
        this.f16423G = i12;
        this.f16424H = i13;
        this.f16425I = cVar;
        this.f16426J = i14;
        this.f16427K = j6;
    }

    public static final /* synthetic */ void i(Y6.b bVar, p229w9.f fVar, p219v9.f fVar2) {
        p199t9.b[] bVarArr = f16417L;
        fVar.m(fVar2, 0, bVar.f16419C);
        fVar.m(fVar2, 1, bVar.f16420D);
        fVar.m(fVar2, 2, bVar.f16421E);
        fVar.r(fVar2, 3, bVarArr[3], bVar.f16422F);
        fVar.m(fVar2, 4, bVar.f16423G);
        fVar.m(fVar2, 5, bVar.f16424H);
        fVar.r(fVar2, 6, bVarArr[6], bVar.f16425I);
        fVar.m(fVar2, 7, bVar.f16426J);
        fVar.B(fVar2, 8, bVar.f16427K);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y6.b)) {
            return false;
        }
        Y6.b bVar = (Y6.b) obj;
        return this.f16419C == bVar.f16419C && this.f16420D == bVar.f16420D && this.f16421E == bVar.f16421E && this.f16422F == bVar.f16422F && this.f16423G == bVar.f16423G && this.f16424H == bVar.f16424H && this.f16425I == bVar.f16425I && this.f16426J == bVar.f16426J && this.f16427K == bVar.f16427K;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(Y6.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "other");
        return p247y7.AbstractC7350t.h(this.f16427K, bVar.f16427K);
    }

    public int hashCode() {
        return (((((((((((((((this.f16419C * 31) + this.f16420D) * 31) + this.f16421E) * 31) + this.f16422F.hashCode()) * 31) + this.f16423G) * 31) + this.f16424H) * 31) + this.f16425I.hashCode()) * 31) + this.f16426J) * 31) + p170r.r.a(this.f16427K);
    }

    public java.lang.String toString() {
        return "GMTDate(seconds=" + this.f16419C + ", minutes=" + this.f16420D + ", hours=" + this.f16421E + ", dayOfWeek=" + this.f16422F + ", dayOfMonth=" + this.f16423G + ", dayOfYear=" + this.f16424H + ", month=" + this.f16425I + ", year=" + this.f16426J + ", timestamp=" + this.f16427K + ')';
    }
}
