package go;

/* JADX INFO: loaded from: classes3.dex */
public class Seq {
    static final go.Seq.RefTracker tracker;
    private static java.util.logging.Logger log = java.util.logging.Logger.getLogger("GoSeq");
    private static final int NULL_REFNUM = 41;
    public static final go.Seq.Ref nullRef = new go.Seq.Ref(NULL_REFNUM, null);
    private static final go.Seq.GoRefQueue goRefQueue = new go.Seq.GoRefQueue();

    public interface GoObject {
        int incRefnum();
    }

    static class GoRef extends java.lang.ref.PhantomReference<go.Seq.GoObject> {
        final int refnum;

        GoRef(int i6, go.Seq.GoObject goObject, go.Seq.GoRefQueue goRefQueue) {
            super(goObject, goRefQueue);
            if (i6 <= 0) {
                this.refnum = i6;
                return;
            }
            throw new java.lang.RuntimeException("GoRef instantiated with a Java refnum " + i6);
        }
    }

    static class GoRefQueue extends java.lang.ref.ReferenceQueue<go.Seq.GoObject> {
        private final java.util.Collection<go.Seq.GoRef> refs = j$.util.DesugarCollections.synchronizedCollection(new java.util.HashSet());

        GoRefQueue() {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: go.Seq.GoRefQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            go.Seq.GoRef goRef = (go.Seq.GoRef) go.Seq.GoRefQueue.this.remove();
                            go.Seq.GoRefQueue.this.refs.remove(goRef);
                            go.Seq.destroyRef(goRef.refnum);
                            goRef.clear();
                        } catch (java.lang.InterruptedException unused) {
                        }
                    }
                }
            });
            thread.setDaemon(true);
            thread.setName("GoRefQueue Finalizer Thread");
            thread.start();
        }

        void track(int i6, go.Seq.GoObject goObject) {
            this.refs.add(new go.Seq.GoRef(i6, goObject, this));
        }
    }

    public interface Proxy extends go.Seq.GoObject {
    }

    public static final class Ref {
        public final java.lang.Object obj;
        private int refcnt;
        public final int refnum;

        Ref(int i6, java.lang.Object obj) {
            if (i6 >= 0) {
                this.refnum = i6;
                this.refcnt = 0;
                this.obj = obj;
            } else {
                throw new java.lang.RuntimeException("Ref instantiated with a Go refnum " + i6);
            }
        }

        static /* synthetic */ int access$110(go.Seq.Ref ref) {
            int i6 = ref.refcnt;
            ref.refcnt = i6 - 1;
            return i6;
        }

        void inc() {
            int i6 = this.refcnt;
            if (i6 != Integer.MAX_VALUE) {
                this.refcnt = i6 + 1;
                return;
            }
            throw new java.lang.RuntimeException("refnum " + this.refnum + " overflow");
        }
    }

    static final class RefMap {
        private int next = 0;
        private int live = 0;
        private int[] keys = new int[16];
        private go.Seq.Ref[] objs = new go.Seq.Ref[16];

        RefMap() {
        }

        private void grow() {
            go.Seq.Ref[] refArr;
            int iRoundPow2 = roundPow2(this.live) * 2;
            int[] iArr = this.keys;
            if (iRoundPow2 > iArr.length) {
                iArr = new int[iArr.length * 2];
                refArr = new go.Seq.Ref[this.objs.length * 2];
            } else {
                refArr = this.objs;
            }
            int i6 = 0;
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.keys;
                if (i6 >= iArr2.length) {
                    break;
                }
                go.Seq.Ref ref = this.objs[i6];
                if (ref != null) {
                    iArr[i10] = iArr2[i6];
                    refArr[i10] = ref;
                    i10++;
                }
                i6++;
            }
            for (int i11 = i10; i11 < iArr.length; i11++) {
                iArr[i11] = 0;
                refArr[i11] = null;
            }
            this.keys = iArr;
            this.objs = refArr;
            this.next = i10;
            if (this.live == i10) {
                return;
            }
            throw new java.lang.RuntimeException("bad state: live=" + this.live + ", next=" + this.next);
        }

        private static int roundPow2(int i6) {
            int i10 = 1;
            while (i10 < i6) {
                i10 *= 2;
            }
            return i10;
        }

        go.Seq.Ref get(int i6) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i6);
            if (iBinarySearch >= 0) {
                return this.objs[iBinarySearch];
            }
            return null;
        }

        void put(int i6, go.Seq.Ref ref) {
            if (ref == null) {
                throw new java.lang.RuntimeException("put a null ref (with key " + i6 + ")");
            }
            int iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i6);
            if (iBinarySearch >= 0) {
                go.Seq.Ref[] refArr = this.objs;
                if (refArr[iBinarySearch] == null) {
                    refArr[iBinarySearch] = ref;
                    this.live++;
                }
                if (refArr[iBinarySearch] == ref) {
                    return;
                }
                throw new java.lang.RuntimeException("replacing an existing ref (with key " + i6 + ")");
            }
            if (this.next >= this.keys.length) {
                grow();
                iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i6);
            }
            int i10 = ~iBinarySearch;
            int i11 = this.next;
            if (i10 < i11) {
                int[] iArr = this.keys;
                int i12 = i10 + 1;
                java.lang.System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
                go.Seq.Ref[] refArr2 = this.objs;
                java.lang.System.arraycopy(refArr2, i10, refArr2, i12, this.next - i10);
            }
            this.keys[i10] = i6;
            this.objs[i10] = ref;
            this.live++;
            this.next++;
        }

        void remove(int i6) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i6);
            if (iBinarySearch >= 0) {
                go.Seq.Ref[] refArr = this.objs;
                if (refArr[iBinarySearch] != null) {
                    refArr[iBinarySearch] = null;
                    this.live--;
                }
            }
        }
    }

    static final class RefTracker {
        private static final int REF_OFFSET = 42;
        private int next = REF_OFFSET;
        private final go.Seq.RefMap javaObjs = new go.Seq.RefMap();
        private final java.util.IdentityHashMap<java.lang.Object, java.lang.Integer> javaRefs = new java.util.IdentityHashMap<>();

        RefTracker() {
        }

        synchronized void dec(int i6) {
            try {
                if (i6 <= 0) {
                    go.Seq.log.severe("dec request for Go object " + i6);
                    return;
                }
                if (i6 == go.Seq.nullRef.refnum) {
                    return;
                }
                go.Seq.Ref ref = this.javaObjs.get(i6);
                if (ref == null) {
                    throw new java.lang.RuntimeException("referenced Java object is not found: refnum=" + i6);
                }
                go.Seq.Ref.access$110(ref);
                if (ref.refcnt <= 0) {
                    this.javaObjs.remove(i6);
                    this.javaRefs.remove(ref.obj);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        synchronized go.Seq.Ref get(int i6) {
            try {
                if (i6 < 0) {
                    throw new java.lang.RuntimeException("ref called with Go refnum " + i6);
                }
                if (i6 == go.Seq.NULL_REFNUM) {
                    return go.Seq.nullRef;
                }
                go.Seq.Ref ref = this.javaObjs.get(i6);
                if (ref != null) {
                    return ref;
                }
                throw new java.lang.RuntimeException("unknown java Ref: " + i6);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        synchronized int inc(java.lang.Object obj) {
            if (obj == null) {
                return go.Seq.NULL_REFNUM;
            }
            if (obj instanceof go.Seq.Proxy) {
                return ((go.Seq.Proxy) obj).incRefnum();
            }
            java.lang.Integer numValueOf = this.javaRefs.get(obj);
            if (numValueOf == null) {
                int i6 = this.next;
                if (i6 == Integer.MAX_VALUE) {
                    throw new java.lang.RuntimeException("createRef overflow for " + obj);
                }
                this.next = i6 + 1;
                numValueOf = java.lang.Integer.valueOf(i6);
                this.javaRefs.put(obj, numValueOf);
            }
            int iIntValue = numValueOf.intValue();
            go.Seq.Ref ref = this.javaObjs.get(iIntValue);
            if (ref == null) {
                ref = new go.Seq.Ref(iIntValue, obj);
                this.javaObjs.put(iIntValue, ref);
            }
            ref.inc();
            return iIntValue;
        }

        synchronized void incRefnum(int i6) {
            go.Seq.Ref ref = this.javaObjs.get(i6);
            if (ref == null) {
                throw new java.lang.RuntimeException("referenced Java object is not found: refnum=" + i6);
            }
            ref.inc();
        }
    }

    static {
        java.lang.System.loadLibrary("gojni");
        init();
        go.Universe.touch();
        tracker = new go.Seq.RefTracker();
    }

    private Seq() {
    }

    static void decRef(int i6) {
        tracker.dec(i6);
    }

    static native void destroyRef(int i6);

    public static go.Seq.Ref getRef(int i6) {
        return tracker.get(i6);
    }

    public static int incGoObjectRef(go.Seq.GoObject goObject) {
        return goObject.incRefnum();
    }

    public static native void incGoRef(int i6, go.Seq.GoObject goObject);

    public static int incRef(java.lang.Object obj) {
        return tracker.inc(obj);
    }

    public static void incRefnum(int i6) {
        tracker.incRefnum(i6);
    }

    private static native void init();

    public static void setContext(android.content.Context context) {
        setContext((java.lang.Object) context);
    }

    static native void setContext(java.lang.Object obj);

    public static void touch() {
    }

    public static void trackGoRef(int i6, go.Seq.GoObject goObject) {
        if (i6 <= 0) {
            goRefQueue.track(i6, goObject);
            return;
        }
        throw new java.lang.RuntimeException("trackGoRef called with Java refnum " + i6);
    }
}
