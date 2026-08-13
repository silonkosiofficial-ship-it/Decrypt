package androidx.compose.material3;

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
@kotlin.Metadata(d1 = {"ٳ"}, d2 = {"ٴ", "ٵ", "ٶ", "ٷ", "ٸ", "", "ٹ", "ٺ", "ٻ", "ټ", "ٽ", "پ", "ٿ", "ڀ", "ځ", "ڂ", "ڃ", "", "ڄ", "څ", "", "چ", "ڇ", "", "ڈ", "ډ", "ڊ", "ڋ", "ڌ", "ڍ", "ڎ", "ڏ", "ڐ", "ڑ"}, k = 1, mv = {1, 8, 0})
public final class ClockDialModifier extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S.C1537c f19575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19577d;

    private ClockDialModifier(S.C1537c c1537c, boolean z6, int i6) {
        this.f19575b = c1537c;
        this.f19576c = z6;
        this.f19577d = i6;
    }

    public /* synthetic */ ClockDialModifier(S.C1537c c1537c, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1537c, z6, i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.material3.ClockDialModifier)) {
            return false;
        }
        androidx.compose.material3.ClockDialModifier clockDialModifier = (androidx.compose.material3.ClockDialModifier) obj;
        return p247y7.AbstractC7350t.b(this.f19575b, clockDialModifier.f19575b) && this.f19576c == clockDialModifier.f19576c && S.s1.f(this.f19577d, clockDialModifier.f19577d);
    }

    public int hashCode() {
        return (((this.f19575b.hashCode() * 31) + p190t.h.a(this.f19576c)) * 31) + S.s1.g(this.f19577d);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public S.C1589y g() {
        return new S.C1589y(this.f19575b, this.f19576c, this.f19577d, null);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(S.C1589y c1589y) {
        c1589y.i2(this.f19575b, this.f19576c, this.f19577d);
    }

    public java.lang.String toString() {
        return "ClockDialModifier(state=" + this.f19575b + ", autoSwitchToMinute=" + this.f19576c + ", selection=" + ((java.lang.Object) S.s1.h(this.f19577d)) + ')';
    }
}
