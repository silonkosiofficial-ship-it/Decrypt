.class final LN/s$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/s;->i(Landroidx/compose/ui/d;LN/h;LH/F;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LN/h;

.field final synthetic J:LH/F;


# direct methods
.method constructor <init>(LN/h;LH/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LN/s$e;->I:LN/h;

    iput-object p2, p0, LN/s$e;->J:LH/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/s$e;->G:I

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

    iget-object p1, p0, LN/s$e;->H:Ljava/lang/Object;

    check-cast p1, Lz0/K;

    new-instance v1, LN/d;

    invoke-interface {p1}, Lz0/K;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v3

    invoke-direct {v1, v3}, LN/d;-><init>(Landroidx/compose/ui/platform/A1;)V

    new-instance v3, LN/s$e$a;

    iget-object v4, p0, LN/s$e;->I:LN/h;

    iget-object v5, p0, LN/s$e;->J:LH/F;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v1, v5, v6}, LN/s$e$a;-><init>(LN/h;LN/d;LH/F;Lm7/e;)V

    iput v2, p0, LN/s$e;->G:I

    invoke-static {p1, v3, p0}, Lx/q;->c(Lz0/K;Lx7/p;Lm7/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LN/s$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LN/s$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LN/s$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/K;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LN/s$e;->H(Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LN/s$e;

    iget-object v1, p0, LN/s$e;->I:LN/h;

    iget-object v2, p0, LN/s$e;->J:LH/F;

    invoke-direct {v0, v1, v2, p2}, LN/s$e;-><init>(LN/h;LH/F;Lm7/e;)V

    iput-object p1, v0, LN/s$e;->H:Ljava/lang/Object;

    return-object v0
.end method
