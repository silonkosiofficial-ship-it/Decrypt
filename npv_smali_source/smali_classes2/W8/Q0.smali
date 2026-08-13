.class final LW8/Q0;
.super LW8/E0;
.source "SourceFile"


# instance fields
.field private final G:Lm7/e;


# direct methods
.method public constructor <init>(Lm7/e;)V
    .locals 0

    invoke-direct {p0}, LW8/E0;-><init>()V

    iput-object p1, p0, LW8/Q0;->G:Lm7/e;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LW8/Q0;->G:Lm7/e;

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method
