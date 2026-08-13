.class final LX2/h$b;
.super LX2/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX2/r$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LX2/r;
    .locals 3

    new-instance v0, LX2/h;

    iget-object v1, p0, LX2/h$b;->a:Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX2/h;-><init>(Ljava/lang/Integer;LX2/h$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/Integer;)LX2/r$a;
    .locals 0

    iput-object p1, p0, LX2/h$b;->a:Ljava/lang/Integer;

    return-object p0
.end method
