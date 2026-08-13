.class final Landroidx/compose/foundation/gestures/f$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;->i2(Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/p;

.field final synthetic J:Lx/C;


# direct methods
.method constructor <init>(Lx7/p;Lx/C;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$b;->I:Lx7/p;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/f$b;->J:Lx/C;

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

    iget v1, p0, Landroidx/compose/foundation/gestures/f$b;->G:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/f$b;->H:Ljava/lang/Object;

    check-cast p1, Lx/r;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$b;->I:Lx7/p;

    new-instance v3, Landroidx/compose/foundation/gestures/f$b$a;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/f$b;->J:Lx/C;

    invoke-direct {v3, p1, v4}, Landroidx/compose/foundation/gestures/f$b$a;-><init>(Lx/r;Lx/C;)V

    iput v2, p0, Landroidx/compose/foundation/gestures/f$b;->G:I

    invoke-interface {v1, v3, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/r;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/f$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/f$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/r;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$b;->H(Lx/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/gestures/f$b;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$b;->I:Lx7/p;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/f$b;->J:Lx/C;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/f$b;-><init>(Lx7/p;Lx/C;Lm7/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/f$b;->H:Ljava/lang/Object;

    return-object v0
.end method
