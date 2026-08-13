.class final Landroidx/compose/ui/window/l$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/l;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/N;

.field final synthetic E:Landroidx/compose/ui/window/l;

.field final synthetic F:LY0/r;

.field final synthetic G:J

.field final synthetic H:J


# direct methods
.method constructor <init>(Ly7/N;Landroidx/compose/ui/window/l;LY0/r;JJ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/l$h;->D:Ly7/N;

    iput-object p2, p0, Landroidx/compose/ui/window/l$h;->E:Landroidx/compose/ui/window/l;

    iput-object p3, p0, Landroidx/compose/ui/window/l$h;->F:LY0/r;

    iput-wide p4, p0, Landroidx/compose/ui/window/l$h;->G:J

    iput-wide p6, p0, Landroidx/compose/ui/window/l$h;->H:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/window/l$h;->D:Ly7/N;

    iget-object v1, p0, Landroidx/compose/ui/window/l$h;->E:Landroidx/compose/ui/window/l;

    invoke-virtual {v1}, Landroidx/compose/ui/window/l;->getPositionProvider()Landroidx/compose/ui/window/r;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/window/l$h;->F:LY0/r;

    iget-wide v4, p0, Landroidx/compose/ui/window/l$h;->G:J

    iget-object v1, p0, Landroidx/compose/ui/window/l$h;->E:Landroidx/compose/ui/window/l;

    invoke-virtual {v1}, Landroidx/compose/ui/window/l;->getParentLayoutDirection()LY0/v;

    move-result-object v6

    iget-wide v7, p0, Landroidx/compose/ui/window/l$h;->H:J

    invoke-interface/range {v2 .. v8}, Landroidx/compose/ui/window/r;->a(LY0/r;JLY0/v;J)J

    move-result-wide v1

    iput-wide v1, v0, Ly7/N;->C:J

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/window/l$h;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
