.class final LK6/a$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/a$a;->d()Lio/ktor/utils/io/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field private synthetic J:Ljava/lang/Object;

.field final synthetic K:LK6/a;

.field final synthetic L:LK6/a$a;


# direct methods
.method constructor <init>(LK6/a;LK6/a$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK6/a$a$a;->K:LK6/a;

    iput-object p2, p0, LK6/a$a$a;->L:LK6/a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LK6/a$a$a;->I:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LK6/a$a$a;->H:Ljava/lang/Object;

    check-cast v1, Lo9/q;

    iget-object v7, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lo9/p;

    iget-object v8, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lio/ktor/utils/io/t;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LK6/a$a$a;->H:Ljava/lang/Object;

    check-cast v1, Lo9/q;

    iget-object v7, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lo9/p;

    iget-object v8, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    check-cast v8, Lio/ktor/utils/io/t;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_3

    :cond_2
    iget-object v1, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lo9/p;

    iget-object v1, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/t;

    :try_start_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    move-object v8, v1

    goto :goto_2

    :cond_4
    iget-object v1, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lo9/p;

    iget-object v1, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/t;

    :try_start_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_5
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/t;

    invoke-static {}, Ld7/c;->a()Lo9/p;

    move-result-object v1

    move-object v7, v1

    move-object v1, p1

    :goto_0
    :try_start_4
    iget-object p1, p0, LK6/a$a$a;->K:LK6/a;

    invoke-static {p1}, LK6/a;->a(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object p1

    invoke-interface {p1}, Lio/ktor/utils/io/d;->h()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, LK6/a$a$a;->K:LK6/a;

    invoke-static {p1}, LK6/a;->a(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object p1

    invoke-static {p1}, Lio/ktor/utils/io/f;->c(Lio/ktor/utils/io/d;)I

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LK6/a$a$a;->K:LK6/a;

    invoke-static {p1}, LK6/a;->a(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object p1

    iput-object v1, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    iput-object v7, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    iput-object v5, p0, LK6/a$a$a;->H:Ljava/lang/Object;

    iput v6, p0, LK6/a$a$a;->I:I

    const/4 v8, 0x0

    invoke-static {p1, v8, p0, v6, v5}, Lio/ktor/utils/io/d$b;->a(Lio/ktor/utils/io/d;ILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    iget-object p1, p0, LK6/a$a$a;->K:LK6/a;

    invoke-static {p1}, LK6/a;->a(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object p1

    iget-object v8, p0, LK6/a$a$a;->K:LK6/a;

    invoke-static {v8}, LK6/a;->a(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object v8

    invoke-static {v8}, Lio/ktor/utils/io/f;->c(Lio/ktor/utils/io/d;)I

    move-result v8

    iput-object v1, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    iput-object v7, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    iput-object v5, p0, LK6/a$a$a;->H:Ljava/lang/Object;

    iput v4, p0, LK6/a$a$a;->I:I

    invoke-static {p1, v8, p0}, Lio/ktor/utils/io/f;->e(Lio/ktor/utils/io/d;ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :goto_2
    move-object v1, p1

    check-cast v1, Lo9/q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v8}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object p1

    invoke-interface {p1}, Lio/ktor/utils/io/g;->b()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {v8}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object p1

    invoke-interface {v1}, Lo9/q;->g1()Lo9/q;

    move-result-object v9

    iput-object v8, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    iput-object v7, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    iput-object v1, p0, LK6/a$a$a;->H:Ljava/lang/Object;

    iput v3, p0, LK6/a$a$a;->I:I

    invoke-static {p1, v9, p0}, Lio/ktor/utils/io/k;->j(Lio/ktor/utils/io/g;Lo9/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_3
    invoke-virtual {v8}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object p1

    iput-object v8, p0, LK6/a$a$a;->J:Ljava/lang/Object;

    iput-object v7, p0, LK6/a$a$a;->G:Ljava/lang/Object;

    iput-object v1, p0, LK6/a$a$a;->H:Ljava/lang/Object;

    iput v2, p0, LK6/a$a$a;->I:I

    invoke-interface {p1, p0}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-ne p1, v0, :cond_8

    return-object v0

    :catch_0
    :cond_8
    :goto_4
    :try_start_6
    invoke-static {v7, v1}, Ld7/c;->f(Lo9/p;Lo9/q;)V

    move-object v1, v8

    goto/16 :goto_0

    :cond_9
    iget-object p1, p0, LK6/a$a$a;->K:LK6/a;

    invoke-static {p1}, LK6/a;->a(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object p1

    invoke-interface {p1}, Lio/ktor/utils/io/d;->a()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_a

    iget-object p1, p0, LK6/a$a$a;->L:LK6/a$a;

    invoke-virtual {p1}, LK6/a$a;->b()LW8/v;

    move-result-object p1

    invoke-static {v7}, Ld7/c;->b(Lo9/p;)Lo9/q;

    move-result-object v0

    invoke-static {v0}, Lo9/r;->a(Lo9/q;)[B

    move-result-object v0

    invoke-interface {p1, v0}, LW8/v;->R0(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_a
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_5
    invoke-interface {v7}, Lo9/g;->close()V

    iget-object v0, p0, LK6/a$a$a;->L:LK6/a$a;

    invoke-virtual {v0}, LK6/a$a;->b()LW8/v;

    move-result-object v0

    invoke-interface {v0, p1}, LW8/v;->g(Ljava/lang/Throwable;)Z

    throw p1
.end method

.method public final H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK6/a$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK6/a$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK6/a$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/ktor/utils/io/t;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK6/a$a$a;->H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LK6/a$a$a;

    iget-object v1, p0, LK6/a$a$a;->K:LK6/a;

    iget-object v2, p0, LK6/a$a$a;->L:LK6/a$a;

    invoke-direct {v0, v1, v2, p2}, LK6/a$a$a;-><init>(LK6/a;LK6/a$a;Lm7/e;)V

    iput-object p1, v0, LK6/a$a$a;->J:Ljava/lang/Object;

    return-object v0
.end method
