.class final Lt/d$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->e(LA/L;ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA/L;

.field final synthetic E:Z

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Landroidx/compose/animation/h;

.field final synthetic H:Landroidx/compose/animation/j;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Lx7/q;

.field final synthetic K:I

.field final synthetic L:I


# direct methods
.method constructor <init>(LA/L;ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;II)V
    .locals 0

    iput-object p1, p0, Lt/d$g;->D:LA/L;

    iput-boolean p2, p0, Lt/d$g;->E:Z

    iput-object p3, p0, Lt/d$g;->F:Landroidx/compose/ui/d;

    iput-object p4, p0, Lt/d$g;->G:Landroidx/compose/animation/h;

    iput-object p5, p0, Lt/d$g;->H:Landroidx/compose/animation/j;

    iput-object p6, p0, Lt/d$g;->I:Ljava/lang/String;

    iput-object p7, p0, Lt/d$g;->J:Lx7/q;

    iput p8, p0, Lt/d$g;->K:I

    iput p9, p0, Lt/d$g;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, Lt/d$g;->D:LA/L;

    iget-boolean v1, p0, Lt/d$g;->E:Z

    iget-object v2, p0, Lt/d$g;->F:Landroidx/compose/ui/d;

    iget-object v3, p0, Lt/d$g;->G:Landroidx/compose/animation/h;

    iget-object v4, p0, Lt/d$g;->H:Landroidx/compose/animation/j;

    iget-object v5, p0, Lt/d$g;->I:Ljava/lang/String;

    iget-object v6, p0, Lt/d$g;->J:Lx7/q;

    iget p2, p0, Lt/d$g;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v8

    iget v9, p0, Lt/d$g;->L:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lt/d;->e(LA/L;ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lt/d$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
