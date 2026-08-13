.class final LM1/j$b;
.super LM1/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/util/List;

.field final synthetic d:LM1/j;


# direct methods
.method public constructor <init>(LM1/j;Ljava/util/List;)V
    .locals 1

    const-string v0, "initTasksList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LM1/j$b;->d:LM1/j;

    invoke-direct {p0}, LM1/s;-><init>()V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LM1/j$b;->c:Ljava/util/List;

    return-void
.end method

.method public static final synthetic d(LM1/j$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LM1/j$b;->c:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic e(LM1/j$b;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LM1/j$b;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected b(Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p1, LM1/j$b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LM1/j$b$a;

    iget v1, v0, LM1/j$b$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$b$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$b$a;

    invoke-direct {v0, p0, p1}, LM1/j$b$a;-><init>(LM1/j$b;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LM1/j$b$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$b$a;->I:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    iget-object v0, v0, LM1/j$b$a;->F:Ljava/lang/Object;

    check-cast v0, LM1/j$b;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$b;->c:Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p1, p0, LM1/j$b;->d:LM1/j;

    invoke-static {p1}, LM1/j;->b(LM1/j;)LM1/n;

    move-result-object p1

    new-instance v2, LM1/j$b$b;

    iget-object v4, p0, LM1/j$b;->d:LM1/j;

    const/4 v5, 0x0

    invoke-direct {v2, v4, p0, v5}, LM1/j$b$b;-><init>(LM1/j;LM1/j$b;Lm7/e;)V

    iput-object p0, v0, LM1/j$b$a;->F:Ljava/lang/Object;

    iput v3, v0, LM1/j$b$a;->I:I

    invoke-interface {p1, v2, v0}, LM1/n;->d(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, p0

    :goto_1
    check-cast p1, LM1/e;

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p1, p0, LM1/j$b;->d:LM1/j;

    iput-object p0, v0, LM1/j$b$a;->F:Ljava/lang/Object;

    iput v4, v0, LM1/j$b$a;->I:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0}, LM1/j;->n(LM1/j;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :goto_3
    iget-object v0, v0, LM1/j$b;->d:LM1/j;

    invoke-static {v0}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object v0

    invoke-virtual {v0, p1}, LM1/k;->c(LM1/v;)LM1/v;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
