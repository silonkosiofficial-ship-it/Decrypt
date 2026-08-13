.class final Li8/v$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/v$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)Lp8/j$a;
    .locals 0

    invoke-virtual {p0, p1}, Li8/v$c$a;->b(I)Li8/v$c;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Li8/v$c;
    .locals 0

    invoke-static {p1}, Li8/v$c;->e(I)Li8/v$c;

    move-result-object p1

    return-object p1
.end method
