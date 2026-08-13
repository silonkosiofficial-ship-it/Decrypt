.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "fire-installations"

    sput-object v0, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->LIBRARY_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le5/e;)LG5/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Le5/e;)LG5/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Le5/e;)LG5/e;
    .locals 6

    new-instance v0, Lcom/google/firebase/installations/c;

    const-class v1, LQ4/f;

    invoke-interface {p0, v1}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ4/f;

    const-class v2, LE5/i;

    invoke-interface {p0, v2}, Le5/e;->d(Ljava/lang/Class;)LF5/b;

    move-result-object v2

    const-class v3, LU4/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v3

    invoke-interface {p0, v3}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, LU4/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v4

    invoke-interface {p0, v4}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lf5/j;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/installations/c;-><init>(LQ4/f;LF5/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le5/c;",
            ">;"
        }
    .end annotation

    const-class v0, LG5/e;

    invoke-static {v0}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v0

    const-string v1, "fire-installations"

    invoke-virtual {v0, v1}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v0

    const-class v2, LQ4/f;

    invoke-static {v2}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LE5/i;

    invoke-static {v2}, Le5/r;->h(Ljava/lang/Class;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LU4/a;

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v2, v3}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v2

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v2, LU4/b;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v2

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v2, LG5/f;

    invoke-direct {v2}, LG5/f;-><init>()V

    invoke-virtual {v0, v2}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    invoke-static {}, LE5/h;->a()Le5/c;

    move-result-object v2

    const-string v3, "18.0.0"

    invoke-static {v1, v3}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Le5/c;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
