.class final Landroidx/compose/animation/f$m;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->h(Lu/I;Lh0/c$b;ZLx7/l;)Landroidx/compose/animation/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/f$m;->D:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/f$m;->D:Lx7/l;

    invoke-static {p1, p2}, LY0/t;->g(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p1, p2}, LY0/t;->f(J)I

    move-result p1

    invoke-static {v0, p1}, LY0/u;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/animation/f$m;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    return-object p1
.end method
