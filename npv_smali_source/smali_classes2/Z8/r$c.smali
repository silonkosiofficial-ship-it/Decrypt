.class public final LZ8/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/r;->b(LZ8/f;Lx7/p;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/f;

.field final synthetic D:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/f;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LZ8/r$c;->C:LZ8/f;

    iput-object p2, p0, LZ8/r$c;->D:Lx7/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    iget-object v1, p0, LZ8/r$c;->C:LZ8/f;

    new-instance v2, LZ8/r$d;

    iget-object v3, p0, LZ8/r$c;->D:Lx7/p;

    invoke-direct {v2, v0, p1, v3}, LZ8/r$d;-><init>(Ly7/K;LZ8/g;Lx7/p;)V

    invoke-interface {v1, v2, p2}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
