package org.jetbrains.compose.resources;

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
@kotlin.Metadata(d1 = {"સ"}, d2 = {"હ", "\u0aba", "\u0abb", "઼", "", "ઽ", "ા", "િ", "ી", "ુ", "ૂ", "ૃ", "ૄ", "ૅ", "\u0ac6", "ે", "", "", "ૈ", "ૉ", "\u0aca", "ો", "ૌ", "્", "\u0ace", "\u0acf", "ૐ", "\u0ad1", "\u0ad2", "\u0ad3", "\u0ad4", "", "\u0ad5", "\u0ad6", "\u0ad7", "\u0ad8", "\u0ad9", "\u0ada", "\u0adb"}, k = 1, mv = {1, 9, 0})
public final class AndroidContextProvider extends android.content.ContentProvider {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final org.jetbrains.compose.resources.AndroidContextProvider.a f52606C = new org.jetbrains.compose.resources.AndroidContextProvider.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static android.content.Context f52607D;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final android.content.Context a() {
            return org.jetbrains.compose.resources.AndroidContextProvider.f52607D;
        }

        public final void b(android.content.Context context) {
            org.jetbrains.compose.resources.AndroidContextProvider.f52607D = context;
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        p247y7.AbstractC7350t.f(context, "context");
        if (providerInfo == null) {
            throw new java.lang.NullPointerException("AndroidContextProvider ProviderInfo cannot be null.");
        }
        if (p247y7.AbstractC7350t.b("org.jetbrains.compose.components.resources.resources.AndroidContextProvider", providerInfo.authority)) {
            throw new java.lang.IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable your application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        p247y7.AbstractC7350t.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        p247y7.AbstractC7350t.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f52607D = getContext();
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        p247y7.AbstractC7350t.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(uri, "uri");
        return 0;
    }
}
