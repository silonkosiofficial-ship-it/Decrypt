.class public final LF0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/d;
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
.method public D0(LE0/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, LE0/c;->a()Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
