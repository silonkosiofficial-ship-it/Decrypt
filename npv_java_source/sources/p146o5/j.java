package p146o5;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z5.a f52550a = new B5.d().j(p136n5.C6937a.f51527a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        java.lang.Object a(android.util.JsonReader jsonReader);
    }

    private static n5.F.e.d.f A(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.f.a aVarA = n5.F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new o5.j.a() { // from class: o5.f
                    @Override // o5.j.a
                    public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                        return p146o5.j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.e.d.a.b.AbstractC0658d B(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a abstractC0659aA = n5.F.e.d.a.b.AbstractC0658d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC0659aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0659aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0659aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0659aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.e.d.a.b.AbstractC0660e C(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a abstractC0661aA = n5.F.e.d.a.b.AbstractC0660e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0661aA.b(n(jsonReader, new p146o5.i()));
                    break;
                case "name":
                    abstractC0661aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0661aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0661aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.d.b D(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.d.b.a aVarA = n5.F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(android.util.Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.d E(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.d.a aVarA = n5.F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new o5.j.a() { // from class: o5.e
                    @Override // o5.j.a
                    public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                        return p146o5.j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.e.AbstractC0667e F(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.AbstractC0667e.a aVarA = n5.F.e.AbstractC0667e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.e.d.a.c G(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.c.AbstractC0664a abstractC0664aA = n5.F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    abstractC0664aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0664aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0664aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0664aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0664aA.a();
    }

    private static p136n5.F H(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.b bVarB = p136n5.F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    private static n5.F.e.d.AbstractC0666e.b I(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.AbstractC0666e.b.a aVarA = n5.F.e.d.AbstractC0666e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.e J(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.b bVarA = n5.F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(android.util.Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(java.lang.Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new o5.j.a() { // from class: o5.d
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(K(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static n5.F.e.f K(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.f.a aVarA = n5.F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.e.a l(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.a.AbstractC0652a abstractC0652aA = n5.F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC0652aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0652aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0652aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0652aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0652aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0652aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0652aA.a();
    }

    private static n5.F.a m(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.a.b bVarA = n5.F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new o5.j.a() { // from class: o5.a
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static java.util.List n(android.util.JsonReader jsonReader, o5.j.a aVar) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.a.AbstractC0650a o(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.a.AbstractC0650a.AbstractC0651a abstractC0651aA = n5.F.a.AbstractC0650a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC0651aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0651aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0651aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0651aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.c p(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.c.a aVarA = n5.F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.e.c q(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.c.a aVarA = n5.F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.e.d r(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.b bVarA = n5.F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static n5.F.e.d.a s(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.AbstractC0653a abstractC0653aA = n5.F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0653aA.b(n(jsonReader, new o5.j.a() { // from class: o5.c
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0653aA.c(java.lang.Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0653aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0653aA.g(n(jsonReader, new o5.j.a() { // from class: o5.b
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0653aA.e(n(jsonReader, new o5.j.a() { // from class: o5.b
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0653aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0653aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0653aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.e.d.a.b.AbstractC0654a t(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a abstractC0655aA = n5.F.e.d.a.b.AbstractC0654a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC0655aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0655aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0655aA.f(android.util.Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0655aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0655aA.a();
    }

    private static n5.F.e.d.c u(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.c.a aVarA = n5.F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(java.lang.Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static n5.F.e.d.a.b v(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.b.AbstractC0656b abstractC0656bA = n5.F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0656bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC0656bA.f(n(jsonReader, new o5.j.a() { // from class: o5.g
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0656bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC0656bA.c(n(jsonReader, new o5.j.a() { // from class: o5.h
                        @Override // o5.j.a
                        public final java.lang.Object a(android.util.JsonReader jsonReader2) {
                            return p146o5.j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0656bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0656bA.a();
    }

    private static n5.F.e.d.a.b.c w(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.b.c.AbstractC0657a abstractC0657aA = n5.F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0657aA.c(n(jsonReader, new p146o5.i()));
                    break;
                case "reason":
                    abstractC0657aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0657aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0657aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0657aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0657aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b x(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a abstractC0663aA = n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC0663aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0663aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0663aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0663aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0663aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0663aA.a();
    }

    private static n5.F.e.d.AbstractC0665d y(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.AbstractC0665d.a aVarA = n5.F.e.d.AbstractC0665d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n5.F.e.d.AbstractC0666e z(android.util.JsonReader jsonReader) throws java.io.IOException {
        n5.F.e.d.AbstractC0666e.a aVarA = n5.F.e.d.AbstractC0666e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(I(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public p136n5.F L(java.lang.String str) throws java.io.IOException {
        try {
            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
            try {
                p136n5.F fH = H(jsonReader);
                jsonReader.close();
                return fH;
            } catch (java.lang.Throwable th) {
                try {
                    jsonReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException e6) {
            throw new java.io.IOException(e6);
        }
    }

    public java.lang.String M(p136n5.F f6) {
        return f52550a.b(f6);
    }

    public n5.F.e.d j(java.lang.String str) throws java.io.IOException {
        try {
            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
            try {
                n5.F.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } catch (java.lang.Throwable th) {
                try {
                    jsonReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException e6) {
            throw new java.io.IOException(e6);
        }
    }

    public java.lang.String k(n5.F.e.d dVar) {
        return f52550a.b(dVar);
    }
}
