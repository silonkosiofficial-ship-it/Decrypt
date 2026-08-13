.class public final LV/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/j0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/i$a;
    }
.end annotation


# instance fields
.field private final C:Lx7/a;

.field private final D:Ljava/lang/Object;

.field private E:Ljava/lang/Throwable;

.field private F:Ljava/util/List;

.field private G:Ljava/util/List;

.field private final H:LV/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/i;->C:Lx7/a;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/i;->D:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/i;->F:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/i;->G:Ljava/util/List;

    new-instance p1, LV/h;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, LV/h;-><init>(I)V

    iput-object p1, p0, LV/i;->H:LV/h;

    return-void
.end method

.method public static final synthetic a(LV/i;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, LV/i;->j(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic b(LV/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LV/i;->F:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic c(LV/i;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, LV/i;->E:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static final synthetic d(LV/i;)LV/h;
    .locals 0

    iget-object p0, p0, LV/i;->H:LV/h;

    return-object p0
.end method

.method public static final synthetic e(LV/i;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LV/i;->D:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic h(LV/i;)Lx7/a;
    .locals 0

    iget-object p0, p0, LV/i;->C:Lx7/a;

    return-object p0
.end method

.method private final j(Ljava/lang/Throwable;)V
    .locals 7

    .prologue
    iget-object v0, p0, LV/i;->D:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/i;->E:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, LV/i;->E:Ljava/lang/Throwable;

    iget-object v1, p0, LV/i;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LV/i$a;

    invoke-virtual {v5}, LV/i$a;->a()Lm7/e;

    move-result-object v5

    sget-object v6, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Lm7/e;->t(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LV/i;->F:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, LV/i;->H:LV/h;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LV/j0$a;->a(LV/j0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public R(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    new-instance v1, LV/i$a;

    invoke-direct {v1, p1, v0}, LV/i$a;-><init>(Lx7/l;Lm7/e;)V

    invoke-static {p0}, LV/i;->e(LV/i;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    invoke-static {p0}, LV/i;->c(LV/i;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {v3}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/e;->t(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-static {p0}, LV/i;->b(LV/i;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    invoke-static {p0}, LV/i;->b(LV/i;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v3, :cond_1

    invoke-static {p0}, LV/i;->d(LV/i;)LV/h;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    xor-int/2addr v2, v3

    monitor-exit p1

    new-instance p1, LV/i$b;

    invoke-direct {p1, p0, v1}, LV/i$b;-><init>(LV/i;LV/i$a;)V

    invoke-interface {v0, p1}, LW8/l;->G(Lx7/l;)V

    if-eqz v2, :cond_2

    invoke-static {p0}, LV/i;->h(LV/i;)Lx7/a;

    move-result-object p1

    if-eqz p1, :cond_2

    :try_start_2
    invoke-static {p0}, LV/i;->h(LV/i;)Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-static {p0, p1}, LV/i;->a(LV/i;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_3

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_3
    return-object p1

    :goto_1
    monitor-exit p1

    throw p2
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, LV/i0;->a(LV/j0;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->b(LV/j0;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public final k()Z
    .locals 1

    .prologue
    iget-object v0, p0, LV/i;->H:LV/h;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(J)V
    .locals 5

    .prologue
    iget-object v0, p0, LV/i;->D:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/i;->F:Ljava/util/List;

    iget-object v2, p0, LV/i;->G:Ljava/util/List;

    iput-object v2, p0, LV/i;->F:Ljava/util/List;

    iput-object v1, p0, LV/i;->G:Ljava/util/List;

    iget-object v2, p0, LV/i;->H:LV/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/i$a;

    invoke-virtual {v4, p1, p2}, LV/i$a;->b(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->d(LV/j0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->c(LV/j0;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
