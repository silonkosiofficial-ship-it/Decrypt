.class final LD0/T;
.super LD0/X$a;
.source "SourceFile"


# instance fields
.field private final b:LF0/o0;


# direct methods
.method public constructor <init>(LF0/o0;)V
    .locals 0

    invoke-direct {p0}, LD0/X$a;-><init>()V

    iput-object p1, p0, LD0/T;->b:LF0/o0;

    return-void
.end method


# virtual methods
.method protected d()LY0/v;
    .locals 1

    iget-object v0, p0, LD0/T;->b:LF0/o0;

    invoke-interface {v0}, LF0/o0;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method protected e()I
    .locals 1

    iget-object v0, p0, LD0/T;->b:LF0/o0;

    invoke-interface {v0}, LF0/o0;->getRoot()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->t0()I

    move-result v0

    return v0
.end method
