.class final LO7/Y$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/Y;->c(LG8/g;)Ly8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/Y;

.field final synthetic E:LG8/g;


# direct methods
.method constructor <init>(LO7/Y;LG8/g;)V
    .locals 0

    iput-object p1, p0, LO7/Y$b;->D:LO7/Y;

    iput-object p2, p0, LO7/Y$b;->E:LG8/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/h;
    .locals 2

    iget-object v0, p0, LO7/Y$b;->D:LO7/Y;

    invoke-static {v0}, LO7/Y;->b(LO7/Y;)Lx7/l;

    move-result-object v0

    iget-object v1, p0, LO7/Y$b;->E:LG8/g;

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO7/Y$b;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
