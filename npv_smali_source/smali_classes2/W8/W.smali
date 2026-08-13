.class LW8/W;
.super LW8/a;
.source "SourceFile"

# interfaces
.implements LW8/V;


# direct methods
.method public constructor <init>(Lm7/i;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LW8/a;-><init>(Lm7/i;ZZ)V

    return-void
.end method

.method static synthetic k1(LW8/W;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->v(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public d1(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LW8/W;->k1(LW8/W;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public y()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW8/F0;->S()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
