.class final Lt/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->a(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/p;Lt/u;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# direct methods
.method constructor <init>(Lt/u;)V
    .locals 0

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->A0()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Lt/d$a$a;

    invoke-direct {v4, p2}, Lt/d$a$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2}, LD0/X;->I0()I

    move-result p1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p2

    invoke-static {p1, p2}, LY0/u;->a(II)J

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/M;

    check-cast p2, LD0/G;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lt/d$a;->a(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
