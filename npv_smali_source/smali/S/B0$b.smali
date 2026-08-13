.class final LS/B0$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/B0;->a(Landroidx/compose/ui/d;JFJILV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:J

.field final synthetic F:F

.field final synthetic G:J

.field final synthetic H:I

.field final synthetic I:I

.field final synthetic J:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;JFJIII)V
    .locals 0

    iput-object p1, p0, LS/B0$b;->D:Landroidx/compose/ui/d;

    iput-wide p2, p0, LS/B0$b;->E:J

    iput p4, p0, LS/B0$b;->F:F

    iput-wide p5, p0, LS/B0$b;->G:J

    iput p7, p0, LS/B0$b;->H:I

    iput p8, p0, LS/B0$b;->I:I

    iput p9, p0, LS/B0$b;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LS/B0$b;->D:Landroidx/compose/ui/d;

    iget-wide v1, p0, LS/B0$b;->E:J

    iget v3, p0, LS/B0$b;->F:F

    iget-wide v4, p0, LS/B0$b;->G:J

    iget v6, p0, LS/B0$b;->H:I

    iget p2, p0, LS/B0$b;->I:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v8

    iget v9, p0, LS/B0$b;->J:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LS/B0;->a(Landroidx/compose/ui/d;JFJILV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/B0$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
