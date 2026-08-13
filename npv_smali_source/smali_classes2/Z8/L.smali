.class final LZ8/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/I;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZ8/N;)LZ8/f;
    .locals 2

    new-instance v0, LZ8/L$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZ8/L$a;-><init>(LZ8/N;Lm7/e;)V

    invoke-static {v0}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SharingStarted.Lazily"

    return-object v0
.end method
