.class final Lt/d$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->f(ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Landroidx/compose/animation/h;

.field final synthetic G:Landroidx/compose/animation/j;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Lx7/q;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;II)V
    .locals 0

    iput-boolean p1, p0, Lt/d$e;->D:Z

    iput-object p2, p0, Lt/d$e;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, Lt/d$e;->F:Landroidx/compose/animation/h;

    iput-object p4, p0, Lt/d$e;->G:Landroidx/compose/animation/j;

    iput-object p5, p0, Lt/d$e;->H:Ljava/lang/String;

    iput-object p6, p0, Lt/d$e;->I:Lx7/q;

    iput p7, p0, Lt/d$e;->J:I

    iput p8, p0, Lt/d$e;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-boolean v0, p0, Lt/d$e;->D:Z

    iget-object v1, p0, Lt/d$e;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, Lt/d$e;->F:Landroidx/compose/animation/h;

    iget-object v3, p0, Lt/d$e;->G:Landroidx/compose/animation/j;

    iget-object v4, p0, Lt/d$e;->H:Ljava/lang/String;

    iget-object v5, p0, Lt/d$e;->I:Lx7/q;

    iget p2, p0, Lt/d$e;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    iget v8, p0, Lt/d$e;->K:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lt/d;->f(ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lt/d$e;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
