.class public final Lh2/y$h$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lh2/T;

.field final synthetic L:Lh2/w;


# direct methods
.method public constructor <init>(Lh2/T;Lm7/e;Lh2/w;)V
    .locals 0

    iput-object p3, p0, Lh2/y$h$b$a;->L:Lh2/w;

    iput-object p1, p0, Lh2/y$h$b$a;->K:Lh2/T;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/y$h$b$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/y$h$b$a;->H:Ljava/lang/Object;

    iget-object v1, p0, Lh2/y$h$b$a;->I:Ljava/lang/Object;

    iget-object v3, p0, Lh2/y$h$b$a;->J:Ljava/lang/Object;

    check-cast v3, Lh2/f;

    iget-object v4, p0, Lh2/y$h$b$a;->K:Lh2/T;

    check-cast v1, Lh2/x;

    move-object v11, p1

    check-cast v11, Lh2/s;

    sget-object p1, Lh2/f;->D:Lh2/f;

    if-eq v3, p1, :cond_5

    instance-of p1, v1, Lh2/x$b;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh2/y$h$b$a;->L:Lh2/w;

    move-object v5, v1

    check-cast v5, Lh2/x$b;

    invoke-virtual {v5}, Lh2/x$b;->k()Lh2/s;

    move-result-object v1

    invoke-virtual {p1, v1}, Lh2/w;->b(Lh2/s;)V

    invoke-virtual {v5}, Lh2/x$b;->k()Lh2/s;

    move-result-object v10

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v13}, Lh2/x$b;->e(Lh2/x$b;Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;ILjava/lang/Object;)Lh2/x$b;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of p1, v1, Lh2/x$a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lh2/y$h$b$a;->L:Lh2/w;

    move-object v3, v1

    check-cast v3, Lh2/x$a;

    invoke-virtual {v3}, Lh2/x$a;->c()Lh2/t;

    move-result-object v3

    sget-object v5, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v5}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v5

    invoke-virtual {p1, v3, v5}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    goto :goto_0

    :cond_3
    instance-of p1, v1, Lh2/x$c;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lh2/y$h$b$a;->L:Lh2/w;

    check-cast v1, Lh2/x$c;

    invoke-virtual {v1}, Lh2/x$c;->d()Lh2/s;

    move-result-object v3

    invoke-virtual {p1, v3}, Lh2/w;->b(Lh2/s;)V

    new-instance p1, Lh2/x$c;

    invoke-virtual {v1}, Lh2/x$c;->d()Lh2/s;

    move-result-object v1

    invoke-direct {p1, v1, v11}, Lh2/x$c;-><init>(Lh2/s;Lh2/s;)V

    move-object v1, p1

    goto :goto_0

    :cond_4
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_5
    new-instance v1, Lh2/x$c;

    iget-object p1, p0, Lh2/y$h$b$a;->L:Lh2/w;

    invoke-virtual {p1}, Lh2/w;->d()Lh2/s;

    move-result-object p1

    invoke-direct {v1, p1, v11}, Lh2/x$c;-><init>(Lh2/s;Lh2/s;)V

    :goto_0
    iput v2, p0, Lh2/y$h$b$a;->G:I

    invoke-interface {v4, v1, p0}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Ljava/lang/Object;Ljava/lang/Object;Lh2/f;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lh2/y$h$b$a;

    iget-object v1, p0, Lh2/y$h$b$a;->K:Lh2/T;

    iget-object v2, p0, Lh2/y$h$b$a;->L:Lh2/w;

    invoke-direct {v0, v1, p4, v2}, Lh2/y$h$b$a;-><init>(Lh2/T;Lm7/e;Lh2/w;)V

    iput-object p1, v0, Lh2/y$h$b$a;->H:Ljava/lang/Object;

    iput-object p2, v0, Lh2/y$h$b$a;->I:Ljava/lang/Object;

    iput-object p3, v0, Lh2/y$h$b$a;->J:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/y$h$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lh2/f;

    check-cast p4, Lm7/e;

    invoke-virtual {p0, p1, p2, p3, p4}, Lh2/y$h$b$a;->H(Ljava/lang/Object;Ljava/lang/Object;Lh2/f;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
