.class public abstract Lo2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/n$a;,
        Lo2/n$b;,
        Lo2/n$c;,
        Lo2/n$d;,
        Lo2/n$e;,
        Lo2/n$f;
    }
.end annotation


# static fields
.field public static final o:Lo2/n$c;


# instance fields
.field protected volatile a:Lz2/d;

.field private b:LW8/N;

.field private c:Lm7/i;

.field private d:Ljava/util/concurrent/Executor;

.field private e:Ljava/util/concurrent/Executor;

.field private f:Lo2/m;

.field private g:Landroidx/room/c;

.field private final h:Lp2/a;

.field private i:Z

.field protected j:Ljava/util/List;

.field private k:Lv2/b;

.field private final l:Ljava/lang/ThreadLocal;

.field private final m:Ljava/util/Map;

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/n$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/n$c;-><init>(Ly7/k;)V

    sput-object v0, Lo2/n;->o:Lo2/n$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp2/a;

    new-instance v1, Lo2/n$h;

    invoke-direct {v1, p0}, Lo2/n$h;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lp2/a;-><init>(Lx7/a;)V

    iput-object v0, p0, Lo2/n;->h:Lp2/a;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lo2/n;->l:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lo2/n;->m:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/n;->n:Z

    return-void
.end method

.method private final F()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/n;->e()V

    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-interface {v0}, Lz2/d;->V0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/c;->x()V

    :cond_0
    invoke-interface {v0}, Lz2/d;->a1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lz2/d;->l0()V

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lz2/d;->u()V

    :goto_0
    return-void
.end method

.method private final G()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-interface {v0}, Lz2/d;->B0()V

    invoke-virtual {p0}, Lo2/n;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/c;->r()V

    :cond_0
    return-void
.end method

