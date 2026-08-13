package com.google.firebase.sessions;

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
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0b64"}, d2 = {"\u0b65", "୦", "୧", "୨", "୩", "୪", "୫", "୬", "୭", "୮", "୯", "୰", "ୱ", "୲", "୳", "୴", "୵", "୶", "୷", "\u0b78", "\u0b79", "\u0b7a", "\u0b7b", "\u0b7c", "\u0b7d", "\u0b7e", "\u0b7f", "\u0b80", "\u0b81", "ஂ", "ஃ"}, k = 1, mv = {1, 8, 0})
public final class SessionLifecycleService extends android.app.Service {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final com.google.firebase.sessions.SessionLifecycleService.a f44216F = new com.google.firebase.sessions.SessionLifecycleService.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.HandlerThread f44217C = new android.os.HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.firebase.sessions.SessionLifecycleService.b f44218D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.os.Messenger f44219E;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class b extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f44220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f44221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.ArrayList f44222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(android.os.Looper looper) {
            super(looper);
            p247y7.AbstractC7350t.f(looper, "looper");
            this.f44222c = new java.util.ArrayList();
        }

        private final void a() {
            com.google.firebase.sessions.b.f44225a.a().a(com.google.firebase.sessions.c.f44227f.a().c());
            for (android.os.Messenger messenger : new java.util.ArrayList(this.f44222c)) {
                p247y7.AbstractC7350t.e(messenger, "it");
                f(messenger);
            }
        }

        private final void b(android.os.Message message) {
            java.lang.String str = "Activity backgrounding at " + message.getWhen();
            this.f44221b = message.getWhen();
        }

        private final void c(android.os.Message message) {
            this.f44222c.add(message.replyTo);
            android.os.Messenger messenger = message.replyTo;
            p247y7.AbstractC7350t.e(messenger, "msg.replyTo");
            f(messenger);
            java.lang.String str = "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f44222c.size();
        }

        private final void d(android.os.Message message) {
            java.lang.String str = "Activity foregrounding at " + message.getWhen() + '.';
            if (this.f44220a) {
                if (e(message.getWhen())) {
                }
                this.f44221b = message.getWhen();
            }
            this.f44220a = true;
            g();
            this.f44221b = message.getWhen();
        }

        private final boolean e(long j6) {
            return j6 - this.f44221b > T8.a.z(U5.f.f14515c.c().c());
        }

        private final void f(android.os.Messenger messenger) {
            java.lang.String strA;
            if (this.f44220a) {
                strA = com.google.firebase.sessions.c.f44227f.a().c().b();
            } else {
                strA = com.google.firebase.sessions.a.f44223a.a().a();
                if (strA == null) {
                    return;
                }
            }
            h(messenger, strA);
        }

        private final void g() {
            com.google.firebase.sessions.c.b bVar = com.google.firebase.sessions.c.f44227f;
            bVar.a().a();
            a();
            com.google.firebase.sessions.a.f44223a.a().b(bVar.a().c().b());
        }

        private final void h(android.os.Messenger messenger, java.lang.String str) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("SessionUpdateExtra", str);
                android.os.Message messageObtain = android.os.Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (android.os.DeadObjectException unused) {
                java.lang.String str2 = "Removing dead client from list: " + messenger;
                this.f44222c.remove(messenger);
            } catch (java.lang.Exception e6) {
                java.lang.String str3 = "Unable to push new session to " + messenger + '.';
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            p247y7.AbstractC7350t.f(message, "msg");
            if (this.f44221b > message.getWhen()) {
                java.lang.String str = "Ignoring old message from " + message.getWhen() + " which is older than " + this.f44221b + '.';
                return;
            }
            int i6 = message.what;
            if (i6 == 1) {
                d(message);
                return;
            }
            if (i6 == 2) {
                b(message);
                return;
            }
            if (i6 == 4) {
                c(message);
                return;
            }
            java.lang.String str2 = "Received unexpected event from the SessionLifecycleClient: " + message;
            super.handleMessage(message);
        }
    }

    private final android.os.Messenger a(android.content.Intent intent) {
        return (android.os.Messenger) (android.os.Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("ClientCallbackMessenger", android.os.Messenger.class) : intent.getParcelableExtra("ClientCallbackMessenger"));
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        java.lang.String str = "Service bound to new client on process " + intent.getAction();
        android.os.Messenger messengerA = a(intent);
        if (messengerA != null) {
            android.os.Message messageObtain = android.os.Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerA;
            com.google.firebase.sessions.SessionLifecycleService.b bVar = this.f44218D;
            if (bVar != null) {
                bVar.sendMessage(messageObtain);
            }
        }
        android.os.Messenger messenger = this.f44219E;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f44217C.start();
        android.os.Looper looper = this.f44217C.getLooper();
        p247y7.AbstractC7350t.e(looper, "handlerThread.looper");
        this.f44218D = new com.google.firebase.sessions.SessionLifecycleService.b(looper);
        this.f44219E = new android.os.Messenger(this.f44218D);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f44217C.quit();
    }
}
