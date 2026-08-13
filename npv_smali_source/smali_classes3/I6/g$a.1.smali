.class final LI6/g$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/g;->d(LC6/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field synthetic J:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/g$a;->I:I

    const/16 v2, 0x12c

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, LI6/g$a;->H:I

    iget-object v1, p0, LI6/g$a;->G:Ljava/lang/Object;

    check-cast v1, LQ6/c;

    iget-object v3, p0, LI6/g$a;->J:Ljava/lang/Object;

    check-cast v3, LQ6/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, LI6/g$a;->H:I

    iget-object v5, p0, LI6/g$a;->J:Ljava/lang/Object;

    check-cast v5, LQ6/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/g$a;->J:Ljava/lang/Object;

    check-cast p1, LQ6/c;

    invoke-virtual {p1}, LQ6/c;->H0()LD6/b;

    move-result-object v1

    invoke-virtual {v1}, LD6/b;->x0()LW6/b;

    move-result-object v1

    invoke-static {}, LI6/p;->j()LW6/a;

    move-result-object v5

    invoke-interface {v1, v5}, LW6/b;->b(LW6/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, LI6/g;->b()Lfa/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Skipping default response validation for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LQ6/c;->H0()LD6/b;

    move-result-object p1

    invoke-virtual {p1}, LD6/b;->d()LO6/b;

    move-result-object p1

    invoke-interface {p1}, LO6/b;->r()LT6/g0;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfa/d;->g(Ljava/lang/String;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_3
    invoke-virtual {p1}, LQ6/c;->e()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    invoke-virtual {p1}, LQ6/c;->H0()LD6/b;

    move-result-object v5

    if-lt v1, v2, :cond_c

    invoke-virtual {v5}, LD6/b;->x0()LW6/b;

    move-result-object v6

    invoke-static {}, LI6/g;->c()LW6/a;

    move-result-object v7

    invoke-interface {v6, v7}, LW6/b;->e(LW6/a;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    iput-object p1, p0, LI6/g$a;->J:Ljava/lang/Object;

    iput v1, p0, LI6/g$a;->H:I

    iput v4, p0, LI6/g$a;->I:I

    invoke-static {v5, p0}, LD6/d;->a(LD6/b;Lm7/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_5

    return-object v0

    :cond_5
    move-object v9, v5

    move-object v5, p1

    move-object p1, v9

    :goto_0
    check-cast p1, LD6/b;

    invoke-virtual {p1}, LD6/b;->x0()LW6/b;

    move-result-object v6

    invoke-static {}, LI6/g;->c()LW6/a;

    move-result-object v7

    sget-object v8, Li7/M;->a:Li7/M;

    invoke-interface {v6, v7, v8}, LW6/b;->f(LW6/a;Ljava/lang/Object;)V

    invoke-virtual {p1}, LD6/b;->e()LQ6/c;

    move-result-object p1

    iput-object v5, p0, LI6/g$a;->J:Ljava/lang/Object;

    iput-object p1, p0, LI6/g$a;->G:Ljava/lang/Object;

    iput v1, p0, LI6/g$a;->H:I

    iput v3, p0, LI6/g$a;->I:I

    const/4 v3, 0x0

    invoke-static {p1, v3, p0, v4, v3}, LQ6/e;->b(LQ6/c;Ljava/nio/charset/Charset;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_6

    return-object v0

    :cond_6
    move v0, v1

    move-object v1, p1

    move-object p1, v3

    move-object v3, v5

    :goto_1
    check-cast p1, Ljava/lang/String;

    const/16 v4, 0x190

    if-gt v2, v0, :cond_8

    if-lt v0, v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, LI6/L;

    invoke-direct {v0, v1, p1}, LI6/L;-><init>(LQ6/c;Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    :goto_2
    const/16 v2, 0x1f4

    if-gt v4, v0, :cond_a

    if-lt v0, v2, :cond_9

    goto :goto_3

    :cond_9
    new-instance v0, LI6/e;

    invoke-direct {v0, v1, p1}, LI6/e;-><init>(LQ6/c;Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    :goto_3
    if-gt v2, v0, :cond_b

    const/16 v2, 0x258

    if-ge v0, v2, :cond_b

    new-instance v0, LI6/T;

    invoke-direct {v0, v1, p1}, LI6/T;-><init>(LQ6/c;Ljava/lang/String;)V

    goto :goto_4

    :cond_b
    new-instance v0, LI6/O;

    invoke-direct {v0, v1, p1}, LI6/O;-><init>(LQ6/c;Ljava/lang/String;)V

    :goto_4
    invoke-static {}, LI6/g;->b()Lfa/d;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Default response validation for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LQ6/c;->H0()LD6/b;

    move-result-object v2

    invoke-virtual {v2}, LD6/b;->d()LO6/b;

    move-result-object v2

    invoke-interface {v2}, LO6/b;->r()LT6/g0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " failed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lfa/d;->g(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_5
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI6/g$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LI6/g$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LI6/g$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ6/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LI6/g$a;->H(LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance v0, LI6/g$a;

    invoke-direct {v0, p2}, LI6/g$a;-><init>(Lm7/e;)V

    iput-object p1, v0, LI6/g$a;->J:Ljava/lang/Object;

    return-object v0
.end method
