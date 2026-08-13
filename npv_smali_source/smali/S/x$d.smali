.class final LS/x$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/x;->b(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:LL0/a;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:LS/v;

.field final synthetic H:I


# direct methods
.method constructor <init>(ZLL0/a;Landroidx/compose/ui/d;LS/v;I)V
    .locals 0

    iput-boolean p1, p0, LS/x$d;->D:Z

    iput-object p2, p0, LS/x$d;->E:LL0/a;

    iput-object p3, p0, LS/x$d;->F:Landroidx/compose/ui/d;

    iput-object p4, p0, LS/x$d;->G:LS/v;

    iput p5, p0, LS/x$d;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-boolean v0, p0, LS/x$d;->D:Z

    iget-object v1, p0, LS/x$d;->E:LL0/a;

    iget-object v2, p0, LS/x$d;->F:Landroidx/compose/ui/d;

    iget-object v3, p0, LS/x$d;->G:LS/v;

    iget p2, p0, LS/x$d;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LS/x;->d(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/x$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
