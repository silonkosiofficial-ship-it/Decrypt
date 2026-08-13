.class final LZ8/K;
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
    .locals 0

    sget-object p1, LZ8/G;->C:LZ8/G;

    invoke-static {p1}, LZ8/h;->z(Ljava/lang/Object;)LZ8/f;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SharingStarted.Eagerly"

    return-object v0
.end method
