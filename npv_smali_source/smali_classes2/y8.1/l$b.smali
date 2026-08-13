.class final Ly8/l$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/l;-><init>(LE8/n;LO7/e;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly8/l;


# direct methods
.method constructor <init>(Ly8/l;)V
    .locals 0

    iput-object p1, p0, Ly8/l$b;->D:Ly8/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, Ly8/l$b;->D:Ly8/l;

    invoke-static {v0}, Ly8/l;->i(Ly8/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly8/l$b;->D:Ly8/l;

    invoke-static {v0}, Ly8/l;->h(Ly8/l;)LO7/e;

    move-result-object v0

    invoke-static {v0}, Lr8/e;->f(LO7/e;)LO7/U;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly8/l$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
