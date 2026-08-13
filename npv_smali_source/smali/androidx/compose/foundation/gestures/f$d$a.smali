.class final Landroidx/compose/foundation/gestures/f$d$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:J


# direct methods
.method constructor <init>(JLm7/e;)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/gestures/f$d$a;->I:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Landroidx/compose/foundation/gestures/f$d$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/f$d$a;->H:Ljava/lang/Object;

    check-cast p1, Lx/r;

    iget-wide v0, p0, Landroidx/compose/foundation/gestures/f$d$a;->I:J

    sget-object v2, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {v2}, Ly0/f$a;->b()I

    move-result v2

    invoke-interface {p1, v0, v1, v2}, Lx/r;->b(JI)J

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lx/r;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$d$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/f$d$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/f$d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/r;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/f$d$a;->H(Lx/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/gestures/f$d$a;

    iget-wide v1, p0, Landroidx/compose/foundation/gestures/f$d$a;->I:J

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/f$d$a;-><init>(JLm7/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/f$d$a;->H:Ljava/lang/Object;

    return-object v0
.end method
