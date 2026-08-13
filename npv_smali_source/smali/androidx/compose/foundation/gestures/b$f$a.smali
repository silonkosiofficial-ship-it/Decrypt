.class final Landroidx/compose/foundation/gestures/b$f$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$f;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Ly7/O;

.field final synthetic K:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Ly7/O;Landroidx/compose/foundation/gestures/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->J:Ly7/O;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$f$a;->K:Landroidx/compose/foundation/gestures/b;

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

    iget v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->G:Ljava/lang/Object;

    check-cast v1, Ly7/O;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$f$a;->I:Ljava/lang/Object;

    check-cast v3, Lx7/l;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->I:Ljava/lang/Object;

    check-cast p1, Lx7/l;

    move-object v3, p1

    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->J:Ly7/O;

    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$d;

    if-nez v1, :cond_6

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$a;

    if-nez v1, :cond_6

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$b;

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    goto :goto_1

    :cond_2
    move-object p1, v4

    :goto_1
    if-eqz p1, :cond_3

    invoke-interface {v3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->J:Ly7/O;

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->K:Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;

    move-result-object p1

    if-eqz p1, :cond_5

    iput-object v3, p0, Landroidx/compose/foundation/gestures/b$f$a;->I:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->G:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/foundation/gestures/b$f$a;->H:I

    invoke-interface {p1, p0}, LY8/B;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/gestures/a;

    :cond_5
    iput-object v4, v1, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_0

    :cond_6
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$f$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$f$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/l;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$f$a;->H(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/gestures/b$f$a;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->J:Ly7/O;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b$f$a;->K:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/b$f$a;-><init>(Ly7/O;Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$f$a;->I:Ljava/lang/Object;

    return-object v0
.end method
