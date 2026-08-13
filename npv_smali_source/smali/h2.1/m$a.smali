.class final Lh2/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Lh2/Z;

.field private final b:LZ8/x;

.field final synthetic c:Lh2/m;


# direct methods
.method public constructor <init>(Lh2/m;)V
    .locals 4

    iput-object p1, p0, Lh2/m$a;->c:Lh2/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LY8/d;->D:LY8/d;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, p1, v0, v1}, LZ8/E;->b(IILY8/d;ILjava/lang/Object;)LZ8/x;

    move-result-object p1

    iput-object p1, p0, Lh2/m$a;->b:LZ8/x;

    return-void
.end method


# virtual methods
.method public final a()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/m$a;->b:LZ8/x;

    return-object v0
.end method

.method public final b()Lh2/Z;
    .locals 1

    iget-object v0, p0, Lh2/m$a;->a:Lh2/Z;

    return-object v0
.end method

.method public final c(Lh2/Z;)V
    .locals 1

    .prologue
    iput-object p1, p0, Lh2/m$a;->a:Lh2/Z;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lh2/m$a;->b:LZ8/x;

    invoke-interface {v0, p1}, LZ8/x;->n(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
