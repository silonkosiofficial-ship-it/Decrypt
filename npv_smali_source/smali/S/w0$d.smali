.class final LS/w0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->a(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/t;


# direct methods
.method constructor <init>(LT/t;)V
    .locals 0

    iput-object p1, p0, LS/w0$d;->D:LT/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:257)"

    const v2, 0x293afa35

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v0, "indicatorRipple"

    invoke-static {p2, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v0, LU/r;->a:LU/r;

    invoke-virtual {v0}, LU/r;->d()LU/z;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v0

    invoke-static {p2, v0}, Ll0/e;->a(Landroidx/compose/ui/d;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LS/w0$d;->D:LT/t;

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LS/I0;->c(ZFJLV/n;II)Lv/G;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/d;Lz/j;Lv/G;)Landroidx/compose/ui/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/w0$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
