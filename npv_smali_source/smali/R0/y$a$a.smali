.class public final LR0/y$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR0/y$a;
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
.method public synthetic a(LR0/h;)LR0/h;
    .locals 0

    invoke-static {p0, p1}, LR0/x;->a(LR0/y;LR0/h;)LR0/h;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(I)I
    .locals 0

    invoke-static {p0, p1}, LR0/x;->b(LR0/y;I)I

    move-result p1

    return p1
.end method

.method public synthetic c(LR0/q;)LR0/q;
    .locals 0

    invoke-static {p0, p1}, LR0/x;->d(LR0/y;LR0/q;)LR0/q;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(I)I
    .locals 0

    invoke-static {p0, p1}, LR0/x;->c(LR0/y;I)I

    move-result p1

    return p1
.end method
