.class final LS/i0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/i0;->b(Lu0/d;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu0/d;

.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:J

.field final synthetic H:I

.field final synthetic I:I


# direct methods
.method constructor <init>(Lu0/d;Ljava/lang/String;Landroidx/compose/ui/d;JII)V
    .locals 0

    iput-object p1, p0, LS/i0$a;->D:Lu0/d;

    iput-object p2, p0, LS/i0$a;->E:Ljava/lang/String;

    iput-object p3, p0, LS/i0$a;->F:Landroidx/compose/ui/d;

    iput-wide p4, p0, LS/i0$a;->G:J

    iput p6, p0, LS/i0$a;->H:I

    iput p7, p0, LS/i0$a;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    iget-object v0, p0, LS/i0$a;->D:Lu0/d;

    iget-object v1, p0, LS/i0$a;->E:Ljava/lang/String;

    iget-object v2, p0, LS/i0$a;->F:Landroidx/compose/ui/d;

    iget-wide v3, p0, LS/i0$a;->G:J

    iget p2, p0, LS/i0$a;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v6

    iget v7, p0, LS/i0$a;->I:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LS/i0;->b(Lu0/d;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/i0$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
