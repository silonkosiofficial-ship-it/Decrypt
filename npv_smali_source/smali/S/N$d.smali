.class final LS/N$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/N;->b(ILandroidx/compose/ui/d;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/N;

.field final synthetic E:I

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:I

.field final synthetic H:I


# direct methods
.method constructor <init>(LS/N;ILandroidx/compose/ui/d;II)V
    .locals 0

    iput-object p1, p0, LS/N$d;->D:LS/N;

    iput p2, p0, LS/N$d;->E:I

    iput-object p3, p0, LS/N$d;->F:Landroidx/compose/ui/d;

    iput p4, p0, LS/N$d;->G:I

    iput p5, p0, LS/N$d;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, LS/N$d;->D:LS/N;

    iget v1, p0, LS/N$d;->E:I

    iget-object v2, p0, LS/N$d;->F:Landroidx/compose/ui/d;

    iget p2, p0, LS/N$d;->G:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v4

    iget v5, p0, LS/N$d;->H:I

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, LS/N;->b(ILandroidx/compose/ui/d;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/N$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
