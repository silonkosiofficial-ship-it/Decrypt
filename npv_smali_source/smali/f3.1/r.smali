.class public Lf3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LZ2/e;

.field private final c:Lg3/d;

.field private final d:Lf3/x;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lh3/b;

.field private final g:Li3/a;

.field private final h:Li3/a;

.field private final i:Lg3/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;LZ2/e;Lg3/d;Lf3/x;Ljava/util/concurrent/Executor;Lh3/b;Li3/a;Li3/a;Lg3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/r;->a:Landroid/content/Context;

    iput-object p2, p0, Lf3/r;->b:LZ2/e;

    iput-object p3, p0, Lf3/r;->c:Lg3/d;

    iput-object p4, p0, Lf3/r;->d:Lf3/x;

    iput-object p5, p0, Lf3/r;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lf3/r;->f:Lh3/b;

    iput-object p7, p0, Lf3/r;->g:Li3/a;

    iput-object p8, p0, Lf3/r;->h:Li3/a;

    iput-object p9, p0, Lf3/r;->i:Lg3/c;

    return-void
.end method

.method public static synthetic a(Lf3/r;LY2/p;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lf3/r;->m(LY2/p;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf3/r;Ljava/lang/Iterable;LY2/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf3/r;->n(Ljava/lang/Iterable;LY2/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf3/r;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lf3/r;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf3/r;LY2/p;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lf3/r;->l(LY2/p;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lf3/r;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lf3/r;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lf3/r;LY2/p;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf3/r;->s(LY2/p;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lf3/r;LY2/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf3/r;->r(LY2/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lf3/r;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lf3/r;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lf3/r;LY2/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf3/r;->t(LY2/p;ILjava/lang/Runnable;)V

    return-void
.end method

.method private synthetic l(LY2/p;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lf3/r;->c:Lg3/d;

    invoke-interface {v0, p1}, Lg3/d;->Z(LY2/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(LY2/p;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lf3/r;->c:Lg3/d;

    invoke-interface {v0, p1}, Lg3/d;->a0(LY2/p;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;LY2/p;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf3/r;->c:Lg3/d;

    invoke-interface {v0, p1}, Lg3/d;->j1(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lf3/r;->c:Lg3/d;

    iget-object v0, p0, Lf3/r;->g:Li3/a;

    invoke-interface {v0}, Li3/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lg3/d;->k1(LY2/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf3/r;->c:Lg3/d;

    invoke-interface {v0, p1}, Lg3/d;->x(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf3/r;->i:Lg3/c;

    invoke-interface {v0}, Lg3/c;->a()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lf3/r;->i:Lg3/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lb3/c$b;->I:Lb3/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lg3/c;->i(JLb3/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(LY2/p;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf3/r;->c:Lg3/d;

    iget-object v1, p0, Lf3/r;->g:Li3/a;

    invoke-interface {v1}, Li3/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lg3/d;->k1(LY2/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(LY2/p;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf3/r;->d:Lf3/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lf3/x;->a(LY2/p;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(LY2/p;ILjava/lang/Runnable;)V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lf3/r;->f:Lh3/b;

    iget-object v1, p0, Lf3/r;->c:Lg3/d;

    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lf3/i;

    invoke-direct {v2, v1}, Lf3/i;-><init>(Lg3/d;)V

    invoke-interface {v0, v2}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Lf3/r;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf3/r;->f:Lh3/b;

    new-instance v1, Lf3/j;

    invoke-direct {v1, p0, p1, p2}, Lf3/j;-><init>(Lf3/r;LY2/p;I)V

    invoke-interface {v0, v1}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lf3/r;->u(LY2/p;I)LZ2/g;
    :try_end_0
    .catch Lh3/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v0, p0, Lf3/r;->d:Lf3/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lf3/x;->a(LY2/p;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p1
.end method


# virtual methods
.method public j(LZ2/m;)LY2/i;
    .locals 4

    iget-object v0, p0, Lf3/r;->f:Lh3/b;

    iget-object v1, p0, Lf3/r;->i:Lg3/c;

    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lf3/h;

    invoke-direct {v2, v1}, Lf3/h;-><init>(Lg3/c;)V

    invoke-interface {v0, v2}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/a;

    invoke-static {}, LY2/i;->a()LY2/i$a;

    move-result-object v1

    iget-object v2, p0, Lf3/r;->g:Li3/a;

    invoke-interface {v2}, Li3/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LY2/i$a;->i(J)LY2/i$a;

    move-result-object v1

    iget-object v2, p0, Lf3/r;->h:Li3/a;

    invoke-interface {v2}, Li3/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LY2/i$a;->o(J)LY2/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, LY2/i$a;->n(Ljava/lang/String;)LY2/i$a;

    move-result-object v1

    new-instance v2, LY2/h;

    const-string v3, "proto"

    invoke-static {v3}, LW2/b;->b(Ljava/lang/String;)LW2/b;

    move-result-object v3

    invoke-virtual {v0}, Lb3/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, LY2/h;-><init>(LW2/b;[B)V

    invoke-virtual {v1, v2}, LY2/i$a;->h(LY2/h;)LY2/i$a;

    move-result-object v0

    invoke-virtual {v0}, LY2/i$a;->d()LY2/i;

    move-result-object v0

    invoke-interface {p1, v0}, LZ2/m;->a(LY2/i;)LY2/i;

    move-result-object p1

    return-object p1
.end method

.method k()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lf3/r;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(LY2/p;I)LZ2/g;
    .locals 11

    .prologue
    iget-object v0, p0, Lf3/r;->b:LZ2/e;

    invoke-virtual {p1}, LY2/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LZ2/e;->d(Ljava/lang/String;)LZ2/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, LZ2/g;->e(J)LZ2/g;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    :cond_1
    :goto_1
    iget-object v1, p0, Lf3/r;->f:Lh3/b;

    new-instance v2, Lf3/k;

    invoke-direct {v2, p0, p1}, Lf3/k;-><init>(Lf3/r;LY2/p;)V

    invoke-interface {v1, v2}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lf3/r;->f:Lh3/b;

    new-instance v2, Lf3/l;

    invoke-direct {v2, p0, p1}, Lf3/l;-><init>(Lf3/r;LY2/p;)V

    invoke-interface {v1, v2}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, Lc3/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, LZ2/g;->a()LZ2/g;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg3/k;

    invoke-virtual {v3}, Lg3/k;->b()LY2/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, LY2/p;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Lf3/r;->j(LZ2/m;)LY2/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, LZ2/f;->a()LZ2/f$a;

    move-result-object v2

    invoke-virtual {v2, v1}, LZ2/f$a;->b(Ljava/lang/Iterable;)LZ2/f$a;

    move-result-object v1

    invoke-virtual {p1}, LY2/p;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, LZ2/f$a;->c([B)LZ2/f$a;

    move-result-object v1

    invoke-virtual {v1}, LZ2/f$a;->a()LZ2/f;

    move-result-object v1

    invoke-interface {v0, v1}, LZ2/m;->b(LZ2/f;)LZ2/g;

    move-result-object v1

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, LZ2/g;->c()LZ2/g$a;

    move-result-object v1

    sget-object v2, LZ2/g$a;->D:LZ2/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Lf3/r;->f:Lh3/b;

    new-instance v1, Lf3/m;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lf3/m;-><init>(Lf3/r;Ljava/lang/Iterable;LY2/p;J)V

    invoke-interface {v0, v1}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    iget-object v0, p0, Lf3/r;->d:Lf3/x;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, Lf3/x;->b(LY2/p;IZ)V

    return-object v3

    :cond_6
    iget-object v1, p0, Lf3/r;->f:Lh3/b;

    new-instance v2, Lf3/n;

    invoke-direct {v2, p0, v6}, Lf3/n;-><init>(Lf3/r;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    invoke-virtual {v3}, LZ2/g;->c()LZ2/g$a;

    move-result-object v1

    sget-object v2, LZ2/g$a;->C:LZ2/g$a;

    if-ne v1, v2, :cond_7

    invoke-virtual {v3}, LZ2/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, LY2/p;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lf3/r;->f:Lh3/b;

    new-instance v5, Lf3/o;

    invoke-direct {v5, p0}, Lf3/o;-><init>(Lf3/r;)V

    invoke-interface {v4, v5}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, LZ2/g;->c()LZ2/g$a;

    move-result-object v1

    sget-object v2, LZ2/g$a;->F:LZ2/g$a;

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg3/k;

    invoke-virtual {v4}, Lg3/k;->b()LY2/i;

    move-result-object v4

    invoke-virtual {v4}, LY2/i;->n()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_6
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_6

    :cond_9
    iget-object v2, p0, Lf3/r;->f:Lh3/b;

    new-instance v4, Lf3/p;

    invoke-direct {v4, p0, v1}, Lf3/p;-><init>(Lf3/r;Ljava/util/Map;)V

    invoke-interface {v2, v4}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    iget-object p2, p0, Lf3/r;->f:Lh3/b;

    new-instance v0, Lf3/q;

    invoke-direct {v0, p0, p1, v8, v9}, Lf3/q;-><init>(Lf3/r;LY2/p;J)V

    invoke-interface {p2, v0}, Lh3/b;->f(Lh3/b$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(LY2/p;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lf3/r;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lf3/g;

    invoke-direct {v1, p0, p1, p2, p3}, Lf3/g;-><init>(Lf3/r;LY2/p;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
