.class final LW8/h0;
.super LW8/E0;
.source "SourceFile"


# instance fields
.field private final G:LW8/f0;


# direct methods
.method public constructor <init>(LW8/f0;)V
    .locals 0

    invoke-direct {p0}, LW8/E0;-><init>()V

    iput-object p1, p0, LW8/h0;->G:LW8/f0;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, LW8/h0;->G:LW8/f0;

    invoke-interface {p1}, LW8/f0;->e()V

    return-void
.end method
