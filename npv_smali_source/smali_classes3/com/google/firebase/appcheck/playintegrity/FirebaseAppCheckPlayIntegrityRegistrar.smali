.class public Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le5/F;Le5/F;Le5/e;)Lc5/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;->b(Le5/F;Le5/F;Le5/e;)Lc5/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Le5/F;Le5/F;Le5/e;)Lc5/i;
    .locals 2

    new-instance v0, Lc5/i;

    const-class v1, LQ4/f;

    invoke-interface {p2, v1}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ4/f;

    invoke-interface {p2, p0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-interface {p2, p1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, p0, p1}, Lc5/i;-><init>(LQ4/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5

    const-class v0, LU4/c;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-class v2, LU4/b;

    invoke-static {v2, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v1

    const-class v2, Lc5/i;

    invoke-static {v2}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v2

    const-string v3, "fire-app-check-play-integrity"

    invoke-virtual {v2, v3}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v2

    const-class v4, LQ4/f;

    invoke-static {v4}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v2

    invoke-static {v0}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v2

    invoke-static {v1}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v2

    new-instance v4, Lb5/a;

    invoke-direct {v4, v0, v1}, Lb5/a;-><init>(Le5/F;Le5/F;)V

    invoke-virtual {v2, v4}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-string v1, "18.0.0"

    invoke-static {v3, v1}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Le5/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
