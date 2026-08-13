.class final LO7/Y$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/Y;-><init>(LO7/e;LE8/n;Lx7/l;LG8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/Y;


# direct methods
.method constructor <init>(LO7/Y;)V
    .locals 0

    iput-object p1, p0, LO7/Y$c;->D:LO7/Y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/h;
    .locals 2

    iget-object v0, p0, LO7/Y$c;->D:LO7/Y;

    invoke-static {v0}, LO7/Y;->b(LO7/Y;)Lx7/l;

    move-result-object v0

    iget-object v1, p0, LO7/Y$c;->D:LO7/Y;

    invoke-static {v1}, LO7/Y;->a(LO7/Y;)LG8/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO7/Y$c;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
