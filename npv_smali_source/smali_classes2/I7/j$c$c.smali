.class final LI7/j$c$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j$c;->a()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/b;

.field final synthetic E:I


# direct methods
.method constructor <init>(LO7/b;I)V
    .locals 0

    iput-object p1, p0, LI7/j$c$c;->D:LO7/b;

    iput p2, p0, LI7/j$c$c;->E:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/Q;
    .locals 2

    iget-object v0, p0, LI7/j$c$c;->D:LO7/b;

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    iget v1, p0, LI7/j$c$c;->E:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/Q;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$c$c;->a()LO7/Q;

    move-result-object v0

    return-object v0
.end method
