.class final Lv/b0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/b0;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lv/b0;

.field final synthetic E:I

.field final synthetic F:LD0/X;


# direct methods
.method constructor <init>(Lv/b0;ILD0/X;)V
    .locals 0

    iput-object p1, p0, Lv/b0$a;->D:Lv/b0;

    iput p2, p0, Lv/b0$a;->E:I

    iput-object p3, p0, Lv/b0$a;->F:LD0/X;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lv/b0$a;->D:Lv/b0;

    invoke-virtual {v0}, Lv/b0;->T1()Landroidx/compose/foundation/m;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/m;->l()I

    move-result v0

    iget v1, p0, Lv/b0$a;->E:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LE7/j;->k(III)I

    move-result v0

    iget-object v1, p0, Lv/b0$a;->D:Lv/b0;

    invoke-virtual {v1}, Lv/b0;->U1()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lv/b0$a;->E:I

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_0
    neg-int v0, v0

    :goto_0
    iget-object v1, p0, Lv/b0$a;->D:Lv/b0;

    invoke-virtual {v1}, Lv/b0;->V1()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    iget-object v3, p0, Lv/b0$a;->D:Lv/b0;

    invoke-virtual {v3}, Lv/b0;->V1()Z

    move-result v3

    if-eqz v3, :cond_2

    move v2, v0

    :cond_2
    new-instance v0, Lv/b0$a$a;

    iget-object v3, p0, Lv/b0$a;->F:LD0/X;

    invoke-direct {v0, v3, v1, v2}, Lv/b0$a$a;-><init>(LD0/X;II)V

    invoke-virtual {p1, v0}, LD0/X$a;->A(Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Lv/b0$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
