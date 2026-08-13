package androidx.room;

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
@kotlin.Metadata(d1 = {"w"}, d2 = {"x", "y", "z", "{", "|", "}", "~", "\u007f", "\u0080", "", "\u0081", "\u0082", "\u0083", "\u0084", "\u0085", "\u0086", "\u0087", "", "", "\u0088", "\u0089", "\u008a", "\u008b", "\u008c", "\u008d", "\u008e", "\u008f", "\u0090", "\u0091", "\u0092", "\u0093", "\u0094", "\u0095", "\u0096", "\u0097", "\u0098"}, k = 1, mv = {1, 8, 0})
public final class MultiInstanceInvalidationService extends android.app.Service {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f23454C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f23455D = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.os.RemoteCallbackList f23456E = new androidx.room.MultiInstanceInvalidationService.b();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.room.b.a f23457F = new androidx.room.MultiInstanceInvalidationService.a();

    public static final class a extends androidx.room.b.a {
        a() {
        }

        @Override // androidx.room.b
        public void G5(int i6, java.lang.String[] strArr) {
            p247y7.AbstractC7350t.f(strArr, "tables");
            android.os.RemoteCallbackList remoteCallbackListA = androidx.room.MultiInstanceInvalidationService.this.a();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                java.lang.String str = (java.lang.String) multiInstanceInvalidationService.b().get(java.lang.Integer.valueOf(i6));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        java.lang.Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i10);
                        p247y7.AbstractC7350t.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        java.lang.Integer num = (java.lang.Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        java.lang.String str2 = (java.lang.String) multiInstanceInvalidationService.b().get(num);
                        if (i6 != iIntValue && p247y7.AbstractC7350t.b(str, str2)) {
                            try {
                                ((androidx.room.a) multiInstanceInvalidationService.a().getBroadcastItem(i10)).x1(strArr);
                            } catch (android.os.RemoteException e6) {
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }

        @Override // androidx.room.b
        public void Y5(androidx.room.a aVar, int i6) {
            p247y7.AbstractC7350t.f(aVar, "callback");
            android.os.RemoteCallbackList remoteCallbackListA = androidx.room.MultiInstanceInvalidationService.this.a();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                multiInstanceInvalidationService.a().unregister(aVar);
            }
        }

        @Override // androidx.room.b
        public int g2(androidx.room.a aVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(aVar, "callback");
            int i6 = 0;
            if (str == null) {
                return 0;
            }
            android.os.RemoteCallbackList remoteCallbackListA = androidx.room.MultiInstanceInvalidationService.this.a();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int iC = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(aVar, java.lang.Integer.valueOf(iC))) {
                        multiInstanceInvalidationService.b().put(java.lang.Integer.valueOf(iC), str);
                        i6 = iC;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return i6;
        }
    }

    public static final class b extends android.os.RemoteCallbackList {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.a aVar, java.lang.Object obj) {
            p247y7.AbstractC7350t.f(aVar, "callback");
            p247y7.AbstractC7350t.f(obj, "cookie");
            androidx.room.MultiInstanceInvalidationService.this.b().remove((java.lang.Integer) obj);
        }
    }

    public final android.os.RemoteCallbackList a() {
        return this.f23456E;
    }

    public final java.util.Map b() {
        return this.f23455D;
    }

    public final int c() {
        return this.f23454C;
    }

    public final void d(int i6) {
        this.f23454C = i6;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p247y7.AbstractC7350t.f(intent, "intent");
        return this.f23457F;
    }
}
