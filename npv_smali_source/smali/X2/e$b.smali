.class final LX2/e$b;
.super LX2/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:LX2/o$b;

.field private b:LX2/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX2/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LX2/o;
    .locals 4

    new-instance v0, LX2/e;

    iget-object v1, p0, LX2/e$b;->a:LX2/o$b;

    iget-object v2, p0, LX2/e$b;->b:LX2/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LX2/e;-><init>(LX2/o$b;LX2/a;LX2/e$a;)V

    return-object v0
.end method

.method public b(LX2/a;)LX2/o$a;
    .locals 0

    iput-object p1, p0, LX2/e$b;->b:LX2/a;

    return-object p0
.end method

.method public c(LX2/o$b;)LX2/o$a;
    .locals 0

    iput-object p1, p0, LX2/e$b;->a:LX2/o$b;

    return-object p0
.end method
