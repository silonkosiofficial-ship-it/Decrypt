.class public final LU5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU5/c$a;
    }
.end annotation


# static fields
.field private static final g:LU5/c$a;


# instance fields
.field private final a:Lm7/i;

.field private final b:LG5/e;

.field private final c:LS5/b;

.field private final d:LU5/a;

.field private final e:Li7/n;

.field private final f:Lf9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU5/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/c$a;-><init>(Ly7/k;)V

    sput-object v0, LU5/c;->g:LU5/c$a;

    return-void
.end method

.method public constructor <init>(Lm7/i;LG5/e;LS5/b;LU5/a;LM1/h;)V
    .locals 1

    const-string v0, "backgroundDispatcher"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallationsApi"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appInfo"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configsFetcher"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStore"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/c;->a:Lm7/i;

    iput-object p2, p0, LU5/c;->b:LG5/e;

    iput-object p3, p0, LU5/c;->c:LS5/b;

    iput-object p4, p0, LU5/c;->d:LU5/a;

    new-instance p1, LU5/c$b;

    invoke-direct {p1, p5}, LU5/c$b;-><init>(LM1/h;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LU5/c;->e:Li7/n;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p3, p1, p2}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object p1

    iput-object p1, p0, LU5/c;->f:Lf9/a;

    return-void
.end method

.method public static final synthetic e(LU5/c;)LU5/g;
    .locals 0

    invoke-direct {p0}, LU5/c;->f()LU5/g;

    move-result-object p0

    return-object p0
.end method

.method private final f()LU5/g;
    .locals 1

    iget-object v0, p0, LU5/c;->e:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU5/g;

    return-object v0
.end method

