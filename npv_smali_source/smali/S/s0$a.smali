.class final LS/s0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s0;->a(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lu/Z;

.field final synthetic F:LV/w0;

.field final synthetic G:LV/G1;

.field final synthetic H:LV/G1;


# direct methods
.method constructor <init>(ZLu/Z;LV/w0;LV/G1;LV/G1;)V
    .locals 0

    iput-boolean p1, p0, LS/s0$a;->D:Z

    iput-object p2, p0, LS/s0$a;->E:Lu/Z;

    iput-object p3, p0, LS/s0$a;->F:LV/w0;

    iput-object p4, p0, LS/s0$a;->G:LV/G1;

    iput-object p5, p0, LS/s0$a;->H:LV/G1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 3

    .prologue
    iget-boolean v0, p0, LS/s0$a;->D:Z

    const v1, 0x3f4ccccd    # 0.8f

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v0, :cond_0

    iget-object v0, p0, LS/s0$a;->G:LV/G1;

    invoke-static {v0}, LS/s0;->e(LV/G1;)F

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LS/s0$a;->E:Lu/Z;

    invoke-virtual {v0}, Lu/Z;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->h(F)V

    iget-boolean v0, p0, LS/s0$a;->D:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LS/s0$a;->G:LV/G1;

    invoke-static {v0}, LS/s0;->e(LV/G1;)F

    move-result v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, LS/s0$a;->E:Lu/Z;

    invoke-virtual {v0}, Lu/Z;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    move v1, v2

    :cond_3
    :goto_1
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/c;->g(F)V

    iget-boolean v0, p0, LS/s0$a;->D:Z

    if-nez v0, :cond_4

    iget-object v0, p0, LS/s0$a;->H:LV/G1;

    invoke-static {v0}, LS/s0;->f(LV/G1;)F

    move-result v2

    goto :goto_2

    :cond_4
    iget-object v0, p0, LS/s0$a;->E:Lu/Z;

    invoke-virtual {v0}, Lu/Z;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    invoke-interface {p1, v2}, Landroidx/compose/ui/graphics/c;->b(F)V

    iget-object v0, p0, LS/s0$a;->F:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/f;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f;->j()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->T0(J)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, LS/s0$a;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
