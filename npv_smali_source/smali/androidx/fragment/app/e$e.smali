.class Landroidx/fragment/app/e$e;
.super LV1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/e;->f()LV1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LV1/e;

.field final synthetic D:Landroidx/fragment/app/e;


# direct methods
.method constructor <init>(Landroidx/fragment/app/e;LV1/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/e$e;->D:Landroidx/fragment/app/e;

    iput-object p2, p0, Landroidx/fragment/app/e$e;->C:LV1/e;

    invoke-direct {p0}, LV1/e;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/e$e;->C:LV1/e;

    invoke-virtual {v0}, LV1/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/e$e;->C:LV1/e;

    invoke-virtual {v0, p1}, LV1/e;->h(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/e$e;->D:Landroidx/fragment/app/e;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/e;->K1(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public j()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/e$e;->C:LV1/e;

    invoke-virtual {v0}, LV1/e;->j()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/e$e;->D:Landroidx/fragment/app/e;

    invoke-virtual {v0}, Landroidx/fragment/app/e;->L1()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
