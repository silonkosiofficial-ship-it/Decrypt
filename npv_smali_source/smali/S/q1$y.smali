.class final LS/q1$y;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->p(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:I

.field final synthetic F:LS/t1;

.field final synthetic G:I

.field final synthetic H:LS/o1;

.field final synthetic I:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;ILS/t1;ILS/o1;I)V
    .locals 0

    iput-object p1, p0, LS/q1$y;->D:Landroidx/compose/ui/d;

    iput p2, p0, LS/q1$y;->E:I

    iput-object p3, p0, LS/q1$y;->F:LS/t1;

    iput p4, p0, LS/q1$y;->G:I

    iput-object p5, p0, LS/q1$y;->H:LS/o1;

    iput p6, p0, LS/q1$y;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

    iget-object v0, p0, LS/q1$y;->D:Landroidx/compose/ui/d;

    iget v1, p0, LS/q1$y;->E:I

    iget-object v2, p0, LS/q1$y;->F:LS/t1;

    iget v3, p0, LS/q1$y;->G:I

    iget-object v4, p0, LS/q1$y;->H:LS/o1;

    iget p2, p0, LS/q1$y;->I:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v6

    move-object v5, p1

    invoke-static/range {v0 .. v6}, LS/q1;->F(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$y;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
