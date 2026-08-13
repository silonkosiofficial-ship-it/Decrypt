.class public Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;
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

.method public static synthetic a(Le5/F;Le5/F;Le5/F;Le5/e;)LX4/e;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;->b(Le5/F;Le5/F;Le5/F;Le5/e;)LX4/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Le5/F;Le5/F;Le5/F;Le5/e;)LX4/e;
    .locals 7

    new-instance v6, LX4/e;

    const-class v0, LQ4/f;

    invoke-interface {p3, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LQ4/f;

    const-class v0, LW4/b;

    invoke-interface {p3, v0}, Le5/e;->d(Ljava/lang/Class;)LF5/b;

    move-result-object v2

    invoke-interface {p3, p0}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p3, p1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LX4/e;-><init>(LQ4/f;LF5/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6

    const-class v0, LU4/c;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    const-class v2, LU4/a;

    invoke-static {v2, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v2

    const-class v3, LU4/b;

    invoke-static {v3, v1}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v1

    const-class v3, LX4/e;

    invoke-static {v3}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v3

    const-string v4, "fire-app-check-debug"

    invoke-virtual {v3, v4}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v3

    const-class v5, LQ4/f;

    invoke-static {v5}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v5

    invoke-virtual {v3, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    const-class v5, LW4/b;

    invoke-static {v5}, Le5/r;->h(Ljava/lang/Class;)Le5/r;

    move-result-object v5

    invoke-virtual {v3, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    invoke-static {v0}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v5

    invoke-virtual {v3, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    invoke-static {v2}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v5

    invoke-virtual {v3, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    invoke-static {v1}, Le5/r;->i(Le5/F;)Le5/r;

    move-result-object v5

    invoke-virtual {v3, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v3

    new-instance v5, LW4/a;

    invoke-direct {v5, v0, v2, v1}, LW4/a;-><init>(Le5/F;Le5/F;Le5/F;)V

    invoke-virtual {v3, v5}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-string v1, "18.0.0"

    invoke-static {v4, v1}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

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
