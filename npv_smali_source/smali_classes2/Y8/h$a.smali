.class final LY8/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY8/l;
.implements LW8/e1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private C:Ljava/lang/Object;

.field private D:LW8/n;

.field final synthetic E:LY8/h;


# direct methods
.method public constructor <init>(LY8/h;)V
    .locals 0

    iput-object p1, p0, LY8/h$a;->E:LY8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LY8/i;->m()Lb9/D;

    move-result-object p1

    iput-object p1, p0, LY8/h$a;->C:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic c(LY8/h$a;)V
    .locals 0

    invoke-direct {p0}, LY8/h$a;->h()V

    return-void
.end method

.method public static final synthetic d(LY8/h$a;LW8/n;)V
    .locals 0

    iput-object p1, p0, LY8/h$a;->D:LW8/n;

    return-void
.end method

.method public static final synthetic e(LY8/h$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LY8/h$a;->C:Ljava/lang/Object;

    return-void
.end method

.method private final f(LY8/p;IJLm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    iget-object v6, p0, LY8/h$a;->E:LY8/h;

    invoke-static {p5}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v0

    invoke-static {v0}, LW8/p;->b(Lm7/e;)LW8/n;

    move-result-object v7

    :try_start_0
    invoke-static {p0, v7}, LY8/h$a;->d(LY8/h$a;LW8/n;)V

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {v6, p0, p1, p2}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v0, p2, :cond_a

    invoke-virtual {v6}, LY8/h;->l0()J

    move-result-wide v0

    cmp-long p2, p3, v0

    if-gez p2, :cond_1

    invoke-virtual {p1}, Lb9/b;->c()V

    :cond_1
    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY8/p;

    :cond_2
    :goto_0
    invoke-virtual {v6}, LY8/h;->u0()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0}, LY8/h$a;->c(LY8/h$a;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, LY8/i;->b:I

    int-to-long v0, p4

    div-long v0, p2, v0

    int-to-long v2, p4

    rem-long v2, p2, v2

    long-to-int p4, v2

    iget-wide v2, p1, Lb9/A;->c:J

    cmp-long v2, v2, v0

    if-eqz v2, :cond_5

    invoke-static {v6, v0, v1, p1}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v0

    :cond_5
    move-object v0, v6

    move-object v1, p1

    move v2, p4

    move-wide v3, p2

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_6

    invoke-static {v6, p0, p1, p4}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    goto :goto_2

    :cond_6
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p4

    if-ne v0, p4, :cond_7

    invoke-virtual {v6}, LY8/h;->l0()J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-gez p2, :cond_2

    invoke-virtual {p1}, Lb9/b;->c()V

    goto :goto_0

    :cond_7
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object p2

    if-eq v0, p2, :cond_9

    invoke-virtual {p1}, Lb9/b;->c()V

    invoke-static {p0, v0}, LY8/h$a;->e(LY8/h$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, LY8/h$a;->d(LY8/h$a;LW8/n;)V

    invoke-static {v8}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, LY8/h;->D:Lx7/l;

    if-eqz p2, :cond_8

    invoke-static {v6, p2, v0}, LY8/h;->k(LY8/h;Lx7/l;Ljava/lang/Object;)Lx7/q;

    move-result-object v9

    :cond_8
    :goto_1
    invoke-virtual {v7, p1, v9}, LW8/n;->C(Ljava/lang/Object;Lx7/q;)V

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p1}, Lb9/b;->c()V

    invoke-static {p0, v0}, LY8/h$a;->e(LY8/h$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, LY8/h$a;->d(LY8/h$a;LW8/n;)V

    invoke-static {v8}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, LY8/h;->D:Lx7/l;

    if-eqz p2, :cond_8

    invoke-static {v6, p2, v0}, LY8/h;->k(LY8/h;Lx7/l;Ljava/lang/Object;)Lx7/q;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {v7}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_b

    invoke-static {p5}, Lo7/h;->c(Lm7/e;)V

    :cond_b
    return-object p1

    :goto_3
    invoke-virtual {v7}, LW8/n;->Q()V

    throw p1
.end method

.method private final g()Z
    .locals 1

    .prologue
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v0

    iput-object v0, p0, LY8/h$a;->C:Ljava/lang/Object;

    iget-object v0, p0, LY8/h$a;->E:LY8/h;

    invoke-virtual {v0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Lb9/C;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method private final h()V
    .locals 3

    .prologue
    iget-object v0, p0, LY8/h$a;->D:LW8/n;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LY8/h$a;->D:LW8/n;

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v1

    iput-object v1, p0, LY8/h$a;->C:Ljava/lang/Object;

    iget-object v1, p0, LY8/h$a;->E:LY8/h;

    invoke-virtual {v1}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Li7/w;->D:Li7/w$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    sget-object v2, Li7/w;->D:Li7/w$a;

    invoke-static {v1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lm7/e;)Ljava/lang/Object;
    .locals 12

    .prologue
    iget-object v0, p0, LY8/h$a;->C:Ljava/lang/Object;

    invoke-static {}, LY8/i;->m()Lb9/D;

    move-result-object v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LY8/h$a;->C:Ljava/lang/Object;

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LY8/h$a;->E:LY8/h;

    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY8/p;

    :cond_1
    :goto_0
    invoke-virtual {v0}, LY8/h;->u0()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0}, LY8/h$a;->g()Z

    move-result v2

    goto :goto_1

    :cond_2
    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v9

    sget v3, LY8/i;->b:I

    int-to-long v4, v3

    div-long v4, v9, v4

    int-to-long v6, v3

    rem-long v6, v9, v6

    long-to-int v11, v6

    iget-wide v6, v1, Lb9/A;->c:J

    cmp-long v3, v6, v4

    if-eqz v3, :cond_4

    invoke-static {v0, v4, v5, v1}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, v3

    :cond_4
    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, v1

    move v5, v11

    move-wide v6, v9

    invoke-static/range {v3 .. v8}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v4

    if-eq v3, v4, :cond_7

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object v4

    if-ne v3, v4, :cond_5

    invoke-virtual {v0}, LY8/h;->l0()J

    move-result-wide v3

    cmp-long v3, v9, v3

    if-gez v3, :cond_1

    invoke-virtual {v1}, Lb9/b;->c()V

    goto :goto_0

    :cond_5
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object v0

    if-ne v3, v0, :cond_6

    move-object v4, p0

    move-object v5, v1

    move v6, v11

    move-wide v7, v9

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, LY8/h$a;->f(LY8/p;IJLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {v1}, Lb9/b;->c()V

    iput-object v3, p0, LY8/h$a;->C:Ljava/lang/Object;

    :goto_1
    invoke-static {v2}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unreachable"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lb9/A;I)V
    .locals 1

    .prologue
    iget-object v0, p0, LY8/h$a;->D:LW8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LW8/n;->b(Lb9/A;I)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    iget-object v0, p0, LY8/h$a;->D:LW8/n;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LY8/h$a;->D:LW8/n;

    iput-object p1, p0, LY8/h$a;->C:Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, LY8/h$a;->E:LY8/h;

    iget-object v4, v3, LY8/h;->D:Lx7/l;

    if-eqz v4, :cond_0

    invoke-static {v3, v4, p1}, LY8/h;->k(LY8/h;Lx7/l;Ljava/lang/Object;)Lx7/q;

    move-result-object v1

    :cond_0
    invoke-static {v0, v2, v1}, LY8/i;->u(LW8/l;Ljava/lang/Object;Lx7/q;)Z

    move-result p1

    return p1
.end method

.method public final j()V
    .locals 3

    .prologue
    iget-object v0, p0, LY8/h$a;->D:LW8/n;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LY8/h$a;->D:LW8/n;

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v1

    iput-object v1, p0, LY8/h$a;->C:Ljava/lang/Object;

    iget-object v1, p0, LY8/h$a;->E:LY8/h;

    invoke-virtual {v1}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Li7/w;->D:Li7/w$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    sget-object v2, Li7/w;->D:Li7/w$a;

    invoke-static {v1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_1
    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, LY8/h$a;->C:Ljava/lang/Object;

    invoke-static {}, LY8/i;->m()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LY8/i;->m()Lb9/D;

    move-result-object v1

    iput-object v1, p0, LY8/h$a;->C:Ljava/lang/Object;

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LY8/h$a;->E:LY8/h;

    invoke-static {v0}, LY8/h;->r(LY8/h;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lb9/C;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
