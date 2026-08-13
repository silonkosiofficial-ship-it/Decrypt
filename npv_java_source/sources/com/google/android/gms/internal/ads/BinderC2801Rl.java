package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2801Rl extends com.google.android.gms.internal.ads.AbstractBinderC2909Ul {
    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final com.google.android.gms.internal.ads.InterfaceC2874Tm E(java.lang.String str) throws android.os.RemoteException {
        try {
            return new com.google.android.gms.internal.ads.BinderC3846gn((com.google.android.gms.ads.mediation.rtb.RtbAdapter) java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.AbstractC3018Xm.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (java.lang.Throwable unused) {
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final boolean Z(java.lang.String str) {
        try {
            return p244y3.a.class.isAssignableFrom(java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.BinderC2801Rl.class.getClassLoader()));
        } catch (java.lang.Throwable unused) {
            p224w3.p.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final boolean o(java.lang.String str) {
        try {
            return p254z3.a.class.isAssignableFrom(java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.BinderC2801Rl.class.getClassLoader()));
        } catch (java.lang.Throwable unused) {
            p224w3.p.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final com.google.android.gms.internal.ads.InterfaceC3053Yl y(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.BinderC5601wm binderC5601wm;
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.BinderC2801Rl.class.getClassLoader());
                if (p244y3.f.class.isAssignableFrom(cls)) {
                    return new com.google.android.gms.internal.ads.BinderC5601wm((p244y3.f) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (p244y3.a.class.isAssignableFrom(cls)) {
                    return new com.google.android.gms.internal.ads.BinderC5601wm((p244y3.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                p224w3.p.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new android.os.RemoteException();
            } catch (java.lang.Throwable th) {
                p224w3.p.h("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new android.os.RemoteException();
            }
        } catch (java.lang.Throwable unused) {
            p224w3.p.b("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    binderC5601wm = new com.google.android.gms.internal.ads.BinderC5601wm(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
                }
                throw new android.os.RemoteException();
            }
            binderC5601wm = new com.google.android.gms.internal.ads.BinderC5601wm(new com.google.ads.mediation.admob.AdMobAdapter());
            return binderC5601wm;
        }
    }
}
