.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u13bd"
    }
    d2 = {
        "\u13be",
        "\u13bf",
        "\u13c0",
        "\u13c1",
        "",
        "\u13c2",
        "",
        "\u13c3",
        "\u13c4",
        "\u13c5",
        "\u13c6",
        "\u13c7",
        "\u13c8"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String;

.field private static final backgroundDispatcher:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field

.field private static final firebaseApp:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field

.field private static final sessionLifecycleServiceBinder:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field

.field private static final sessionsSettings:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field

.field private static final transportFactory:Le5/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le5/F;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "fire-sessions"

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->LIBRARY_NAME:Ljava/lang/String;

    new-instance v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>(Ly7/k;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const-class v0, LQ4/f;

    invoke-static {v0}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v1, "unqualified(FirebaseApp::class.java)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    const-class v0, LG5/e;

    invoke-static {v0}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v1, "unqualified(FirebaseInstallationsApi::class.java)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Le5/F;

    const-class v0, LU4/a;

    const-class v1, LW8/J;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v2, "qualified(Background::cl\u2026neDispatcher::class.java)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Le5/F;

    const-class v0, LU4/b;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v1, "qualified(Blocking::clas\u2026neDispatcher::class.java)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Le5/F;

    const-class v0, LW2/i;

    invoke-static {v0}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v1, "unqualified(TransportFactory::class.java)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Le5/F;

    const-class v0, LU5/f;

    invoke-static {v0}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v1, "unqualified(SessionsSettings::class.java)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Le5/F;

    const-class v0, LS5/F;

    invoke-static {v0}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-string v1, "unqualified(SessionLifec\u2026erviceBinder::class.java)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Le5/F;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le5/e;)Lcom/google/firebase/sessions/a;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$4(Le5/e;)Lcom/google/firebase/sessions/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Le5/e;)LS5/F;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$5(Le5/e;)LS5/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Le5/e;)LU5/f;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$3(Le5/e;)LU5/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Le5/e;)Lcom/google/firebase/sessions/b;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$2(Le5/e;)Lcom/google/firebase/sessions/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Le5/e;)Lcom/google/firebase/sessions/c;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(Le5/e;)Lcom/google/firebase/sessions/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Le5/e;)LS5/k;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(Le5/e;)LS5/k;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(Le5/e;)LS5/k;
    .locals 5

    new-instance v0, LS5/k;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    invoke-interface {p0, v1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LQ4/f;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Le5/F;

    invoke-interface {p0, v2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[sessionsSettings]"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LU5/f;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Le5/F;

    invoke-interface {p0, v3}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lm7/i;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Le5/F;

    invoke-interface {p0, v4}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    const-string v4, "container[sessionLifecycleServiceBinder]"

    invoke-static {p0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LS5/F;

    invoke-direct {v0, v1, v2, v3, p0}, LS5/k;-><init>(LQ4/f;LU5/f;Lm7/i;LS5/F;)V

    return-object v0
.end method

.method private static final getComponents$lambda$1(Le5/e;)Lcom/google/firebase/sessions/c;
    .locals 3

    new-instance p0, Lcom/google/firebase/sessions/c;

    sget-object v0, LS5/J;->a:LS5/J;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lcom/google/firebase/sessions/c;-><init>(LS5/I;Lx7/a;ILy7/k;)V

    return-object p0
.end method

.method private static final getComponents$lambda$2(Le5/e;)Lcom/google/firebase/sessions/b;
    .locals 7

    new-instance v6, LS5/B;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    invoke-interface {p0, v0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "container[firebaseApp]"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, LQ4/f;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Le5/F;

    invoke-interface {p0, v0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "container[firebaseInstallationsApi]"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, LG5/e;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Le5/F;

    invoke-interface {p0, v0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "container[sessionsSettings]"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, LU5/f;

    new-instance v4, LS5/g;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Le5/F;

    invoke-interface {p0, v0}, Le5/e;->f(Le5/F;)LF5/b;

    move-result-object v0

    const-string v5, "container.getProvider(transportFactory)"

    invoke-static {v0, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v0}, LS5/g;-><init>(LF5/b;)V

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Le5/F;

    invoke-interface {p0, v0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "container[backgroundDispatcher]"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Lm7/i;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LS5/B;-><init>(LQ4/f;LG5/e;LU5/f;LS5/h;Lm7/i;)V

    return-object v6
.end method

.method private static final getComponents$lambda$3(Le5/e;)LU5/f;
    .locals 5

    new-instance v0, LU5/f;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    invoke-interface {p0, v1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LQ4/f;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Le5/F;

    invoke-interface {p0, v2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[blockingDispatcher]"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm7/i;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Le5/F;

    invoke-interface {p0, v3}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lm7/i;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Le5/F;

    invoke-interface {p0, v4}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    const-string v4, "container[firebaseInstallationsApi]"

    invoke-static {p0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LG5/e;

    invoke-direct {v0, v1, v2, v3, p0}, LU5/f;-><init>(LQ4/f;Lm7/i;Lm7/i;LG5/e;)V

    return-object v0
.end method

.method private static final getComponents$lambda$4(Le5/e;)Lcom/google/firebase/sessions/a;
    .locals 3

    new-instance v0, LS5/x;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    invoke-interface {p0, v1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ4/f;

    invoke-virtual {v1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v1

    const-string v2, "container[firebaseApp].applicationContext"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Le5/F;

    invoke-interface {p0, v2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "container[backgroundDispatcher]"

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lm7/i;

    invoke-direct {v0, v1, p0}, LS5/x;-><init>(Landroid/content/Context;Lm7/i;)V

    return-object v0
.end method

.method private static final getComponents$lambda$5(Le5/e;)LS5/F;
    .locals 2

    new-instance v0, LS5/G;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    invoke-interface {p0, v1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "container[firebaseApp]"

    invoke-static {p0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LQ4/f;

    invoke-direct {v0, p0}, LS5/G;-><init>(LQ4/f;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le5/c;",
            ">;"
        }
    .end annotation

    const-class v0, LS5/k;

    invoke-static {v0}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v0

    const-string v1, "fire-sessions"

    invoke-virtual {v0, v1}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Le5/F;

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v3

    invoke-virtual {v0, v3}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Le5/F;

    invoke-static {v3}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v4

    invoke-virtual {v0, v4}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Le5/F;

    invoke-static {v4}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v5

    invoke-virtual {v0, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Le5/F;

    invoke-static {v5}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v5

    invoke-virtual {v0, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v5, LS5/m;

    invoke-direct {v5}, LS5/m;-><init>()V

    invoke-virtual {v0, v5}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->e()Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-class v5, Lcom/google/firebase/sessions/c;

    invoke-static {v5}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v5

    const-string v6, "session-generator"

    invoke-virtual {v5, v6}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v5

    new-instance v6, LS5/n;

    invoke-direct {v6}, LS5/n;-><init>()V

    invoke-virtual {v5, v6}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v5

    invoke-virtual {v5}, Le5/c$b;->d()Le5/c;

    move-result-object v5

    const-class v6, Lcom/google/firebase/sessions/b;

    invoke-static {v6}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v6

    const-string v7, "session-publisher"

    invoke-virtual {v6, v7}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v6

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v7

    invoke-virtual {v6, v7}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v6

    sget-object v7, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Le5/F;

    invoke-static {v7}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v6, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v6

    invoke-static {v3}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v3

    invoke-virtual {v6, v3}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    sget-object v6, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Le5/F;

    invoke-static {v6}, Le5/r;->k(Le5/F;)Le5/r;

    move-result-object v6

    invoke-virtual {v3, v6}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    invoke-static {v4}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v6

    invoke-virtual {v3, v6}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    new-instance v6, LS5/o;

    invoke-direct {v6}, LS5/o;-><init>()V

    invoke-virtual {v3, v6}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v3

    invoke-virtual {v3}, Le5/c$b;->d()Le5/c;

    move-result-object v3

    const-class v6, LU5/f;

    invoke-static {v6}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v6

    const-string v8, "sessions-settings"

    invoke-virtual {v6, v8}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v6

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v6, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v6

    sget-object v8, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Le5/F;

    invoke-static {v8}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v6, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v6

    invoke-static {v4}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v6, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v6

    invoke-static {v7}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v7

    invoke-virtual {v6, v7}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v6

    new-instance v7, LS5/p;

    invoke-direct {v7}, LS5/p;-><init>()V

    invoke-virtual {v6, v7}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v6

    invoke-virtual {v6}, Le5/c$b;->d()Le5/c;

    move-result-object v6

    const-class v7, Lcom/google/firebase/sessions/a;

    invoke-static {v7}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v7

    const-string v8, "sessions-datastore"

    invoke-virtual {v7, v8}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v7

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v7, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v7

    invoke-static {v4}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v4

    invoke-virtual {v7, v4}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v4

    new-instance v7, LS5/q;

    invoke-direct {v7}, LS5/q;-><init>()V

    invoke-virtual {v4, v7}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v4

    invoke-virtual {v4}, Le5/c$b;->d()Le5/c;

    move-result-object v4

    const-class v7, LS5/F;

    invoke-static {v7}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v7

    const-string v8, "sessions-service-binder"

    invoke-virtual {v7, v8}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v7

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v2

    invoke-virtual {v7, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v2

    new-instance v7, LS5/r;

    invoke-direct {v7}, LS5/r;-><init>()V

    invoke-virtual {v2, v7}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v2

    invoke-virtual {v2}, Le5/c$b;->d()Le5/c;

    move-result-object v2

    const-string v7, "2.0.7"

    invoke-static {v1, v7}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v1

    const/4 v7, 0x7

    new-array v7, v7, [Le5/c;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v5, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v6, v7, v0

    const/4 v0, 0x4

    aput-object v4, v7, v0

    const/4 v0, 0x5

    aput-object v2, v7, v0

    const/4 v0, 0x6

    aput-object v1, v7, v0

    invoke-static {v7}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
