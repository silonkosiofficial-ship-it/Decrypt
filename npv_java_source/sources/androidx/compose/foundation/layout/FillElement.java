package androidx.compose.foundation.layout;

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
@kotlin.Metadata(d1 = {"͍"}, d2 = {"͎", "͏", "͐", "͑", "͒", "", "͓", "", "͔", "͕", "͖", "͗", "͘", "͙", "͚", "͛", "͜", "", "͝", "", "͞", "͟", "", "͠", "͡", "͢", "ͣ", "ͤ", "ͥ", "ͦ", "ͧ", "ͨ", "ͩ", "ͪ"}, k = 1, mv = {1, 8, 0})
final class FillElement extends F0.W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.FillElement.a f19184e = new androidx.compose.foundation.layout.FillElement.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.EnumC0781o f19185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f19187d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.foundation.layout.FillElement a(float f6) {
            return new androidx.compose.foundation.layout.FillElement(A.EnumC0781o.Vertical, f6, "fillMaxHeight");
        }

        public final androidx.compose.foundation.layout.FillElement b(float f6) {
            return new androidx.compose.foundation.layout.FillElement(A.EnumC0781o.Both, f6, "fillMaxSize");
        }

        public final androidx.compose.foundation.layout.FillElement c(float f6) {
            return new androidx.compose.foundation.layout.FillElement(A.EnumC0781o.Horizontal, f6, "fillMaxWidth");
        }
    }

    public FillElement(A.EnumC0781o enumC0781o, float f6, java.lang.String str) {
        this.f19185b = enumC0781o;
        this.f19186c = f6;
        this.f19187d = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.layout.FillElement)) {
            return false;
        }
        androidx.compose.foundation.layout.FillElement fillElement = (androidx.compose.foundation.layout.FillElement) obj;
        return this.f19185b == fillElement.f19185b && this.f19186c == fillElement.f19186c;
    }

    public int hashCode() {
        return (this.f19185b.hashCode() * 31) + java.lang.Float.floatToIntBits(this.f19186c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.g g() {
        return new androidx.compose.foundation.layout.g(this.f19185b, this.f19186c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.layout.g gVar) {
        gVar.T1(this.f19185b);
        gVar.U1(this.f19186c);
    }
}
