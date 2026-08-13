.class public final LF0/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/n;-><init>(Z)V
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
.method public a(LF0/J;LF0/J;)I
    .locals 2

    .prologue
    invoke-virtual {p1}, LF0/J;->L()I

    move-result v0

    invoke-virtual {p2}, LF0/J;->L()I

    move-result v1

    invoke-static {v0, v1}, Ly7/t;->g(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Ly7/t;->g(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, LF0/J;

    invoke-virtual {p0, p1, p2}, LF0/n$a;->a(LF0/J;LF0/J;)I

    move-result p1

    return p1
.end method
