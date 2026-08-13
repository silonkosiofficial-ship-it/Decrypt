package androidx.lifecycle;

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
@kotlin.Metadata(d1 = {"X"}, d2 = {"Y", "Z", "[", "\\", "]", "^", "_", "`", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"}, k = 1, mv = {1, 8, 0})
public class F extends android.app.Fragment {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final androidx.lifecycle.F.b f22752D = new androidx.lifecycle.F.b(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.lifecycle.F.a f22753C;

    public interface a {
        void a();

        void onCreate();

        void onResume();
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(android.app.Activity activity, androidx.lifecycle.AbstractC2079k.a aVar) {
            p247y7.AbstractC7350t.f(activity, "activity");
            p247y7.AbstractC7350t.f(aVar, "event");
            if (activity instanceof androidx.lifecycle.r) {
                androidx.lifecycle.AbstractC2079k abstractC2079kU = ((androidx.lifecycle.r) activity).u();
                if (abstractC2079kU instanceof androidx.lifecycle.C2087t) {
                    ((androidx.lifecycle.C2087t) abstractC2079kU).i(aVar);
                }
            }
        }

        public final androidx.lifecycle.F b(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "<this>");
            android.app.Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            p247y7.AbstractC7350t.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (androidx.lifecycle.F) fragmentFindFragmentByTag;
        }

        public final void c(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.lifecycle.F.c.Companion.a(activity);
            }
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new androidx.lifecycle.F(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class c implements android.app.Application.ActivityLifecycleCallbacks {
        public static final androidx.lifecycle.F.c.a Companion = new androidx.lifecycle.F.c.a(null);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final void a(android.app.Activity activity) {
                p247y7.AbstractC7350t.f(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.F.c());
            }
        }

        public static final void registerIn(android.app.Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            p247y7.AbstractC7350t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.a(activity, androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.a(activity, androidx.lifecycle.AbstractC2079k.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.a(activity, androidx.lifecycle.AbstractC2079k.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.a(activity, androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.a(activity, androidx.lifecycle.AbstractC2079k.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
            androidx.lifecycle.F.f22752D.a(activity, androidx.lifecycle.AbstractC2079k.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            p247y7.AbstractC7350t.f(activity, "activity");
            p247y7.AbstractC7350t.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            p247y7.AbstractC7350t.f(activity, "activity");
        }
    }

    private final void a(androidx.lifecycle.AbstractC2079k.a aVar) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            androidx.lifecycle.F.b bVar = f22752D;
            android.app.Activity activity = getActivity();
            p247y7.AbstractC7350t.e(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(androidx.lifecycle.F.a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(androidx.lifecycle.F.a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void d(androidx.lifecycle.F.a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e(androidx.lifecycle.F.a aVar) {
        this.f22753C = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f22753C);
        a(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
        this.f22753C = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(androidx.lifecycle.AbstractC2079k.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(this.f22753C);
        a(androidx.lifecycle.AbstractC2079k.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        d(this.f22753C);
        a(androidx.lifecycle.AbstractC2079k.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
    }
}
