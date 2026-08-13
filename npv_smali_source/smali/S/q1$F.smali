.class final LS/q1$F;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->t(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/c;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:LS/o1;

.field final synthetic G:Z

.field final synthetic H:I

.field final synthetic I:I


# direct methods
.method constructor <init>(LS/c;Landroidx/compose/ui/d;LS/o1;ZII)V
    .locals 0

    iput-object p1, p0, LS/q1$F;->D:LS/c;

    iput-object p2, p0, LS/q1$F;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LS/q1$F;->F:LS/o1;

    iput-boolean p4, p0, LS/q1$F;->G:Z

    iput p5, p0, LS/q1$F;->H:I

    iput p6, p0, LS/q1$F;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

    iget-object v0, p0, LS/q1$F;->D:LS/c;

    iget-object v1, p0, LS/q1$F;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, LS/q1$F;->F:LS/o1;

    iget-boolean v3, p0, LS/q1$F;->G:Z

    iget p2, p0, LS/q1$F;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v5

    iget v6, p0, LS/q1$F;->I:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LS/q1;->t(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$F;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
