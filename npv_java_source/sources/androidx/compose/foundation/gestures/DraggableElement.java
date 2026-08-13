package androidx.compose.foundation.gestures;

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
@kotlin.Metadata(d1 = {"ʔ"}, d2 = {"ʕ", "ʖ", "ʗ", "ʘ", "ʙ", "ʚ", "ʛ", "", "ʜ", "ʝ", "ʞ", "ʟ", "ʠ", "ʡ", "ʢ", "ʣ", "ʤ", "", "ʥ", "", "ʦ", "ʧ", "ʨ", "ʩ", "ʪ", "ʫ", "ʬ", "ʭ", "ʮ", "ʯ", "ʰ", "ʱ", "", "ʲ", "ʳ", "ʴ", "ʵ", "ʶ", "ʷ", "ʸ", "ʹ", "ʺ", "ʻ", "ʼ", "ʽ", "ʾ", "ʿ", "ˀ", "ˁ", "˂"}, k = 1, mv = {1, 8, 0})
public final class DraggableElement extends F0.W {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final androidx.compose.foundation.gestures.DraggableElement.b f18987j = new androidx.compose.foundation.gestures.DraggableElement.b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p237x7.l f18988k = androidx.compose.foundation.gestures.DraggableElement.a.f18997D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p230x.o f18989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p230x.s f18990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p250z.l f18992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.q f18994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p237x7.q f18995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f18996i;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.foundation.gestures.DraggableElement.a f18997D = new androidx.compose.foundation.gestures.DraggableElement.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p251z0.B b6) {
            return java.lang.Boolean.TRUE;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public DraggableElement(p230x.o oVar, p230x.s sVar, boolean z6, p250z.l lVar, boolean z10, p237x7.q qVar, p237x7.q qVar2, boolean z11) {
        this.f18989b = oVar;
        this.f18990c = sVar;
        this.f18991d = z6;
        this.f18992e = lVar;
        this.f18993f = z10;
        this.f18994g = qVar;
        this.f18995h = qVar2;
        this.f18996i = z11;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.gestures.DraggableElement.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.gestures.DraggableElement draggableElement = (androidx.compose.foundation.gestures.DraggableElement) obj;
        return p247y7.AbstractC7350t.b(this.f18989b, draggableElement.f18989b) && this.f18990c == draggableElement.f18990c && this.f18991d == draggableElement.f18991d && p247y7.AbstractC7350t.b(this.f18992e, draggableElement.f18992e) && this.f18993f == draggableElement.f18993f && p247y7.AbstractC7350t.b(this.f18994g, draggableElement.f18994g) && p247y7.AbstractC7350t.b(this.f18995h, draggableElement.f18995h) && this.f18996i == draggableElement.f18996i;
    }

    public int hashCode() {
        int iHashCode = ((((this.f18989b.hashCode() * 31) + this.f18990c.hashCode()) * 31) + p190t.h.a(this.f18991d)) * 31;
        p250z.l lVar = this.f18992e;
        return ((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + p190t.h.a(this.f18993f)) * 31) + this.f18994g.hashCode()) * 31) + this.f18995h.hashCode()) * 31) + p190t.h.a(this.f18996i);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.gestures.c g() {
        return new androidx.compose.foundation.gestures.c(this.f18989b, f18988k, this.f18990c, this.f18991d, this.f18992e, this.f18993f, this.f18994g, this.f18995h, this.f18996i);
    }

    @Override // F0.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(androidx.compose.foundation.gestures.c cVar) {
        cVar.B2(this.f18989b, f18988k, this.f18990c, this.f18991d, this.f18992e, this.f18993f, this.f18994g, this.f18995h, this.f18996i);
    }
}
