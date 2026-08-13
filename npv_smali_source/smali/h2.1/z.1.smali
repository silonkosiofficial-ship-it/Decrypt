.class public final Lh2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/z$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lh2/L;

.field private final c:Lh2/E;

.field private final d:LZ8/f;

.field private final e:Lh2/Q;

.field private final f:Lh2/M;

.field private final g:Lx7/a;

.field private final h:Lh2/m;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final j:LY8/j;

.field private final k:Lh2/B$a;

.field private final l:LW8/y;

.field private final m:LZ8/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lh2/L;Lh2/E;LZ8/f;Lh2/Q;Lh2/M;Lx7/a;)V
    .locals 0

    .prologue
    const-string p5, "pagingSource"

    invoke-static {p2, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "config"

    invoke-static {p3, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "retryFlow"

    invoke-static {p4, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "jumpCallback"

    invoke-static {p7, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/z;->a:Ljava/lang/Object;

    iput-object p2, p0, Lh2/z;->b:Lh2/L;

    iput-object p3, p0, Lh2/z;->c:Lh2/E;

    iput-object p4, p0, Lh2/z;->d:LZ8/f;

    iput-object p6, p0, Lh2/z;->f:Lh2/M;

    iput-object p7, p0, Lh2/z;->g:Lx7/a;

    iget p1, p3, Lh2/E;->f:I

    const/high16 p4, -0x80000000

    if-eq p1, p4, :cond_1

    invoke-virtual {p2}, Lh2/L;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    new-instance p1, Lh2/m;

    invoke-direct {p1}, Lh2/m;-><init>()V

    iput-object p1, p0, Lh2/z;->h:Lh2/m;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lh2/z;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, -0x2

    const/4 p2, 0x6

    const/4 p4, 0x0

    invoke-static {p1, p4, p4, p2, p4}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p1

    iput-object p1, p0, Lh2/z;->j:LY8/j;

    new-instance p1, Lh2/B$a;

    invoke-direct {p1, p3}, Lh2/B$a;-><init>(Lh2/E;)V

    iput-object p1, p0, Lh2/z;->k:Lh2/B$a;

    const/4 p1, 0x1

    invoke-static {p4, p1, p4}, LW8/C0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object p1

    iput-object p1, p0, Lh2/z;->l:LW8/y;

    new-instance p2, Lh2/z$i;

    invoke-direct {p2, p0, p4}, Lh2/z$i;-><init>(Lh2/z;Lm7/e;)V

    invoke-static {p1, p2}, Lh2/d;->a(LW8/z0;Lx7/p;)LZ8/f;

    move-result-object p1

    new-instance p2, Lh2/z$j;

    invoke-direct {p2, p0, p4}, Lh2/z$j;-><init>(Lh2/z;Lm7/e;)V

    invoke-static {p1, p2}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object p1

    iput-object p1, p0, Lh2/z;->m:LZ8/f;

    return-void
.end method

.method private final A()V
    .locals 1

    invoke-virtual {p0}, Lh2/z;->p()V

    iget-object v0, p0, Lh2/z;->b:Lh2/L;

    invoke-virtual {v0}, Lh2/L;->e()V

    return-void
.end method

.method private final B(Lh2/t;Lh2/Z;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    sget-object v0, Lh2/z$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p3}, Lh2/z;->s(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    iget-object p3, p0, Lh2/z;->h:Lh2/m;

    invoke-virtual {p3, p1, p2}, Lh2/m;->a(Lh2/t;Lh2/Z;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final C(Lh2/B;Lh2/t;Lh2/r$a;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v0

    invoke-virtual {v0, p2}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object v0

    invoke-static {v0, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    iget-object p2, p0, Lh2/z;->j:LY8/j;

    new-instance p3, Lh2/x$c;

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p1

    invoke-virtual {p1}, Lh2/w;->d()Lh2/s;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p3, p1, v0}, Lh2/x$c;-><init>(Lh2/s;Lh2/s;)V

    invoke-interface {p2, p3, p4}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final D(Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v0

    invoke-virtual {v0, p2}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object v0

    sget-object v1, Lh2/r$b;->b:Lh2/r$b;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v0

    invoke-virtual {v0, p2, v1}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    iget-object p2, p0, Lh2/z;->j:LY8/j;

    new-instance v0, Lh2/x$c;

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p1

    invoke-virtual {p1}, Lh2/w;->d()Lh2/s;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lh2/x$c;-><init>(Lh2/s;Lh2/s;)V

    invoke-interface {p2, v0, p3}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final E(LW8/N;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lh2/z;->c:Lh2/E;

    iget v1, v1, Lh2/E;->f:I

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    new-instance v7, Lh2/z$k;

    invoke-direct {v7, v0, v3}, Lh2/z$k;-><init>(Lh2/z;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    new-instance v13, Lh2/z$l;

    invoke-direct {v13, v0, v3}, Lh2/z$l;-><init>(Lh2/z;Lm7/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v15}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance v7, Lh2/z$m;

    invoke-direct {v7, v0, v3}, Lh2/z$m;-><init>(Lh2/z;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public static final synthetic a(Lh2/z;LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/z;->q(LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lh2/z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lh2/z;->s(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lh2/z;Lh2/t;Lh2/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/z;->t(Lh2/t;Lh2/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lh2/z;)Lh2/E;
    .locals 0

    iget-object p0, p0, Lh2/z;->c:Lh2/E;

    return-object p0
.end method

.method public static final synthetic e(Lh2/z;)Lh2/m;
    .locals 0

    iget-object p0, p0, Lh2/z;->h:Lh2/m;

    return-object p0
.end method

.method public static final synthetic f(Lh2/z;)Lx7/a;
    .locals 0

    iget-object p0, p0, Lh2/z;->g:Lx7/a;

    return-object p0
.end method

.method public static final synthetic g(Lh2/z;)LY8/j;
    .locals 0

    iget-object p0, p0, Lh2/z;->j:LY8/j;

    return-object p0
.end method

.method public static final synthetic h(Lh2/z;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lh2/z;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic i(Lh2/z;)Lh2/M;
    .locals 0

    iget-object p0, p0, Lh2/z;->f:Lh2/M;

    return-object p0
.end method

.method public static final synthetic j(Lh2/z;)LZ8/f;
    .locals 0

    iget-object p0, p0, Lh2/z;->d:LZ8/f;

    return-object p0
.end method

.method public static final synthetic k(Lh2/z;)Lh2/B$a;
    .locals 0

    iget-object p0, p0, Lh2/z;->k:Lh2/B$a;

    return-object p0
.end method

.method public static final synthetic l(Lh2/z;Lh2/t;Lh2/Z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/z;->B(Lh2/t;Lh2/Z;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lh2/z;Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/z;->D(Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lh2/z;LW8/N;)V
    .locals 0

    invoke-direct {p0, p1}, Lh2/z;->E(LW8/N;)V

    return-void
.end method

.method private final q(LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, Lh2/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p2}, Lh2/z$b;-><init>(Lm7/e;Lh2/z;Lh2/t;)V

    invoke-static {p1, v0}, Lh2/k;->d(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p1

    new-instance v0, Lh2/z$c;

    invoke-direct {v0, p2, v1}, Lh2/z$c;-><init>(Lh2/t;Lm7/e;)V

    invoke-static {p1, v0}, Lh2/k;->b(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p1

    invoke-static {p1}, LZ8/h;->l(LZ8/f;)LZ8/f;

    move-result-object p1

    new-instance v0, Lh2/z$d;

    invoke-direct {v0, p0, p2}, Lh2/z$d;-><init>(Lh2/z;Lh2/t;)V

    invoke-interface {p1, v0, p3}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final s(Lm7/e;)Ljava/lang/Object;
    .locals 14

    .prologue
    instance-of v0, p1, Lh2/z$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh2/z$g;

    iget v1, v0, Lh2/z$g;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/z$g;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/z$g;

    invoke-direct {v0, p0, p1}, Lh2/z$g;-><init>(Lh2/z;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lh2/z$g;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/z$g;->L:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_d

    :catchall_0
    move-exception p1

    goto/16 :goto_e

    :pswitch_1
    iget-object v2, v0, Lh2/z$g;->I:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v3, v0, Lh2/z$g;->H:Ljava/lang/Object;

    check-cast v3, Lh2/B$a;

    iget-object v4, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v4, Lh2/L$b;

    iget-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_2
    iget-object v1, v0, Lh2/z$g;->I:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v2, v0, Lh2/z$g;->H:Ljava/lang/Object;

    check-cast v2, Lh2/B$a;

    iget-object v3, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v3, Lh2/L$b;

    iget-object v0, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v0, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_3
    iget-object v2, v0, Lh2/z$g;->H:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v3, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v3, Lh2/L$b;

    iget-object v4, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v4, Lh2/z;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_7

    :catchall_1
    move-exception p1

    goto/16 :goto_8

    :pswitch_4
    iget-object v2, v0, Lh2/z$g;->I:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v3, v0, Lh2/z$g;->H:Ljava/lang/Object;

    check-cast v3, Lh2/B$a;

    iget-object v4, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v4, Lh2/L$b;

    iget-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    iget-object v2, v0, Lh2/z$g;->I:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v6, v0, Lh2/z$g;->H:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v7, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v7, Lh2/L$b;

    iget-object v8, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v8, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_6
    iget-object v2, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v2, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v6, v2

    goto/16 :goto_3

    :pswitch_7
    iget-object v2, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v6, Lh2/z;

    :try_start_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    goto/16 :goto_10

    :pswitch_8
    iget-object v2, v0, Lh2/z$g;->H:Ljava/lang/Object;

    check-cast v2, Lf9/a;

    iget-object v6, v0, Lh2/z$g;->G:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v7, v0, Lh2/z$g;->F:Ljava/lang/Object;

    check-cast v7, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_9
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v6, p0, Lh2/z;->k:Lh2/B$a;

    invoke-static {v6}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p1

    iput-object p0, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v6, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object p1, v0, Lh2/z$g;->H:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Lh2/z$g;->L:I

    invoke-interface {p1, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    return-object v1

    :cond_1
    move-object v7, p0

    move-object v2, p1

    :goto_1
    :try_start_3
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    sget-object v6, Lh2/t;->C:Lh2/t;

    iput-object v7, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v5, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput v4, v0, Lh2/z$g;->L:I

    invoke-direct {v7, p1, v6, v0}, Lh2/z;->D(Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    move-object v6, v7

    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object p1, Lh2/t;->C:Lh2/t;

    iget-object v2, v6, Lh2/z;->a:Ljava/lang/Object;

    invoke-direct {v6, p1, v2}, Lh2/z;->x(Lh2/t;Ljava/lang/Object;)Lh2/L$a;

    move-result-object p1

    sget-object v2, Lh2/K;->a:Lh2/K;

    invoke-virtual {v2, v3}, Lh2/K;->a(I)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Start REFRESH with loadKey "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v6, Lh2/z;->a:Ljava/lang/Object;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " on "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v6, Lh2/z;->b:Lh2/L;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3, v7, v5}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v2, v6, Lh2/z;->b:Lh2/L;

    iput-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v5, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/z$g;->L:I

    invoke-virtual {v2, p1, v0}, Lh2/L;->f(Lh2/L$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_3
    check-cast p1, Lh2/L$b;

    instance-of v2, p1, Lh2/L$b$c;

    if-eqz v2, :cond_10

    iget-object v2, v6, Lh2/z;->k:Lh2/B$a;

    invoke-static {v2}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v7

    iput-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput-object v7, v0, Lh2/z$g;->I:Ljava/lang/Object;

    const/4 v8, 0x4

    iput v8, v0, Lh2/z$g;->L:I

    invoke-interface {v7, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_5

    return-object v1

    :cond_5
    move-object v8, v6

    move-object v6, v2

    move-object v2, v7

    move-object v7, p1

    :goto_4
    :try_start_4
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    sget-object v6, Lh2/t;->C:Lh2/t;

    move-object v9, v7

    check-cast v9, Lh2/L$b$c;

    const/4 v10, 0x0

    invoke-virtual {p1, v10, v6, v9}, Lh2/B;->r(ILh2/t;Lh2/L$b$c;)Z

    move-result v9

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v10

    sget-object v11, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v11}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v12

    invoke-virtual {v10, v6, v12}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    move-object v10, v7

    check-cast v10, Lh2/L$b$c;

    invoke-virtual {v10}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_6

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v10

    sget-object v12, Lh2/t;->D:Lh2/t;

    invoke-virtual {v11}, Lh2/r$c$a;->a()Lh2/r$c;

    move-result-object v13

    invoke-virtual {v10, v12, v13}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    goto :goto_5

    :catchall_3
    move-exception p1

    goto/16 :goto_b

    :cond_6
    :goto_5
    move-object v10, v7

    check-cast v10, Lh2/L$b$c;

    invoke-virtual {v10}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p1

    sget-object v10, Lh2/t;->E:Lh2/t;

    invoke-virtual {v11}, Lh2/r$c$a;->a()Lh2/r$c;

    move-result-object v11

    invoke-virtual {p1, v10, v11}, Lh2/w;->c(Lh2/t;Lh2/r;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :cond_7
    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object p1, Lh2/K;->a:Lh2/K;

    if-eqz v9, :cond_b

    invoke-virtual {p1, v3}, Lh2/K;->a(I)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v8, Lh2/z;->a:Ljava/lang/Object;

    invoke-direct {v8, v6, v2, v7}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v3, v2, v5}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object v3, v8, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p1

    iput-object v8, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v7, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v3, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput-object p1, v0, Lh2/z$g;->I:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v0, Lh2/z$g;->L:I

    invoke-interface {p1, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_9
    move-object v2, p1

    move-object v4, v7

    move-object v6, v8

    :goto_6
    :try_start_5
    invoke-static {v3}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    iget-object v3, v6, Lh2/z;->j:LY8/j;

    move-object v7, v4

    check-cast v7, Lh2/L$b$c;

    sget-object v8, Lh2/t;->C:Lh2/t;

    invoke-virtual {p1, v7, v8}, Lh2/B;->u(Lh2/L$b$c;Lh2/t;)Lh2/x;

    move-result-object p1

    iput-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v4, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput-object v5, v0, Lh2/z$g;->I:Ljava/lang/Object;

    const/4 v7, 0x6

    iput v7, v0, Lh2/z$g;->L:I

    invoke-interface {v3, p1, v0}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    move-object v3, v4

    move-object v4, v6

    :goto_7
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    goto :goto_9

    :goto_8
    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_b
    invoke-virtual {p1, v4}, Lh2/K;->a(I)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, v8, Lh2/z;->a:Ljava/lang/Object;

    invoke-direct {v8, v6, v2, v5}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v4, v2, v5}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    move-object v3, v7

    move-object v4, v8

    :goto_9
    iget-object p1, v4, Lh2/z;->e:Lh2/Q;

    if-eqz p1, :cond_16

    move-object p1, v3

    check-cast p1, Lh2/L$b$c;

    invoke-virtual {p1}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {p1}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_16

    :cond_d
    iget-object v2, v4, Lh2/z;->k:Lh2/B$a;

    invoke-static {v2}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p1

    iput-object v4, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v3, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput-object p1, v0, Lh2/z$g;->I:Ljava/lang/Object;

    const/4 v6, 0x7

    iput v6, v0, Lh2/z$g;->L:I

    invoke-interface {p1, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_e

    return-object v1

    :cond_e
    move-object v1, p1

    move-object v0, v4

    :goto_a
    :try_start_6
    invoke-static {v2}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    iget-object v2, v0, Lh2/z;->h:Lh2/m;

    invoke-virtual {v2}, Lh2/m;->b()Lh2/Z$a;

    move-result-object v2

    invoke-virtual {p1, v2}, Lh2/B;->g(Lh2/Z$a;)Lh2/M;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-interface {v1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    check-cast v3, Lh2/L$b$c;

    invoke-virtual {v3}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_f

    iget-object v1, v0, Lh2/z;->e:Lh2/Q;

    sget-object v2, Lh2/t;->D:Lh2/t;

    invoke-interface {v1, v2, p1}, Lh2/Q;->b(Lh2/t;Lh2/M;)V

    :cond_f
    invoke-virtual {v3}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_16

    iget-object v0, v0, Lh2/z;->e:Lh2/Q;

    sget-object v1, Lh2/t;->E:Lh2/t;

    invoke-interface {v0, v1, p1}, Lh2/Q;->b(Lh2/t;Lh2/M;)V

    goto/16 :goto_f

    :catchall_4
    move-exception p1

    invoke-interface {v1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :goto_b
    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_10
    instance-of v2, p1, Lh2/L$b$a;

    if-eqz v2, :cond_14

    sget-object v2, Lh2/K;->a:Lh2/K;

    invoke-virtual {v2, v4}, Lh2/K;->a(I)Z

    move-result v3

    if-eqz v3, :cond_11

    sget-object v3, Lh2/t;->C:Lh2/t;

    iget-object v7, v6, Lh2/z;->a:Ljava/lang/Object;

    invoke-direct {v6, v3, v7, p1}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3, v5}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    iget-object v3, v6, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v2

    iput-object v6, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v3, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$g;->I:Ljava/lang/Object;

    const/16 v4, 0x8

    iput v4, v0, Lh2/z$g;->L:I

    invoke-interface {v2, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_12

    return-object v1

    :cond_12
    move-object v4, p1

    :goto_c
    :try_start_7
    invoke-static {v3}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    new-instance v3, Lh2/r$a;

    check-cast v4, Lh2/L$b$a;

    invoke-virtual {v4}, Lh2/L$b$a;->d()Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v3, v4}, Lh2/r$a;-><init>(Ljava/lang/Throwable;)V

    sget-object v4, Lh2/t;->C:Lh2/t;

    iput-object v2, v0, Lh2/z$g;->F:Ljava/lang/Object;

    iput-object v5, v0, Lh2/z$g;->G:Ljava/lang/Object;

    iput-object v5, v0, Lh2/z$g;->H:Ljava/lang/Object;

    iput-object v5, v0, Lh2/z$g;->I:Ljava/lang/Object;

    const/16 v7, 0x9

    iput v7, v0, Lh2/z$g;->L:I

    invoke-direct {v6, p1, v4, v3, v0}, Lh2/z;->C(Lh2/B;Lh2/t;Lh2/r$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    if-ne p1, v1, :cond_13

    return-object v1

    :cond_13
    move-object v0, v2

    :goto_d
    :try_start_8
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    invoke-interface {v0, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_5
    move-exception p1

    move-object v0, v2

    :goto_e
    invoke-interface {v0, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_14
    instance-of v0, p1, Lh2/L$b$b;

    if-eqz v0, :cond_16

    sget-object v0, Lh2/K;->a:Lh2/K;

    invoke-virtual {v0, v4}, Lh2/K;->a(I)Z

    move-result v1

    if-eqz v1, :cond_15

    sget-object v1, Lh2/t;->C:Lh2/t;

    iget-object v2, v6, Lh2/z;->a:Ljava/lang/Object;

    invoke-direct {v6, v1, v2, p1}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, p1, v5}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    invoke-direct {v6}, Lh2/z;->A()V

    :cond_16
    :goto_f
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_10
    invoke-interface {v2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final t(Lh2/t;Lh2/l;Lm7/e;)Ljava/lang/Object;
    .locals 19

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    instance-of v4, v2, Lh2/z$h;

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lh2/z$h;

    iget v5, v4, Lh2/z$h;->U:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lh2/z$h;->U:I

    goto :goto_0

    :cond_0
    new-instance v4, Lh2/z$h;

    invoke-direct {v4, v1, v2}, Lh2/z$h;-><init>(Lh2/z;Lm7/e;)V

    :goto_0
    iget-object v2, v4, Lh2/z$h;->S:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v5

    iget v6, v4, Lh2/z$h;->U:I

    const-string v7, "Use doInitialLoad for LoadType == REFRESH"

    packed-switch v6, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v4, Lh2/z$h;->R:I

    iget v6, v4, Lh2/z$h;->Q:I

    iget-object v12, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v12, Lf9/a;

    iget-object v13, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v13, Lh2/B$a;

    iget-object v14, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v14, Ly7/K;

    iget-object v15, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v15, Ly7/O;

    iget-object v8, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v8, Ly7/M;

    iget-object v9, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v9, Lh2/l;

    iget-object v10, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v10, Lh2/t;

    iget-object v11, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v11, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v2, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v15

    goto/16 :goto_24

    :pswitch_1
    iget-object v0, v4, Lh2/z$h;->N:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lf9/a;

    iget-object v0, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v0, Lh2/L$b;

    iget-object v8, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v8, Lh2/L$a;

    iget-object v9, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v9, Ly7/K;

    iget-object v10, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v10, Ly7/O;

    iget-object v11, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v11, Ly7/M;

    iget-object v12, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v12, Lh2/l;

    iget-object v13, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v13, Lh2/t;

    iget-object v14, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v14, Lh2/z;

    :try_start_0
    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v17, v12

    move-object v12, v10

    move-object/from16 v10, v17

    move-object/from16 v18, v13

    move-object v13, v11

    move-object/from16 v11, v18

    goto/16 :goto_21

    :catchall_0
    move-exception v0

    :goto_1
    const/4 v1, 0x0

    goto/16 :goto_25

    :pswitch_2
    iget-object v0, v4, Lh2/z$h;->O:Ljava/lang/Object;

    check-cast v0, Lh2/B;

    iget-object v6, v4, Lh2/z$h;->N:Ljava/lang/Object;

    check-cast v6, Lf9/a;

    iget-object v8, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v8, Lh2/L$b;

    iget-object v9, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v9, Lh2/L$a;

    iget-object v10, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v10, Ly7/K;

    iget-object v11, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v11, Ly7/O;

    iget-object v12, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v12, Ly7/M;

    iget-object v13, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v13, Lh2/l;

    iget-object v14, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v14, Lh2/t;

    iget-object v15, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v15, Lh2/z;

    :try_start_1
    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_1e

    :pswitch_3
    iget-object v0, v4, Lh2/z$h;->P:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    iget-object v6, v4, Lh2/z$h;->O:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v8, v4, Lh2/z$h;->N:Ljava/lang/Object;

    check-cast v8, Lh2/t;

    iget-object v9, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v9, Lh2/L$b;

    iget-object v10, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v10, Lh2/L$a;

    iget-object v11, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v11, Ly7/K;

    iget-object v12, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v12, Ly7/O;

    iget-object v13, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v13, Ly7/M;

    iget-object v14, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v14, Lh2/l;

    iget-object v15, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v15, Lh2/t;

    iget-object v3, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v3, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v17, v14

    move-object v14, v0

    move-object/from16 v0, v17

    goto/16 :goto_1d

    :pswitch_4
    iget-object v0, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v0, Lh2/B;

    iget-object v3, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v3, Lf9/a;

    iget-object v5, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v5, Lh2/l;

    iget-object v4, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v4, Lh2/t;

    :try_start_2
    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_19

    :catchall_1
    move-exception v0

    :goto_2
    const/4 v2, 0x0

    goto/16 :goto_1a

    :pswitch_5
    iget-object v0, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    iget-object v3, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v3, Lh2/B$a;

    iget-object v6, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v6, Lh2/L$b;

    iget-object v7, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v7, Lh2/l;

    iget-object v8, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v8, Lh2/t;

    iget-object v9, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v9, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v2, v0

    move-object v0, v4

    move-object v12, v7

    move-object v4, v8

    goto/16 :goto_18

    :pswitch_6
    iget-object v0, v4, Lh2/z$h;->O:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    iget-object v3, v4, Lh2/z$h;->N:Ljava/lang/Object;

    check-cast v3, Lh2/B$a;

    iget-object v6, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v6, Lh2/L$b;

    iget-object v8, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v8, Lh2/L$a;

    iget-object v9, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v9, Ly7/K;

    iget-object v10, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v10, Ly7/O;

    iget-object v11, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v11, Ly7/M;

    iget-object v12, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v12, Lh2/l;

    iget-object v13, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v13, Lh2/t;

    iget-object v14, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v14, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v2, v0

    goto/16 :goto_13

    :pswitch_7
    iget-object v0, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v0, Lh2/L$a;

    iget-object v3, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v3, Ly7/K;

    iget-object v6, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v6, Ly7/O;

    iget-object v8, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v8, Ly7/M;

    iget-object v9, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v9, Lh2/l;

    iget-object v10, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v10, Lh2/t;

    iget-object v11, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v11, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v12, v9

    move-object v13, v10

    move-object v9, v11

    move-object v10, v6

    move-object v11, v8

    move-object v8, v0

    move-object v0, v3

    goto/16 :goto_f

    :pswitch_8
    iget-object v0, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v0, Ly7/O;

    iget-object v3, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iget-object v6, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v6, Lf9/a;

    iget-object v8, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v8, Ly7/O;

    iget-object v9, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v9, Ly7/M;

    iget-object v10, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v10, Lh2/l;

    iget-object v11, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v11, Lh2/t;

    iget-object v12, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v12, Lh2/z;

    :try_start_3
    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto/16 :goto_a

    :catchall_2
    move-exception v0

    :goto_3
    const/4 v1, 0x0

    goto/16 :goto_27

    :pswitch_9
    iget-object v0, v4, Lh2/z$h;->M:Ljava/lang/Object;

    check-cast v0, Ly7/O;

    iget-object v3, v4, Lh2/z$h;->L:Ljava/lang/Object;

    check-cast v3, Lf9/a;

    iget-object v6, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v8, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v8, Ly7/O;

    iget-object v9, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v9, Ly7/M;

    iget-object v10, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v10, Lh2/l;

    iget-object v11, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v11, Lh2/t;

    iget-object v12, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v12, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_a
    iget-object v0, v4, Lh2/z$h;->K:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    iget-object v3, v4, Lh2/z$h;->J:Ljava/lang/Object;

    check-cast v3, Lh2/B$a;

    iget-object v6, v4, Lh2/z$h;->I:Ljava/lang/Object;

    check-cast v6, Ly7/M;

    iget-object v8, v4, Lh2/z$h;->H:Ljava/lang/Object;

    check-cast v8, Lh2/l;

    iget-object v9, v4, Lh2/z$h;->G:Ljava/lang/Object;

    check-cast v9, Lh2/t;

    iget-object v10, v4, Lh2/z$h;->F:Ljava/lang/Object;

    check-cast v10, Lh2/z;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v2, v0

    move-object v0, v9

    goto :goto_4

    :pswitch_b
    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object v2, Lh2/t;->C:Lh2/t;

    if-eq v0, v2, :cond_2e

    new-instance v6, Ly7/M;

    invoke-direct {v6}, Ly7/M;-><init>()V

    iget-object v3, v1, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v2

    iput-object v1, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->G:Ljava/lang/Object;

    move-object/from16 v8, p2

    iput-object v8, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v3, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->K:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v4, Lh2/z$h;->U:I

    const/4 v9, 0x0

    invoke-interface {v2, v9, v4}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_1

    return-object v5

    :cond_1
    move-object v10, v1

    :goto_4
    :try_start_4
    invoke-static {v3}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v3

    sget-object v9, Lh2/z$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v9, v9, v11

    const/4 v11, 0x1

    if-eq v9, v11, :cond_2d

    const/4 v12, 0x2

    if-eq v9, v12, :cond_4

    const/4 v12, 0x3

    if-eq v9, v12, :cond_2

    goto/16 :goto_8

    :cond_2
    invoke-virtual {v3}, Lh2/B;->l()I

    move-result v9

    invoke-virtual {v8}, Lh2/l;->b()Lh2/Z;

    move-result-object v12

    invoke-virtual {v12}, Lh2/Z;->b()I

    move-result v12

    add-int/2addr v9, v12

    add-int/2addr v9, v11

    if-gez v9, :cond_3

    iget v11, v6, Ly7/M;->C:I

    iget-object v12, v10, Lh2/z;->c:Lh2/E;

    iget v12, v12, Lh2/E;->a:I

    neg-int v9, v9

    mul-int/2addr v12, v9

    add-int/2addr v11, v12

    iput v11, v6, Ly7/M;->C:I

    const/4 v9, 0x0

    goto :goto_5

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    goto/16 :goto_28

    :cond_3
    :goto_5
    invoke-virtual {v3}, Lh2/B;->m()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lj7/v;->o(Ljava/util/List;)I

    move-result v11

    if-gt v9, v11, :cond_6

    :goto_6
    iget v12, v6, Ly7/M;->C:I

    invoke-virtual {v3}, Lh2/B;->m()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh2/L$b$c;

    invoke-virtual {v13}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    add-int/2addr v12, v13

    iput v12, v6, Ly7/M;->C:I

    if-eq v9, v11, :cond_6

    const/4 v12, 0x1

    add-int/2addr v9, v12

    goto :goto_6

    :cond_4
    invoke-virtual {v3}, Lh2/B;->l()I

    move-result v9

    invoke-virtual {v8}, Lh2/l;->b()Lh2/Z;

    move-result-object v11

    invoke-virtual {v11}, Lh2/Z;->a()I

    move-result v11

    add-int/2addr v9, v11

    const/4 v11, 0x1

    sub-int/2addr v9, v11

    invoke-virtual {v3}, Lh2/B;->m()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lj7/v;->o(Ljava/util/List;)I

    move-result v11

    if-le v9, v11, :cond_5

    iget v11, v6, Ly7/M;->C:I

    iget-object v12, v10, Lh2/z;->c:Lh2/E;

    iget v12, v12, Lh2/E;->a:I

    invoke-virtual {v3}, Lh2/B;->m()Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Lj7/v;->o(Ljava/util/List;)I

    move-result v13

    sub-int/2addr v9, v13

    mul-int/2addr v12, v9

    add-int/2addr v11, v12

    iput v11, v6, Ly7/M;->C:I

    invoke-virtual {v3}, Lh2/B;->m()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lj7/v;->o(Ljava/util/List;)I

    move-result v9

    :cond_5
    if-ltz v9, :cond_6

    const/4 v11, 0x0

    :goto_7
    iget v12, v6, Ly7/M;->C:I

    invoke-virtual {v3}, Lh2/B;->m()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh2/L$b$c;

    invoke-virtual {v13}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    add-int/2addr v12, v13

    iput v12, v6, Ly7/M;->C:I

    if-eq v11, v9, :cond_6

    const/4 v12, 0x1

    add-int/2addr v11, v12

    goto :goto_7

    :cond_6
    :goto_8
    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    new-instance v2, Ly7/O;

    invoke-direct {v2}, Ly7/O;-><init>()V

    iget-object v3, v10, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v9

    iput-object v10, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v8, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v3, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v9, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->M:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v4, Lh2/z$h;->U:I

    const/4 v11, 0x0

    invoke-interface {v9, v11, v4}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v5, :cond_7

    return-object v5

    :cond_7
    move-object v11, v0

    move-object v0, v2

    move-object v12, v10

    move-object v10, v8

    move-object v8, v0

    move-object/from16 v17, v6

    move-object v6, v3

    move-object v3, v9

    move-object/from16 v9, v17

    :goto_9
    :try_start_5
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v2

    invoke-virtual {v10}, Lh2/l;->a()I

    move-result v6

    invoke-virtual {v10}, Lh2/l;->b()Lh2/Z;

    move-result-object v13

    invoke-virtual {v13, v11}, Lh2/Z;->e(Lh2/t;)I

    move-result v13

    iget v14, v9, Ly7/M;->C:I

    add-int/2addr v13, v14

    invoke-direct {v12, v2, v11, v6, v13}, Lh2/z;->z(Lh2/B;Lh2/t;II)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_9

    iput-object v12, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v9, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v8, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v3, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->M:Ljava/lang/Object;

    const/4 v13, 0x3

    iput v13, v4, Lh2/z$h;->U:I

    invoke-direct {v12, v2, v11, v4}, Lh2/z;->D(Lh2/B;Lh2/t;Lm7/e;)Ljava/lang/Object;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-ne v2, v5, :cond_8

    return-object v5

    :cond_8
    move-object/from16 v17, v6

    move-object v6, v3

    move-object/from16 v3, v17

    :goto_a
    move-object v2, v3

    move-object v3, v6

    :goto_b
    const/4 v6, 0x0

    goto :goto_c

    :catchall_4
    move-exception v0

    move-object v6, v3

    goto/16 :goto_3

    :cond_9
    const/4 v2, 0x0

    goto :goto_b

    :goto_c
    invoke-interface {v3, v6}, Lf9/a;->d(Ljava/lang/Object;)V

    iput-object v2, v0, Ly7/O;->C:Ljava/lang/Object;

    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    :goto_d
    iget-object v2, v8, Ly7/O;->C:Ljava/lang/Object;

    if-eqz v2, :cond_2c

    invoke-direct {v12, v11, v2}, Lh2/z;->x(Lh2/t;Ljava/lang/Object;)Lh2/L$a;

    move-result-object v2

    sget-object v3, Lh2/K;->a:Lh2/K;

    const/4 v6, 0x3

    invoke-virtual {v3, v6}, Lh2/K;->a(I)Z

    move-result v13

    if-eqz v13, :cond_a

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Start "

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " with loadKey "

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v8, Ly7/O;->C:Ljava/lang/Object;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " on "

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v12, Lh2/z;->b:Lh2/L;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-virtual {v3, v13, v6, v14}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_a
    const/4 v14, 0x0

    :goto_e
    iget-object v3, v12, Lh2/z;->b:Lh2/L;

    iput-object v12, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v9, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v8, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v14, v4, Lh2/z$h;->M:Ljava/lang/Object;

    iput-object v14, v4, Lh2/z$h;->N:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v4, Lh2/z$h;->U:I

    invoke-virtual {v3, v2, v4}, Lh2/L;->f(Lh2/L$a;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_b

    return-object v5

    :cond_b
    move-object v13, v11

    move-object v11, v9

    move-object v9, v12

    move-object v12, v10

    move-object v10, v8

    move-object v8, v2

    move-object v2, v3

    :goto_f
    move-object v6, v2

    check-cast v6, Lh2/L$b;

    instance-of v2, v6, Lh2/L$b$c;

    if-eqz v2, :cond_18

    sget-object v2, Lh2/z$a;->a:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_d

    const/4 v3, 0x3

    if-ne v2, v3, :cond_c

    move-object v2, v6

    check-cast v2, Lh2/L$b$c;

    invoke-virtual {v2}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object v2

    goto :goto_10

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object v2, v6

    check-cast v2, Lh2/L$b$c;

    invoke-virtual {v2}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object v2

    :goto_10
    iget-object v3, v9, Lh2/z;->b:Lh2/L;

    invoke-virtual {v3}, Lh2/L;->c()Z

    move-result v3

    if-nez v3, :cond_10

    iget-object v3, v10, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_12

    :cond_e
    sget-object v0, Lh2/t;->D:Lh2/t;

    if-ne v13, v0, :cond_f

    const-string v0, "prevKey"

    goto :goto_11

    :cond_f
    const-string v0, "nextKey"

    :goto_11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The same value, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v10, Ly7/O;->C:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", was passed as the "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v2}, LS8/r;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_10
    :goto_12
    iget-object v3, v9, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v2

    iput-object v9, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v13, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v12, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v8, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->M:Ljava/lang/Object;

    iput-object v3, v4, Lh2/z$h;->N:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->O:Ljava/lang/Object;

    const/4 v14, 0x5

    iput v14, v4, Lh2/z$h;->U:I

    const/4 v14, 0x0

    invoke-interface {v2, v14, v4}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v5, :cond_11

    return-object v5

    :cond_11
    move-object v14, v9

    move-object v9, v0

    :goto_13
    :try_start_6
    invoke-static {v3}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v0

    invoke-virtual {v12}, Lh2/l;->a()I

    move-result v3

    move-object v15, v6

    check-cast v15, Lh2/L$b$c;

    invoke-virtual {v0, v3, v13, v15}, Lh2/B;->r(ILh2/t;Lh2/L$b$c;)Z

    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    if-nez v0, :cond_12

    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lh2/K;->a(I)Z

    move-result v4

    if-eqz v4, :cond_2c

    iget-object v4, v10, Ly7/O;->C:Ljava/lang/Object;

    invoke-direct {v14, v13, v4, v3}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4, v3}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_26

    :cond_12
    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v15, 0x3

    invoke-virtual {v0, v15}, Lh2/K;->a(I)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v10, Ly7/O;->C:Ljava/lang/Object;

    invoke-direct {v14, v13, v2, v6}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v15, v2, v3}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_13
    iget v0, v11, Ly7/M;->C:I

    move-object v2, v6

    check-cast v2, Lh2/L$b$c;

    invoke-virtual {v2}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v0, v3

    iput v0, v11, Ly7/M;->C:I

    sget-object v0, Lh2/t;->D:Lh2/t;

    if-ne v13, v0, :cond_15

    invoke-virtual {v2}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    goto :goto_15

    :cond_14
    :goto_14
    const/4 v3, 0x1

    goto :goto_16

    :cond_15
    :goto_15
    sget-object v0, Lh2/t;->E:Lh2/t;

    if-ne v13, v0, :cond_16

    invoke-virtual {v2}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_16

    goto :goto_14

    :goto_16
    iput-boolean v3, v9, Ly7/K;->C:Z

    goto :goto_17

    :cond_16
    const/4 v3, 0x1

    :goto_17
    move-object v0, v9

    move-object v9, v14

    :cond_17
    const/4 v14, 0x2

    goto/16 :goto_1b

    :catchall_5
    move-exception v0

    const/4 v14, 0x0

    invoke-interface {v2, v14}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_18
    const/4 v3, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x3

    instance-of v2, v6, Lh2/L$b$a;

    if-eqz v2, :cond_1c

    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lh2/K;->a(I)Z

    move-result v3

    if-eqz v3, :cond_19

    iget-object v3, v10, Ly7/O;->C:Ljava/lang/Object;

    invoke-direct {v9, v13, v3, v6}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v14}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    iget-object v3, v9, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v0

    iput-object v9, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v13, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v12, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v3, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v14, v4, Lh2/z$h;->L:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v4, Lh2/z$h;->U:I

    invoke-interface {v0, v14, v4}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_1a

    return-object v5

    :cond_1a
    move-object v2, v0

    move-object v0, v4

    move-object v4, v13

    :goto_18
    :try_start_7
    invoke-static {v3}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v3

    new-instance v7, Lh2/r$a;

    check-cast v6, Lh2/L$b$a;

    invoke-virtual {v6}, Lh2/L$b$a;->d()Ljava/lang/Throwable;

    move-result-object v6

    invoke-direct {v7, v6}, Lh2/r$a;-><init>(Ljava/lang/Throwable;)V

    iput-object v4, v0, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v12, v0, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v3, v0, Lh2/z$h;->I:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v0, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v6, v0, Lh2/z$h;->K:Ljava/lang/Object;

    const/4 v6, 0x7

    iput v6, v0, Lh2/z$h;->U:I

    invoke-direct {v9, v3, v4, v7, v0}, Lh2/z;->C(Lh2/B;Lh2/t;Lh2/r$a;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    if-ne v0, v5, :cond_1b

    return-object v5

    :cond_1b
    move-object v0, v3

    move-object v5, v12

    move-object v3, v2

    :goto_19
    :try_start_8
    invoke-virtual {v0}, Lh2/B;->k()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5}, Lh2/l;->b()Lh2/Z;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    const/4 v2, 0x0

    invoke-interface {v3, v2}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :catchall_6
    move-exception v0

    move-object v3, v2

    goto/16 :goto_2

    :goto_1a
    invoke-interface {v3, v2}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_1c
    move-object v2, v14

    instance-of v14, v6, Lh2/L$b$b;

    if-eqz v14, :cond_17

    sget-object v0, Lh2/K;->a:Lh2/K;

    const/4 v14, 0x2

    invoke-virtual {v0, v14}, Lh2/K;->a(I)Z

    move-result v3

    if-eqz v3, :cond_1d

    iget-object v3, v10, Ly7/O;->C:Ljava/lang/Object;

    invoke-direct {v9, v13, v3, v6}, Lh2/z;->y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v14, v3, v2}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_1d
    invoke-direct {v9}, Lh2/z;->A()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :goto_1b
    sget-object v2, Lh2/z$a;->a:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aget v2, v2, v16

    if-ne v2, v14, :cond_1e

    sget-object v2, Lh2/t;->E:Lh2/t;

    goto :goto_1c

    :cond_1e
    sget-object v2, Lh2/t;->D:Lh2/t;

    :goto_1c
    iget-object v3, v9, Lh2/z;->k:Lh2/B$a;

    invoke-static {v3}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v14

    iput-object v9, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v13, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v12, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v8, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->M:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->N:Ljava/lang/Object;

    iput-object v3, v4, Lh2/z$h;->O:Ljava/lang/Object;

    iput-object v14, v4, Lh2/z$h;->P:Ljava/lang/Object;

    const/16 v15, 0x8

    iput v15, v4, Lh2/z$h;->U:I

    move-object/from16 p1, v0

    const/4 v15, 0x0

    invoke-interface {v14, v15, v4}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_1f

    return-object v5

    :cond_1f
    move-object v0, v12

    move-object v15, v13

    move-object v12, v10

    move-object v13, v11

    move-object/from16 v11, p1

    move-object v10, v8

    move-object v8, v2

    move-object/from16 v17, v6

    move-object v6, v3

    move-object v3, v9

    move-object/from16 v9, v17

    :goto_1d
    :try_start_9
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v2

    invoke-virtual {v0}, Lh2/l;->b()Lh2/Z;

    move-result-object v6

    invoke-virtual {v2, v8, v6}, Lh2/B;->i(Lh2/t;Lh2/Z;)Lh2/x$a;

    move-result-object v6

    if-eqz v6, :cond_21

    invoke-virtual {v2, v6}, Lh2/B;->h(Lh2/x$a;)V

    iget-object v8, v3, Lh2/z;->j:LY8/j;

    iput-object v3, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v15, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v13, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v12, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v9, v4, Lh2/z$h;->M:Ljava/lang/Object;

    iput-object v14, v4, Lh2/z$h;->N:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->O:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v4, Lh2/z$h;->P:Ljava/lang/Object;

    const/16 v1, 0x9

    iput v1, v4, Lh2/z$h;->U:I

    invoke-interface {v8, v6, v4}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    if-ne v1, v5, :cond_20

    return-object v5

    :cond_20
    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v6, v14

    move-object v14, v15

    move-object v13, v0

    move-object v0, v2

    move-object v15, v3

    :goto_1e
    :try_start_a
    sget-object v1, Li7/M;->a:Li7/M;

    move-object v2, v0

    move-object v0, v13

    move-object v3, v15

    move-object v13, v12

    move-object v15, v14

    move-object v12, v11

    move-object v11, v10

    goto :goto_1f

    :catchall_7
    move-exception v0

    move-object v6, v14

    goto/16 :goto_1

    :cond_21
    move-object v8, v9

    move-object v9, v10

    move-object v6, v14

    :goto_1f
    invoke-virtual {v0}, Lh2/l;->a()I

    move-result v1

    invoke-virtual {v0}, Lh2/l;->b()Lh2/Z;

    move-result-object v10

    invoke-virtual {v10, v15}, Lh2/Z;->e(Lh2/t;)I

    move-result v10

    iget v14, v13, Ly7/M;->C:I

    add-int/2addr v10, v14

    invoke-direct {v3, v2, v15, v1, v10}, Lh2/z;->z(Lh2/B;Lh2/t;II)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v12, Ly7/O;->C:Ljava/lang/Object;

    if-nez v1, :cond_23

    invoke-virtual {v2}, Lh2/B;->p()Lh2/w;

    move-result-object v1

    invoke-virtual {v1, v15}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object v1

    instance-of v1, v1, Lh2/r$a;

    if-nez v1, :cond_23

    invoke-virtual {v2}, Lh2/B;->p()Lh2/w;

    move-result-object v1

    iget-boolean v10, v11, Ly7/K;->C:Z

    if-eqz v10, :cond_22

    sget-object v10, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v10}, Lh2/r$c$a;->a()Lh2/r$c;

    move-result-object v10

    goto :goto_20

    :cond_22
    sget-object v10, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v10}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v10

    :goto_20
    invoke-virtual {v1, v15, v10}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    :cond_23
    move-object v1, v8

    check-cast v1, Lh2/L$b$c;

    invoke-virtual {v2, v1, v15}, Lh2/B;->u(Lh2/L$b$c;Lh2/t;)Lh2/x;

    move-result-object v1

    iget-object v2, v3, Lh2/z;->j:LY8/j;

    iput-object v3, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v15, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v0, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v13, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v12, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v9, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v8, v4, Lh2/z$h;->M:Ljava/lang/Object;

    iput-object v6, v4, Lh2/z$h;->N:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, v4, Lh2/z$h;->O:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->P:Ljava/lang/Object;

    const/16 v10, 0xa

    iput v10, v4, Lh2/z$h;->U:I

    invoke-interface {v2, v1, v4}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_24

    return-object v5

    :cond_24
    move-object v10, v0

    move-object v14, v3

    move-object v0, v8

    move-object v8, v9

    move-object v9, v11

    move-object v11, v15

    :goto_21
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Lf9/a;->d(Ljava/lang/Object;)V

    instance-of v1, v8, Lh2/L$a$c;

    if-eqz v1, :cond_25

    move-object v1, v0

    check-cast v1, Lh2/L$b$c;

    invoke-virtual {v1}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_25

    const/4 v6, 0x1

    goto :goto_22

    :cond_25
    const/4 v6, 0x0

    :goto_22
    instance-of v1, v8, Lh2/L$a$a;

    if-eqz v1, :cond_26

    check-cast v0, Lh2/L$b$c;

    invoke-virtual {v0}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_26

    const/4 v0, 0x1

    goto :goto_23

    :cond_26
    const/4 v0, 0x0

    :goto_23
    iget-object v1, v14, Lh2/z;->e:Lh2/Q;

    if-eqz v1, :cond_2b

    if-nez v6, :cond_27

    if-eqz v0, :cond_2b

    :cond_27
    iget-object v1, v14, Lh2/z;->k:Lh2/B$a;

    invoke-static {v1}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v2

    iput-object v14, v4, Lh2/z$h;->F:Ljava/lang/Object;

    iput-object v11, v4, Lh2/z$h;->G:Ljava/lang/Object;

    iput-object v10, v4, Lh2/z$h;->H:Ljava/lang/Object;

    iput-object v13, v4, Lh2/z$h;->I:Ljava/lang/Object;

    iput-object v12, v4, Lh2/z$h;->J:Ljava/lang/Object;

    iput-object v9, v4, Lh2/z$h;->K:Ljava/lang/Object;

    iput-object v1, v4, Lh2/z$h;->L:Ljava/lang/Object;

    iput-object v2, v4, Lh2/z$h;->M:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v4, Lh2/z$h;->N:Ljava/lang/Object;

    iput v6, v4, Lh2/z$h;->Q:I

    iput v0, v4, Lh2/z$h;->R:I

    const/16 v8, 0xb

    iput v8, v4, Lh2/z$h;->U:I

    invoke-interface {v2, v3, v4}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_28

    return-object v5

    :cond_28
    move-object v8, v12

    move-object v12, v14

    move-object v14, v9

    move-object v9, v13

    move-object v13, v1

    :goto_24
    :try_start_b
    invoke-static {v13}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object v1

    iget-object v3, v12, Lh2/z;->h:Lh2/m;

    invoke-virtual {v3}, Lh2/m;->b()Lh2/Z$a;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh2/B;->g(Lh2/Z$a;)Lh2/M;

    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lf9/a;->d(Ljava/lang/Object;)V

    if-eqz v6, :cond_29

    iget-object v2, v12, Lh2/z;->e:Lh2/Q;

    sget-object v3, Lh2/t;->D:Lh2/t;

    invoke-interface {v2, v3, v1}, Lh2/Q;->b(Lh2/t;Lh2/M;)V

    :cond_29
    if-eqz v0, :cond_2a

    iget-object v0, v12, Lh2/z;->e:Lh2/Q;

    sget-object v2, Lh2/t;->E:Lh2/t;

    invoke-interface {v0, v2, v1}, Lh2/Q;->b(Lh2/t;Lh2/M;)V

    :cond_2a
    move-object/from16 v1, p0

    move-object v0, v14

    goto/16 :goto_d

    :catchall_8
    move-exception v0

    const/4 v1, 0x0

    invoke-interface {v2, v1}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_2b
    move-object/from16 v1, p0

    move-object v0, v9

    move-object v8, v12

    move-object v9, v13

    move-object v12, v14

    goto/16 :goto_d

    :goto_25
    invoke-interface {v6, v1}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_2c
    :goto_26
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :goto_27
    invoke-interface {v6, v1}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_2d
    :try_start_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :goto_28
    invoke-interface {v2, v1}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v0

    :cond_2e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final x(Lh2/t;Ljava/lang/Object;)Lh2/L$a;
    .locals 3

    .prologue
    sget-object v0, Lh2/L$a;->c:Lh2/L$a$b;

    sget-object v1, Lh2/t;->C:Lh2/t;

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lh2/z;->c:Lh2/E;

    iget v1, v1, Lh2/E;->d:I

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh2/z;->c:Lh2/E;

    iget v1, v1, Lh2/E;->a:I

    :goto_0
    iget-object v2, p0, Lh2/z;->c:Lh2/E;

    iget-boolean v2, v2, Lh2/E;->c:Z

    invoke-virtual {v0, p1, p2, v1, v2}, Lh2/L$a$b;->a(Lh2/t;Ljava/lang/Object;IZ)Lh2/L$a;

    move-result-object p1

    return-object p1
.end method

.method private final y(Lh2/t;Ljava/lang/Object;Lh2/L$b;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "End "

    if-nez p3, :cond_0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with loadkey "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Load CANCELLED."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with loadKey "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Returned "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final z(Lh2/B;Lh2/t;II)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p1, p2}, Lh2/B;->j(Lh2/t;)I

    move-result v0

    const/4 v1, 0x0

    if-eq p3, v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p3

    invoke-virtual {p3, p2}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object p3

    instance-of p3, p3, Lh2/r$a;

    if-eqz p3, :cond_1

    return-object v1

    :cond_1
    iget-object p3, p0, Lh2/z;->c:Lh2/E;

    iget p3, p3, Lh2/E;->b:I

    if-lt p4, p3, :cond_2

    return-object v1

    :cond_2
    sget-object p3, Lh2/t;->D:Lh2/t;

    invoke-virtual {p1}, Lh2/B;->m()Ljava/util/List;

    move-result-object p1

    if-ne p2, p3, :cond_3

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/L$b$c;

    invoke-virtual {p1}, Lh2/L$b$c;->o()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/L$b$c;

    invoke-virtual {p1}, Lh2/L$b$c;->g()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final o(Lh2/Z;)V
    .locals 1

    const-string v0, "viewportHint"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/z;->h:Lh2/m;

    invoke-virtual {v0, p1}, Lh2/m;->d(Lh2/Z;)V

    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lh2/z;->l:LW8/y;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final r(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, Lh2/z$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh2/z$f;

    iget v1, v0, Lh2/z$f;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/z$f;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/z$f;

    invoke-direct {v0, p0, p1}, Lh2/z$f;-><init>(Lh2/z;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lh2/z$f;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/z$f;->K:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lh2/z$f;->H:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v2, v0, Lh2/z$f;->G:Ljava/lang/Object;

    check-cast v2, Lh2/B$a;

    iget-object v0, v0, Lh2/z$f;->F:Ljava/lang/Object;

    check-cast v0, Lh2/z;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lh2/z;->k:Lh2/B$a;

    invoke-static {v2}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object p1

    iput-object p0, v0, Lh2/z$f;->F:Ljava/lang/Object;

    iput-object v2, v0, Lh2/z$f;->G:Ljava/lang/Object;

    iput-object p1, v0, Lh2/z$f;->H:Ljava/lang/Object;

    iput v3, v0, Lh2/z$f;->K:I

    invoke-interface {p1, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    :try_start_0
    invoke-static {v2}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    iget-object v0, v0, Lh2/z;->h:Lh2/m;

    invoke-virtual {v0}, Lh2/m;->b()Lh2/Z$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lh2/B;->g(Lh2/Z$a;)Lh2/M;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final u()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/z;->m:LZ8/f;

    return-object v0
.end method

.method public final v()Lh2/L;
    .locals 1

    iget-object v0, p0, Lh2/z;->b:Lh2/L;

    return-object v0
.end method

.method public final w()Lh2/Q;
    .locals 1

    iget-object v0, p0, Lh2/z;->e:Lh2/Q;

    return-object v0
.end method
