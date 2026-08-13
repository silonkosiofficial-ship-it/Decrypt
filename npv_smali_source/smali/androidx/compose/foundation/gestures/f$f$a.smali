.class final Landroidx/compose/foundation/gestures/f$f$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f$f;->a(FF)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Landroidx/compose/foundation/gestures/f;

.field final synthetic I:F

.field final synthetic J:F


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/f;FFLm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$f$a;->H:Landroidx/compose/foundation/gestures/f;

    iput p2, p0, Landroidx/compose/foundation/gestures/f$f$a;->I:F

    iput p3, p0, Landroidx/compose/foundation/gestures/f$f$a;->J:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/f$f$a;->G:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/f$f$a;->H:Landroidx/compose/foundation/gestures/f;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/f;->w2(Landroidx/compose/foundation/gestures/f;)Lx/C;

    move-result-object p1

    iget v1, p0, Landroidx/compose/foundation/gestures/f$f$a;->I:F

    iget v3, p0, Landroidx/compose/foundation/gestures/f$f$a;->J:F

    invoke-static {v1, v3}, Ln0/h;->a(FF)J

    move-result-wide v3

    iput v2, p0, Landroidx/compose/foundation/gestures/f$f$a;->G:I

    invoke-static {p1, v3, v4, p0}, Landroidx/compose/foundation/gestures/d;->d(Lx/C;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$f$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/f$f$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/f$f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$f$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, Landroidx/compose/foundation/gestures/f$f$a;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$f$a;->H:Landroidx/compose/foundation/gestures/f;

    iget v1, p0, Landroidx/compose/foundation/gestures/f$f$a;->I:F

    iget v2, p0, Landroidx/compose/foundation/gestures/f$f$a;->J:F

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/f$f$a;-><init>(Landroidx/compose/foundation/gestures/f;FFLm7/e;)V

    return-object p1
.end method
