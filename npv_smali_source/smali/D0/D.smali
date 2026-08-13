.class final LD0/D;
.super LD0/X$a;
.source "SourceFile"


# instance fields
.field private final b:LF0/T;


# direct methods
.method public constructor <init>(LF0/T;)V
    .locals 0

    invoke-direct {p0}, LD0/X$a;-><init>()V

    iput-object p1, p0, LD0/D;->b:LF0/T;

    return-void
.end method


# virtual methods
.method protected d()LY0/v;
    .locals 1

    iget-object v0, p0, LD0/D;->b:LF0/T;

    invoke-interface {v0}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method protected e()I
    .locals 1

    iget-object v0, p0, LD0/D;->b:LF0/T;

    invoke-virtual {v0}, LD0/X;->D0()I

    move-result v0

    return v0
.end method
