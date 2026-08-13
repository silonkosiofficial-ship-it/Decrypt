.class final LS/f$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->c(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/q;

.field final synthetic H:F

.field final synthetic I:LA/S;

.field final synthetic J:LS/w1;

.field final synthetic K:I

.field final synthetic L:I


# direct methods
.method constructor <init>(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;II)V
    .locals 0

    iput-object p1, p0, LS/f$g;->D:Lx7/p;

    iput-object p2, p0, LS/f$g;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LS/f$g;->F:Lx7/p;

    iput-object p4, p0, LS/f$g;->G:Lx7/q;

    iput p5, p0, LS/f$g;->H:F

    iput-object p6, p0, LS/f$g;->I:LA/S;

    iput-object p7, p0, LS/f$g;->J:LS/w1;

    iput p9, p0, LS/f$g;->K:I

    iput p10, p0, LS/f$g;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

    iget-object v0, p0, LS/f$g;->D:Lx7/p;

    iget-object v1, p0, LS/f$g;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, LS/f$g;->F:Lx7/p;

    iget-object v3, p0, LS/f$g;->G:Lx7/q;

    iget v4, p0, LS/f$g;->H:F

    iget-object v5, p0, LS/f$g;->I:LA/S;

    iget-object v6, p0, LS/f$g;->J:LS/w1;

    iget p2, p0, LS/f$g;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v9

    iget v10, p0, LS/f$g;->L:I

    const/4 v7, 0x0

    move-object v8, p1

    invoke-static/range {v0 .. v10}, LS/f;->c(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/f$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
