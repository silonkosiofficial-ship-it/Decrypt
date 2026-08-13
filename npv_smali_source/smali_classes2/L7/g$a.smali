.class LL7/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/g;-><init>(LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LL7/g;


# direct methods
.method constructor <init>(LL7/g;)V
    .locals 0

    iput-object p1, p0, LL7/g$a;->C:LL7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 6

    iget-object v0, p0, LL7/g$a;->C:LL7/g;

    invoke-virtual {v0}, LL7/g;->r()LR7/x;

    move-result-object v0

    sget-object v1, LL7/j;->y:Ln8/c;

    invoke-virtual {v0, v1}, LR7/x;->s0(Ln8/c;)LO7/P;

    move-result-object v0

    iget-object v1, p0, LL7/g$a;->C:LL7/g;

    invoke-virtual {v1}, LL7/g;->r()LR7/x;

    move-result-object v1

    sget-object v2, LL7/j;->A:Ln8/c;

    invoke-virtual {v1, v2}, LR7/x;->s0(Ln8/c;)LO7/P;

    move-result-object v1

    iget-object v2, p0, LL7/g$a;->C:LL7/g;

    invoke-virtual {v2}, LL7/g;->r()LR7/x;

    move-result-object v2

    sget-object v3, LL7/j;->B:Ln8/c;

    invoke-virtual {v2, v3}, LR7/x;->s0(Ln8/c;)LO7/P;

    move-result-object v2

    iget-object v3, p0, LL7/g$a;->C:LL7/g;

    invoke-virtual {v3}, LL7/g;->r()LR7/x;

    move-result-object v3

    sget-object v4, LL7/j;->z:Ln8/c;

    invoke-virtual {v3, v4}, LR7/x;->s0(Ln8/c;)LO7/P;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [LO7/P;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL7/g$a;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
