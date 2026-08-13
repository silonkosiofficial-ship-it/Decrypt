.class final LW8/H0;
.super LW8/W;
.source "SourceFile"


# instance fields
.field private final F:Lm7/e;


# direct methods
.method public constructor <init>(Lm7/i;Lx7/p;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LW8/W;-><init>(Lm7/i;Z)V

    invoke-static {p2, p0, p0}, Ln7/b;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    iput-object p1, p0, LW8/H0;->F:Lm7/e;

    return-void
.end method


# virtual methods
.method protected I0()V
    .locals 1

    iget-object v0, p0, LW8/H0;->F:Lm7/e;

    invoke-static {v0, p0}, Lc9/a;->b(Lm7/e;Lm7/e;)V

    return-void
.end method
