.class final Landroidx/compose/foundation/gestures/b$b$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/gestures/b;

.field final synthetic E:LA0/d;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;LA0/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$e;->E:LA0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;Lz0/B;J)V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/b;->j2()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->b2(Landroidx/compose/foundation/gestures/b;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    const v2, 0x7fffffff

    const/4 v3, 0x6

    invoke-static {v2, v1, v1, v3, v1}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/gestures/b;->f2(Landroidx/compose/foundation/gestures/b;LY8/j;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/b;->g2(Landroidx/compose/foundation/gestures/b;)V

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$e;->E:LA0/d;

    invoke-static {v0, p1}, LA0/e;->c(LA0/d;Lz0/B;)V

    invoke-virtual {p2}, Lz0/B;->h()J

    move-result-wide p1

    invoke-static {p1, p2, p3, p4}, Ln0/g;->q(JJ)J

    move-result-wide p1

    iget-object p3, p0, Landroidx/compose/foundation/gestures/b$b$e;->D:Landroidx/compose/foundation/gestures/b;

    invoke-static {p3}, Landroidx/compose/foundation/gestures/b;->Z1(Landroidx/compose/foundation/gestures/b;)LY8/j;

    move-result-object p3

    if-eqz p3, :cond_2

    new-instance p4, Landroidx/compose/foundation/gestures/a$c;

    invoke-direct {p4, p1, p2, v1}, Landroidx/compose/foundation/gestures/a$c;-><init>(JLy7/k;)V

    invoke-interface {p3, p4}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    :cond_2
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lz0/B;

    check-cast p2, Lz0/B;

    check-cast p3, Ln0/g;

    invoke-virtual {p3}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/gestures/b$b$e;->a(Lz0/B;Lz0/B;J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
