.class final LS/x$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/x;->c(LL0/a;Lx7/a;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LL0/a;

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Z

.field final synthetic H:LS/v;

.field final synthetic I:Lz/l;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(LL0/a;Lx7/a;Landroidx/compose/ui/d;ZLS/v;Lz/l;II)V
    .locals 0

    iput-object p1, p0, LS/x$g;->D:LL0/a;

    iput-object p2, p0, LS/x$g;->E:Lx7/a;

    iput-object p3, p0, LS/x$g;->F:Landroidx/compose/ui/d;

    iput-boolean p4, p0, LS/x$g;->G:Z

    iput-object p5, p0, LS/x$g;->H:LS/v;

    iput-object p6, p0, LS/x$g;->I:Lz/l;

    iput p7, p0, LS/x$g;->J:I

    iput p8, p0, LS/x$g;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-object v0, p0, LS/x$g;->D:LL0/a;

    iget-object v1, p0, LS/x$g;->E:Lx7/a;

    iget-object v2, p0, LS/x$g;->F:Landroidx/compose/ui/d;

    iget-boolean v3, p0, LS/x$g;->G:Z

    iget-object v4, p0, LS/x$g;->H:LS/v;

    iget-object v5, p0, LS/x$g;->I:Lz/l;

    iget p2, p0, LS/x$g;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    iget v8, p0, LS/x$g;->K:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LS/x;->c(LL0/a;Lx7/a;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/x$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
