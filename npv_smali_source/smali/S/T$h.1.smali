.class final LS/T$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->b(LS/U;Landroidx/compose/ui/d;LS/Q;Lx7/p;Lx7/p;ZLS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:LS/Q;

.field final synthetic G:Lx7/p;

.field final synthetic H:Lx7/p;

.field final synthetic I:Z

.field final synthetic J:LS/M;

.field final synthetic K:I

.field final synthetic L:I


# direct methods
.method constructor <init>(LS/U;Landroidx/compose/ui/d;LS/Q;Lx7/p;Lx7/p;ZLS/M;II)V
    .locals 0

    iput-object p1, p0, LS/T$h;->D:LS/U;

    iput-object p2, p0, LS/T$h;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LS/T$h;->F:LS/Q;

    iput-object p4, p0, LS/T$h;->G:Lx7/p;

    iput-object p5, p0, LS/T$h;->H:Lx7/p;

    iput-boolean p6, p0, LS/T$h;->I:Z

    iput-object p7, p0, LS/T$h;->J:LS/M;

    iput p8, p0, LS/T$h;->K:I

    iput p9, p0, LS/T$h;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LS/T$h;->D:LS/U;

    iget-object v1, p0, LS/T$h;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, LS/T$h;->F:LS/Q;

    iget-object v3, p0, LS/T$h;->G:Lx7/p;

    iget-object v4, p0, LS/T$h;->H:Lx7/p;

    iget-boolean v5, p0, LS/T$h;->I:Z

    iget-object v6, p0, LS/T$h;->J:LS/M;

    iget p2, p0, LS/T$h;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v8

    iget v9, p0, LS/T$h;->L:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LS/T;->b(LS/U;Landroidx/compose/ui/d;LS/Q;Lx7/p;Lx7/p;ZLS/M;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$h;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
