.class final LS/s0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s0;->d(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Lx7/p;

.field final synthetic H:Lx7/p;

.field final synthetic I:Z

.field final synthetic J:LS/r0;

.field final synthetic K:LA/B;

.field final synthetic L:Lz/l;

.field final synthetic M:I


# direct methods
.method constructor <init>(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;I)V
    .locals 0

    iput-object p1, p0, LS/s0$g;->D:Lx7/p;

    iput-object p2, p0, LS/s0$g;->E:Lx7/a;

    iput-object p3, p0, LS/s0$g;->F:Landroidx/compose/ui/d;

    iput-object p4, p0, LS/s0$g;->G:Lx7/p;

    iput-object p5, p0, LS/s0$g;->H:Lx7/p;

    iput-boolean p6, p0, LS/s0$g;->I:Z

    iput-object p7, p0, LS/s0$g;->J:LS/r0;

    iput-object p8, p0, LS/s0$g;->K:LA/B;

    iput-object p9, p0, LS/s0$g;->L:Lz/l;

    iput p10, p0, LS/s0$g;->M:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

    iget-object v0, p0, LS/s0$g;->D:Lx7/p;

    iget-object v1, p0, LS/s0$g;->E:Lx7/a;

    iget-object v2, p0, LS/s0$g;->F:Landroidx/compose/ui/d;

    iget-object v3, p0, LS/s0$g;->G:Lx7/p;

    iget-object v4, p0, LS/s0$g;->H:Lx7/p;

    iget-boolean v5, p0, LS/s0$g;->I:Z

    iget-object v6, p0, LS/s0$g;->J:LS/r0;

    iget-object v7, p0, LS/s0$g;->K:LA/B;

    iget-object v8, p0, LS/s0$g;->L:Lz/l;

    iget p2, p0, LS/s0$g;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    move-object v9, p1

    invoke-static/range {v0 .. v10}, LS/s0;->d(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/s0$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
