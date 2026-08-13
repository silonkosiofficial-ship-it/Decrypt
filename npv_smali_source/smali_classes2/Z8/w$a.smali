.class public final LZ8/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/w;->c(LZ8/f;LZ8/f;Lx7/q;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/f;

.field final synthetic D:LZ8/f;

.field final synthetic E:Lx7/q;


# direct methods
.method public constructor <init>(LZ8/f;LZ8/f;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LZ8/w$a;->C:LZ8/f;

    iput-object p2, p0, LZ8/w$a;->D:LZ8/f;

    iput-object p3, p0, LZ8/w$a;->E:Lx7/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    iget-object v0, p0, LZ8/w$a;->C:LZ8/f;

    iget-object v1, p0, LZ8/w$a;->D:LZ8/f;

    const/4 v2, 0x2

    new-array v2, v2, [LZ8/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {}, LZ8/w;->a()Lx7/a;

    move-result-object v0

    new-instance v1, LZ8/w$b;

    iget-object v3, p0, LZ8/w$a;->E:Lx7/q;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LZ8/w$b;-><init>(Lx7/q;Lm7/e;)V

    invoke-static {p1, v2, v0, v1, p2}, La9/l;->a(LZ8/g;[LZ8/f;Lx7/a;Lx7/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
