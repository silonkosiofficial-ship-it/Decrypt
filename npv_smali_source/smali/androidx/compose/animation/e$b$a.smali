.class final Landroidx/compose/animation/e$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e$b;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/animation/e;

.field final synthetic E:LD0/X;

.field final synthetic F:J


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;LD0/X;J)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b$a;->D:Landroidx/compose/animation/e;

    iput-object p2, p0, Landroidx/compose/animation/e$b$a;->E:LD0/X;

    iput-wide p3, p0, Landroidx/compose/animation/e$b$a;->F:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 14

    iget-object v0, p0, Landroidx/compose/animation/e$b$a;->D:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->h()Lh0/c;

    move-result-object v1

    iget-object v0, p0, Landroidx/compose/animation/e$b$a;->E:LD0/X;

    invoke-virtual {v0}, LD0/X;->I0()I

    move-result v0

    iget-object v2, p0, Landroidx/compose/animation/e$b$a;->E:LD0/X;

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v2

    invoke-static {v0, v2}, LY0/u;->a(II)J

    move-result-wide v2

    iget-wide v4, p0, Landroidx/compose/animation/e$b$a;->F:J

    sget-object v6, LY0/v;->C:LY0/v;

    invoke-interface/range {v1 .. v6}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide v9

    iget-object v8, p0, Landroidx/compose/animation/e$b$a;->E:LD0/X;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
