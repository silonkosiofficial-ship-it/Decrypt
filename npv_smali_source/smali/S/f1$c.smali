.class final LS/f1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f1;->d(Landroidx/compose/ui/d;LS/e1;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/e1;


# direct methods
.method constructor <init>(LS/e1;)V
    .locals 0

    iput-object p1, p0, LS/f1$c;->D:LS/e1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LV/G1;)F
    .locals 0

    invoke-static {p0}, LS/f1$c;->g(LV/G1;)F

    move-result p0

    return p0
.end method

.method private static final f(LV/G1;)F
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/i;

    invoke-virtual {p0}, LY0/i;->v()F

    move-result p0

    return p0
.end method

.method private static final g(LV/G1;)F
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/i;

    invoke-virtual {p0}, LY0/i;->v()F

    move-result p0

    return p0
.end method


# virtual methods
.method public final e(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    const v0, -0x5bddee2c

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1265)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LS/f1$c;->D:LS/e1;

    invoke-virtual {p3}, LS/e1;->c()F

    move-result v0

    invoke-static {}, LS/g1;->d()Lu/j;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Lu/c;->c(FLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p3

    iget-object v0, p0, LS/f1$c;->D:LS/e1;

    invoke-virtual {v0}, LS/e1;->a()F

    move-result v1

    invoke-static {}, LS/g1;->d()Lu/j;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v4, 0x0

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lu/c;->c(FLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v3}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p1

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->d()Lh0/c;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {p1, v1, v2, v4, v3}, Landroidx/compose/foundation/layout/p;->z(Landroidx/compose/ui/d;Lh0/c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-interface {p2, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, LS/f1$c$a;

    invoke-direct {v2, v0}, LS/f1$c$a;-><init>(LV/G1;)V

    invoke-interface {p2, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lx7/l;

    invoke-static {p1, v2}, Landroidx/compose/foundation/layout/k;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {p3}, LS/f1$c;->f(LV/G1;)F

    move-result p3

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/p;->t(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

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

    invoke-virtual {p0, p1, p2, p3}, LS/f1$c;->e(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
