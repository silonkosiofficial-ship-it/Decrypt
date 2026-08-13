.class public final LS/N$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS/P0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/N;
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
.method public synthetic a(J)Z
    .locals 0

    invoke-static {p0, p1, p2}, LS/O0;->a(LS/P0;J)Z

    move-result p1

    return p1
.end method

.method public synthetic b(I)Z
    .locals 0

    invoke-static {p0, p1}, LS/O0;->b(LS/P0;I)Z

    move-result p1

    return p1
.end method
