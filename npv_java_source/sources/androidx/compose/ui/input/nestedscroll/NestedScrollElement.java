package androidx.compose.ui.input.nestedscroll;

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
@kotlin.Metadata(d1 = {"\u0872"}, d2 = {"\u0873", "\u0874", "\u0875", "\u0876", "\u0877", "\u0878", "\u0879", "\u087a", "\u087b", "\u087c", "\u087d", "\u087e", "\u087f", "\u0880", "\u0881", "", "\u0882", "\u0883", "", "\u0884", "", "\u0885", "\u0886", "\u0887", "\u0888", "\u0889", "\u088a", "\u088b", "\u088c", "\u088d", "\u088e", "\u088f"}, k = 1, mv = {1, 8, 0})
final class NestedScrollElement extends F0.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p241y0.b f19791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p241y0.c f19792c;

    public NestedScrollElement(p241y0.b bVar, p241y0.c cVar) {
        this.f19791b = bVar;
        this.f19792c = cVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.compose.ui.input.nestedscroll.NestedScrollElement)) {
            return false;
        }
        androidx.compose.ui.input.nestedscroll.NestedScrollElement nestedScrollElement = (androidx.compose.ui.input.nestedscroll.NestedScrollElement) obj;
        return p247y7.AbstractC7350t.b(nestedScrollElement.f19791b, this.f19791b) && p247y7.AbstractC7350t.b(nestedScrollElement.f19792c, this.f19792c);
    }

    public int hashCode() {
        int iHashCode = this.f19791b.hashCode() * 31;
        p241y0.c cVar = this.f19792c;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p241y0.d g() {
        return new p241y0.d(this.f19791b, this.f19792c);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(p241y0.d dVar) {
        dVar.a2(this.f19791b, this.f19792c);
    }
}
