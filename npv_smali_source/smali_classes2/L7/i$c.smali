.class final LL7/i$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/i;-><init>(LO7/G;LO7/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/G;


# direct methods
.method constructor <init>(LO7/G;)V
    .locals 0

    iput-object p1, p0, LL7/i$c;->D:LO7/G;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/h;
    .locals 2

    iget-object v0, p0, LL7/i$c;->D:LO7/G;

    sget-object v1, LL7/j;->v:Ln8/c;

    invoke-interface {v0, v1}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object v0

    invoke-interface {v0}, LO7/P;->u()Ly8/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL7/i$c;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
