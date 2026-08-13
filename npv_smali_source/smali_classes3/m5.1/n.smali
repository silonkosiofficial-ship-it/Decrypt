.class public Lm5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm5/n$a;
    }
.end annotation


# instance fields
.field private final a:Lm5/f;

.field private final b:Ll5/f;

.field private c:Ljava/lang/String;

.field private final d:Lm5/n$a;

.field private final e:Lm5/n$a;

.field private final f:Lm5/j;

.field private final g:Ljava/util/concurrent/atomic/AtomicMarkableReference;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lq5/g;Ll5/f;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm5/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lm5/n$a;-><init>(Lm5/n;Z)V

    iput-object v0, p0, Lm5/n;->d:Lm5/n$a;

    new-instance v0, Lm5/n$a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lm5/n$a;-><init>(Lm5/n;Z)V

    iput-object v0, p0, Lm5/n;->e:Lm5/n$a;

    new-instance v0, Lm5/j;

    const/16 v2, 0x80

    invoke-direct {v0, v2}, Lm5/j;-><init>(I)V

    iput-object v0, p0, Lm5/n;->f:Lm5/j;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, Lm5/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    iput-object p1, p0, Lm5/n;->c:Ljava/lang/String;

    new-instance p1, Lm5/f;

    invoke-direct {p1, p2}, Lm5/f;-><init>(Lq5/g;)V

    iput-object p1, p0, Lm5/n;->a:Lm5/f;

    iput-object p3, p0, Lm5/n;->b:Ll5/f;

    return-void
.end method

.method public static synthetic a(Lm5/n;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lm5/n;->k(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lm5/n;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lm5/n;->j(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lm5/n;)Ll5/f;
    .locals 0

    iget-object p0, p0, Lm5/n;->b:Ll5/f;

    return-object p0
.end method

.method static synthetic d(Lm5/n;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lm5/n;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lm5/n;)Lm5/f;
    .locals 0

    iget-object p0, p0, Lm5/n;->a:Lm5/f;

    return-object p0
.end method

.method private synthetic j(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lm5/n;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm5/n;->a:Lm5/f;

    invoke-virtual {p0}, Lm5/n;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lm5/f;->t(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lm5/n;->a:Lm5/f;

    invoke-virtual {v0, p1, p2}, Lm5/f;->q(Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lm5/n;->a:Lm5/f;

    invoke-virtual {p2, p1, p3}, Lm5/f;->s(Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method private synthetic k(Ljava/util/List;)V
    .locals 2

    iget-object v0, p0, Lm5/n;->a:Lm5/f;

    iget-object v1, p0, Lm5/n;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lm5/f;->s(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static l(Ljava/lang/String;Lq5/g;Ll5/f;)Lm5/n;
    .locals 3

    new-instance v0, Lm5/f;

    invoke-direct {v0, p1}, Lm5/f;-><init>(Lq5/g;)V

    new-instance v1, Lm5/n;

    invoke-direct {v1, p0, p1, p2}, Lm5/n;-><init>(Ljava/lang/String;Lq5/g;Ll5/f;)V

    iget-object p1, v1, Lm5/n;->d:Lm5/n$a;

    iget-object p1, p1, Lm5/n$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm5/d;

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Lm5/f;->i(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lm5/d;->e(Ljava/util/Map;)V

    iget-object p1, v1, Lm5/n;->e:Lm5/n$a;

    iget-object p1, p1, Lm5/n$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm5/d;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v2}, Lm5/f;->i(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lm5/d;->e(Ljava/util/Map;)V

    iget-object p1, v1, Lm5/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0, p0}, Lm5/f;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, p2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    iget-object p1, v1, Lm5/n;->f:Lm5/j;

    invoke-virtual {v0, p0}, Lm5/f;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lm5/j;->c(Ljava/util/List;)Z

    return-object v1
.end method

.method public static m(Ljava/lang/String;Lq5/g;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lm5/f;

    invoke-direct {v0, p1}, Lm5/f;-><init>(Lq5/g;)V

    invoke-virtual {v0, p0}, Lm5/f;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lm5/n;->d:Lm5/n$a;

    invoke-virtual {v0}, Lm5/n$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lm5/n;->e:Lm5/n$a;

    invoke-virtual {v0}, Lm5/n$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm5/n;->f:Lm5/j;

    invoke-virtual {v0}, Lm5/j;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm5/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lm5/n;->e:Lm5/n$a;

    invoke-virtual {v0, p1, p2}, Lm5/n$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public o(Ljava/lang/String;)V
    .locals 5

    .prologue
    iget-object v0, p0, Lm5/n;->c:Ljava/lang/String;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lm5/n;->c:Ljava/lang/String;

    iget-object v1, p0, Lm5/n;->d:Lm5/n$a;

    invoke-virtual {v1}, Lm5/n$a;->b()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lm5/n;->f:Lm5/j;

    invoke-virtual {v2}, Lm5/j;->b()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lm5/n;->b:Ll5/f;

    iget-object v3, v3, Ll5/f;->b:Ll5/e;

    new-instance v4, Lm5/k;

    invoke-direct {v4, p0, p1, v1, v2}, Lm5/k;-><init>(Lm5/n;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public p(Ljava/util/List;)Z
    .locals 3

    .prologue
    iget-object v0, p0, Lm5/n;->f:Lm5/j;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm5/n;->f:Lm5/j;

    invoke-virtual {v1, p1}, Lm5/j;->c(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm5/n;->f:Lm5/j;

    invoke-virtual {p1}, Lm5/j;->b()Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lm5/n;->b:Ll5/f;

    iget-object v1, v1, Ll5/f;->b:Ll5/e;

    new-instance v2, Lm5/l;

    invoke-direct {v2, p0, p1}, Lm5/l;-><init>(Lm5/n;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
