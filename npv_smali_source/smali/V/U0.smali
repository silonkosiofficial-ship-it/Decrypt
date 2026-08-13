.class public final LV/U0;
.super LV/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/U0$a;,
        LV/U0$b;,
        LV/U0$c;,
        LV/U0$d;
    }
.end annotation


# static fields
.field private static final A:LZ8/y;

.field private static final B:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final y:LV/U0$a;

.field public static final z:I


# instance fields
.field private a:J

.field private final b:LV/i;

.field private final c:Ljava/lang/Object;

.field private d:LW8/z0;

.field private e:Ljava/lang/Throwable;

.field private final f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Lr/L;

.field private final i:LX/b;

.field private final j:Ljava/util/List;

.field private final k:Ljava/util/List;

.field private final l:Ljava/util/Map;

.field private final m:Ljava/util/Map;

.field private n:Ljava/util/List;

.field private o:Ljava/util/Set;

.field private p:LW8/l;

.field private q:I

.field private r:Z

.field private s:LV/U0$b;

.field private t:Z

.field private final u:LZ8/y;

.field private final v:LW8/y;

.field private final w:Lm7/i;

.field private final x:LV/U0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV/U0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/U0$a;-><init>(Ly7/k;)V

    sput-object v0, LV/U0;->y:LV/U0$a;

    const/16 v0, 0x8

    sput v0, LV/U0;->z:I

    invoke-static {}, LY/a;->b()LY/g;

    move-result-object v0

    invoke-static {v0}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v0

    sput-object v0, LV/U0;->A:LZ8/y;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, LV/U0;->B:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lm7/i;)V
    .locals 5

    invoke-direct {p0}, LV/s;-><init>()V

    new-instance v0, LV/i;

    new-instance v1, LV/U0$e;

    invoke-direct {v1, p0}, LV/U0$e;-><init>(LV/U0;)V

    invoke-direct {v0, v1}, LV/i;-><init>(Lx7/a;)V

    iput-object v0, p0, LV/U0;->b:LV/i;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LV/U0;->c:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LV/U0;->f:Ljava/util/List;

    new-instance v1, Lr/L;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lr/L;-><init>(IILy7/k;)V

    iput-object v1, p0, LV/U0;->h:Lr/L;

    new-instance v1, LX/b;

    const/16 v2, 0x10

    new-array v2, v2, [LV/G;

    invoke-direct {v1, v2, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v1, p0, LV/U0;->i:LX/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LV/U0;->j:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LV/U0;->k:Ljava/util/List;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LV/U0;->l:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LV/U0;->m:Ljava/util/Map;

    sget-object v1, LV/U0$d;->E:LV/U0$d;

    invoke-static {v1}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v1

    iput-object v1, p0, LV/U0;->u:LZ8/y;

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    check-cast v1, LW8/z0;

    invoke-static {v1}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object v1

    new-instance v2, LV/U0$f;

    invoke-direct {v2, p0}, LV/U0$f;-><init>(LV/U0;)V

    invoke-interface {v1, v2}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    iput-object v1, p0, LV/U0;->v:LW8/y;

    invoke-interface {p1, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    invoke-interface {p1, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    iput-object p1, p0, LV/U0;->w:Lm7/i;

    new-instance p1, LV/U0$c;

    invoke-direct {p1, p0}, LV/U0$c;-><init>(LV/U0;)V

    iput-object p1, p0, LV/U0;->x:LV/U0$c;

    return-void
.end method

.method public static final synthetic A(LV/U0;)Z
    .locals 0

    invoke-direct {p0}, LV/U0;->h0()Z

    move-result p0

    return p0
.end method

.method private final A0(LV/G;Lr/L;)Lx7/l;
    .locals 1

    new-instance v0, LV/U0$l;

    invoke-direct {v0, p1, p2}, LV/U0$l;-><init>(LV/G;Lr/L;)V

    return-object v0
.end method

.method public static final synthetic B(LV/U0;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LV/U0;->i0()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(LV/U0;)LV/U0$c;
    .locals 0

    iget-object p0, p0, LV/U0;->x:LV/U0$c;

    return-object p0
.end method

.method public static final synthetic D(LV/U0;)LW8/z0;
    .locals 0

    iget-object p0, p0, LV/U0;->d:LW8/z0;

    return-object p0
.end method

.method public static final synthetic E(LV/U0;)Z
    .locals 0

    invoke-direct {p0}, LV/U0;->j0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic F(LV/U0;)Lr/L;
    .locals 0

    iget-object p0, p0, LV/U0;->h:Lr/L;

    return-object p0
.end method

.method public static final synthetic G(LV/U0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LV/U0;->c:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic H(LV/U0;)LW8/l;
    .locals 0

    iget-object p0, p0, LV/U0;->p:LW8/l;

    return-object p0
.end method

.method public static final synthetic I()LZ8/y;
    .locals 1

    sget-object v0, LV/U0;->A:LZ8/y;

    return-object v0
.end method

.method public static final synthetic J(LV/U0;)LZ8/y;
    .locals 0

    iget-object p0, p0, LV/U0;->u:LZ8/y;

    return-object p0
.end method

.method public static final synthetic K(LV/U0;)Z
    .locals 0

    iget-boolean p0, p0, LV/U0;->r:Z

    return p0
.end method

.method public static final synthetic L(LV/U0;Ljava/util/List;Lr/L;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, LV/U0;->o0(Ljava/util/List;Lr/L;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M(LV/U0;LV/G;Lr/L;)LV/G;
    .locals 0

    invoke-direct {p0, p1, p2}, LV/U0;->p0(LV/G;Lr/L;)LV/G;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(LV/U0;)Z
    .locals 0

    invoke-direct {p0}, LV/U0;->u0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic O(LV/U0;LV/G;)V
    .locals 0

    invoke-direct {p0, p1}, LV/U0;->v0(LV/G;)V

    return-void
.end method

.method public static final synthetic P(LV/U0;LW8/z0;)V
    .locals 0

    invoke-direct {p0, p1}, LV/U0;->w0(LW8/z0;)V

    return-void
.end method

.method public static final synthetic Q(LV/U0;J)V
    .locals 0

    iput-wide p1, p0, LV/U0;->a:J

    return-void
.end method

.method public static final synthetic R(LV/U0;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LV/U0;->e:Ljava/lang/Throwable;

    return-void
.end method

.method public static final synthetic S(LV/U0;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, LV/U0;->o:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic T(LV/U0;LW8/z0;)V
    .locals 0

    iput-object p1, p0, LV/U0;->d:LW8/z0;

    return-void
.end method

.method public static final synthetic U(LV/U0;LW8/l;)V
    .locals 0

    iput-object p1, p0, LV/U0;->p:LW8/l;

    return-void
.end method

.method private final V(LV/G;)V
    .locals 1

    iget-object v0, p0, LV/U0;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LV/U0;->g:Ljava/util/List;

    return-void
.end method

.method private final W(Lf0/c;)V
    .locals 2

    .prologue
    :try_start_0
    invoke-virtual {p1}, Lf0/c;->C()Lf0/l;

    move-result-object v0

    instance-of v0, v0, Lf0/l$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lf0/c;->d()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lf0/c;->d()V

    throw v0
.end method

.method private final X(Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0}, LV/U0;->h0()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, LW8/n;

    invoke-static {p1}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    invoke-static {p0}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, LV/U0;->A(LV/U0;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, LV/U0;->U(LV/U0;LW8/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :goto_0
    monitor-exit v1

    if-eqz v2, :cond_1

    sget-object v1, Li7/w;->D:Li7/w$a;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_2
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_3

    return-object v0

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final Z()V
    .locals 1

    iget-object v0, p0, LV/U0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LV/U0;->g:Ljava/util/List;

    return-void
.end method

.method private final a0()LW8/l;
    .locals 4

    .prologue
    iget-object v0, p0, LV/U0;->u:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/U0$d;

    sget-object v1, LV/U0$d;->D:LV/U0$d;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gtz v0, :cond_1

    invoke-direct {p0}, LV/U0;->Z()V

    new-instance v0, Lr/L;

    invoke-direct {v0, v1, v2, v3}, Lr/L;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/U0;->h:Lr/L;

    iget-object v0, p0, LV/U0;->i:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    iget-object v0, p0, LV/U0;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LV/U0;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iput-object v3, p0, LV/U0;->n:Ljava/util/List;

    iget-object v0, p0, LV/U0;->p:LW8/l;

    if-eqz v0, :cond_0

    invoke-static {v0, v3, v2, v3}, LW8/l$a;->a(LW8/l;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_0
    iput-object v3, p0, LV/U0;->p:LW8/l;

    iput-object v3, p0, LV/U0;->s:LV/U0$b;

    return-object v3

    :cond_1
    iget-object v0, p0, LV/U0;->s:LV/U0$b;

    if-eqz v0, :cond_3

    :cond_2
    sget-object v0, LV/U0$d;->E:LV/U0$d;

    goto :goto_1

    :cond_3
    iget-object v0, p0, LV/U0;->d:LW8/z0;

    if-nez v0, :cond_4

    new-instance v0, Lr/L;

    invoke-direct {v0, v1, v2, v3}, Lr/L;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/U0;->h:Lr/L;

    iget-object v0, p0, LV/U0;->i:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    invoke-direct {p0}, LV/U0;->f0()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LV/U0$d;->F:LV/U0$d;

    goto :goto_1

    :cond_4
    iget-object v0, p0, LV/U0;->i:LX/b;

    invoke-virtual {v0}, LX/b;->x()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LV/U0;->h:Lr/L;

    invoke-virtual {v0}, Lr/W;->e()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LV/U0;->j:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-nez v0, :cond_6

    iget-object v0, p0, LV/U0;->k:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-nez v0, :cond_6

    iget v0, p0, LV/U0;->q:I

    if-gtz v0, :cond_6

    invoke-direct {p0}, LV/U0;->f0()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, LV/U0$d;->G:LV/U0$d;

    goto :goto_1

    :cond_6
    :goto_0
    sget-object v0, LV/U0$d;->H:LV/U0$d;

    :goto_1
    iget-object v1, p0, LV/U0;->u:LZ8/y;

    invoke-interface {v1, v0}, LZ8/y;->setValue(Ljava/lang/Object;)V

    sget-object v1, LV/U0$d;->H:LV/U0$d;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, LV/U0;->p:LW8/l;

    iput-object v3, p0, LV/U0;->p:LW8/l;

    move-object v3, v0

    :cond_7
    return-object v3
.end method

.method private final b0()V
    .locals 8

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, LV/U0;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lj7/v;->z(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, LV/U0;->l:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_0

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LV/o0;

    iget-object v7, p0, LV/U0;->m:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    iget-object v1, p0, LV/U0;->m:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    goto :goto_1

    :cond_1
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v2, v0, :cond_2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/u;

    invoke-virtual {v1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/o0;

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/n0;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method private final e0()Z
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, LV/U0;->f0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final f0()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, LV/U0;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LV/U0;->b:LV/i;

    invoke-virtual {v0}, LV/i;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final g0()Z
    .locals 1

    .prologue
    iget-object v0, p0, LV/U0;->i:LX/b;

    invoke-virtual {v0}, LX/b;->x()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LV/U0;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final h0()Z
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->h:Lr/L;

    invoke-virtual {v1}, Lr/W;->e()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LV/U0;->i:LX/b;

    invoke-virtual {v1}, LX/b;->x()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0}, LV/U0;->f0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method private final i0()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->g:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v0, p0, LV/U0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, LV/U0;->g:Ljava/util/List;

    :cond_1
    return-object v0
.end method

.method private final j0()Z
    .locals 3

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LV/U0;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    monitor-exit v0

    if-nez v1, :cond_2

    iget-object v0, p0, LV/U0;->v:LW8/y;

    invoke-interface {v0}, LW8/z0;->N()LR8/h;

    move-result-object v0

    invoke-interface {v0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW8/z0;

    invoke-interface {v1}, LW8/z0;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final m0(LV/G;)V
    .locals 5

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/o0;

    invoke-virtual {v4}, LV/o0;->b()LV/G;

    move-result-object v4

    invoke-static {v4, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-static {v0, p0, p1}, LV/U0;->n0(Ljava/util/List;LV/U0;LV/G;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LV/U0;->o0(Ljava/util/List;Lr/L;)Ljava/util/List;

    goto :goto_1

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method private static final n0(Ljava/util/List;LV/U0;LV/G;)V
    .locals 3

    .prologue
    invoke-interface {p0}, Ljava/util/List;->clear()V

    iget-object v0, p1, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, LV/U0;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/o0;

    invoke-virtual {v1}, LV/o0;->b()LV/G;

    move-result-object v2

    invoke-static {v2, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    sget-object p0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method private final o0(Ljava/util/List;Lr/L;)Ljava/util/List;
    .locals 13

    .prologue
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LV/o0;

    invoke-virtual {v5}, LV/o0;->b()LV/G;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/G;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v3}, LV/G;->p()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, LV/q;->O(Z)V

    sget-object v4, Lf0/k;->e:Lf0/k$a;

    invoke-direct {p0, v3}, LV/U0;->s0(LV/G;)Lx7/l;

    move-result-object v5

    invoke-direct {p0, v3, p2}, LV/U0;->A0(LV/G;Lr/L;)Lx7/l;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lf0/k$a;->o(Lx7/l;Lx7/l;)Lf0/c;

    move-result-object v4

    :try_start_0
    invoke-virtual {v4}, Lf0/k;->l()Lf0/k;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v6, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    move v9, v2

    :goto_2
    const/4 v10, 0x0

    if-ge v9, v8, :cond_2

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LV/o0;

    iget-object v12, p0, LV/U0;->l:Ljava/util/Map;

    invoke-virtual {v11}, LV/o0;->c()LV/m0;

    invoke-static {v12, v10}, LV/V0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11, v10}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_2
    :try_start_3
    monitor-exit v6

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    move v6, v2

    :goto_3
    if-ge v6, v1, :cond_a

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li7/u;

    invoke-virtual {v8}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_3
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    move v6, v2

    :goto_4
    if-ge v6, v1, :cond_a

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li7/u;

    invoke-virtual {v8}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    move v8, v2

    :goto_5
    if-ge v8, v6, :cond_7

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li7/u;

    invoke-virtual {v9}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_5

    invoke-virtual {v9}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LV/o0;

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_a

    :cond_5
    move-object v9, v10

    :goto_6
    if-eqz v9, :cond_6

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    iget-object v6, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v8, p0, LV/U0;->k:Ljava/util/List;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8, v1}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v6

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    move v8, v2

    :goto_7
    if-ge v8, v6, :cond_9

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Li7/u;

    invoke-virtual {v10}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_8

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_9
    move-object v7, v1

    goto :goto_8

    :catchall_2
    move-exception p1

    monitor-exit v6

    throw p1

    :cond_a
    :goto_8
    invoke-interface {v3, v7}, LV/G;->q(Ljava/util/List;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v4, v5}, Lf0/k;->s(Lf0/k;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-direct {p0, v4}, LV/U0;->W(Lf0/c;)V

    goto/16 :goto_1

    :catchall_3
    move-exception p1

    goto :goto_b

    :goto_9
    :try_start_7
    monitor-exit v6

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_a
    :try_start_8
    invoke-virtual {v4, v5}, Lf0/k;->s(Lf0/k;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_b
    invoke-direct {p0, v4}, LV/U0;->W(Lf0/c;)V

    throw p1

    :cond_b
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final p0(LV/G;Lr/L;)LV/G;
    .locals 5

    .prologue
    invoke-interface {p1}, LV/G;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-interface {p1}, LV/r;->l()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LV/U0;->o:Ljava/util/Set;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_4

    :cond_0
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-direct {p0, p1}, LV/U0;->s0(LV/G;)Lx7/l;

    move-result-object v3

    invoke-direct {p0, p1, p2}, LV/U0;->A0(LV/G;Lr/L;)Lx7/l;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lf0/k$a;->o(Lx7/l;Lx7/l;)Lf0/c;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Lf0/k;->l()Lf0/k;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_1

    :try_start_1
    invoke-virtual {p2}, Lr/W;->e()Z

    move-result v4

    if-ne v4, v2, :cond_1

    new-instance v2, LV/U0$h;

    invoke-direct {v2, p2, p1}, LV/U0$h;-><init>(Lr/L;LV/G;)V

    invoke-interface {p1, v2}, LV/G;->b(Lx7/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-interface {p1}, LV/G;->w()Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0, v3}, Lf0/k;->s(Lf0/k;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-direct {p0, v0}, LV/U0;->W(Lf0/c;)V

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_3
    invoke-virtual {v0, v3}, Lf0/k;->s(Lf0/k;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    invoke-direct {p0, v0}, LV/U0;->W(Lf0/c;)V

    throw p1

    :cond_3
    :goto_4
    return-object v1
.end method

.method private final q0(Ljava/lang/Exception;LV/G;Z)V
    .locals 5

    .prologue
    sget-object v0, LV/U0;->B:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v0, p1, LV/m;

    if-nez v0, :cond_1

    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v2, "Error was captured in composition while live edit was enabled."

    invoke-static {v2, p1}, LV/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v2, p0, LV/U0;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, p0, LV/U0;->i:LX/b;

    invoke-virtual {v2}, LX/b;->j()V

    new-instance v2, Lr/L;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, Lr/L;-><init>(IILy7/k;)V

    iput-object v2, p0, LV/U0;->h:Lr/L;

    iget-object v1, p0, LV/U0;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, LV/U0;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, LV/U0;->m:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    new-instance v1, LV/U0$b;

    invoke-direct {v1, p3, p1}, LV/U0$b;-><init>(ZLjava/lang/Exception;)V

    iput-object v1, p0, LV/U0;->s:LV/U0$b;

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, LV/U0;->v0(LV/G;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-direct {p0}, LV/U0;->a0()LW8/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :cond_1
    iget-object p2, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object p3, p0, LV/U0;->s:LV/U0$b;

    if-nez p3, :cond_2

    new-instance p3, LV/U0$b;

    invoke-direct {p3, v1, p1}, LV/U0$b;-><init>(ZLjava/lang/Exception;)V

    iput-object p3, p0, LV/U0;->s:LV/U0$b;

    sget-object p3, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :try_start_2
    invoke-virtual {p3}, LV/U0$b;->a()Ljava/lang/Exception;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit p2

    throw p1
.end method

.method static synthetic r0(LV/U0;Ljava/lang/Exception;LV/G;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LV/U0;->q0(Ljava/lang/Exception;LV/G;Z)V

    return-void
.end method

.method public static final synthetic s(LV/U0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LV/U0;->X(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final s0(LV/G;)Lx7/l;
    .locals 1

    new-instance v0, LV/U0$i;

    invoke-direct {v0, p1}, LV/U0$i;-><init>(LV/G;)V

    return-object v0
.end method

.method public static final synthetic t(LV/U0;)LW8/l;
    .locals 0

    invoke-direct {p0}, LV/U0;->a0()LW8/l;

    move-result-object p0

    return-object p0
.end method

.method private final t0(Lx7/q;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, LV/l0;->a(Lm7/i;)LV/j0;

    move-result-object v0

    iget-object v1, p0, LV/U0;->b:LV/i;

    new-instance v2, LV/U0$j;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, LV/U0$j;-><init>(LV/U0;Lx7/q;LV/j0;Lm7/e;)V

    invoke-static {v1, v2, p2}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public static final synthetic u(LV/U0;)V
    .locals 0

    invoke-direct {p0}, LV/U0;->b0()V

    return-void
.end method

.method private final u0()Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    iget-object v1, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LV/U0;->h:Lr/L;

    invoke-virtual {v2}, Lr/W;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, LV/U0;->g0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :try_start_1
    iget-object v2, p0, LV/U0;->h:Lr/L;

    invoke-static {v2}, LX/e;->a(Lr/W;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, Lr/L;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v5, v0, v4}, Lr/L;-><init>(IILy7/k;)V

    iput-object v3, p0, LV/U0;->h:Lr/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    iget-object v1, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    invoke-direct {p0}, LV/U0;->i0()Ljava/util/List;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    monitor-exit v1

    :try_start_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move v6, v5

    :goto_0
    if-ge v6, v1, :cond_1

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LV/G;

    invoke-interface {v7, v2}, LV/G;->m(Ljava/util/Set;)V

    iget-object v7, p0, LV/U0;->u:LZ8/y;

    invoke-interface {v7}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LV/U0$d;

    sget-object v8, LV/U0$d;->D:LV/U0$d;

    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v7

    if-lez v7, :cond_1

    add-int/2addr v6, v0

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v1, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    new-instance v3, Lr/L;

    invoke-direct {v3, v5, v0, v4}, Lr/L;-><init>(IILy7/k;)V

    iput-object v3, p0, LV/U0;->h:Lr/L;

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_6
    invoke-direct {p0}, LV/U0;->a0()LW8/l;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-direct {p0}, LV/U0;->g0()Z

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v0

    return v1

    :catchall_2
    move-exception v1

    goto :goto_1

    :cond_2
    :try_start_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "called outside of runRecomposeAndApplyChanges"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_1
    monitor-exit v0

    throw v1

    :catchall_3
    move-exception v0

    :try_start_8
    monitor-exit v1

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    iget-object v1, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_9
    iget-object v3, p0, LV/U0;->h:Lr/L;

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual {v3, v2}, Lr/L;->i(Ljava/lang/Iterable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    monitor-exit v1

    throw v0

    :catchall_4
    move-exception v0

    monitor-exit v1

    throw v0

    :catchall_5
    move-exception v0

    monitor-exit v1

    throw v0

    :goto_3
    monitor-exit v1

    throw v0
.end method

.method public static final synthetic v(LV/U0;)LV/i;
    .locals 0

    iget-object p0, p0, LV/U0;->b:LV/i;

    return-object p0
.end method

.method private final v0(LV/G;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->n:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LV/U0;->n:Ljava/util/List;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-direct {p0, p1}, LV/U0;->x0(LV/G;)V

    return-void
.end method

.method public static final synthetic w(LV/U0;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, LV/U0;->e:Ljava/lang/Throwable;

    return-object p0
.end method

.method private final w0(LW8/z0;)V
    .locals 3

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->e:Ljava/lang/Throwable;

    if-nez v1, :cond_2

    iget-object v1, p0, LV/U0;->u:LZ8/y;

    invoke-interface {v1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/U0$d;

    sget-object v2, LV/U0$d;->D:LV/U0$d;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, LV/U0;->d:LW8/z0;

    if-nez v1, :cond_0

    iput-object p1, p0, LV/U0;->d:LW8/z0;

    invoke-direct {p0}, LV/U0;->a0()LW8/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Recomposer already running"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Recomposer shut down"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public static final synthetic x(LV/U0;)LX/b;
    .locals 0

    iget-object p0, p0, LV/U0;->i:LX/b;

    return-object p0
.end method

.method private final x0(LV/G;)V
    .locals 1

    iget-object v0, p0, LV/U0;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LV/U0;->g:Ljava/util/List;

    return-void
.end method

.method public static final synthetic y(LV/U0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LV/U0;->k:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic z(LV/U0;)Z
    .locals 0

    invoke-direct {p0}, LV/U0;->e0()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final Y()V
    .locals 3

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->u:LZ8/y;

    invoke-interface {v1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/U0$d;

    sget-object v2, LV/U0$d;->G:LV/U0$d;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, LV/U0;->u:LZ8/y;

    sget-object v2, LV/U0$d;->D:LV/U0$d;

    invoke-interface {v1, v2}, LZ8/y;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LV/U0;->v:LW8/y;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public a(LV/G;Lx7/p;)V
    .locals 6

    .prologue
    invoke-interface {p1}, LV/G;->p()Z

    move-result v0

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-direct {p0, p1}, LV/U0;->s0(LV/G;)Lx7/l;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {p0, p1, v4}, LV/U0;->A0(LV/G;Lr/L;)Lx7/l;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lf0/k$a;->o(Lx7/l;Lx7/l;)Lf0/c;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v3}, Lf0/k;->l()Lf0/k;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p1, p2}, LV/G;->j(Lx7/p;)V

    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3, v4}, Lf0/k;->s(Lf0/k;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-direct {p0, v3}, LV/U0;->W(Lf0/c;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lf0/k$a;->g()V

    :cond_0
    iget-object p2, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_5
    iget-object v3, p0, LV/U0;->u:LZ8/y;

    invoke-interface {v3}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/U0$d;

    sget-object v4, LV/U0$d;->D:LV/U0$d;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_1

    invoke-direct {p0}, LV/U0;->i0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-direct {p0, p1}, LV/U0;->V(LV/G;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p2

    :try_start_6
    invoke-direct {p0, p1}, LV/U0;->m0(LV/G;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    invoke-interface {p1}, LV/G;->n()V

    invoke-interface {p1}, LV/G;->k()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Lf0/k$a;->g()V

    :cond_2
    return-void

    :catch_0
    move-exception p1

    move-object v1, p1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LV/U0;->r0(LV/U0;Ljava/lang/Exception;LV/G;ZILjava/lang/Object;)V

    return-void

    :catch_1
    move-exception p2

    invoke-direct {p0, p2, p1, v1}, LV/U0;->q0(Ljava/lang/Exception;LV/G;Z)V

    return-void

    :goto_1
    monitor-exit p2

    throw p1

    :catch_2
    move-exception p2

    goto :goto_3

    :catchall_1
    move-exception p2

    goto :goto_2

    :catchall_2
    move-exception p2

    :try_start_8
    invoke-virtual {v3, v4}, Lf0/k;->s(Lf0/k;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    :try_start_9
    invoke-direct {p0, v3}, LV/U0;->W(Lf0/c;)V

    throw p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    :goto_3
    invoke-direct {p0, p2, p1, v1}, LV/U0;->q0(Ljava/lang/Exception;LV/G;Z)V

    return-void
.end method

.method public c()Z
    .locals 1

    sget-object v0, LV/U0;->B:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c0()J
    .locals 2

    iget-wide v0, p0, LV/U0;->a:J

    return-wide v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d0()LZ8/N;
    .locals 1

    iget-object v0, p0, LV/U0;->u:LZ8/y;

    return-object v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    const/16 v0, 0x3e8

    return v0
.end method

.method public h()Lm7/i;
    .locals 1

    iget-object v0, p0, LV/U0;->w:Lm7/i;

    return-object v0
.end method

.method public j(LV/o0;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->k:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, LV/U0;->a0()LW8/l;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p1, :cond_0

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public k(LV/G;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->i:LX/b;

    invoke-virtual {v1, p1}, LX/b;->l(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LV/U0;->i:LX/b;

    invoke-virtual {v1, p1}, LX/b;->d(Ljava/lang/Object;)Z

    invoke-direct {p0}, LV/U0;->a0()LW8/l;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    if-eqz p1, :cond_1

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final k0(Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-virtual {p0}, LV/U0;->d0()LZ8/N;

    move-result-object v0

    new-instance v1, LV/U0$g;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LV/U0$g;-><init>(Lm7/e;)V

    invoke-static {v0, v1, p1}, LZ8/h;->v(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public l(LV/o0;)LV/n0;
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->m:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final l0()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LV/U0;->t:Z

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public m(Ljava/util/Set;)V
    .locals 0

    return-void
.end method

.method public o(LV/G;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/U0;->o:Ljava/util/Set;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, LV/U0;->o:Ljava/util/Set;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public r(LV/G;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1}, LV/U0;->x0(LV/G;)V

    iget-object v1, p0, LV/U0;->i:LX/b;

    invoke-virtual {v1, p1}, LX/b;->A(Ljava/lang/Object;)Z

    iget-object v1, p0, LV/U0;->j:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final y0()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LV/U0;->t:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, LV/U0;->t:Z

    invoke-direct {p0}, LV/U0;->a0()LW8/l;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    if-eqz v1, :cond_1

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final z0(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, LV/U0$k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LV/U0$k;-><init>(LV/U0;Lm7/e;)V

    invoke-direct {p0, v0, p1}, LV/U0;->t0(Lx7/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
