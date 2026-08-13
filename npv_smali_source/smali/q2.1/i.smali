.class final Lq2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/B;
.implements Lq2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/i$a;,
        Lq2/i$b;,
        Lq2/i$c;,
        Lq2/i$d;
    }
.end annotation


# instance fields
.field private final a:Lq2/f;

.field private final b:Z

.field private final c:Lj7/m;

.field private final d:LV8/a;


# direct methods
.method public constructor <init>(Lq2/f;Z)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/i;->a:Lq2/f;

    iput-boolean p2, p0, Lq2/i;->b:Z

    new-instance p1, Lj7/m;

    invoke-direct {p1}, Lj7/m;-><init>()V

    iput-object p1, p0, Lq2/i;->c:Lj7/m;

    const/4 p1, 0x0

    invoke-static {p1}, LV8/b;->a(Z)LV8/a;

    move-result-object p1

    iput-object p1, p0, Lq2/i;->d:LV8/a;

    return-void
.end method

.method public static final synthetic e(Lq2/i;Lo2/B$a;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lq2/i;->i(Lo2/B$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lq2/i;ZLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lq2/i;->j(ZLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lq2/i;)Z
    .locals 0

    invoke-direct {p0}, Lq2/i;->m()Z

    move-result p0

    return p0
.end method

.method public static final synthetic h(Lq2/i;Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq2/i;->o(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lo2/B$a;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lq2/i$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq2/i$e;

    iget v1, v0, Lq2/i$e;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq2/i$e;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq2/i$e;

    invoke-direct {v0, p0, p2}, Lq2/i$e;-><init>(Lq2/i;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lq2/i$e;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lq2/i$e;->K:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lq2/i$e;->H:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object v1, v0, Lq2/i$e;->G:Ljava/lang/Object;

    check-cast v1, Lo2/B$a;

    iget-object v0, v0, Lq2/i$e;->F:Ljava/lang/Object;

    check-cast v0, Lq2/i;

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

    iget-object p2, p0, Lq2/i;->a:Lq2/f;

    iput-object p0, v0, Lq2/i$e;->F:Ljava/lang/Object;

    iput-object p1, v0, Lq2/i$e;->G:Ljava/lang/Object;

    iput-object p2, v0, Lq2/i$e;->H:Ljava/lang/Object;

    iput v3, v0, Lq2/i$e;->K:I

    invoke-interface {p2, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_0
    iget-object v1, v0, Lq2/i;->c:Lj7/m;

    invoke-virtual {v1}, Lj7/h;->size()I

    move-result v1

    iget-object v2, v0, Lq2/i;->c:Lj7/m;

    invoke-virtual {v2}, Lj7/m;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lq2/i$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v3, :cond_6

    const/4 v2, 0x2

    if-eq p1, v2, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    goto :goto_3

    :cond_4
    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    :goto_2
    invoke-static {p1, v2}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_5
    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    const-string v2, "BEGIN IMMEDIATE TRANSACTION"

    goto :goto_2

    :cond_6
    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    const-string v2, "BEGIN DEFERRED TRANSACTION"

    goto :goto_2

    :cond_7
    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SAVEPOINT \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :goto_3
    iget-object p1, v0, Lq2/i;->c:Lj7/m;

    new-instance v0, Lq2/i$c;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq2/i$c;-><init>(IZ)V

    invoke-virtual {p1, v0}, Lj7/m;->g(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p1

    :goto_4
    invoke-interface {p2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method private final j(ZLm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lq2/i$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq2/i$f;

    iget v1, v0, Lq2/i$f;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq2/i$f;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq2/i$f;

    invoke-direct {v0, p0, p2}, Lq2/i$f;-><init>(Lq2/i;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lq2/i$f;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lq2/i$f;->K:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, Lq2/i$f;->H:Z

    iget-object v1, v0, Lq2/i$f;->G:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v0, v0, Lq2/i$f;->F:Ljava/lang/Object;

    check-cast v0, Lq2/i;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lq2/i;->a:Lq2/f;

    iput-object p0, v0, Lq2/i$f;->F:Ljava/lang/Object;

    iput-object p2, v0, Lq2/i$f;->G:Ljava/lang/Object;

    iput-boolean p1, v0, Lq2/i$f;->H:Z

    iput v3, v0, Lq2/i$f;->K:I

    invoke-interface {p2, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p2

    :goto_1
    :try_start_0
    iget-object p2, v0, Lq2/i;->c:Lj7/m;

    invoke-virtual {p2}, Lj7/m;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_7

    iget-object p2, v0, Lq2/i;->c:Lj7/m;

    invoke-static {p2}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lq2/i$c;

    const/16 v2, 0x27

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Lq2/i$c;->b()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, v0, Lq2/i;->c:Lj7/m;

    invoke-virtual {p1}, Lj7/m;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    const-string p2, "END TRANSACTION"

    :goto_2
    invoke-static {p1, p2}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RELEASE SAVEPOINT \'"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lq2/i$c;->a()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_5
    iget-object p1, v0, Lq2/i;->c:Lj7/m;

    invoke-virtual {p1}, Lj7/m;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    const-string p2, "ROLLBACK TRANSACTION"

    goto :goto_2

    :cond_6
    iget-object p1, v0, Lq2/i;->a:Lq2/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ROLLBACK TRANSACTION TO SAVEPOINT \'"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lq2/i$c;->a()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p1

    :cond_7
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not in a transaction"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method private final m()Z
    .locals 1

    iget-object v0, p0, Lq2/i;->d:LV8/a;

    invoke-virtual {v0}, LV8/a;->c()Z

    move-result v0

    return v0
.end method

.method private final o(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p3, Lq2/i$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lq2/i$g;

    iget v1, v0, Lq2/i$g;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq2/i$g;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq2/i$g;

    invoke-direct {v0, p0, p3}, Lq2/i$g;-><init>(Lq2/i;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lq2/i$g;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lq2/i$g;->K:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_6

    if-eq v2, v8, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    const/4 p1, 0x4

    if-eq v2, p1, :cond_2

    if-eq v2, v5, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Lq2/i$g;->G:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object p2, v0, Lq2/i$g;->F:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception p3

    goto/16 :goto_5

    :cond_2
    iget-object p1, v0, Lq2/i$g;->F:Ljava/lang/Object;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    iget-object p1, v0, Lq2/i$g;->F:Ljava/lang/Object;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget p1, v0, Lq2/i$g;->H:I

    iget-object p2, v0, Lq2/i$g;->F:Ljava/lang/Object;

    check-cast p2, Lq2/i;

    :try_start_1
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    goto :goto_4

    :cond_5
    iget-object p1, v0, Lq2/i$g;->G:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lx7/p;

    iget-object p1, v0, Lq2/i$g;->F:Ljava/lang/Object;

    check-cast p1, Lq2/i;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    if-nez p1, :cond_7

    sget-object p1, Lo2/B$a;->C:Lo2/B$a;

    :cond_7
    iput-object p0, v0, Lq2/i$g;->F:Ljava/lang/Object;

    iput-object p2, v0, Lq2/i$g;->G:Ljava/lang/Object;

    iput v8, v0, Lq2/i$g;->K:I

    invoke-direct {p0, p1, v0}, Lq2/i;->i(Lo2/B$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    move-object p1, p0

    :goto_1
    :try_start_2
    new-instance p3, Lq2/i$b;

    invoke-direct {p3, p1}, Lq2/i$b;-><init>(Lq2/i;)V

    iput-object p1, v0, Lq2/i$g;->F:Ljava/lang/Object;

    iput-object v4, v0, Lq2/i$g;->G:Ljava/lang/Object;

    iput v8, v0, Lq2/i$g;->H:I

    iput v7, v0, Lq2/i$g;->K:I

    invoke-interface {p2, p3, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p3, v1, :cond_9

    return-object v1

    :cond_9
    move-object p2, p1

    move p1, v8

    :goto_2
    if-eqz p1, :cond_a

    move v3, v8

    :cond_a
    iput-object p3, v0, Lq2/i$g;->F:Ljava/lang/Object;

    iput v6, v0, Lq2/i$g;->K:I

    invoke-direct {p2, v3, v0}, Lq2/i;->j(ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    return-object v1

    :cond_b
    move-object p1, p3

    :goto_3
    return-object p1

    :catchall_1
    move-exception p2

    :goto_4
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p3

    :try_start_4
    iput-object p2, v0, Lq2/i$g;->F:Ljava/lang/Object;

    iput-object p3, v0, Lq2/i$g;->G:Ljava/lang/Object;

    iput v5, v0, Lq2/i$g;->K:I

    invoke-direct {p1, v3, v0}, Lq2/i;->j(ZLm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_1

    if-ne p1, v1, :cond_c

    return-object v1

    :cond_c
    move-object p1, p3

    goto :goto_6

    :catch_1
    move-exception p1

    move-object v9, p3

    move-object p3, p1

    move-object p1, v9

    :goto_5
    if-eqz p2, :cond_d

    invoke-static {p2, p3}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    sget-object v4, Li7/M;->a:Li7/M;

    :cond_d
    if-nez v4, :cond_e

    throw p3

    :cond_e
    :goto_6
    throw p1
.end method


# virtual methods
.method public a(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {p0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    sget-object v0, Lq2/a;->D:Lq2/a$a;

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    check-cast p1, Lq2/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lq2/a;->a()Lq2/i;

    move-result-object p1

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Lq2/i;->c:Lj7/m;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use connection on a different coroutine"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Connection is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p3, Lq2/i$h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lq2/i$h;

    iget v1, v0, Lq2/i$h;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq2/i$h;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq2/i$h;

    invoke-direct {v0, p0, p3}, Lq2/i$h;-><init>(Lq2/i;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lq2/i$h;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lq2/i$h;->L:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lq2/i$h;->I:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object p2, v0, Lq2/i$h;->H:Ljava/lang/Object;

    check-cast p2, Lx7/l;

    iget-object v1, v0, Lq2/i$h;->G:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lq2/i$h;->F:Ljava/lang/Object;

    check-cast v0, Lq2/i;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Lq2/i;->g(Lq2/i;)Z

    move-result p3

    const/16 v2, 0x15

    if-nez p3, :cond_5

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object p3

    sget-object v5, Lq2/a;->D:Lq2/a$a;

    invoke-interface {p3, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p3

    check-cast p3, Lq2/a;

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lq2/a;->a()Lq2/i;

    move-result-object p3

    if-ne p3, p0, :cond_4

    iget-object p3, p0, Lq2/i;->a:Lq2/f;

    iput-object p0, v0, Lq2/i$h;->F:Ljava/lang/Object;

    iput-object p1, v0, Lq2/i$h;->G:Ljava/lang/Object;

    iput-object p2, v0, Lq2/i$h;->H:Ljava/lang/Object;

    iput-object p3, v0, Lq2/i$h;->I:Ljava/lang/Object;

    iput v3, v0, Lq2/i$h;->L:I

    invoke-interface {p3, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_0
    new-instance v1, Lq2/i$a;

    iget-object v2, v0, Lq2/i;->a:Lq2/f;

    invoke-virtual {v2, p1}, Lq2/f;->e(Ljava/lang/String;)Ly2/e;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lq2/i$a;-><init>(Lq2/i;Ly2/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v1}, Ly2/e;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p3, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-interface {v1}, Ly2/e;->close()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    invoke-interface {p3, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_4
    const-string p1, "Attempted to use connection on a different coroutine"

    invoke-static {v2, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_5
    const-string p1, "Connection is recycled"

    invoke-static {v2, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public c(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {p0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    invoke-interface {p3}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v2, Lq2/a;->D:Lq2/a$a;

    invoke-interface {v0, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, Lq2/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq2/a;->a()Lq2/i;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lq2/i;->o(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use connection on a different coroutine"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Connection is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public d()Ly2/b;
    .locals 1

    iget-object v0, p0, Lq2/i;->a:Lq2/f;

    return-object v0
.end method

.method public final k()Lq2/f;
    .locals 1

    iget-object v0, p0, Lq2/i;->a:Lq2/f;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lq2/i;->b:Z

    return v0
.end method

.method public final n()V
    .locals 3

    .prologue
    iget-object v0, p0, Lq2/i;->a:Lq2/f;

    invoke-virtual {v0}, Lq2/f;->h()Lq2/f;

    iget-object v0, p0, Lq2/i;->d:LV8/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LV8/a;->a(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lq2/i;->a:Lq2/f;

    const-string v1, "ROLLBACK TRANSACTION"

    invoke-static {v0, v1}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
