.class final LN7/i$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;-><init>(LO7/G;LE8/n;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/i;


# direct methods
.method constructor <init>(LN7/i;)V
    .locals 0

    iput-object p1, p0, LN7/i$k;->D:LN7/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LP7/g;
    .locals 8

    iget-object v0, p0, LN7/i$k;->D:LN7/i;

    invoke-static {v0}, LN7/i;->g(LN7/i;)LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v2, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v1 .. v7}, LP7/f;->b(LL7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)LP7/c;

    move-result-object v0

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/i$k;->a()LP7/g;

    move-result-object v0

    return-object v0
.end method
