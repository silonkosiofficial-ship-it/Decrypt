.class final Landroidx/compose/animation/g$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:J

.field final synthetic F:J

.field final synthetic G:Lx7/l;


# direct methods
.method constructor <init>(LD0/X;JJLx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g$c;->D:LD0/X;

    iput-wide p2, p0, Landroidx/compose/animation/g$c;->E:J

    iput-wide p4, p0, Landroidx/compose/animation/g$c;->F:J

    iput-object p6, p0, Landroidx/compose/animation/g$c;->G:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 6

    iget-object v1, p0, Landroidx/compose/animation/g$c;->D:LD0/X;

    iget-wide v2, p0, Landroidx/compose/animation/g$c;->E:J

    invoke-static {v2, v3}, LY0/p;->h(J)I

    move-result v0

    iget-wide v2, p0, Landroidx/compose/animation/g$c;->F:J

    invoke-static {v2, v3}, LY0/p;->h(J)I

    move-result v2

    add-int/2addr v2, v0

    iget-wide v3, p0, Landroidx/compose/animation/g$c;->E:J

    invoke-static {v3, v4}, LY0/p;->i(J)I

    move-result v0

    iget-wide v3, p0, Landroidx/compose/animation/g$c;->F:J

    invoke-static {v3, v4}, LY0/p;->i(J)I

    move-result v3

    add-int/2addr v3, v0

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/compose/animation/g$c;->G:Lx7/l;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->u(LD0/X;IIFLx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$c;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
