.class final LZ8/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/C;
.implements LZ8/f;
.implements La9/q;


# instance fields
.field private final synthetic C:LZ8/C;

.field private final D:LW8/z0;


# direct methods
.method public constructor <init>(LZ8/C;LW8/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ8/z;->C:LZ8/C;

    iput-object p2, p0, LZ8/z;->D:LW8/z0;

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZ8/z;->C:LZ8/C;

    invoke-interface {v0, p1, p2}, LZ8/C;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LZ8/z;->C:LZ8/C;

    invoke-interface {v0}, LZ8/C;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lm7/i;ILY8/d;)LZ8/f;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LZ8/E;->e(LZ8/C;Lm7/i;ILY8/d;)LZ8/f;

    move-result-object p1

    return-object p1
.end method
