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
@kotlin.Metadata(d1 = {"০"}, d2 = {"১", "", "২", "৩", "৪", "৫", "", "৬", "৭", "৮", "", "৯", "ৰ", "", "", "ৱ", "৲", "৳", "৴", "", "৵", "৶", "৷", "৸", "৹", "৺", "৻", "ৼ", "৽", "৾", "\u09ff"}, k = 1, mv = {1, 9, 0})
public final class g implements java.lang.Comparable<p079h9.g> {
    public static final h9.g.a Companion = new h9.g.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final p079h9.g f46550D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p079h9.g f46551E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final p079h9.g f46552F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final p079h9.g f46553G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final j$.time.Instant f46554C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ p079h9.g h(h9.g.a aVar, java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                interfaceC6683n = p089i9.C6679j.b.f47537a.a();
            }
            return aVar.g(charSequence, interfaceC6683n);
        }

        public final p079h9.g a(long j6) {
            j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(j6);
            p247y7.AbstractC7350t.e(instantOfEpochMilli, "ofEpochMilli(...)");
            return new p079h9.g(instantOfEpochMilli);
        }

        public final p079h9.g b(long j6, int i6) {
            return c(j6, i6);
        }

        public final p079h9.g c(long j6, long j10) throws java.lang.Exception {
            try {
                j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(j6, j10);
                p247y7.AbstractC7350t.e(instantOfEpochSecond, "ofEpochSecond(...)");
                return new p079h9.g(instantOfEpochSecond);
            } catch (java.lang.Exception e6) {
                if ((e6 instanceof java.lang.ArithmeticException) || (e6 instanceof j$.time.DateTimeException)) {
                    return j6 > 0 ? d() : e();
                }
                throw e6;
            }
        }

        public final p079h9.g d() {
            return p079h9.g.f46553G;
        }

        public final p079h9.g e() {
            return p079h9.g.f46552F;
        }

        public final p079h9.g f() {
            j$.time.Instant instant = j$.time.Clock.systemUTC().instant();
            p247y7.AbstractC7350t.e(instant, "instant(...)");
            return new p079h9.g(instant);
        }

        public final p079h9.g g(java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(charSequence, "input");
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            try {
                return ((p089i9.C6679j) interfaceC6683n.b(charSequence)).d();
            } catch (java.lang.IllegalArgumentException e6) {
                throw new p079h9.c("Failed to parse an instant from '" + ((java.lang.Object) charSequence) + '\'', e6);
            }
        }

        public final p199t9.b serializer() {
            return p139n9.b.f52076a;
        }
    }

    static {
        j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(-3217862419201L, 999999999L);
        p247y7.AbstractC7350t.e(instantOfEpochSecond, "ofEpochSecond(...)");
        f46550D = new p079h9.g(instantOfEpochSecond);
        j$.time.Instant instantOfEpochSecond2 = j$.time.Instant.ofEpochSecond(3093527980800L, 0L);
        p247y7.AbstractC7350t.e(instantOfEpochSecond2, "ofEpochSecond(...)");
        f46551E = new p079h9.g(instantOfEpochSecond2);
        j$.time.Instant instant = j$.time.Instant.MIN;
        p247y7.AbstractC7350t.e(instant, "MIN");
        f46552F = new p079h9.g(instant);
        j$.time.Instant instant2 = j$.time.Instant.MAX;
        p247y7.AbstractC7350t.e(instant2, "MAX");
        f46553G = new p079h9.g(instant2);
    }

    public g(j$.time.Instant instant) {
        p247y7.AbstractC7350t.f(instant, "value");
        this.f46554C = instant;
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof p079h9.g) && p247y7.AbstractC7350t.b(this.f46554C, ((p079h9.g) obj).f46554C));
    }

    public int hashCode() {
        return this.f46554C.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(p079h9.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "other");
        return this.f46554C.compareTo(gVar.f46554C);
    }

    public final long m() {
        return this.f46554C.getEpochSecond();
    }

    public final j$.time.Instant n() {
        return this.f46554C;
    }

    public final long o() {
        try {
            return this.f46554C.toEpochMilli();
        } catch (java.lang.ArithmeticException unused) {
            return this.f46554C.isAfter(j$.time.Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public java.lang.String toString() {
        java.lang.String string = this.f46554C.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
