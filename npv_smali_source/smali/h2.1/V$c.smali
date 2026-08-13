.class final Lh2/V$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lh2/V;

.field private final b:Z

.field private final c:Lf9/a;

.field private d:LW8/z0;

.field private e:I


# direct methods
.method public constructor <init>(Lh2/V;Z)V
    .locals 1

    const-string v0, "singleRunner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/V$c;->a:Lh2/V;

    iput-boolean p2, p0, Lh2/V$c;->b:Z

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {v0, p1, p2}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object p1

    iput-object p1, p0, Lh2/V$c;->c:Lf9/a;

    return-void
.end method


# virtual methods
.method public final a(LW8/z0;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lh2/V$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/V$c$a;

    iget v1, v0, Lh2/V$c$a;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/V$c$a;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/V$c$a;

    invoke-direct {v0, p0, p2}, Lh2/V$c$a;-><init>(Lh2/V$c;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/V$c$a;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/V$c$a;->K:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh2/V$c$a;->H:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object v1, v0, Lh2/V$c$a;->G:Ljava/lang/Object;

    check-cast v1, LW8/z0;

    iget-object v0, v0, Lh2/V$c$a;->F:Ljava/lang/Object;

    check-cast v0, Lh2/V$c;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/V$c;->c:Lf9/a;

    iput-object p0, v0, Lh2/V$c$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/V$c$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lh2/V$c$a;->H:Ljava/lang/Object;

    iput v3, v0, Lh2/V$c$a;->K:I

    invoke-interface {p2, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_0
    iget-object v1, v0, Lh2/V$c;->d:LW8/z0;

    if-ne p1, v1, :cond_4

    iput-object v4, v0, Lh2/V$c;->d:LW8/z0;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_3
    invoke-interface {p2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final b(ILW8/z0;Lm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    instance-of v0, p3, Lh2/V$c$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh2/V$c$b;

    iget v1, v0, Lh2/V$c$b;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/V$c$b;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/V$c$b;

    invoke-direct {v0, p0, p3}, Lh2/V$c$b;-><init>(Lh2/V$c;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lh2/V$c$b;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/V$c$b;->L:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lh2/V$c$b;->I:I

    iget-object p2, v0, Lh2/V$c$b;->H:Ljava/lang/Object;

    check-cast p2, Lf9/a;

    iget-object v1, v0, Lh2/V$c$b;->G:Ljava/lang/Object;

    check-cast v1, LW8/z0;

    iget-object v0, v0, Lh2/V$c$b;->F:Ljava/lang/Object;

    check-cast v0, Lh2/V$c;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lh2/V$c$b;->I:I

    iget-object p2, v0, Lh2/V$c$b;->H:Ljava/lang/Object;

    check-cast p2, Lf9/a;

    iget-object v2, v0, Lh2/V$c$b;->G:Ljava/lang/Object;

    check-cast v2, LW8/z0;

    iget-object v6, v0, Lh2/V$c$b;->F:Ljava/lang/Object;

    check-cast v6, Lh2/V$c;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lh2/V$c;->c:Lf9/a;

    iput-object p0, v0, Lh2/V$c$b;->F:Ljava/lang/Object;

    iput-object p2, v0, Lh2/V$c$b;->G:Ljava/lang/Object;

    iput-object p3, v0, Lh2/V$c$b;->H:Ljava/lang/Object;

    iput p1, v0, Lh2/V$c$b;->I:I

    iput v4, v0, Lh2/V$c$b;->L:I

    invoke-interface {p3, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, p0

    move-object v2, p2

    move-object p2, p3

    :goto_1
    :try_start_1
    iget-object p3, v6, Lh2/V$c;->d:LW8/z0;

    if-eqz p3, :cond_6

    invoke-interface {p3}, LW8/z0;->f()Z

    move-result v7

    if-eqz v7, :cond_6

    iget v7, v6, Lh2/V$c;->e:I

    if-lt v7, p1, :cond_6

    if-ne v7, p1, :cond_5

    iget-boolean v7, v6, Lh2/V$c;->b:Z

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    goto :goto_4

    :cond_6
    :goto_2
    if-eqz p3, :cond_7

    new-instance v7, Lh2/V$a;

    iget-object v8, v6, Lh2/V$c;->a:Lh2/V;

    invoke-direct {v7, v8}, Lh2/V$a;-><init>(Lh2/V;)V

    invoke-interface {p3, v7}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    if-eqz p3, :cond_9

    iput-object v6, v0, Lh2/V$c$b;->F:Ljava/lang/Object;

    iput-object v2, v0, Lh2/V$c$b;->G:Ljava/lang/Object;

    iput-object p2, v0, Lh2/V$c$b;->H:Ljava/lang/Object;

    iput p1, v0, Lh2/V$c$b;->I:I

    iput v3, v0, Lh2/V$c$b;->L:I

    invoke-interface {p3, v0}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    return-object v1

    :cond_8
    move-object v1, v2

    move-object v0, v6

    :goto_3
    move-object v6, v0

    move-object v2, v1

    :cond_9
    iput-object v2, v6, Lh2/V$c;->d:LW8/z0;

    iput p1, v6, Lh2/V$c;->e:I

    :goto_4
    invoke-static {v4}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p1

    :goto_5
    invoke-interface {p2, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method