.method private final L()V
    .locals 3

    .prologue
    iget-object v0, p0, Lo2/n;->b:LW8/N;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "coroutineScope"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LW8/O;->e(LW8/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/c;->v()V

    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    if-nez v0, :cond_1

    const-string v0, "connectionManager"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lo2/m;->C()V

    return-void
.end method

.method public static final synthetic a(Lo2/n;)V
    .locals 0

    invoke-direct {p0}, Lo2/n;->F()V

    return-void
.end method

.method public static final synthetic b(Lo2/n;)V
    .locals 0

    invoke-direct {p0}, Lo2/n;->G()V

    return-void
.end method

.method public static final synthetic c(Lo2/n;)V
    .locals 0

    invoke-direct {p0}, Lo2/n;->L()V

    return-void
.end method


# virtual methods
.method public final A(LF7/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final B()Z
    .locals 1

    iget-boolean v0, p0, Lo2/n;->n:Z

    return v0
.end method

.method public final C()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    if-nez v0, :cond_0

    const-string v0, "connectionManager"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lo2/m;->D()Lz2/e;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D()Z
    .locals 1

    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-interface {v0}, Lz2/d;->V0()Z

    move-result v0

    return v0
.end method

.method public E(Lo2/c;)V
    .locals 7

    .prologue
    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lo2/n;->j(Lo2/c;)Lo2/m;

    move-result-object v0

    iput-object v0, p0, Lo2/n;->f:Lo2/m;

    invoke-virtual {p0}, Lo2/n;->k()Landroidx/room/c;

    move-result-object v0

    iput-object v0, p0, Lo2/n;->g:Landroidx/room/c;

    invoke-static {p0, p1}, Lo2/o;->b(Lo2/n;Lo2/c;)V

    invoke-static {p0, p1}, Lo2/o;->d(Lo2/n;Lo2/c;)V

    iget-object v0, p1, Lo2/c;->u:Lm7/i;

    const/4 v1, 0x1

    const-string v2, "internalQueryExecutor"

    const-string v3, "coroutineScope"

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    sget-object v5, Lm7/f;->A:Lm7/f$b;

    invoke-interface {v0, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    const-string v5, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher"

    invoke-static {v0, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LW8/J;

    invoke-static {v0}, LW8/s0;->a(LW8/J;)Ljava/util/concurrent/Executor;

    move-result-object v5

    iput-object v5, p0, Lo2/n;->d:Ljava/util/concurrent/Executor;

    new-instance v6, Lo2/z;

    if-nez v5, :cond_0

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v5, v4

    :cond_0
    invoke-direct {v6, v5}, Lo2/z;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v6, p0, Lo2/n;->e:Ljava/util/concurrent/Executor;

    iget-object v2, p1, Lo2/c;->u:Lm7/i;

    sget-object v5, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v2, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v2

    check-cast v2, LW8/z0;

    iget-object v5, p1, Lo2/c;->u:Lm7/i;

    invoke-static {v2}, LW8/U0;->a(LW8/z0;)LW8/y;

    move-result-object v2

    invoke-interface {v5, v2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v2

    invoke-static {v2}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v2

    iput-object v2, p0, Lo2/n;->b:LW8/N;

    invoke-virtual {p0}, Lo2/n;->C()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lo2/n;->b:LW8/N;

    if-nez v2, :cond_1

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    invoke-interface {v2}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v2

    invoke-virtual {v0, v1}, LW8/J;->w1(I)LW8/J;

    move-result-object v0

    invoke-interface {v2, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo2/n;->b:LW8/N;

    if-nez v0, :cond_3

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v4

    :cond_3
    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lo2/n;->c:Lm7/i;

    goto :goto_1

    :cond_4
    iget-object v0, p1, Lo2/c;->h:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lo2/n;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lo2/z;

    iget-object v5, p1, Lo2/c;->i:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v5}, Lo2/z;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lo2/n;->e:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lo2/n;->d:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_5

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v4

    :cond_5
    invoke-static {v0}, LW8/s0;->b(Ljava/util/concurrent/Executor;)LW8/J;

    move-result-object v0

    invoke-static {v4, v1, v4}, LW8/U0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm7/a;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v0

    iput-object v0, p0, Lo2/n;->b:LW8/N;

    if-nez v0, :cond_6

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v4

    :cond_6
    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    iget-object v1, p0, Lo2/n;->e:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_7

    const-string v1, "internalTransactionExecutor"

    invoke-static {v1}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v4

    :cond_7
    invoke-static {v1}, LW8/s0;->b(Ljava/util/concurrent/Executor;)LW8/J;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-boolean v0, p1, Lo2/c;->f:Z

    iput-boolean v0, p0, Lo2/n;->i:Z

    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    const-string v1, "connectionManager"

    if-nez v0, :cond_8

    invoke-static {v1}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v4

    :cond_8
    invoke-virtual {v0}, Lo2/m;->D()Lz2/e;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    move-object v0, v4

    goto :goto_3

    :cond_a
    :goto_2
    instance-of v2, v0, Lv2/e;

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    instance-of v2, v0, Lo2/d;

    if-eqz v2, :cond_9

    check-cast v0, Lo2/d;

    invoke-interface {v0}, Lo2/d;->a()Lz2/e;

    move-result-object v0

    goto :goto_2

    :goto_3
    check-cast v0, Lv2/e;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p1}, Lv2/e;->i(Lo2/c;)V

    :cond_c
    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    if-nez v0, :cond_d

    invoke-static {v1}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v4

    :cond_d
    invoke-virtual {v0}, Lo2/m;->D()Lz2/e;

    move-result-object v0

    if-nez v0, :cond_f

    :cond_e
    move-object v0, v4

    goto :goto_5

    :cond_f
    :goto_4
    instance-of v1, v0, Lv2/c;

    if-eqz v1, :cond_10

    goto :goto_5

    :cond_10
    instance-of v1, v0, Lo2/d;

    if-eqz v1, :cond_e

    check-cast v0, Lo2/d;

    invoke-interface {v0}, Lo2/d;->a()Lz2/e;

    move-result-object v0

    goto :goto_4

    :goto_5
    check-cast v0, Lv2/c;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lv2/c;->f()Lv2/b;

    move-result-object v1

    iput-object v1, p0, Lo2/n;->k:Lv2/b;

    invoke-virtual {v0}, Lv2/c;->f()Lv2/b;

    move-result-object v1

    iget-object v2, p0, Lo2/n;->b:LW8/N;

    if-nez v2, :cond_11

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_6

    :cond_11
    move-object v4, v2

    :goto_6
    invoke-virtual {v1, v4}, Lv2/b;->k(LW8/N;)V

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v1

    invoke-virtual {v0}, Lv2/c;->f()Lv2/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/room/c;->u(Lv2/b;)V

    :cond_12
    iget-object v0, p1, Lo2/c;->j:Landroid/content/Intent;

    if-eqz v0, :cond_14

    iget-object v0, p1, Lo2/c;->b:Ljava/lang/String;

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v0

    iget-object v1, p1, Lo2/c;->a:Landroid/content/Context;

    iget-object v2, p1, Lo2/c;->b:Ljava/lang/String;

    iget-object v3, p1, Lo2/c;->j:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/room/c;->k(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V

    goto :goto_7

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    :goto_7
    invoke-virtual {p1}, Lo2/c;->d()Z

    move-result p1

    iput-boolean p1, p0, Lo2/n;->n:Z

    return-void
.end method

.method protected final H(Ly2/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/room/c;->l(Ly2/b;)V

    return-void
.end method

.method protected I(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr2/a;

    invoke-direct {v0, p1}, Lr2/a;-><init>(Lz2/d;)V

    invoke-virtual {p0, v0}, Lo2/n;->H(Ly2/b;)V

    return-void
.end method

.method public final J()Z
    .locals 2

    .prologue
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    if-nez v0, :cond_0

    const-string v0, "connectionManager"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lo2/m;->G()Z

    move-result v0

    return v0
.end method

.method public M(Lz2/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .prologue
    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/n;->e()V

    invoke-virtual {p0}, Lo2/n;->f()V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lz2/d;->L0(Lz2/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object p2

    invoke-interface {p2}, Lz2/e;->v0()Lz2/d;

    move-result-object p2

    invoke-interface {p2, p1}, Lz2/d;->T(Lz2/g;)Landroid/database/Cursor;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public N()V
    .locals 1

    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-interface {v0}, Lz2/d;->i0()V

    return-void
.end method

.method public final O(ZLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    if-nez v0, :cond_0

    const-string v0, "connectionManager"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lo2/m;->H(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(LF7/c;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "kclass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "converter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n;->m:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lo2/n;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lo2/n;->J()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/n;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo2/n;->D()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo2/n;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public g()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/n;->e()V

    iget-object v0, p0, Lo2/n;->k:Lv2/b;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo2/n;->F()V

    goto :goto_0

    :cond_0
    new-instance v1, Lo2/n$g;

    invoke-direct {v1, p0}, Lo2/n$g;-><init>(Lo2/n;)V

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public h(Ljava/lang/String;)Lz2/h;
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/n;->e()V

    invoke-virtual {p0}, Lo2/n;->f()V

    invoke-virtual {p0}, Lo2/n;->s()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lz2/d;->J(Ljava/lang/String;)Lz2/h;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/util/Map;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lj7/S;->d(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF7/c;

    invoke-static {v2}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lo2/n;->o(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lo2/c;)Lo2/m;
    .locals 2

    .prologue
    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lo2/n;->l()Lo2/s;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lo2/r;
    :try_end_0
    .catch Li7/t; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Lo2/m;

    new-instance v1, Lo2/n$i;

    invoke-direct {v1, p0}, Lo2/n$i;-><init>(Lo2/n;)V

    invoke-direct {v0, p1, v1}, Lo2/m;-><init>(Lo2/c;Lx7/l;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lo2/m;

    invoke-direct {v1, p1, v0}, Lo2/m;-><init>(Lo2/c;Lo2/r;)V

    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method protected abstract k()Landroidx/room/c;
.end method

.method protected l()Lo2/s;
    .locals 3

    new-instance v0, Li7/t;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Li7/t;-><init>(Ljava/lang/String;ILy7/k;)V

    throw v0
.end method

.method protected m(Lo2/c;)Lz2/e;
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li7/t;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, Li7/t;-><init>(Ljava/lang/String;ILy7/k;)V

    throw p1
.end method

.method public n()V
    .locals 2

    .prologue
    iget-object v0, p0, Lo2/n;->k:Lv2/b;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo2/n;->G()V

    goto :goto_0

    :cond_0
    new-instance v1, Lo2/n$j;

    invoke-direct {v1, p0}, Lo2/n$j;-><init>(Lo2/n;)V

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public o(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final p()Lp2/a;
    .locals 1

    iget-object v0, p0, Lo2/n;->h:Lp2/a;

    return-object v0
.end method

.method public final q()LW8/N;
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->b:LW8/N;

    if-nez v0, :cond_0

    const-string v0, "coroutineScope"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public r()Landroidx/room/c;
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->g:Landroidx/room/c;

    if-nez v0, :cond_0

    const-string v0, "internalTracker"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public s()Lz2/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lo2/n;->f:Lo2/m;

    if-nez v0, :cond_0

    const-string v0, "connectionManager"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lo2/m;->D()Lz2/e;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t()Lm7/i;
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->b:LW8/N;

    if-nez v0, :cond_0

    const-string v0, "coroutineScope"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Set;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lo2/n;->v()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-static {v2}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/util/Set;
    .locals 1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected w()Ljava/util/Map;
    .locals 7

    .prologue
    invoke-virtual {p0}, Lo2/n;->y()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lj7/S;->d(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, LE7/j;->d(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v4}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object v4

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    invoke-static {v6}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v4, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-virtual {v2}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public final x()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lo2/n;->w()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected y()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final z()Lm7/i;
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/n;->c:Lm7/i;

    if-nez v0, :cond_0

    const-string v0, "transactionContext"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
