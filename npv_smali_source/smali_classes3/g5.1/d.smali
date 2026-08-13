.class public Lg5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF5/a;

.field private volatile b:Li5/a;

.field private volatile c:Lj5/b;

.field private final d:Ljava/util/List;


# direct methods
.method public constructor <init>(LF5/a;)V
    .locals 2

    new-instance v0, Lj5/c;

    invoke-direct {v0}, Lj5/c;-><init>()V

    new-instance v1, Li5/f;

    invoke-direct {v1}, Li5/f;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lg5/d;-><init>(LF5/a;Lj5/b;Li5/a;)V

    return-void
.end method

.method public constructor <init>(LF5/a;Lj5/b;Li5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/d;->a:LF5/a;

    iput-object p2, p0, Lg5/d;->c:Lj5/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg5/d;->d:Ljava/util/List;

    iput-object p3, p0, Lg5/d;->b:Li5/a;

    invoke-direct {p0}, Lg5/d;->f()V

    return-void
.end method

.method public static synthetic a(Lg5/d;LF5/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg5/d;->i(LF5/b;)V

    return-void
.end method

.method public static synthetic b(Lg5/d;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg5/d;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Lg5/d;Lj5/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg5/d;->h(Lj5/a;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lg5/d;->a:LF5/a;

    new-instance v1, Lg5/c;

    invoke-direct {v1, p0}, Lg5/c;-><init>(Lg5/d;)V

    invoke-interface {v0, v1}, LF5/a;->a(LF5/a$a;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lg5/d;->b:Li5/a;

    invoke-interface {v0, p1, p2}, Li5/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private synthetic h(Lj5/a;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg5/d;->c:Lj5/b;

    instance-of v0, v0, Lj5/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg5/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lg5/d;->c:Lj5/b;

    invoke-interface {v0, p1}, Lj5/b;->a(Lj5/a;)V

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic i(LF5/b;)V
    .locals 5

    .prologue
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "AnalyticsConnector now available."

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-interface {p1}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT4/a;

    new-instance v0, Li5/e;

    invoke-direct {v0, p1}, Li5/e;-><init>(LT4/a;)V

    new-instance v1, Lg5/e;

    invoke-direct {v1}, Lg5/e;-><init>()V

    invoke-static {p1, v1}, Lg5/d;->j(LT4/a;Lg5/e;)LT4/a$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v2, "Registered Firebase Analytics listener."

    invoke-virtual {p1, v2}, Lh5/g;->b(Ljava/lang/String;)V

    new-instance p1, Li5/d;

    invoke-direct {p1}, Li5/d;-><init>()V

    new-instance v2, Li5/c;

    const/16 v3, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v0, v3, v4}, Li5/c;-><init>(Li5/e;ILjava/util/concurrent/TimeUnit;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg5/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj5/a;

    invoke-virtual {p1, v3}, Li5/d;->a(Lj5/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1}, Lg5/e;->d(Li5/b;)V

    invoke-virtual {v1, v2}, Lg5/e;->e(Li5/b;)V

    iput-object p1, p0, Lg5/d;->c:Lj5/b;

    iput-object v2, p0, Lg5/d;->b:Li5/a;

    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Could not register Firebase Analytics listener; a listener is already registered."

    invoke-virtual {p1, v0}, Lh5/g;->k(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method private static j(LT4/a;Lg5/e;)LT4/a$a;
    .locals 2

    .prologue
    const-string v0, "clx"

    invoke-interface {p0, v0, p1}, LT4/a;->a(Ljava/lang/String;LT4/a$b;)LT4/a$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    const-string v0, "crash"

    invoke-interface {p0, v0, p1}, LT4/a;->a(Ljava/lang/String;LT4/a$b;)LT4/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    invoke-virtual {p0, p1}, Lh5/g;->k(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public d()Li5/a;
    .locals 1

    new-instance v0, Lg5/b;

    invoke-direct {v0, p0}, Lg5/b;-><init>(Lg5/d;)V

    return-object v0
.end method

.method public e()Lj5/b;
    .locals 1

    new-instance v0, Lg5/a;

    invoke-direct {v0, p0}, Lg5/a;-><init>(Lg5/d;)V

    return-object v0
.end method
