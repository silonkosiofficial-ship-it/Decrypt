.class public final LX5/d;
.super LX5/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX5/a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/StringBuilder;)Z
    .locals 1

    .prologue
    const-string v0, "stringBuilder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0xd800

    if-lt p1, p2, :cond_0

    const p2, 0xdfff

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
