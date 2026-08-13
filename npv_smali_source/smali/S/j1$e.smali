.class final LS/j1$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/j1;->n(Landroidx/compose/ui/d;ZZLz/j;LS/i1;FF)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lz/j;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:LS/i1;

.field final synthetic H:F

.field final synthetic I:F


# direct methods
.method constructor <init>(Lz/j;ZZLS/i1;FF)V
    .locals 0

    iput-object p1, p0, LS/j1$e;->D:Lz/j;

    iput-boolean p2, p0, LS/j1$e;->E:Z

    iput-boolean p3, p0, LS/j1$e;->F:Z

    iput-object p4, p0, LS/j1$e;->G:LS/i1;

    iput p5, p0, LS/j1$e;->H:F

    iput p6, p0, LS/j1$e;->I:F

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    const p1, -0x351c2cd6    # -7465365.0f

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LS/j1$e;->D:Lz/j;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lz/f;->a(Lz/j;LV/n;I)LV/G1;

    move-result-object p1

    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-boolean v0, p0, LS/j1$e;->E:Z

    iget-boolean v1, p0, LS/j1$e;->F:Z

    iget-object v3, p0, LS/j1$e;->G:LS/i1;

    iget v4, p0, LS/j1$e;->H:F

    iget v5, p0, LS/j1$e;->I:F

    const/4 v7, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v7}, LT/A;->h(ZZZLS/i1;FFLV/n;I)LV/G1;

    move-result-object p1

    sget-object p3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {p3, p1}, LS/k1;->j(Landroidx/compose/ui/d;LV/G1;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
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

    invoke-virtual {p0, p1, p2, p3}, LS/j1$e;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
