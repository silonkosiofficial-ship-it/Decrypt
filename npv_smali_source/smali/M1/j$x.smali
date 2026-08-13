.class final LM1/j$x;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;->z(Ljava/lang/Object;ZLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Ly7/M;

.field final synthetic K:LM1/j;

.field final synthetic L:Ljava/lang/Object;

.field final synthetic M:Z


# direct methods
.method constructor <init>(Ly7/M;LM1/j;Ljava/lang/Object;ZLm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$x;->J:Ly7/M;

    iput-object p2, p0, LM1/j$x;->K:LM1/j;

    iput-object p3, p0, LM1/j$x;->L:Ljava/lang/Object;

    iput-boolean p4, p0, LM1/j$x;->M:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$x;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LM1/j$x;->G:Ljava/lang/Object;

    check-cast v1, Ly7/M;

    iget-object v3, p0, LM1/j$x;->I:Ljava/lang/Object;

    check-cast v3, LM1/B;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$x;->I:Ljava/lang/Object;

    check-cast p1, LM1/B;

    iget-object v1, p0, LM1/j$x;->J:Ly7/M;

    iget-object v4, p0, LM1/j$x;->K:LM1/j;

    invoke-static {v4}, LM1/j;->b(LM1/j;)LM1/n;

    move-result-object v4

    iput-object p1, p0, LM1/j$x;->I:Ljava/lang/Object;

    iput-object v1, p0, LM1/j$x;->G:Ljava/lang/Object;

    iput v3, p0, LM1/j$x;->H:I

    invoke-interface {v4, p0}, LM1/n;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v5, v3

    move-object v3, p1

    move-object p1, v5

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v1, Ly7/M;->C:I

    iget-object p1, p0, LM1/j$x;->L:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LM1/j$x;->I:Ljava/lang/Object;

    iput-object v1, p0, LM1/j$x;->G:Ljava/lang/Object;

    iput v2, p0, LM1/j$x;->H:I

    invoke-interface {v3, p1, p0}, LM1/B;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-boolean p1, p0, LM1/j$x;->M:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, LM1/j$x;->K:LM1/j;

    invoke-static {p1}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object p1

    new-instance v0, LM1/e;

    iget-object v1, p0, LM1/j$x;->L:Ljava/lang/Object;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    iget-object v3, p0, LM1/j$x;->J:Ly7/M;

    iget v3, v3, Ly7/M;->C:I

    invoke-direct {v0, v1, v2, v3}, LM1/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v0}, LM1/k;->c(LM1/v;)LM1/v;

    :cond_6
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LM1/B;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/j$x;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$x;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$x;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM1/B;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$x;->H(LM1/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, LM1/j$x;

    iget-object v1, p0, LM1/j$x;->J:Ly7/M;

    iget-object v2, p0, LM1/j$x;->K:LM1/j;

    iget-object v3, p0, LM1/j$x;->L:Ljava/lang/Object;

    iget-boolean v4, p0, LM1/j$x;->M:Z

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LM1/j$x;-><init>(Ly7/M;LM1/j;Ljava/lang/Object;ZLm7/e;)V

    iput-object p1, v6, LM1/j$x;->I:Ljava/lang/Object;

    return-object v6
.end method
