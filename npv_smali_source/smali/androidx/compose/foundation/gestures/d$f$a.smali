.class final Landroidx/compose/foundation/gestures/d$f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/d$f;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/L;

.field final synthetic E:Lx/C;

.field final synthetic F:Lx/r;


# direct methods
.method constructor <init>(Ly7/L;Lx/C;Lx/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/d$f$a;->D:Ly7/L;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->E:Lx/C;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/d$f$a;->F:Lx/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 3

    iget-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->D:Ly7/L;

    iget p2, p2, Ly7/L;->C:F

    sub-float/2addr p1, p2

    iget-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->E:Lx/C;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/d$f$a;->F:Lx/r;

    invoke-virtual {p2, p1}, Lx/C;->t(F)F

    move-result p1

    invoke-virtual {p2, p1}, Lx/C;->B(F)J

    move-result-wide v1

    sget-object p1, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {p1}, Ly0/f$a;->b()I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Lx/r;->b(JI)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lx/C;->A(J)F

    move-result p1

    invoke-virtual {p2, p1}, Lx/C;->t(F)F

    move-result p1

    iget-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->D:Ly7/L;

    iget v0, p2, Ly7/L;->C:F

    add-float/2addr v0, p1

    iput v0, p2, Ly7/L;->C:F

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f$a;->a(FF)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
