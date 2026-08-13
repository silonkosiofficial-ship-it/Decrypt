package androidx.compose.ui.graphics;

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
@kotlin.Metadata(d1 = {"ࠃ"}, d2 = {"ࠄ", "ࠅ", "ࠆ", "", "ࠇ", "ࠈ", "ࠉ", "ࠊ", "ࠋ", "ࠌ", "ࠍ", "ࠎ", "ࠏ", "ࠐ", "ࠑ", "ࠒ", "ࠓ", "ࠔ", "", "ࠕ", "ࠖ", "ࠗ", "࠘", "࠙", "ࠚ", "ࠛ", "ࠜ", "ࠝ", "ࠞ", "ࠟ", "ࠠ", "ࠡ", "ࠢ", "ࠣ", "ࠤ", "", "ࠥ", "ࠦ", "", "ࠧ", "ࠨ", "", "ࠩ", "ࠪ", "ࠫ", "ࠬ", "࠭", "\u082e", "\u082f", "࠰", "࠱", "࠲", "࠳", "࠴", "࠵", "࠶", "࠷", "࠸", "࠹", "࠺", "࠻", "࠼", "࠽", "࠾", "\u083f", "ࡀ", "ࡁ", "ࡂ", "ࡃ", "ࡄ", "ࡅ", "ࡆ", "ࡇ", "ࡈ", "ࡉ", "ࡊ", "ࡋ", "ࡌ", "ࡍ", "ࡎ", "ࡏ", "ࡐ", "ࡑ", "ࡒ", "ࡓ"}, k = 1, mv = {1, 8, 0})
final class GraphicsLayerElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f19726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f19727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f19728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f19729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f19730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f19731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f19732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f19733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p141o0.e2 f19734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f19735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f19736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f19737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19738q;

    private GraphicsLayerElement(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, p141o0.e2 e2Var, boolean z6, p141o0.Z1 z10, long j10, long j11, int i6) {
        this.f19723b = f6;
        this.f19724c = f10;
        this.f19725d = f11;
        this.f19726e = f12;
        this.f19727f = f13;
        this.f19728g = f14;
        this.f19729h = f15;
        this.f19730i = f16;
        this.f19731j = f17;
        this.f19732k = f18;
        this.f19733l = j6;
        this.f19734m = e2Var;
        this.f19735n = z6;
        this.f19736o = j10;
        this.f19737p = j11;
        this.f19738q = i6;
    }

    public /* synthetic */ GraphicsLayerElement(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, p141o0.e2 e2Var, boolean z6, p141o0.Z1 z10, long j10, long j11, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, f13, f14, f15, f16, f17, f18, j6, e2Var, z6, z10, j10, j11, i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.graphics.GraphicsLayerElement)) {
            return false;
        }
        androidx.compose.ui.graphics.GraphicsLayerElement graphicsLayerElement = (androidx.compose.ui.graphics.GraphicsLayerElement) obj;
        return java.lang.Float.compare(this.f19723b, graphicsLayerElement.f19723b) == 0 && java.lang.Float.compare(this.f19724c, graphicsLayerElement.f19724c) == 0 && java.lang.Float.compare(this.f19725d, graphicsLayerElement.f19725d) == 0 && java.lang.Float.compare(this.f19726e, graphicsLayerElement.f19726e) == 0 && java.lang.Float.compare(this.f19727f, graphicsLayerElement.f19727f) == 0 && java.lang.Float.compare(this.f19728g, graphicsLayerElement.f19728g) == 0 && java.lang.Float.compare(this.f19729h, graphicsLayerElement.f19729h) == 0 && java.lang.Float.compare(this.f19730i, graphicsLayerElement.f19730i) == 0 && java.lang.Float.compare(this.f19731j, graphicsLayerElement.f19731j) == 0 && java.lang.Float.compare(this.f19732k, graphicsLayerElement.f19732k) == 0 && androidx.compose.ui.graphics.f.e(this.f19733l, graphicsLayerElement.f19733l) && p247y7.AbstractC7350t.b(this.f19734m, graphicsLayerElement.f19734m) && this.f19735n == graphicsLayerElement.f19735n && p247y7.AbstractC7350t.b(null, null) && p141o0.C7016y0.o(this.f19736o, graphicsLayerElement.f19736o) && p141o0.C7016y0.o(this.f19737p, graphicsLayerElement.f19737p) && androidx.compose.ui.graphics.a.e(this.f19738q, graphicsLayerElement.f19738q);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((java.lang.Float.floatToIntBits(this.f19723b) * 31) + java.lang.Float.floatToIntBits(this.f19724c)) * 31) + java.lang.Float.floatToIntBits(this.f19725d)) * 31) + java.lang.Float.floatToIntBits(this.f19726e)) * 31) + java.lang.Float.floatToIntBits(this.f19727f)) * 31) + java.lang.Float.floatToIntBits(this.f19728g)) * 31) + java.lang.Float.floatToIntBits(this.f19729h)) * 31) + java.lang.Float.floatToIntBits(this.f19730i)) * 31) + java.lang.Float.floatToIntBits(this.f19731j)) * 31) + java.lang.Float.floatToIntBits(this.f19732k)) * 31) + androidx.compose.ui.graphics.f.h(this.f19733l)) * 31) + this.f19734m.hashCode()) * 31) + p190t.h.a(this.f19735n)) * 961) + p141o0.C7016y0.u(this.f19736o)) * 31) + p141o0.C7016y0.u(this.f19737p)) * 31) + androidx.compose.ui.graphics.a.f(this.f19738q);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.graphics.e g() {
        return new androidx.compose.ui.graphics.e(this.f19723b, this.f19724c, this.f19725d, this.f19726e, this.f19727f, this.f19728g, this.f19729h, this.f19730i, this.f19731j, this.f19732k, this.f19733l, this.f19734m, this.f19735n, null, this.f19736o, this.f19737p, this.f19738q, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.ui.graphics.e eVar) {
        eVar.h(this.f19723b);
        eVar.g(this.f19724c);
        eVar.b(this.f19725d);
        eVar.j(this.f19726e);
        eVar.e(this.f19727f);
        eVar.p(this.f19728g);
        eVar.n(this.f19729h);
        eVar.c(this.f19730i);
        eVar.d(this.f19731j);
        eVar.m(this.f19732k);
        eVar.T0(this.f19733l);
        eVar.l0(this.f19734m);
        eVar.A(this.f19735n);
        eVar.l(null);
        eVar.w(this.f19736o);
        eVar.D(this.f19737p);
        eVar.q(this.f19738q);
        eVar.c2();
    }

    public java.lang.String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f19723b + ", scaleY=" + this.f19724c + ", alpha=" + this.f19725d + ", translationX=" + this.f19726e + ", translationY=" + this.f19727f + ", shadowElevation=" + this.f19728g + ", rotationX=" + this.f19729h + ", rotationY=" + this.f19730i + ", rotationZ=" + this.f19731j + ", cameraDistance=" + this.f19732k + ", transformOrigin=" + ((java.lang.Object) androidx.compose.ui.graphics.f.i(this.f19733l)) + ", shape=" + this.f19734m + ", clip=" + this.f19735n + ", renderEffect=" + ((java.lang.Object) null) + ", ambientShadowColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f19736o)) + ", spotShadowColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f19737p)) + ", compositingStrategy=" + ((java.lang.Object) androidx.compose.ui.graphics.a.g(this.f19738q)) + ')';
    }
}
