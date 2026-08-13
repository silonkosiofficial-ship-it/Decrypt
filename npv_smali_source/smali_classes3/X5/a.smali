.class public abstract LX5/a;
.super LW5/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW5/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;ILjava/lang/StringBuilder;)I
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringBuilder"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {p0, p1, p3}, LX5/a;->d(ILjava/lang/StringBuilder;)Z

    move-result p1

    return p1
.end method

.method public abstract d(ILjava/lang/StringBuilder;)Z
.end method
