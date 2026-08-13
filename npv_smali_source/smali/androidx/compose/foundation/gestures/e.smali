.class final Landroidx/compose/foundation/gestures/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/b;


# instance fields
.field private final C:Lx/C;

.field private D:Z


# direct methods
.method public constructor <init>(Lx/C;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/e;->C:Lx/C;

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/e;->D:Z

    return-void
.end method


# virtual methods
.method public J(JJLm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    instance-of p1, p5, Landroidx/compose/foundation/gestures/e$a;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, Landroidx/compose/foundation/gestures/e$a;

    iget p2, p1, Landroidx/compose/foundation/gestures/e$a;->I:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Landroidx/compose/foundation/gestures/e$a;->I:I

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/compose/foundation/gestures/e$a;

    invoke-direct {p1, p0, p5}, Landroidx/compose/foundation/gestures/e$a;-><init>(Landroidx/compose/foundation/gestures/e;Lm7/e;)V

    :goto_0
    iget-object p2, p1, Landroidx/compose/foundation/gestures/e$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p5

    iget v0, p1, Landroidx/compose/foundation/gestures/e$a;->I:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-wide p3, p1, Landroidx/compose/foundation/gestures/e$a;->F:J

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-boolean p2, p0, Landroidx/compose/foundation/gestures/e;->D:Z

    if-eqz p2, :cond_4

    iget-object p2, p0, Landroidx/compose/foundation/gestures/e;->C:Lx/C;

    iput-wide p3, p1, Landroidx/compose/foundation/gestures/e$a;->F:J

    iput v1, p1, Landroidx/compose/foundation/gestures/e$a;->I:I

    invoke-virtual {p2, p3, p4, p1}, Lx/C;->n(JLm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p5, :cond_3

    return-object p5

    :cond_3
    :goto_1
    check-cast p2, LY0/A;

    invoke-virtual {p2}, LY0/A;->o()J

    move-result-wide p1

    invoke-static {p3, p4, p1, p2}, LY0/A;->k(JJ)J

    move-result-wide p1

    goto :goto_2

    :cond_4
    sget-object p1, LY0/A;->b:LY0/A$a;

    invoke-virtual {p1}, LY0/A$a;->a()J

    move-result-wide p1

    :goto_2
    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    return-object p1
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/e;->D:Z

    return-void
.end method

.method public e1(JJI)J
    .locals 0

    .prologue
    iget-boolean p1, p0, Landroidx/compose/foundation/gestures/e;->D:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/gestures/e;->C:Lx/C;

    invoke-virtual {p1, p3, p4}, Lx/C;->r(J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public synthetic h1(JLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ly0/a;->c(Ly0/b;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u0(JI)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ly0/a;->d(Ly0/b;JI)J

    move-result-wide p1

    return-wide p1
.end method
