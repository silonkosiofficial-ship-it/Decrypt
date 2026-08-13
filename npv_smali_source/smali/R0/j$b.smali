.class final LR0/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR0/j;->g(LR0/F;)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR0/j;

.field final synthetic E:LR0/F;


# direct methods
.method constructor <init>(LR0/j;LR0/F;)V
    .locals 0

    iput-object p1, p0, LR0/j$b;->D:LR0/j;

    iput-object p2, p0, LR0/j$b;->E:LR0/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/l;)LR0/H;
    .locals 4

    .prologue
    iget-object v0, p0, LR0/j$b;->D:LR0/j;

    invoke-static {v0}, LR0/j;->c(LR0/j;)LR0/m;

    move-result-object v0

    iget-object v1, p0, LR0/j$b;->E:LR0/F;

    iget-object v2, p0, LR0/j$b;->D:LR0/j;

    invoke-virtual {v2}, LR0/j;->f()LR0/w;

    move-result-object v2

    iget-object v3, p0, LR0/j$b;->D:LR0/j;

    invoke-static {v3}, LR0/j;->b(LR0/j;)Lx7/l;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, LR0/m;->a(LR0/F;LR0/w;Lx7/l;Lx7/l;)LR0/H;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LR0/j$b;->D:LR0/j;

    invoke-static {v0}, LR0/j;->d(LR0/j;)LR0/v;

    move-result-object v0

    iget-object v1, p0, LR0/j$b;->E:LR0/F;

    iget-object v2, p0, LR0/j$b;->D:LR0/j;

    invoke-virtual {v2}, LR0/j;->f()LR0/w;

    move-result-object v2

    iget-object v3, p0, LR0/j$b;->D:LR0/j;

    invoke-static {v3}, LR0/j;->b(LR0/j;)Lx7/l;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, LR0/v;->a(LR0/F;LR0/w;Lx7/l;Lx7/l;)LR0/H;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not load font"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/l;

    invoke-virtual {p0, p1}, LR0/j$b;->a(Lx7/l;)LR0/H;

    move-result-object p1

    return-object p1
.end method
