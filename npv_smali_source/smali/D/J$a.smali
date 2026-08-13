.class final LD/J$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/J;-><init>(LE7/i;LD/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:I

.field final synthetic F:Lr/H;

.field final synthetic G:LD/J;


# direct methods
.method constructor <init>(IILr/H;LD/J;)V
    .locals 0

    iput p1, p0, LD/J$a;->D:I

    iput p2, p0, LD/J$a;->E:I

    iput-object p3, p0, LD/J$a;->F:Lr/H;

    iput-object p4, p0, LD/J$a;->G:LD/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD/d$a;)V
    .locals 6

    .prologue
    invoke-virtual {p1}, LD/d$a;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/o$a;

    invoke-interface {v0}, LD/o$a;->getKey()Lx7/l;

    move-result-object v0

    iget v1, p0, LD/J$a;->D:I

    invoke-virtual {p1}, LD/d$a;->b()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, LD/J$a;->E:I

    invoke-virtual {p1}, LD/d$a;->b()I

    move-result v3

    invoke-virtual {p1}, LD/d$a;->a()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-gt v1, v2, :cond_2

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p1}, LD/d$a;->b()I

    move-result v3

    sub-int v3, v1, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    invoke-static {v1}, LD/H;->a(I)Ljava/lang/Object;

    move-result-object v3

    :cond_1
    iget-object v4, p0, LD/J$a;->F:Lr/H;

    invoke-virtual {v4, v3, v1}, Lr/H;->s(Ljava/lang/Object;I)V

    iget-object v4, p0, LD/J$a;->G:LD/J;

    invoke-static {v4}, LD/J;->a(LD/J;)[Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, LD/J$a;->G:LD/J;

    invoke-static {v5}, LD/J;->c(LD/J;)I

    move-result v5

    sub-int v5, v1, v5

    aput-object v3, v4, v5

    if-eq v1, v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD/d$a;

    invoke-virtual {p0, p1}, LD/J$a;->a(LD/d$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
