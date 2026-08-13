.class final Landroidx/compose/foundation/gestures/b$b$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA0/d;

.field final synthetic E:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(LA0/d;Landroidx/compose/foundation/gestures/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->D:LA0/d;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$d;->E:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;)V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$d;->D:LA0/d;

    invoke-static {v0, p1}, LA0/e;->c(LA0/d;Lz0/B;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->E:Landroidx/compose/foundation/gestures/b;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->r()LV/O0;

    move-result-object v0

    invoke-static {p1, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/A1;

    invoke-interface {p1}, Landroidx/compose/ui/platform/A1;->f()F

    move-result p1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$d;->D:LA0/d;

    invoke-static {p1, p1}, LY0/B;->a(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LA0/d;->b(J)J

    move-result-wide v0

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->D:LA0/d;

    invoke-virtual {p1}, LA0/d;->e()V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$d;->E:Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v2, Landroidx/compose/foundation/gestures/a$d;

    invoke-static {v0, v1}, Lx/n;->f(J)J

    move-result-wide v0

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Landroidx/compose/foundation/gestures/a$d;-><init>(JLy7/k;)V

    invoke-interface {p1, v2}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/B;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/b$b$d;->a(Lz0/B;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
