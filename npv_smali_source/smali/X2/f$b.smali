.class final LX2/f$b;
.super LX2/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:LX2/s;

.field private b:LX2/p$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX2/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LX2/p;
    .locals 4

    new-instance v0, LX2/f;

    iget-object v1, p0, LX2/f$b;->a:LX2/s;

    iget-object v2, p0, LX2/f$b;->b:LX2/p$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LX2/f;-><init>(LX2/s;LX2/p$b;LX2/f$a;)V

    return-object v0
.end method

.method public b(LX2/s;)LX2/p$a;
    .locals 0

    iput-object p1, p0, LX2/f$b;->a:LX2/s;

    return-object p0
.end method

.method public c(LX2/p$b;)LX2/p$a;
    .locals 0

    iput-object p1, p0, LX2/f$b;->b:LX2/p$b;

    return-object p0
.end method
