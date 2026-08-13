.class final La9/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# instance fields
.field private final C:Lm7/i;

.field private final D:Ljava/lang/Object;

.field private final E:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/g;Lm7/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La9/C;->C:Lm7/i;

    invoke-static {p2}, Lb9/K;->g(Lm7/i;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, La9/C;->D:Ljava/lang/Object;

    new-instance p2, La9/C$a;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, La9/C$a;-><init>(LZ8/g;Lm7/e;)V

    iput-object p2, p0, La9/C;->E:Lx7/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, La9/C;->C:Lm7/i;

    iget-object v1, p0, La9/C;->D:Ljava/lang/Object;

    iget-object v2, p0, La9/C;->E:Lx7/p;

    invoke-static {v0, p1, v1, v2, p2}, La9/f;->b(Lm7/i;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
