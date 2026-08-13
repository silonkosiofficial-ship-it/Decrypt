.class final Landroidx/compose/ui/platform/p0$u;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/p0;->a(LF0/o0;Landroidx/compose/ui/platform/w1;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/o0;

.field final synthetic E:Landroidx/compose/ui/platform/w1;

.field final synthetic F:Lx7/p;

.field final synthetic G:I


# direct methods
.method constructor <init>(LF0/o0;Landroidx/compose/ui/platform/w1;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/p0$u;->D:LF0/o0;

    iput-object p2, p0, Landroidx/compose/ui/platform/p0$u;->E:Landroidx/compose/ui/platform/w1;

    iput-object p3, p0, Landroidx/compose/ui/platform/p0$u;->F:Lx7/p;

    iput p4, p0, Landroidx/compose/ui/platform/p0$u;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 3

    iget-object p2, p0, Landroidx/compose/ui/platform/p0$u;->D:LF0/o0;

    iget-object v0, p0, Landroidx/compose/ui/platform/p0$u;->E:Landroidx/compose/ui/platform/w1;

    iget-object v1, p0, Landroidx/compose/ui/platform/p0$u;->F:Lx7/p;

    iget v2, p0, Landroidx/compose/ui/platform/p0$u;->G:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LV/S0;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Landroidx/compose/ui/platform/p0;->a(LF0/o0;Landroidx/compose/ui/platform/w1;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/p0$u;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
