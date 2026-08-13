.class LZ8/d;
.super La9/e;
.source "SourceFile"


# instance fields
.field private final F:Lx7/p;


# direct methods
.method public constructor <init>(Lx7/p;Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, La9/e;-><init>(Lm7/i;ILY8/d;)V

    iput-object p1, p0, LZ8/d;->F:Lx7/p;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/p;Lm7/i;ILY8/d;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, Lm7/j;->C:Lm7/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, LY8/d;->C:LY8/d;

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LZ8/d;-><init>(Lx7/p;Lm7/i;ILY8/d;)V

    return-void
.end method

.method static synthetic q(LZ8/d;LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    iget-object p0, p0, LZ8/d;->F:Lx7/p;

    invoke-interface {p0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method protected h(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LZ8/d;->q(LZ8/d;LY8/z;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected i(Lm7/i;ILY8/d;)La9/e;
    .locals 2

    new-instance v0, LZ8/d;

    iget-object v1, p0, LZ8/d;->F:Lx7/p;

    invoke-direct {v0, v1, p1, p2, p3}, LZ8/d;-><init>(Lx7/p;Lm7/i;ILY8/d;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "block["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ8/d;->F:Lx7/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, La9/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
