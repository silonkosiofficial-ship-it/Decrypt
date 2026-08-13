.class final LX2/i$b;
.super LX2/s$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:LX2/r;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX2/s$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LX2/s;
    .locals 3

    new-instance v0, LX2/i;

    iget-object v1, p0, LX2/i$b;->a:LX2/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX2/i;-><init>(LX2/r;LX2/i$a;)V

    return-object v0
.end method

.method public b(LX2/r;)LX2/s$a;
    .locals 0

    iput-object p1, p0, LX2/i$b;->a:LX2/r;

    return-object p0
.end method
