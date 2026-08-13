.class final La9/n;
.super Lb9/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm7/i;Lm7/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb9/z;-><init>(Lm7/i;Lm7/e;)V

    return-void
.end method


# virtual methods
.method public K(Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    instance-of v0, p1, La9/k;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LW8/F0;->z(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
