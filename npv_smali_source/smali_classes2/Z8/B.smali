.class final LZ8/B;
.super LZ8/a;
.source "SourceFile"


# instance fields
.field private final C:Lx7/p;


# direct methods
.method public constructor <init>(Lx7/p;)V
    .locals 0

    invoke-direct {p0}, LZ8/a;-><init>()V

    iput-object p1, p0, LZ8/B;->C:Lx7/p;

    return-void
.end method


# virtual methods
.method public e(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LZ8/B;->C:Lx7/p;

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
