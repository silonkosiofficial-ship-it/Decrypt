.class final Landroidx/compose/ui/draw/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/C1;


# instance fields
.field private a:Lr/I;

.field private b:Lo0/C1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr0/c;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/draw/f;->b:Lo0/C1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lo0/C1;->a(Lr0/c;)V

    :cond_0
    return-void
.end method

.method public b()Lr0/c;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/draw/f;->b:Lo0/C1;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, "GraphicsContext not provided"

    invoke-static {v1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v0}, Lo0/C1;->b()Lr0/c;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/draw/f;->a:Lr/I;

    if-nez v1, :cond_2

    invoke-static {v0}, Lr/Q;->b(Ljava/lang/Object;)Lr/I;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/draw/f;->a:Lr/I;

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v0}, Lr/I;->g(Ljava/lang/Object;)Z

    :goto_1
    return-object v0
.end method

.method public final c()Lo0/C1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/f;->b:Lo0/C1;

    return-object v0
.end method

.method public final d()V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/draw/f;->a:Lr/I;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lr/P;->a:[Ljava/lang/Object;

    iget v2, v0, Lr/P;->b:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    check-cast v4, Lr0/c;

    invoke-virtual {p0, v4}, Landroidx/compose/ui/draw/f;->a(Lr0/c;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lr/I;->h()V

    :cond_1
    return-void
.end method

.method public final e(Lo0/C1;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/draw/f;->d()V

    iput-object p1, p0, Landroidx/compose/ui/draw/f;->b:Lo0/C1;

    return-void
.end method
