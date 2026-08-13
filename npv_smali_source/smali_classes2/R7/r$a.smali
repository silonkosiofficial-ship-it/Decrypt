.class final LR7/r$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/r;-><init>(LR7/x;Ln8/c;LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/r;


# direct methods
.method constructor <init>(LR7/r;)V
    .locals 0

    iput-object p1, p0, LR7/r$a;->D:LR7/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LR7/r$a;->D:LR7/r;

    invoke-virtual {v0}, LR7/r;->T0()LR7/x;

    move-result-object v0

    invoke-virtual {v0}, LR7/x;->Z0()LO7/L;

    move-result-object v0

    iget-object v1, p0, LR7/r$a;->D:LR7/r;

    invoke-virtual {v1}, LR7/r;->e()Ln8/c;

    move-result-object v1

    invoke-static {v0, v1}, LO7/N;->b(LO7/L;Ln8/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/r$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
