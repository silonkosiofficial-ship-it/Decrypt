.class public LO5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/firebase/remoteconfig/internal/f;

.field private b:LO5/a;

.field private c:Ljava/util/concurrent/Executor;

.field private d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lcom/google/firebase/remoteconfig/internal/f;LO5/a;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LO5/e;->d:Ljava/util/Set;

    iput-object p1, p0, LO5/e;->a:Lcom/google/firebase/remoteconfig/internal/f;

    iput-object p2, p0, LO5/e;->b:LO5/a;

    iput-object p3, p0, LO5/e;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(LO5/e;Ll4/l;LQ5/f;Lcom/google/firebase/remoteconfig/internal/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LO5/e;->f(Ll4/l;LQ5/f;Lcom/google/firebase/remoteconfig/internal/g;)V

    return-void
.end method

.method public static synthetic b(LQ5/f;LQ5/e;)V
    .locals 0

    invoke-static {p0, p1}, LO5/e;->e(LQ5/f;LQ5/e;)V

    return-void
.end method

.method public static synthetic c(LQ5/f;LQ5/e;)V
    .locals 0

    invoke-static {p0, p1}, LO5/e;->d(LQ5/f;LQ5/e;)V

    return-void
.end method

.method private static synthetic d(LQ5/f;LQ5/e;)V
    .locals 0

    invoke-interface {p0, p1}, LQ5/f;->a(LQ5/e;)V

    return-void
.end method

.method private static synthetic e(LQ5/f;LQ5/e;)V
    .locals 0

    invoke-interface {p0, p1}, LQ5/f;->a(LQ5/e;)V

    return-void
.end method

.method private synthetic f(Ll4/l;LQ5/f;Lcom/google/firebase/remoteconfig/internal/g;)V
    .locals 1

    .prologue
    :try_start_0
    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/g;

    if-eqz p1, :cond_0

    iget-object p3, p0, LO5/e;->b:LO5/a;

    invoke-virtual {p3, p1}, LO5/a;->b(Lcom/google/firebase/remoteconfig/internal/g;)LQ5/e;

    move-result-object p1

    iget-object p3, p0, LO5/e;->c:Ljava/util/concurrent/Executor;

    new-instance v0, LO5/d;

    invoke-direct {v0, p2, p1}, LO5/d;-><init>(LQ5/f;LQ5/e;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch LN5/k; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "FirebaseRemoteConfig"

    const-string p3, "Exception publishing RolloutsState to subscriber. Continuing to listen for changes."

    nop

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public g(Lcom/google/firebase/remoteconfig/internal/g;)V
    .locals 4

    .prologue
    :try_start_0
    iget-object v0, p0, LO5/e;->b:LO5/a;

    invoke-virtual {v0, p1}, LO5/a;->b(Lcom/google/firebase/remoteconfig/internal/g;)LQ5/e;

    move-result-object p1

    iget-object v0, p0, LO5/e;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ5/f;

    iget-object v2, p0, LO5/e;->c:Ljava/util/concurrent/Executor;

    new-instance v3, LO5/c;

    invoke-direct {v3, v1, p1}, LO5/c;-><init>(LQ5/f;LQ5/e;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch LN5/k; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "FirebaseRemoteConfig"

    const-string v1, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes."

    nop

    :cond_0
    return-void
.end method

.method public h(LQ5/f;)V
    .locals 3

    iget-object v0, p0, LO5/e;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LO5/e;->a:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/f;->e()Ll4/l;

    move-result-object v0

    iget-object v1, p0, LO5/e;->c:Ljava/util/concurrent/Executor;

    new-instance v2, LO5/b;

    invoke-direct {v2, p0, v0, p1}, LO5/b;-><init>(LO5/e;Ll4/l;LQ5/f;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;

    return-void
.end method
