.class final LM1/j$n;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;->w(ZLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:Ly7/O;

.field final synthetic J:LM1/j;

.field final synthetic K:Ly7/M;


# direct methods
.method constructor <init>(Ly7/O;LM1/j;Ly7/M;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$n;->I:Ly7/O;

    iput-object p2, p0, LM1/j$n;->J:LM1/j;

    iput-object p3, p0, LM1/j$n;->K:Ly7/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$n;->H:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LM1/j$n;->G:Ljava/lang/Object;

    check-cast v0, Ly7/M;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LM1/j$n;->G:Ljava/lang/Object;

    check-cast v1, Ly7/M;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch LM1/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    iget-object v1, p0, LM1/j$n;->G:Ljava/lang/Object;

    check-cast v1, Ly7/O;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch LM1/c; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object v1, p0, LM1/j$n;->I:Ly7/O;

    iget-object p1, p0, LM1/j$n;->J:LM1/j;

    iput-object v1, p0, LM1/j$n;->G:Ljava/lang/Object;

    iput v4, p0, LM1/j$n;->H:I

    invoke-static {p1, p0}, LM1/j;->m(LM1/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    iput-object p1, v1, Ly7/O;->C:Ljava/lang/Object;

    iget-object v1, p0, LM1/j$n;->K:Ly7/M;

    iget-object p1, p0, LM1/j$n;->J:LM1/j;

    invoke-static {p1}, LM1/j;->b(LM1/j;)LM1/n;

    move-result-object p1

    iput-object v1, p0, LM1/j$n;->G:Ljava/lang/Object;

    iput v3, p0, LM1/j$n;->H:I

    invoke-interface {p1, p0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v1, Ly7/M;->C:I
    :try_end_2
    .catch LM1/c; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    iget-object p1, p0, LM1/j$n;->K:Ly7/M;

    iget-object v1, p0, LM1/j$n;->J:LM1/j;

    iget-object v3, p0, LM1/j$n;->I:Ly7/O;

    iget-object v3, v3, Ly7/O;->C:Ljava/lang/Object;

    iput-object p1, p0, LM1/j$n;->G:Ljava/lang/Object;

    iput v2, p0, LM1/j$n;->H:I

    invoke-virtual {v1, v3, v4, p0}, LM1/j;->z(Ljava/lang/Object;ZLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, Ly7/M;->C:I

    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LM1/j$n;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$n;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, LM1/j$n;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, LM1/j$n;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LM1/j$n;

    iget-object v1, p0, LM1/j$n;->I:Ly7/O;

    iget-object v2, p0, LM1/j$n;->J:LM1/j;

    iget-object v3, p0, LM1/j$n;->K:Ly7/M;

    invoke-direct {v0, v1, v2, v3, p1}, LM1/j$n;-><init>(Ly7/O;LM1/j;Ly7/M;Lm7/e;)V

    return-object v0
.end method
