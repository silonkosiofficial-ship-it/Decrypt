.class public final Lh2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LZ8/y;

.field private final b:LZ8/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li7/u;

    const/high16 v1, -0x80000000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object p1

    iput-object p1, p0, Lh2/h;->a:LZ8/y;

    new-instance v0, Lh2/h$a;

    invoke-direct {v0, p1}, Lh2/h$a;-><init>(LZ8/f;)V

    iput-object v0, p0, Lh2/h;->b:LZ8/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lh2/h;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/h;->b:LZ8/f;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/h;->a:LZ8/y;

    new-instance v1, Li7/u;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LZ8/y;->setValue(Ljava/lang/Object;)V

    return-void
.end method
