.class final Landroidx/compose/foundation/gestures/b$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


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

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$b;->D:LA0/d;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$b;->E:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;J)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$b;->D:LA0/d;

    invoke-static {v0, p1}, LA0/e;->c(LA0/d;Lz0/B;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$b;->E:Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Landroidx/compose/foundation/gestures/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Landroidx/compose/foundation/gestures/a$b;-><init>(JLy7/k;)V

    invoke-interface {p1, v0}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    :cond_0
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lz0/B;

    check-cast p2, Ln0/g;

    invoke-virtual {p2}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/gestures/b$b$b;->a(Lz0/B;J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
