.class final Landroidx/compose/animation/e$b$c;
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


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b$c;->D:Landroidx/compose/animation/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)J
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/e$b$c;->D:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->i()Lr/K;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/G1;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-virtual {p1}, LY0/t$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$c;->a(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    return-object p1
.end method
