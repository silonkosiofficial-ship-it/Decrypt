.class final LS/x$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/x;->b(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;

.field final synthetic E:LV/G1;

.field final synthetic F:LV/G1;

.field final synthetic G:LV/G1;

.field final synthetic H:LV/G1;

.field final synthetic I:LS/u;


# direct methods
.method constructor <init>(LV/G1;LV/G1;LV/G1;LV/G1;LV/G1;LS/u;)V
    .locals 0

    iput-object p1, p0, LS/x$c;->D:LV/G1;

    iput-object p2, p0, LS/x$c;->E:LV/G1;

    iput-object p3, p0, LS/x$c;->F:LV/G1;

    iput-object p4, p0, LS/x$c;->G:LV/G1;

    iput-object p5, p0, LS/x$c;->H:LV/G1;

    iput-object p6, p0, LS/x$c;->I:LS/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 9

    invoke-static {}, LS/x;->h()F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->B0(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, LS/x$c;->D:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v3

    iget-object v1, p0, LS/x$c;->E:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v5

    invoke-static {}, LS/x;->g()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->B0(F)F

    move-result v7

    move-object v2, p1

    move v8, v0

    invoke-static/range {v2 .. v8}, LS/x;->e(Lq0/g;JJFF)V

    iget-object v1, p0, LS/x$c;->F:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v3

    iget-object v1, p0, LS/x$c;->G:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v5

    iget-object v1, p0, LS/x$c;->H:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v6

    iget-object v8, p0, LS/x$c;->I:LS/u;

    move v7, v0

    invoke-static/range {v2 .. v8}, LS/x;->f(Lq0/g;JFFFLS/u;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, LS/x$c;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
