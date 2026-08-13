.class final LG6/o$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/o;-><init>(LH9/x;LH9/F$a;LH9/z;Lm7/i;)V
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

.field final synthetic K:LG6/o;

.field final synthetic L:LH9/z;


# direct methods
.method constructor <init>(LG6/o;LH9/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LG6/o$a;->K:LG6/o;

    iput-object p2, p0, LG6/o$a;->L:LH9/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG6/o$a;->I:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LG6/o$a;->H:Ljava/lang/Object;

    check-cast v1, LY8/l;

    iget-object v3, p0, LG6/o$a;->G:Ljava/lang/Object;

    check-cast v3, Lg7/a;

    iget-object v4, p0, LG6/o$a;->J:Ljava/lang/Object;

    check-cast v4, LH9/F;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LG6/o$a;->H:Ljava/lang/Object;

    check-cast v1, LH9/z;

    iget-object v3, p0, LG6/o$a;->G:Ljava/lang/Object;

    check-cast v3, LH9/F$a;

    iget-object v4, p0, LG6/o$a;->J:Ljava/lang/Object;

    check-cast v4, LY8/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG6/o$a;->J:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LY8/c;

    iget-object p1, p0, LG6/o$a;->K:LG6/o;

    invoke-static {p1}, LG6/o;->h(LG6/o;)LH9/F$a;

    move-result-object p1

    iget-object v1, p0, LG6/o$a;->L:LH9/z;

    iget-object v5, p0, LG6/o$a;->K:LG6/o;

    invoke-static {v5}, LG6/o;->g(LG6/o;)LW8/v;

    move-result-object v5

    iput-object v4, p0, LG6/o$a;->J:Ljava/lang/Object;

    iput-object p1, p0, LG6/o$a;->G:Ljava/lang/Object;

    iput-object v1, p0, LG6/o$a;->H:Ljava/lang/Object;

    iput v3, p0, LG6/o$a;->I:I

    invoke-interface {v5, p0}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v8, v3

    move-object v3, p1

    move-object p1, v8

    :goto_0
    check-cast p1, LH9/G;

    invoke-interface {v3, v1, p1}, LH9/F$a;->a(LH9/z;LH9/G;)LH9/F;

    move-result-object p1

    invoke-static {}, LG6/p;->a()Lg7/a;

    move-result-object v3

    :try_start_1
    invoke-interface {v4}, LY8/c;->s0()LY8/j;

    move-result-object v1

    invoke-interface {v1}, LY8/B;->iterator()LY8/l;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object v4, p1

    :goto_1
    :try_start_2
    iput-object v4, p0, LG6/o$a;->J:Ljava/lang/Object;

    iput-object v3, p0, LG6/o$a;->G:Ljava/lang/Object;

    iput-object v1, p0, LG6/o$a;->H:Ljava/lang/Object;

    iput v2, p0, LG6/o$a;->I:I

    invoke-interface {v1, p0}, LY8/l;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {v1}, LY8/l;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg7/b;

    instance-of v5, p1, Lg7/b$a;

    if-eqz v5, :cond_5

    sget-object v5, LX9/g;->F:LX9/g$a;

    invoke-virtual {p1}, Lg7/b;->a()[B

    move-result-object v6

    invoke-virtual {p1}, Lg7/b;->a()[B

    move-result-object p1

    array-length p1, p1

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7, p1}, LX9/g$a;->d([BII)LX9/g;

    move-result-object p1

    invoke-interface {v4, p1}, LH9/F;->c(LX9/g;)Z

    goto :goto_1

    :cond_5
    instance-of v5, p1, Lg7/b$d;

    if-eqz v5, :cond_6

    new-instance v5, Ljava/lang/String;

    invoke-virtual {p1}, Lg7/b;->a()[B

    move-result-object p1

    sget-object v6, LS8/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v5, p1, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-interface {v4, v5}, LH9/F;->b(Ljava/lang/String;)Z

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lg7/b$b;

    if-eqz v0, :cond_8

    check-cast p1, Lg7/b$b;

    invoke-static {p1}, Lg7/c;->a(Lg7/b$b;)Lg7/a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, LG6/p;->b(Lg7/a;)Z

    move-result v0

    if-nez v0, :cond_7

    move-object v3, p1

    :cond_7
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v3}, Lg7/a;->a()S

    move-result v0

    invoke-virtual {v3}, Lg7/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, LH9/F;->f(ILjava/lang/String;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-object p1

    :catchall_1
    move-exception p1

    invoke-interface {v4}, LH9/F;->cancel()V

    throw p1

    :cond_8
    :try_start_4
    new-instance v0, LG6/t;

    invoke-direct {v0, p1}, LG6/t;-><init>(Lg7/b;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_9
    :try_start_5
    invoke-virtual {v3}, Lg7/a;->a()S

    move-result p1

    invoke-virtual {v3}, Lg7/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, p1, v0}, LH9/F;->f(ILjava/lang/String;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_2
    move-exception p1

    invoke-interface {v4}, LH9/F;->cancel()V

    throw p1

    :catchall_3
    move-exception v0

    move-object v4, p1

    move-object p1, v0

    :goto_3
    :try_start_6
    invoke-virtual {v3}, Lg7/a;->a()S

    move-result v0

    invoke-virtual {v3}, Lg7/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, LH9/F;->f(ILjava/lang/String;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw p1

    :catchall_4
    move-exception p1

    invoke-interface {v4}, LH9/F;->cancel()V

    throw p1
.end method

.method public final H(LY8/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LG6/o$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LG6/o$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LG6/o$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY8/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LG6/o$a;->H(LY8/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LG6/o$a;

    iget-object v1, p0, LG6/o$a;->K:LG6/o;

    iget-object v2, p0, LG6/o$a;->L:LH9/z;

    invoke-direct {v0, v1, v2, p2}, LG6/o$a;-><init>(LG6/o;LH9/z;Lm7/e;)V

    iput-object p1, v0, LG6/o$a;->J:Ljava/lang/Object;

    return-object v0
.end method
