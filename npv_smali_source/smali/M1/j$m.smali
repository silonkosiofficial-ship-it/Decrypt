.class final LM1/j$m;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


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

.field synthetic I:Z

.field final synthetic J:LM1/j;

.field final synthetic K:I


# direct methods
.method constructor <init>(LM1/j;ILm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$m;->J:LM1/j;

    iput p2, p0, LM1/j$m;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/j$m;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LM1/j$m;->G:Ljava/lang/Object;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, LM1/j$m;->I:Z

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-boolean v1, p0, LM1/j$m;->I:Z

    iget-object p1, p0, LM1/j$m;->J:LM1/j;

    iput-boolean v1, p0, LM1/j$m;->I:Z

    iput v3, p0, LM1/j$m;->H:I

    invoke-static {p1, p0}, LM1/j;->m(LM1/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    if-eqz v1, :cond_5

    iget-object v1, p0, LM1/j$m;->J:LM1/j;

    invoke-static {v1}, LM1/j;->b(LM1/j;)LM1/n;

    move-result-object v1

    iput-object p1, p0, LM1/j$m;->G:Ljava/lang/Object;

    iput v2, p0, LM1/j$m;->H:I

    invoke-interface {v1, p0}, LM1/n;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    move-object p1, v1

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_2

    :cond_5
    iget v0, p0, LM1/j$m;->K:I

    move v4, v0

    move-object v0, p1

    move p1, v4

    :goto_2
    new-instance v1, LM1/e;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    invoke-direct {v1, v0, v2, p1}, LM1/e;-><init>(Ljava/lang/Object;II)V

    return-object v1
.end method

.method public final H(ZLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LM1/j$m;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$m;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$m;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$m;->H(ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LM1/j$m;

    iget-object v1, p0, LM1/j$m;->J:LM1/j;

    iget v2, p0, LM1/j$m;->K:I

    invoke-direct {v0, v1, v2, p2}, LM1/j$m;-><init>(LM1/j;ILm7/e;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, LM1/j$m;->I:Z

    return-object v0
.end method
