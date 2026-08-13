package p079h9;

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
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0adc"}, d2 = {"\u0add", "\u0ade", "\u0adf", "ૠ", "ૡ", "ૢ", "ૣ", "\u0ae4", "\u0ae5", "૦", "૧", "૨", "૩", "૪", "૫", "૬"}, k = 1, mv = {1, 9, 0})
public final class e extends p079h9.o {
    public static final h9.e.a Companion = new h9.e.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p079h9.r f46549c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p199t9.b serializer() {
            return p139n9.a.f52074a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(p079h9.r rVar) {
        this(rVar, rVar.b());
        p247y7.AbstractC7350t.f(rVar, "offset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p079h9.r rVar, j$.time.ZoneId zoneId) {
        super(zoneId);
        p247y7.AbstractC7350t.f(rVar, "offset");
        p247y7.AbstractC7350t.f(zoneId, "zoneId");
        this.f46549c = rVar;
    }
}
