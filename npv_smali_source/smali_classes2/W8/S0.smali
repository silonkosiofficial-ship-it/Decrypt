.class LW8/S0;
.super LW8/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm7/i;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LW8/a;-><init>(Lm7/i;ZZ)V

    return-void
.end method


# virtual methods
.method protected f0(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, LW8/a;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0, p1}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
