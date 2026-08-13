.class public final La9/i;
.super La9/g;
.source "SourceFile"


# instance fields
.field private final G:Lx7/q;


# direct methods
.method public constructor <init>(Lx7/q;LZ8/f;Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p2, p3, p4, p5}, La9/g;-><init>(LZ8/f;Lm7/i;ILY8/d;)V

    iput-object p1, p0, La9/i;->G:Lx7/q;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/q;LZ8/f;Lm7/i;ILY8/d;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    sget-object p3, Lm7/j;->C:Lm7/j;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x2

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    sget-object p5, LY8/d;->C:LY8/d;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, La9/i;-><init>(Lx7/q;LZ8/f;Lm7/i;ILY8/d;)V

    return-void
.end method

.method public static final synthetic u(La9/i;)Lx7/q;
    .locals 0

    iget-object p0, p0, La9/i;->G:Lx7/q;

    return-object p0
.end method


# virtual methods
.method protected i(Lm7/i;ILY8/d;)La9/e;
    .locals 7

    new-instance v6, La9/i;

    iget-object v1, p0, La9/i;->G:Lx7/q;

    iget-object v2, p0, La9/g;->F:LZ8/f;

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, La9/i;-><init>(Lx7/q;LZ8/f;Lm7/i;ILY8/d;)V

    return-object v6
.end method

.method protected t(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, La9/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, La9/i$a;-><init>(La9/i;LZ8/g;Lm7/e;)V

    invoke-static {v0, p2}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
