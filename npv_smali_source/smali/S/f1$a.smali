.class final LS/f1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f1;->a(Landroidx/compose/ui/d;FJLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/f1;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:F

.field final synthetic G:J

.field final synthetic H:I

.field final synthetic I:I


# direct methods
.method constructor <init>(LS/f1;Landroidx/compose/ui/d;FJII)V
    .locals 0

    iput-object p1, p0, LS/f1$a;->D:LS/f1;

    iput-object p2, p0, LS/f1$a;->E:Landroidx/compose/ui/d;

    iput p3, p0, LS/f1$a;->F:F

    iput-wide p4, p0, LS/f1$a;->G:J

    iput p6, p0, LS/f1$a;->H:I

    iput p7, p0, LS/f1$a;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    iget-object v0, p0, LS/f1$a;->D:LS/f1;

    iget-object v1, p0, LS/f1$a;->E:Landroidx/compose/ui/d;

    iget v2, p0, LS/f1$a;->F:F

    iget-wide v3, p0, LS/f1$a;->G:J

    iget p2, p0, LS/f1$a;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v6

    iget v7, p0, LS/f1$a;->I:I

    move-object v5, p1

    invoke-virtual/range {v0 .. v7}, LS/f1;->a(Landroidx/compose/ui/d;FJLV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/f1$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
