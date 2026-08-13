.class public Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;
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

.method public static synthetic a(Le5/F;Le5/F;Le5/F;Le5/F;Le5/e;)LV4/e;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->b(Le5/F;Le5/F;Le5/F;Le5/F;Le5/e;)LV4/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Le5/F;Le5/F;Le5/F;Le5/F;Le5/e;)LV4/e;
    .locals 8

    new-instance v7, LY4/h;

    const-class v0, LQ4/f;

    invoke-interface {p4, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LQ4/f;

    const-class v0, LE5/i;

    invoke-interface {p4, v0}, Le5/e;->d(Ljava/lang/Class;)LF5/b;

    move-result-object v2

    invoke-interface {p4, p0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p3}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LY4/h;-><init>(LQ4/f;LF5/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v7
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 9

    const-class v0, LU4/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-class v2, LU4/c;

    invoke-static {v2, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v2

    const-class v3, LU4/a;

    invoke-static {v3, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v1

    const-class v3, LU4/b;

    const-class v4, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3, v4}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v3

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, La5/a;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const-class v6, LV4/e;

    invoke-static {v6, v5}, Le5/c;->f(Ljava/lang/Class;[Ljava/lang/Class;)Le5/c$b;

    move-result-object v5

    const-string v6, "fire-app-check"

    invoke-virtual {v5, v6}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v5

    const-class v8, LQ4/f;

    invoke-static {v8}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v8

    invoke-virtual {v5, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v5

    invoke-static {v0}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v5, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v5

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v5, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v5

    invoke-static {v1}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v5, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v5

    invoke-static {v3}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v8

    invoke-virtual {v5, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v5

    const-class v8, LE5/i;

    invoke-static {v8}, Le5/r;->h(Ljava/lang/Class;)Le5/r;

    move-result-object v8

    invoke-virtual {v5, v8}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v5

    new-instance v8, LV4/f;

    invoke-direct {v8, v0, v2, v1, v3}, LV4/f;-><init>(Le5/F;Le5/F;Le5/F;Le5/F;)V

    invoke-virtual {v5, v8}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->c()Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    invoke-static {}, LE5/h;->a()Le5/c;

    move-result-object v1

    const-string v2, "18.0.0"

    invoke-static {v6, v2}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Le5/c;

    aput-object v0, v3, v7

    aput-object v1, v3, v4

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
