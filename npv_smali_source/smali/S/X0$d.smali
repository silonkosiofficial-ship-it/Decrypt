.class final LS/X0$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0;->b(LS/Y0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS/U0;

.field final synthetic I:Landroidx/compose/ui/platform/i;


# direct methods
.method constructor <init>(LS/U0;Landroidx/compose/ui/platform/i;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/X0$d;->H:LS/U0;

    iput-object p2, p0, LS/X0$d;->I:Landroidx/compose/ui/platform/i;

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

    iget v1, p0, LS/X0$d;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS/X0$d;->H:LS/U0;

    if-eqz p1, :cond_4

    invoke-interface {p1}, LS/U0;->b()LS/b1;

    move-result-object p1

    invoke-interface {p1}, LS/b1;->c()LS/W0;

    move-result-object p1

    iget-object v1, p0, LS/X0$d;->H:LS/U0;

    invoke-interface {v1}, LS/U0;->b()LS/b1;

    move-result-object v1

    invoke-interface {v1}, LS/b1;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, LS/X0$d;->I:Landroidx/compose/ui/platform/i;

    invoke-static {p1, v1, v3}, LS/X0;->h(LS/W0;ZLandroidx/compose/ui/platform/i;)J

    move-result-wide v3

    iput v2, p0, LS/X0$d;->G:I

    invoke-static {v3, v4, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, p0, LS/X0$d;->H:LS/U0;

    invoke-interface {p1}, LS/U0;->dismiss()V

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS/X0$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/X0$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/X0$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/X0$d;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LS/X0$d;

    iget-object v0, p0, LS/X0$d;->H:LS/U0;

    iget-object v1, p0, LS/X0$d;->I:Landroidx/compose/ui/platform/i;

    invoke-direct {p1, v0, v1, p2}, LS/X0$d;-><init>(LS/U0;Landroidx/compose/ui/platform/i;Lm7/e;)V

    return-object p1
.end method
