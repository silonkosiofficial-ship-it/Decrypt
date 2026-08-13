.class final LN/r$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/r;->l(LN/w;LN/j;LN/k$a;)LN/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/j;

.field final synthetic E:I


# direct methods
.method constructor <init>(LN/j;I)V
    .locals 0

    iput-object p1, p0, LN/r$b;->D:LN/j;

    iput p2, p0, LN/r$b;->E:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, LN/r$b;->D:LN/j;

    invoke-virtual {v0}, LN/j;->k()LM0/K;

    move-result-object v0

    iget v1, p0, LN/r$b;->E:I

    invoke-virtual {v0, v1}, LM0/K;->q(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/r$b;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
