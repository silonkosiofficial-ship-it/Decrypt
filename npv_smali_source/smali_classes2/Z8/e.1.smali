.class final LZ8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# instance fields
.field private final C:LZ8/f;

.field public final D:Lx7/l;

.field public final E:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/f;Lx7/l;Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ8/e;->C:LZ8/f;

    iput-object p2, p0, LZ8/e;->D:Lx7/l;

    iput-object p3, p0, LZ8/e;->E:Lx7/p;

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    sget-object v1, La9/t;->a:Lb9/D;

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    iget-object v1, p0, LZ8/e;->C:LZ8/f;

    new-instance v2, LZ8/e$a;

    invoke-direct {v2, p0, v0, p1}, LZ8/e$a;-><init>(LZ8/e;Ly7/O;LZ8/g;)V

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
