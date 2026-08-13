.class final LI6/h$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/h;->d(LC6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/h$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/h$a;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    iget-object v1, p0, LI6/h$a;->I:Ljava/lang/Object;

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO6/d;

    invoke-virtual {v3}, LO6/d;->a()LT6/q;

    move-result-object v3

    sget-object v4, LT6/v;->a:LT6/v;

    invoke-virtual {v4}, LT6/v;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, LW6/B;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO6/d;

    invoke-virtual {v3}, LO6/d;->a()LT6/q;

    move-result-object v3

    invoke-virtual {v4}, LT6/v;->c()Ljava/lang/String;

    move-result-object v5

    const-string v6, "*/*"

    invoke-virtual {v3, v5, v6}, LW6/B;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT6/y;

    invoke-static {v3}, LT6/z;->d(LT6/y;)LT6/h;

    move-result-object v3

    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_4

    new-instance v5, LU6/f;

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    if-nez v3, :cond_3

    sget-object v3, LT6/h$d;->a:LT6/h$d;

    invoke-virtual {v3}, LT6/h$d;->b()LT6/h;

    move-result-object v3

    :cond_3
    move-object v8, v3

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, v5

    invoke-direct/range {v6 .. v11}, LU6/f;-><init>(Ljava/lang/String;LT6/h;LT6/C;ILy7/k;)V

    goto :goto_0

    :cond_4
    instance-of v5, v1, [B

    if-eqz v5, :cond_5

    new-instance v5, LI6/h$a$a;

    invoke-direct {v5, v3, v1}, LI6/h$a$a;-><init>(LT6/h;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    instance-of v5, v1, Lio/ktor/utils/io/d;

    if-eqz v5, :cond_6

    new-instance v5, LI6/h$a$b;

    invoke-direct {v5, p1, v3, v1}, LI6/h$a$b;-><init>(La7/e;LT6/h;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    instance-of v5, v1, LU6/b;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, LU6/b;

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO6/d;

    invoke-static {v3, v5, v1}, LI6/j;->a(LT6/h;LO6/d;Ljava/lang/Object;)LU6/b;

    move-result-object v5

    :goto_0
    const/4 v3, 0x0

    if-eqz v5, :cond_8

    invoke-virtual {v5}, LU6/b;->b()LT6/h;

    move-result-object v6

    goto :goto_1

    :cond_8
    move-object v6, v3

    :goto_1
    if-eqz v6, :cond_9

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LO6/d;

    invoke-virtual {v6}, LO6/d;->a()LT6/q;

    move-result-object v6

    invoke-virtual {v4}, LT6/v;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, LW6/B;->m(Ljava/lang/String;)V

    invoke-static {}, LI6/h;->b()Lfa/d;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Transformed with default transformers request body for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LO6/d;

    invoke-virtual {v7}, LO6/d;->j()LT6/M;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " from "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Lfa/d;->g(Ljava/lang/String;)V

    iput-object v3, p0, LI6/h$a;->H:Ljava/lang/Object;

    iput v2, p0, LI6/h$a;->G:I

    invoke-virtual {p1, v5, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LI6/h$a;

    invoke-direct {v0, p3}, LI6/h$a;-><init>(Lm7/e;)V

    iput-object p1, v0, LI6/h$a;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/h$a;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/h$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/h$a;->H(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
