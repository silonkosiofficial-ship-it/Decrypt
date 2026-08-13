.class public final Lh2/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LZ8/f;


# direct methods
.method public constructor <init>(Lh2/E;Ljava/lang/Object;Lh2/O;Lx7/a;)V
    .locals 3

    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingSourceFactory"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/y;

    new-instance v1, Lh2/D$a;

    const/4 v2, 0x0

    invoke-direct {v1, p4, v2}, Lh2/D$a;-><init>(Lx7/a;Lm7/e;)V

    invoke-direct {v0, v1, p2, p1, p3}, Lh2/y;-><init>(Lx7/l;Ljava/lang/Object;Lh2/E;Lh2/O;)V

    invoke-virtual {v0}, Lh2/y;->i()LZ8/f;

    move-result-object p1

    iput-object p1, p0, Lh2/D;->a:LZ8/f;

    return-void
.end method

.method public constructor <init>(Lh2/E;Ljava/lang/Object;Lx7/a;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingSourceFactory"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lh2/D;-><init>(Lh2/E;Ljava/lang/Object;Lh2/O;Lx7/a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lh2/E;Ljava/lang/Object;Lx7/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lh2/D;-><init>(Lh2/E;Ljava/lang/Object;Lx7/a;)V

    return-void
.end method


# virtual methods
.method public final a()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/D;->a:LZ8/f;

    return-object v0
.end method
