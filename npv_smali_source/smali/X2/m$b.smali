.class final LX2/m$b;
.super LX2/w$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:LX2/w$c;

.field private b:LX2/w$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX2/w$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LX2/w;
    .locals 4

    new-instance v0, LX2/m;

    iget-object v1, p0, LX2/m$b;->a:LX2/w$c;

    iget-object v2, p0, LX2/m$b;->b:LX2/w$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LX2/m;-><init>(LX2/w$c;LX2/w$b;LX2/m$a;)V

    return-object v0
.end method

.method public b(LX2/w$b;)LX2/w$a;
    .locals 0

    iput-object p1, p0, LX2/m$b;->b:LX2/w$b;

    return-object p0
.end method

.method public c(LX2/w$c;)LX2/w$a;
    .locals 0

    iput-object p1, p0, LX2/m$b;->a:LX2/w$c;

    return-object p0
.end method
