.class final LV/F0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/F0;-><init>(Ljava/util/List;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/F0;


# direct methods
.method constructor <init>(LV/F0;)V
    .locals 0

    iput-object p1, p0, LV/F0$a;->D:LV/F0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lr/K;
    .locals 6

    .prologue
    iget-object v0, p0, LV/F0$a;->D:LV/F0;

    invoke-virtual {v0}, LV/F0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, LV/q;->j(I)Lr/K;

    move-result-object v0

    iget-object v1, p0, LV/F0$a;->D:LV/F0;

    invoke-virtual {v1}, LV/F0;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1}, LV/F0;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/c0;

    invoke-static {v4}, LV/q;->h(LV/c0;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v4}, LV/v0;->f(Lr/K;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/F0$a;->a()Lr/K;

    move-result-object v0

    invoke-static {v0}, LV/v0;->a(Lr/K;)LV/v0;

    move-result-object v0

    return-object v0
.end method