.method private final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, LS8/o;

    const-string v1, "/"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, LS8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    invoke-direct {p0}, LU5/c;->f()LU5/g;

    move-result-object v0

    invoke-virtual {v0}, LU5/g;->g()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lm7/e;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    instance-of v6, v0, LU5/c$c;

    if-eqz v6, :cond_0

    move-object v6, v0

    check-cast v6, LU5/c$c;

    iget v7, v6, LU5/c$c;->J:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, LU5/c$c;->J:I

    goto :goto_0

    :cond_0
    new-instance v6, LU5/c$c;

    invoke-direct {v6, v1, v0}, LU5/c$c;-><init>(LU5/c;Lm7/e;)V

    :goto_0
    iget-object v0, v6, LU5/c$c;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v8, v6, LU5/c$c;->J:I

    const-string v9, "SessionConfigFetcher"

    const/4 v10, 0x0

    if-eqz v8, :cond_4

    if-eq v8, v5, :cond_3

    if-eq v8, v4, :cond_2

    if-ne v8, v3, :cond_1

    iget-object v2, v6, LU5/c$c;->F:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    :try_start_0
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v10

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    :goto_1
    move-object v3, v10

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v8, v6, LU5/c$c;->G:Ljava/lang/Object;

    check-cast v8, Lf9/a;

    iget-object v11, v6, LU5/c$c;->F:Ljava/lang/Object;

    check-cast v11, LU5/c;

    :try_start_1
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v8

    goto :goto_1

    :cond_3
    iget-object v8, v6, LU5/c$c;->G:Ljava/lang/Object;

    check-cast v8, Lf9/a;

    iget-object v11, v6, LU5/c$c;->F:Ljava/lang/Object;

    check-cast v11, LU5/c;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v0, v1, LU5/c;->f:Lf9/a;

    invoke-interface {v0}, Lf9/a;->b()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct/range {p0 .. p0}, LU5/c;->f()LU5/g;

    move-result-object v0

    invoke-virtual {v0}, LU5/g;->d()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :cond_5
    iget-object v0, v1, LU5/c;->f:Lf9/a;

    iput-object v1, v6, LU5/c$c;->F:Ljava/lang/Object;

    iput-object v0, v6, LU5/c$c;->G:Ljava/lang/Object;

    iput v5, v6, LU5/c$c;->J:I

    invoke-interface {v0, v10, v6}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_6

    return-object v7

    :cond_6
    move-object v8, v0

    move-object v11, v1

    :goto_2
    :try_start_2
    invoke-direct {v11}, LU5/c;->f()LU5/g;

    move-result-object v0

    invoke-virtual {v0}, LU5/g;->d()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-nez v0, :cond_7

    :try_start_3
    const-string v0, "Remote settings cache not expired. Using cached values."

    nop

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v8, v10}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object v0

    :cond_7
    :try_start_4
    sget-object v0, LS5/s;->c:LS5/s$a;

    iget-object v12, v11, LU5/c;->b:LG5/e;

    iput-object v11, v6, LU5/c$c;->F:Ljava/lang/Object;

    iput-object v8, v6, LU5/c$c;->G:Ljava/lang/Object;

    iput v4, v6, LU5/c$c;->J:I

    invoke-virtual {v0, v12, v6}, LS5/s$a;->a(LG5/e;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_8

    return-object v7

    :cond_8
    :goto_3
    check-cast v0, LS5/s;

    invoke-virtual {v0}, LS5/s;->b()Ljava/lang/String;

    move-result-object v0

    const-string v12, ""

    invoke-static {v0, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v12, :cond_9

    :try_start_5
    const-string v0, "Error getting Firebase Installation ID. Skipping this Session Event."

    nop

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-interface {v8, v10}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object v0

    :cond_9
    :try_start_6
    const-string v12, "X-Crashlytics-Installation-ID"

    invoke-static {v12, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const-string v12, "X-Crashlytics-Device-Model"

    sget-object v13, Ly7/V;->a:Ly7/V;

    const-string v13, "%s/%s"

    new-array v14, v4, [Ljava/lang/Object;

    sget-object v15, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    aput-object v15, v14, v2

    sget-object v15, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v15, v14, v5

    invoke-static {v14, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "format(format, *args)"

    invoke-static {v13, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v13}, LU5/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v12

    const-string v13, "X-Crashlytics-OS-Build-Version"

    sget-object v14, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    const-string v15, "INCREMENTAL"

    invoke-static {v14, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v14}, LU5/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v13

    const-string v14, "X-Crashlytics-OS-Display-Version"

    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v10, "RELEASE"

    invoke-static {v15, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v15}, LU5/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v14, v10}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v10

    const-string v14, "X-Crashlytics-API-Client-Version"

    iget-object v15, v11, LU5/c;->c:LS5/b;

    invoke-virtual {v15}, LS5/b;->f()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    const/4 v15, 0x5

    new-array v15, v15, [Li7/u;

    aput-object v0, v15, v2

    aput-object v12, v15, v5

    aput-object v13, v15, v4

    aput-object v10, v15, v3

    const/4 v0, 0x4

    aput-object v14, v15, v0

    invoke-static {v15}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "Fetching settings from server."

    nop

    iget-object v2, v11, LU5/c;->d:LU5/a;

    new-instance v4, LU5/c$d;

    const/4 v5, 0x0

    invoke-direct {v4, v11, v5}, LU5/c$d;-><init>(LU5/c;Lm7/e;)V

    new-instance v9, LU5/c$e;

    invoke-direct {v9, v5}, LU5/c$e;-><init>(Lm7/e;)V

    iput-object v8, v6, LU5/c$c;->F:Ljava/lang/Object;

    iput-object v5, v6, LU5/c$c;->G:Ljava/lang/Object;

    iput v3, v6, LU5/c$c;->J:I

    invoke-interface {v2, v0, v4, v9, v6}, LU5/a;->a(Ljava/util/Map;Lx7/p;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-ne v0, v7, :cond_a

    return-object v7

    :cond_a
    move-object v2, v8

    :goto_4
    :try_start_7
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :catchall_2
    move-exception v0

    :goto_5
    const/4 v3, 0x0

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v2, v8

    goto :goto_5

    :goto_6
    invoke-interface {v2, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0
.end method

.method public c()LT8/a;
    .locals 2

    .prologue
    invoke-direct {p0}, LU5/c;->f()LU5/g;

    move-result-object v0

    invoke-virtual {v0}, LU5/g;->e()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LT8/a;->D:LT8/a$a;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, LT8/d;->G:LT8/d;

    invoke-static {v0, v1}, LT8/c;->s(ILT8/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LT8/a;->o(J)LT8/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public d()Ljava/lang/Double;
    .locals 1

    invoke-direct {p0}, LU5/c;->f()LU5/g;

    move-result-object v0

    invoke-virtual {v0}, LU5/g;->f()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method
