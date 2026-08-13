.class final LN/y$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/y;->d(Landroidx/compose/ui/d;Lx7/a;Lx7/l;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(Lx7/a;Lx7/l;)V
    .locals 0

    iput-object p1, p0, LN/y$c;->D:Lx7/a;

    iput-object p2, p0, LN/y$c;->E:Lx7/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LV/G1;)J
    .locals 2

    invoke-static {p0}, LN/y$c;->f(LV/G1;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f(LV/G1;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/g;

    invoke-virtual {p0}, Ln0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final e(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    const p1, 0x2d4acc1b

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LN/y$c;->D:Lx7/a;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LN/y;->b(Lx7/a;LV/n;I)LV/G1;

    move-result-object p1

    iget-object p3, p0, LN/y$c;->E:Lx7/l;

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, LN/y$c$a;

    invoke-direct {v1, p1}, LN/y$c$a;-><init>(LV/G1;)V

    invoke-interface {p2, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lx7/a;

    invoke-interface {p3, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/d;

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

    invoke-virtual {p0, p1, p2, p3}, LN/y$c;->e(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
