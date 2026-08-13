.class final Lt/d$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->g(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;

.field final synthetic E:Lx7/l;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Landroidx/compose/animation/h;

.field final synthetic H:Landroidx/compose/animation/j;

.field final synthetic I:Lx7/q;

.field final synthetic J:I


# direct methods
.method constructor <init>(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/q;I)V
    .locals 0

    iput-object p1, p0, Lt/d$l;->D:Lu/s0;

    iput-object p2, p0, Lt/d$l;->E:Lx7/l;

    iput-object p3, p0, Lt/d$l;->F:Landroidx/compose/ui/d;

    iput-object p4, p0, Lt/d$l;->G:Landroidx/compose/animation/h;

    iput-object p5, p0, Lt/d$l;->H:Landroidx/compose/animation/j;

    iput-object p6, p0, Lt/d$l;->I:Lx7/q;

    iput p7, p0, Lt/d$l;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    iget-object v0, p0, Lt/d$l;->D:Lu/s0;

    iget-object v1, p0, Lt/d$l;->E:Lx7/l;

    iget-object v2, p0, Lt/d$l;->F:Landroidx/compose/ui/d;

    iget-object v3, p0, Lt/d$l;->G:Landroidx/compose/animation/h;

    iget-object v4, p0, Lt/d$l;->H:Landroidx/compose/animation/j;

    iget-object v5, p0, Lt/d$l;->I:Lx7/q;

    iget p2, p0, Lt/d$l;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Lt/d;->g(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/q;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lt/d$l;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
