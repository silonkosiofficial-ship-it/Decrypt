.class public final LF0/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/d0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0x8

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    return v0
.end method

.method public b(LF0/J;JLF0/v;ZZ)V
    .locals 0

    invoke-virtual/range {p1 .. p6}, LF0/J;->z0(JLF0/v;ZZ)V

    return-void
.end method

.method public c(LF0/J;)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, LF0/J;->I()LK0/k;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LK0/k;->E()Z

    move-result p1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    xor-int/lit8 p1, v0, 0x1

    return p1
.end method

.method public d(Landroidx/compose/ui/d$c;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
