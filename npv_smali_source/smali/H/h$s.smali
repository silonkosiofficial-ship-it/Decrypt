.class final LH/h$s;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->e(LN/F;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LH/F;

.field final synthetic J:LN/F;


# direct methods
.method constructor <init>(LH/F;LN/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/h$s;->I:LH/F;

    iput-object p2, p0, LH/h$s;->J:LN/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LH/h$s;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LH/h$s;->H:Ljava/lang/Object;

    check-cast p1, Lz0/K;

    new-instance v1, LH/h$s$a;

    iget-object v3, p0, LH/h$s;->I:LH/F;

    iget-object v4, p0, LH/h$s;->J:LN/F;

    const/4 v5, 0x0

    invoke-direct {v1, p1, v3, v4, v5}, LH/h$s$a;-><init>(Lz0/K;LH/F;LN/F;Lm7/e;)V

    iput v2, p0, LH/h$s;->G:I

    invoke-static {v1, p0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LH/h$s;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/h$s;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/h$s;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/K;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/h$s;->H(Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LH/h$s;

    iget-object v1, p0, LH/h$s;->I:LH/F;

    iget-object v2, p0, LH/h$s;->J:LN/F;

    invoke-direct {v0, v1, v2, p2}, LH/h$s;-><init>(LH/F;LN/F;Lm7/e;)V

    iput-object p1, v0, LH/h$s;->H:Ljava/lang/Object;

    return-object v0
.end method
