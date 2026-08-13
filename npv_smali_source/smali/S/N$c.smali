.class final LS/N$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/N;->a(Ljava/lang/Long;ILS/Q;Landroidx/compose/ui/d;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/N;

.field final synthetic E:Ljava/lang/Long;

.field final synthetic F:I

.field final synthetic G:LS/Q;

.field final synthetic H:Landroidx/compose/ui/d;

.field final synthetic I:I

.field final synthetic J:I


# direct methods
.method constructor <init>(LS/N;Ljava/lang/Long;ILS/Q;Landroidx/compose/ui/d;II)V
    .locals 0

    iput-object p1, p0, LS/N$c;->D:LS/N;

    iput-object p2, p0, LS/N$c;->E:Ljava/lang/Long;

    iput p3, p0, LS/N$c;->F:I

    iput-object p4, p0, LS/N$c;->G:LS/Q;

    iput-object p5, p0, LS/N$c;->H:Landroidx/compose/ui/d;

    iput p6, p0, LS/N$c;->I:I

    iput p7, p0, LS/N$c;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    iget-object v0, p0, LS/N$c;->D:LS/N;

    iget-object v1, p0, LS/N$c;->E:Ljava/lang/Long;

    iget v2, p0, LS/N$c;->F:I

    iget-object v3, p0, LS/N$c;->G:LS/Q;

    iget-object v4, p0, LS/N$c;->H:Landroidx/compose/ui/d;

    iget p2, p0, LS/N$c;->I:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v6

    iget v7, p0, LS/N$c;->J:I

    move-object v5, p1

    invoke-virtual/range {v0 .. v7}, LS/N;->a(Ljava/lang/Long;ILS/Q;Landroidx/compose/ui/d;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/N$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
