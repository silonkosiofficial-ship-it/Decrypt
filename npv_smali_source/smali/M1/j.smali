.class public final LM1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM1/j$a;,
        LM1/j$b;
    }
.end annotation


# static fields
.field public static final l:LM1/j$a;


# instance fields
.field private final a:LM1/w;

.field private final b:LM1/d;

.field private final c:LW8/N;

.field private final d:LZ8/C;

.field private final e:LZ8/f;

.field private final f:LZ8/f;

.field private final g:LM1/k;

.field private final h:LM1/j$b;

.field private final i:Li7/n;

.field private final j:Li7/n;

.field private final k:LM1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM1/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM1/j$a;-><init>(Ly7/k;)V

    sput-object v0, LM1/j;->l:LM1/j$a;

    return-void
.end method

.method public constructor <init>(LM1/w;Ljava/util/List;LM1/d;LW8/N;)V
    .locals 6

    const-string v0, "storage"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initTasksList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "corruptionHandler"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/j;->a:LM1/w;

    iput-object p3, p0, LM1/j;->b:LM1/d;

    iput-object p4, p0, LM1/j;->c:LW8/N;

    new-instance p1, LM1/j$r;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, LM1/j$r;-><init>(LM1/j;Lm7/e;)V

    invoke-static {p1}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p1

    sget-object v0, LZ8/I;->a:LZ8/I$a;

    sget-object v1, LT8/a;->D:LT8/a$a;

    invoke-virtual {v1}, LT8/a$a;->c()J

    move-result-wide v2

    invoke-virtual {v1}, LT8/a$a;->c()J

    move-result-wide v4

    invoke-static {v0, v2, v3, v4, v5}, LZ8/J;->a(LZ8/I$a;JJ)LZ8/I;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, p4, v0, v1}, LZ8/h;->K(LZ8/f;LW8/N;LZ8/I;I)LZ8/C;

    move-result-object p1

    iput-object p1, p0, LM1/j;->d:LZ8/C;

    new-instance p1, LM1/j$g;

    invoke-direct {p1, p0, p3}, LM1/j$g;-><init>(LM1/j;Lm7/e;)V

    invoke-static {p1}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p1

    iput-object p1, p0, LM1/j;->e:LZ8/f;

    new-instance p1, LM1/j$d;

    invoke-direct {p1, p0, p3}, LM1/j$d;-><init>(LM1/j;Lm7/e;)V

    invoke-static {p1}, LZ8/h;->h(Lx7/p;)LZ8/f;

    move-result-object p1

    iput-object p1, p0, LM1/j;->f:LZ8/f;

    new-instance p1, LM1/k;

    invoke-direct {p1}, LM1/k;-><init>()V

    iput-object p1, p0, LM1/j;->g:LM1/k;

    new-instance p1, LM1/j$b;

    invoke-direct {p1, p0, p2}, LM1/j$b;-><init>(LM1/j;Ljava/util/List;)V

    iput-object p1, p0, LM1/j;->h:LM1/j$b;

    new-instance p1, LM1/j$p;

    invoke-direct {p1, p0}, LM1/j$p;-><init>(LM1/j;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LM1/j;->i:Li7/n;

    new-instance p1, LM1/j$c;

    invoke-direct {p1, p0}, LM1/j$c;-><init>(LM1/j;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LM1/j;->j:Li7/n;

    new-instance p1, LM1/t;

    new-instance p2, LM1/j$t;

    invoke-direct {p2, p0}, LM1/j$t;-><init>(LM1/j;)V

    sget-object v0, LM1/j$u;->D:LM1/j$u;

    new-instance v1, LM1/j$v;

    invoke-direct {v1, p0, p3}, LM1/j$v;-><init>(LM1/j;Lm7/e;)V

    invoke-direct {p1, p4, p2, v0, v1}, LM1/t;-><init>(LW8/N;Lx7/l;Lx7/p;Lx7/p;)V

    iput-object p1, p0, LM1/j;->k:LM1/t;

    return-void
.end method

.method public static final synthetic b(LM1/j;)LM1/n;
    .locals 0

    invoke-direct {p0}, LM1/j;->q()LM1/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LM1/j;)LM1/k;
    .locals 0

    iget-object p0, p0, LM1/j;->g:LM1/k;

    return-object p0
.end method

.method public static final synthetic d(LM1/j;)LZ8/f;
    .locals 0

    iget-object p0, p0, LM1/j;->e:LZ8/f;

    return-object p0
.end method

.method public static final synthetic e(LM1/j;)LM1/j$b;
    .locals 0

    iget-object p0, p0, LM1/j;->h:LM1/j$b;

    return-object p0
.end method

.method public static final synthetic f(LM1/j;)LM1/w;
    .locals 0

    iget-object p0, p0, LM1/j;->a:LM1/w;

    return-object p0
.end method

.method public static final synthetic g(LM1/j;)Li7/n;
    .locals 0

    iget-object p0, p0, LM1/j;->i:Li7/n;

    return-object p0
.end method

.method public static final synthetic h(LM1/j;)LZ8/C;
    .locals 0

    iget-object p0, p0, LM1/j;->d:LZ8/C;

    return-object p0
.end method

.method public static final synthetic i(LM1/j;)LM1/t;
    .locals 0

    iget-object p0, p0, LM1/j;->k:LM1/t;

    return-object p0
.end method

.method public static final synthetic j(LM1/j;LM1/p$a;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LM1/j;->s(LM1/p$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LM1/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LM1/j;->t(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LM1/j;ZLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LM1/j;->u(ZLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LM1/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LM1/j;->v(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LM1/j;ZLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LM1/j;->w(ZLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LM1/j;ZLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LM1/j;->x(ZLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final p(ZLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LM1/j;->q()LM1/n;

    move-result-object p1

    new-instance v0, LM1/j$e;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, LM1/j$e;-><init>(Lx7/l;Lm7/e;)V

    invoke-interface {p1, v0, p3}, LM1/n;->d(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final q()LM1/n;
    .locals 1

    iget-object v0, p0, LM1/j;->j:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM1/n;

    return-object v0
.end method

.method private final s(LM1/p$a;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p2, LM1/j$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LM1/j$f;

    iget v1, v0, LM1/j$f;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$f;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$f;

    invoke-direct {v0, p0, p2}, LM1/j$f;-><init>(LM1/j;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LM1/j$f;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$f;->K:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LM1/j$f;->F:Ljava/lang/Object;

    check-cast p1, LW8/v;

    :goto_1
    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LM1/j$f;->H:Ljava/lang/Object;

    check-cast p1, LW8/v;

    iget-object v2, v0, LM1/j$f;->G:Ljava/lang/Object;

    check-cast v2, LM1/j;

    iget-object v4, v0, LM1/j$f;->F:Ljava/lang/Object;

    check-cast v4, LM1/p$a;

    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p2, p1

    move-object p1, v4

    goto :goto_3

    :cond_3
    iget-object p1, v0, LM1/j$f;->F:Ljava/lang/Object;

    check-cast p1, LW8/v;

    goto :goto_1

    :cond_4
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, LM1/p$a;->a()LW8/v;

    move-result-object p2

    :try_start_2
    sget-object v2, Li7/w;->D:Li7/w$a;

    iget-object v2, p0, LM1/j;->g:LM1/k;

    invoke-virtual {v2}, LM1/k;->a()LM1/v;

    move-result-object v2

    instance-of v6, v2, LM1/e;

    if-eqz v6, :cond_6

    invoke-virtual {p1}, LM1/p$a;->d()Lx7/p;

    move-result-object v2

    invoke-virtual {p1}, LM1/p$a;->b()Lm7/i;

    move-result-object p1

    iput-object p2, v0, LM1/j$f;->F:Ljava/lang/Object;

    iput v5, v0, LM1/j$f;->K:I

    invoke-direct {p0, v2, p1, v0}, LM1/j;->y(Lx7/p;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_5

    :cond_6
    instance-of v6, v2, LM1/q;

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    instance-of v5, v2, LM1/z;

    :goto_2
    if-eqz v5, :cond_a

    invoke-virtual {p1}, LM1/p$a;->c()LM1/v;

    move-result-object v5

    if-ne v2, v5, :cond_9

    iput-object p1, v0, LM1/j$f;->F:Ljava/lang/Object;

    iput-object p0, v0, LM1/j$f;->G:Ljava/lang/Object;

    iput-object p2, v0, LM1/j$f;->H:Ljava/lang/Object;

    iput v4, v0, LM1/j$f;->K:I

    invoke-direct {p0, v0}, LM1/j;->t(Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v2, p0

    :goto_3
    invoke-virtual {p1}, LM1/p$a;->d()Lx7/p;

    move-result-object v4

    invoke-virtual {p1}, LM1/p$a;->b()Lm7/i;

    move-result-object p1

    iput-object p2, v0, LM1/j$f;->F:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, LM1/j$f;->G:Ljava/lang/Object;

    iput-object v5, v0, LM1/j$f;->H:Ljava/lang/Object;

    iput v3, v0, LM1/j$f;->K:I

    invoke-direct {v2, v4, p1, v0}, LM1/j;->y(Lx7/p;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_5

    return-object v1

    :goto_4
    :try_start_3
    invoke-static {p2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :cond_9
    :try_start_4
    const-string p1, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>"

    invoke-static {v2, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LM1/q;

    invoke-virtual {v2}, LM1/q;->b()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_a
    instance-of p1, v2, LM1/l;

    if-eqz p1, :cond_b

    check-cast v2, LM1/l;

    invoke-virtual {v2}, LM1/l;->b()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_b
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_5
    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {p2}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_6
    invoke-static {p1, p2}, LW8/x;->c(LW8/v;Ljava/lang/Object;)Z

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final t(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, LM1/j$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LM1/j$h;

    iget v1, v0, LM1/j$h;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$h;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$h;

    invoke-direct {v0, p0, p1}, LM1/j$h;-><init>(LM1/j;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LM1/j$h;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$h;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget v1, v0, LM1/j$h;->G:I

    iget-object v0, v0, LM1/j$h;->F:Ljava/lang/Object;

    check-cast v0, LM1/j;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LM1/j$h;->F:Ljava/lang/Object;

    check-cast v2, LM1/j;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-direct {p0}, LM1/j;->q()LM1/n;

    move-result-object p1

    iput-object p0, v0, LM1/j$h;->F:Ljava/lang/Object;

    iput v4, v0, LM1/j$h;->J:I

    invoke-interface {p1, v0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :try_start_1
    iget-object v4, v2, LM1/j;->h:LM1/j$b;

    iput-object v2, v0, LM1/j$h;->F:Ljava/lang/Object;

    iput p1, v0, LM1/j$h;->G:I

    iput v3, v0, LM1/j$h;->J:I

    invoke-virtual {v4, v0}, LM1/s;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception v0

    move v1, p1

    move-object p1, v0

    move-object v0, v2

    :goto_3
    iget-object v0, v0, LM1/j;->g:LM1/k;

    new-instance v2, LM1/q;

    invoke-direct {v2, p1, v1}, LM1/q;-><init>(Ljava/lang/Throwable;I)V

    invoke-virtual {v0, v2}, LM1/k;->c(LM1/v;)LM1/v;

    throw p1
.end method

.method private final u(ZLm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    instance-of v0, p2, LM1/j$i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LM1/j$i;

    iget v1, v0, LM1/j$i;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$i;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$i;

    invoke-direct {v0, p0, p2}, LM1/j$i;-><init>(LM1/j;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LM1/j$i;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$i;->K:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v0, LM1/j$i;->F:Ljava/lang/Object;

    check-cast p1, LM1/j;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-boolean p1, v0, LM1/j$i;->H:Z

    iget-object v2, v0, LM1/j$i;->G:Ljava/lang/Object;

    check-cast v2, LM1/v;

    iget-object v5, v0, LM1/j$i;->F:Ljava/lang/Object;

    check-cast v5, LM1/j;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v8, p2

    move p2, p1

    move-object p1, v5

    move-object v5, v2

    move-object v2, v8

    goto :goto_2

    :cond_4
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LM1/j;->g:LM1/k;

    invoke-virtual {p2}, LM1/k;->a()LM1/v;

    move-result-object v2

    instance-of p2, v2, LM1/z;

    xor-int/2addr p2, v5

    if-eqz p2, :cond_b

    invoke-direct {p0}, LM1/j;->q()LM1/n;

    move-result-object p2

    iput-object p0, v0, LM1/j$i;->F:Ljava/lang/Object;

    iput-object v2, v0, LM1/j$i;->G:Ljava/lang/Object;

    iput-boolean p1, v0, LM1/j$i;->H:Z

    iput v5, v0, LM1/j$i;->K:I

    invoke-interface {p2, v0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, v2

    move-object v2, p2

    move p2, p1

    move-object p1, p0

    :goto_2
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    instance-of v6, v5, LM1/e;

    if-eqz v6, :cond_6

    invoke-virtual {v5}, LM1/v;->a()I

    move-result v7

    goto :goto_3

    :cond_6
    const/4 v7, -0x1

    :goto_3
    if-eqz v6, :cond_7

    if-ne v2, v7, :cond_7

    return-object v5

    :cond_7
    const/4 v2, 0x0

    if-eqz p2, :cond_9

    invoke-direct {p1}, LM1/j;->q()LM1/n;

    move-result-object p2

    new-instance v3, LM1/j$j;

    invoke-direct {v3, p1, v2}, LM1/j$j;-><init>(LM1/j;Lm7/e;)V

    iput-object p1, v0, LM1/j$i;->F:Ljava/lang/Object;

    iput-object v2, v0, LM1/j$i;->G:Ljava/lang/Object;

    iput v4, v0, LM1/j$i;->K:I

    invoke-interface {p2, v3, v0}, LM1/n;->d(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_8
    :goto_4
    check-cast p2, Li7/u;

    goto :goto_5

    :cond_9
    invoke-direct {p1}, LM1/j;->q()LM1/n;

    move-result-object p2

    new-instance v4, LM1/j$k;

    invoke-direct {v4, p1, v7, v2}, LM1/j$k;-><init>(LM1/j;ILm7/e;)V

    iput-object p1, v0, LM1/j$i;->F:Ljava/lang/Object;

    iput-object v2, v0, LM1/j$i;->G:Ljava/lang/Object;

    iput v3, v0, LM1/j$i;->K:I

    invoke-interface {p2, v4, v0}, LM1/n;->c(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :goto_5
    invoke-virtual {p2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM1/v;

    invoke-virtual {p2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p1, p1, LM1/j;->g:LM1/k;

    invoke-virtual {p1, v0}, LM1/k;->c(LM1/v;)LM1/v;

    :cond_a
    return-object v0

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final v(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM1/j;->r()LM1/x;

    move-result-object v0

    invoke-static {v0, p1}, LM1/y;->a(LM1/x;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final w(ZLm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p2, LM1/j$l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LM1/j$l;

    iget v1, v0, LM1/j$l;->N:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$l;->N:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$l;

    invoke-direct {v0, p0, p2}, LM1/j$l;-><init>(LM1/j;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LM1/j$l;->L:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$l;->N:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v0, LM1/j$l;->H:Ljava/lang/Object;

    check-cast p1, Ly7/M;

    iget-object v1, v0, LM1/j$l;->G:Ljava/lang/Object;

    check-cast v1, Ly7/O;

    iget-object v0, v0, LM1/j$l;->F:Ljava/lang/Object;

    check-cast v0, LM1/c;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_a

    :catchall_0
    move-exception p1

    goto/16 :goto_b

    :pswitch_1
    iget-boolean p1, v0, LM1/j$l;->J:Z

    iget-object v2, v0, LM1/j$l;->I:Ljava/lang/Object;

    check-cast v2, Ly7/O;

    iget-object v3, v0, LM1/j$l;->H:Ljava/lang/Object;

    check-cast v3, Ly7/O;

    iget-object v6, v0, LM1/j$l;->G:Ljava/lang/Object;

    check-cast v6, LM1/c;

    iget-object v7, v0, LM1/j$l;->F:Ljava/lang/Object;

    check-cast v7, LM1/j;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    goto/16 :goto_9

    :pswitch_2
    iget-boolean p1, v0, LM1/j$l;->J:Z

    iget-object v2, v0, LM1/j$l;->F:Ljava/lang/Object;

    check-cast v2, LM1/j;

    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch LM1/c; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception p2

    move-object v7, v2

    goto/16 :goto_8

    :pswitch_3
    iget-boolean p1, v0, LM1/j$l;->J:Z

    iget-object v2, v0, LM1/j$l;->F:Ljava/lang/Object;

    check-cast v2, LM1/j;

    :try_start_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch LM1/c; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_5

    :pswitch_4
    iget p1, v0, LM1/j$l;->K:I

    iget-boolean v2, v0, LM1/j$l;->J:Z

    iget-object v3, v0, LM1/j$l;->G:Ljava/lang/Object;

    iget-object v6, v0, LM1/j$l;->F:Ljava/lang/Object;

    check-cast v6, LM1/j;

    :try_start_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch LM1/c; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    :catch_1
    move-exception p2

    move p1, v2

    :goto_1
    move-object v7, v6

    goto/16 :goto_8

    :pswitch_5
    iget-boolean p1, v0, LM1/j$l;->J:Z

    iget-object v2, v0, LM1/j$l;->F:Ljava/lang/Object;

    check-cast v2, LM1/j;

    :try_start_4
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch LM1/c; {:try_start_4 .. :try_end_4} :catch_0

    move-object v6, v2

    goto :goto_2

    :pswitch_6
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    :try_start_5
    iput-object p0, v0, LM1/j$l;->F:Ljava/lang/Object;

    iput-boolean p1, v0, LM1/j$l;->J:Z

    iput v3, v0, LM1/j$l;->N:I

    invoke-direct {p0, v0}, LM1/j;->v(Lm7/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_5
    .catch LM1/c; {:try_start_5 .. :try_end_5} :catch_3

    if-ne p2, v1, :cond_1

    return-object v1

    :cond_1
    move-object v6, p0

    :goto_2
    if-eqz p2, :cond_2

    :try_start_6
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :catch_2
    move-exception p2

    goto :goto_1

    :cond_2
    move v2, v5

    :goto_3
    invoke-direct {v6}, LM1/j;->q()LM1/n;

    move-result-object v3

    iput-object v6, v0, LM1/j$l;->F:Ljava/lang/Object;

    iput-object p2, v0, LM1/j$l;->G:Ljava/lang/Object;

    iput-boolean p1, v0, LM1/j$l;->J:Z

    iput v2, v0, LM1/j$l;->K:I

    const/4 v7, 0x2

    iput v7, v0, LM1/j$l;->N:I

    invoke-interface {v3, v0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v3
    :try_end_6
    .catch LM1/c; {:try_start_6 .. :try_end_6} :catch_2

    if-ne v3, v1, :cond_3

    return-object v1

    :cond_3
    move v8, v2

    move v2, p1

    move p1, v8

    move-object v9, v3

    move-object v3, p2

    move-object p2, v9

    :goto_4
    :try_start_7
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    new-instance v7, LM1/e;

    invoke-direct {v7, v3, p1, p2}, LM1/e;-><init>(Ljava/lang/Object;II)V
    :try_end_7
    .catch LM1/c; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_7

    :catch_3
    move-exception p2

    move-object v7, p0

    goto :goto_8

    :cond_4
    :try_start_8
    invoke-direct {p0}, LM1/j;->q()LM1/n;

    move-result-object p2

    iput-object p0, v0, LM1/j$l;->F:Ljava/lang/Object;

    iput-boolean p1, v0, LM1/j$l;->J:Z

    const/4 v2, 0x3

    iput v2, v0, LM1/j$l;->N:I

    invoke-interface {p2, v0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_8
    .catch LM1/c; {:try_start_8 .. :try_end_8} :catch_3

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_5
    :try_start_9
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-direct {v2}, LM1/j;->q()LM1/n;

    move-result-object v3

    new-instance v6, LM1/j$m;

    invoke-direct {v6, v2, p2, v4}, LM1/j$m;-><init>(LM1/j;ILm7/e;)V

    iput-object v2, v0, LM1/j$l;->F:Ljava/lang/Object;

    iput-boolean p1, v0, LM1/j$l;->J:Z

    const/4 p2, 0x4

    iput p2, v0, LM1/j$l;->N:I

    invoke-interface {v3, v6, v0}, LM1/n;->c(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_6
    move-object v7, p2

    check-cast v7, LM1/e;
    :try_end_9
    .catch LM1/c; {:try_start_9 .. :try_end_9} :catch_0

    :goto_7
    return-object v7

    :goto_8
    new-instance v2, Ly7/O;

    invoke-direct {v2}, Ly7/O;-><init>()V

    iget-object v3, v7, LM1/j;->b:LM1/d;

    iput-object v7, v0, LM1/j$l;->F:Ljava/lang/Object;

    iput-object p2, v0, LM1/j$l;->G:Ljava/lang/Object;

    iput-object v2, v0, LM1/j$l;->H:Ljava/lang/Object;

    iput-object v2, v0, LM1/j$l;->I:Ljava/lang/Object;

    iput-boolean p1, v0, LM1/j$l;->J:Z

    const/4 v6, 0x5

    iput v6, v0, LM1/j$l;->N:I

    invoke-interface {v3, p2, v0}, LM1/d;->a(LM1/c;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_7

    return-object v1

    :cond_7
    move-object v6, p2

    move-object p2, v3

    move-object v3, v2

    :goto_9
    iput-object p2, v3, Ly7/O;->C:Ljava/lang/Object;

    new-instance p2, Ly7/M;

    invoke-direct {p2}, Ly7/M;-><init>()V

    :try_start_a
    new-instance v3, LM1/j$n;

    invoke-direct {v3, v2, v7, p2, v4}, LM1/j$n;-><init>(Ly7/O;LM1/j;Ly7/M;Lm7/e;)V

    iput-object v6, v0, LM1/j$l;->F:Ljava/lang/Object;

    iput-object v2, v0, LM1/j$l;->G:Ljava/lang/Object;

    iput-object p2, v0, LM1/j$l;->H:Ljava/lang/Object;

    iput-object v4, v0, LM1/j$l;->I:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, v0, LM1/j$l;->N:I

    invoke-direct {v7, p1, v3, v0}, LM1/j;->p(ZLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    move-object p1, p2

    move-object v1, v2

    :goto_a
    new-instance p2, LM1/e;

    iget-object v0, v1, Ly7/O;->C:Ljava/lang/Object;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    :cond_9
    iget p1, p1, Ly7/M;->C:I

    invoke-direct {p2, v0, v5, p1}, LM1/e;-><init>(Ljava/lang/Object;II)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v0, v6

    :goto_b
    invoke-static {v0, p1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final x(ZLm7/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LM1/j;->c:LW8/N;

    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    new-instance v1, LM1/j$o;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LM1/j$o;-><init>(LM1/j;ZLm7/e;)V

    invoke-static {v0, v1, p2}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final y(Lx7/p;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, LM1/j;->q()LM1/n;

    move-result-object v0

    new-instance v1, LM1/j$q;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, LM1/j$q;-><init>(LM1/j;Lm7/i;Lx7/p;Lm7/e;)V

    invoke-interface {v0, v1, p3}, LM1/n;->d(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, LM1/A$a$a;->C:LM1/A$a$a;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LM1/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LM1/A;->a(LM1/h;)V

    :cond_0
    new-instance v1, LM1/A;

    invoke-direct {v1, v0, p0}, LM1/A;-><init>(LM1/A;LM1/j;)V

    new-instance v0, LM1/j$s;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, LM1/j$s;-><init>(LM1/j;Lx7/p;Lm7/e;)V

    invoke-static {v1, v0, p2}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getData()LZ8/f;
    .locals 1

    iget-object v0, p0, LM1/j;->f:LZ8/f;

    return-object v0
.end method

.method public final r()LM1/x;
    .locals 1

    iget-object v0, p0, LM1/j;->i:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM1/x;

    return-object v0
.end method

.method public final z(Ljava/lang/Object;ZLm7/e;)Ljava/lang/Object;
    .locals 11

    .prologue
    instance-of v0, p3, LM1/j$w;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LM1/j$w;

    iget v1, v0, LM1/j$w;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$w;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$w;

    invoke-direct {v0, p0, p3}, LM1/j$w;-><init>(LM1/j;Lm7/e;)V

    :goto_0
    iget-object p3, v0, LM1/j$w;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$w;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LM1/j$w;->F:Ljava/lang/Object;

    check-cast p1, Ly7/M;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p3, Ly7/M;

    invoke-direct {p3}, Ly7/M;-><init>()V

    invoke-virtual {p0}, LM1/j;->r()LM1/x;

    move-result-object v2

    new-instance v10, LM1/j$x;

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, p3

    move-object v6, p0

    move-object v7, p1

    move v8, p2

    invoke-direct/range {v4 .. v9}, LM1/j$x;-><init>(Ly7/M;LM1/j;Ljava/lang/Object;ZLm7/e;)V

    iput-object p3, v0, LM1/j$w;->F:Ljava/lang/Object;

    iput v3, v0, LM1/j$w;->I:I

    invoke-interface {v2, v10, v0}, LM1/x;->c(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p3

    :goto_1
    iget p1, p1, Ly7/M;->C:I

    invoke-static {p1}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
