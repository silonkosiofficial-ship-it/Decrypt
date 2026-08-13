.class final LG8/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/j;-><init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LG8/j;


# direct methods
.method constructor <init>(LG8/j;)V
    .locals 0

    iput-object p1, p0, LG8/j$b;->D:LG8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, LG8/j$b;->D:LG8/j;

    invoke-static {v0}, LG8/j;->b(LG8/j;)Lx7/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG8/j$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
