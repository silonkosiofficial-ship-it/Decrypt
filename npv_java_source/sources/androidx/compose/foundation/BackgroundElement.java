package androidx.compose.foundation;

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
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"ĺ"}, d2 = {"Ļ", "ļ", "Ľ", "ľ", "Ŀ", "ŀ", "Ł", "", "ł", "Ń", "ń", "Ņ", "ņ", "Ň", "ň", "ŉ", "Ŋ", "ŋ", "Ō", "ō", "Ŏ", "ŏ", "", "Ő", "ő", "", "Œ", "", "œ", "Ŕ", "ŕ", "Ŗ", "ŗ", "Ř", "ř", "Ś", "ś", "Ŝ", "ŝ", "Ş", "ş"}, k = 1, mv = {1, 8, 0})
final class BackgroundElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.AbstractC6984n0 f18814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p141o0.e2 f18816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p237x7.l f18817f;

    private BackgroundElement(long j6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.e2 e2Var, p237x7.l lVar) {
        this.f18813b = j6;
        this.f18814c = abstractC6984n0;
        this.f18815d = f6;
        this.f18816e = e2Var;
        this.f18817f = lVar;
    }

    public /* synthetic */ BackgroundElement(long j6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.e2 e2Var, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p141o0.C7016y0.f52264b.g() : j6, (i6 & 2) != 0 ? null : abstractC6984n0, f6, e2Var, lVar, null);
    }

    public /* synthetic */ BackgroundElement(long j6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.e2 e2Var, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, abstractC6984n0, f6, e2Var, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        androidx.compose.foundation.BackgroundElement backgroundElement = obj instanceof androidx.compose.foundation.BackgroundElement ? (androidx.compose.foundation.BackgroundElement) obj : null;
        return backgroundElement != null && p141o0.C7016y0.o(this.f18813b, backgroundElement.f18813b) && p247y7.AbstractC7350t.b(this.f18814c, backgroundElement.f18814c) && this.f18815d == backgroundElement.f18815d && p247y7.AbstractC7350t.b(this.f18816e, backgroundElement.f18816e);
    }

    public int hashCode() {
        int iU = p141o0.C7016y0.u(this.f18813b) * 31;
        p141o0.AbstractC6984n0 abstractC6984n0 = this.f18814c;
        return ((((iU + (abstractC6984n0 != null ? abstractC6984n0.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.f18815d)) * 31) + this.f18816e.hashCode();
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.c g() {
        return new androidx.compose.foundation.c(this.f18813b, this.f18814c, this.f18815d, this.f18816e, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.c cVar) {
        cVar.Y1(this.f18813b);
        cVar.X1(this.f18814c);
        cVar.b(this.f18815d);
        cVar.l0(this.f18816e);
    }
}
