.class final LN/a$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a;->e(Landroidx/compose/ui/d;Lx7/a;Z)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;

.field final synthetic E:Z


# direct methods
.method constructor <init>(Lx7/a;Z)V
    .locals 0

    iput-object p1, p0, LN/a$f;->D:Lx7/a;

    iput-boolean p2, p0, LN/a$f;->E:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 5

    .prologue
    const v0, -0xbba9706

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LN/K;->b()LV/O0;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LN/J;

    invoke-virtual {p3}, LN/J;->b()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LV/n;->j(J)Z

    move-result p3

    iget-object v2, p0, LN/a$f;->D:Lx7/a;

    invoke-interface {p2, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    iget-boolean v2, p0, LN/a$f;->E:Z

    invoke-interface {p2, v2}, LV/n;->d(Z)Z

    move-result v2

    or-int/2addr p3, v2

    iget-object v2, p0, LN/a$f;->D:Lx7/a;

    iget-boolean v3, p0, LN/a$f;->E:Z

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez p3, :cond_1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v4, p3, :cond_2

    :cond_1
    new-instance v4, LN/a$f$a;

    invoke-direct {v4, v0, v1, v2, v3}, LN/a$f$a;-><init>(JLx7/a;Z)V

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lx7/l;

    invoke-static {p1, v4}, Landroidx/compose/ui/draw/b;->c(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/a$f;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
